package net.alberlet.measurement.state;

import java.util.List;

public class Measurement {

    private final List<Dimensions> measurements;

    private float result;

    private int axisUsedIndex;

    public Measurement(List<Dimensions> measurements) {
        this.measurements = measurements;
        result = 0;
    }

    public void calculateResultFromMeasurements() {
        correctMeasurementTimestamps();
        axisUsedForMeasuring();

        long measuringTime = measurements.get(measurements.size()-1).getTimestamp();

    }

    private void axisUsedForMeasuring(){
        int[] axes = new int[3];
        for(Dimensions dimensions: measurements) {
            axes[indexOfGreatestOfThreeNumbers(dimensions.getX(), dimensions.getY(), dimensions.getZ())]++;
        }
        axisUsedIndex = indexOfGreatestOfThreeNumbers(axes[0], axes[1], axes[2]);
    }

    private void correctMeasurementTimestamps() {
        long firstTimestamp = measurements.get(0).getTimestamp();
        for(Dimensions dimensions: measurements) {
            dimensions.correctTimestamp(firstTimestamp);
        }
    }

    private int indexOfGreatestOfThreeNumbers(float a, float b, float c) {
        if(a > b){
            if(a > c) {
                return 1;
            } else {
                return 3;
            }
        } else if (b > c) {
            return 2;
        } else {
            return 3;
        }
    }

    public float getResult() {
        return result;
    }
}
