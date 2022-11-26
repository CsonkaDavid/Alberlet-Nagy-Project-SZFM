package net.alberlet.measurement.state;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import java.util.ArrayList;
import java.util.List;

public class MeasurementSensorManager implements SensorEventListener {
    private SensorManager sensorManager;

    private final Sensor accelerometer;

    private final Sensor gyroscope;

    private List<AccelerationData> values;

    public MeasurementSensorManager(SensorManager manager) {
        this.sensorManager = manager;
        this.values = new ArrayList<>();
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        gyroscope = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_LINEAR_ACCELERATION) {
            values.add(new AccelerationData(event.values[0], event.values[1], event.values[2], event.timestamp));
        }

        if(event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void registerListeners() {
        sensorManager.registerListener(
                this,
                accelerometer,
                SensorManager.SENSOR_DELAY_FASTEST,
                SensorManager.SENSOR_DELAY_FASTEST);

        sensorManager.registerListener(
                this,
                gyroscope,
                SensorManager.SENSOR_DELAY_FASTEST,
                SensorManager.SENSOR_DELAY_FASTEST);
    }

    public float unregisterListenersAndGetResult() {
        sensorManager.unregisterListener(this);
        Measurer measurer = new Measurer(values);
        measurer.calculateResultFromMeasurements();
        values = new ArrayList<>();
        return measurer.getResult();
    }
}