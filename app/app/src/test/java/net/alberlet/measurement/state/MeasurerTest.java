package net.alberlet.measurement.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MeasurerTest {

    @Test
    void testCalculateResultFromMeasurementsShouldReturnCorrectDistance1() {
        //Given
        List<AccelerationData> accelerationDataList = List.of(
                new AccelerationData(10f,0f,0f, 1000000000L),
                new AccelerationData(10f,0f,0f, 2000000000L),
                new AccelerationData(10f,0f,0f, 3000000000L),
                new AccelerationData(10f,0f,0f, 4000000000L),
                new AccelerationData(10f,0f,0f, 5000000000L)
        );

        Measurer testMeasurement = new Measurer(accelerationDataList);

        float time = 4;

        Float expected = (((time*time) * 10) / 2) * 100;

        //When
        testMeasurement.calculateResultFromMeasurements();
        Float actual = testMeasurement.getResult();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateResultFromMeasurementsShouldReturnCorrectDistance2() {
        //Given
        List<AccelerationData> accelerationDataList = List.of(
                new AccelerationData(10f,0f,0f, 1000000000L),
                new AccelerationData(0f,0f,0f, 2000000000L),
                new AccelerationData(10f,0f,0f, 3000000000L),
                new AccelerationData(10f,0f,0f, 4000000000L),
                new AccelerationData(10f,0f,0f, 5000000000L)
        );

        Measurer testMeasurement = new Measurer(accelerationDataList);

        float time = 4;

        Float expected = (((time*time) * 8) / 2) * 100;

        //When
        testMeasurement.calculateResultFromMeasurements();
        Float actual = testMeasurement.getResult();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateResultFromMeasurementsShouldReturnCorrectDistance3() {
        //Given
        List<AccelerationData> accelerationDataList = List.of(
                new AccelerationData(10f,0f,0f, 1000000000L),
                new AccelerationData(10f,0f,0f, 2000000000L),
                new AccelerationData(10f,0f,0f, 2000000000L),
                new AccelerationData(10f,0f,0f, 4000000000L),
                new AccelerationData(10f,0f,0f, 5000000000L)
        );

        Measurer testMeasurement = new Measurer(accelerationDataList);

        float time = 4;

        Float expected = (((time*time) * 10) / 2) * 100;

        //When
        testMeasurement.calculateResultFromMeasurements();
        Float actual = testMeasurement.getResult();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateResultFromMeasurementsShouldReturnCorrectDistance4() {
        //Given
        List<AccelerationData> accelerationDataList = List.of(
                new AccelerationData(10f,0f,0f, 1000000000L),
                new AccelerationData(10f,0f,0f, 2000000000L),
                new AccelerationData(-10f,0f,0f, 3000000000L),
                new AccelerationData(10f,0f,0f, 4000000000L),
                new AccelerationData(10f,0f,0f, 5000000000L)
        );

        Measurer testMeasurement = new Measurer(accelerationDataList);

        float time = 4;

        Float expected = (((time*time) * 6) / 2) * 100;

        //When
        testMeasurement.calculateResultFromMeasurements();
        Float actual = testMeasurement.getResult();

        //Then
        Assertions.assertEquals(expected, actual);
    }
    
}