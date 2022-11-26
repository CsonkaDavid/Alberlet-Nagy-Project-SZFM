package net.alberlet.measurement.state;

import java.util.ArrayList;
import java.util.List;

public class Measurer {

    private final List<AccelerationData> measurements;

    private final List<Long> measurementWeights;

    private long sumOfMeasurementWeights;

    private int indexOfUsedAxis;

    private float result;

    public Measurer(List<AccelerationData> measurements) {
        this.measurements = measurements;
        this.measurementWeights = new ArrayList<>();
        result = 0;
    }

    public void calculateResultFromMeasurements() {
        processMeasurementTimestamps();
        axisUsedForMeasuring();
        float accelerationInMeterPerSquareSecond = Math.abs(calculateAverageSpeed());
        float timeInSeconds = ((float) measurements.get(measurements.size()-1).getTimestamp() / (float) Math.pow(10, 9));
        float distanceInMeters = (accelerationInMeterPerSquareSecond * (float)Math.pow(timeInSeconds, 2)) / 2;
        result = distanceInMeters * 100;
    }

    private void axisUsedForMeasuring(){
        int[] axes = new int[3];
        for(AccelerationData dimensions: measurements) {
            axes[indexOfGreatestOfThreeNumbers(dimensions.getX(), dimensions.getY(), dimensions.getZ())]++;
        }
        indexOfUsedAxis = indexOfGreatestOfThreeNumbers(axes[0], axes[1], axes[2]);
    }

    private void processMeasurementTimestamps() {
        long firstTimestamp = measurements.get(0).getTimestamp();
        long prevTimestamp = 0;
        for(AccelerationData dimensions: measurements) {
            long thisTimestamp = dimensions.getTimestamp();
            long timeElapsed = thisTimestamp - prevTimestamp;
            dimensions.correctTimestamp(firstTimestamp);
            sumOfMeasurementWeights += timeElapsed;
            measurementWeights.add(timeElapsed);
            prevTimestamp = thisTimestamp;
        }
    }

    private float calculateAverageSpeed() {
        float weightedArithmeticMean = 0;
        for(int i=0; i<measurements.size(); i++){
            weightedArithmeticMean += measurements.get(i).getAxisWithIndex(indexOfUsedAxis) *
                    measurementWeights.get(i) / sumOfMeasurementWeights;
        }
        return weightedArithmeticMean;
    }

    private int indexOfGreatestOfThreeNumbers(float a, float b, float c) {
        float abs_a = Math.abs(a);
        float abs_b = Math.abs(b);
        float abs_c = Math.abs(c);
        if(abs_a > abs_b){
            if(abs_a > abs_c) {
                return 0;
            } else {
                return 2;
            }
        } else if (abs_b > abs_c) {
            return 1;
        } else {
            return 2;
        }
    }

    public float getResult() {
        return result;
    }
}
