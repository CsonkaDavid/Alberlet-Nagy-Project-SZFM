package net.alberlet.measurement.state;

import java.util.List;

public class Measurement {

    private final List<Dimensions> measurements;

    private float result;

    public Measurement(List<Dimensions> measurements) {
        this.measurements = measurements;
    }

    public void calculateResultFromMeasurements() {
        correctMeasurementTimestamps();
        long measuringTime = measurements.get(measurements.size()-1).getTimestamp();

    }

    private int axisUsedForMeasuring(){
        int[] axes = new int[3];
        for(Dimensions dimensions: measurements) {
            axes[indexOfGreatestOfThreeNumbers(dimensions.getX(), dimensions.getY(), dimensions.getZ())]++;
        }
        return indexOfGreatestOfThreeNumbers(axes[0], axes[1], axes[2]);
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

}
