package net.alberlet.measurement.state;

import java.util.List;

public class Measurement {

    public Measurement() {

    }

    public float calculateMeasurementFromMeasurementList(List<Dimensions> measurements) {
        return 0;
    }

    private void correctMeasurementTimestamps(List<Dimensions> measurements) {
        long firstTimestamp = measurements.get(0).getTimestamp();
        for(Dimensions dimensions: measurements) {
            dimensions.correctTimestamp(firstTimestamp);
        }
    }
}
