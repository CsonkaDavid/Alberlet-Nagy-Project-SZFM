package net.alberlet.measurement;

import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.measurement.state.MeasurementSensorManager;

public class MeasurementActivity extends AppCompatActivity {
    private MeasurementSensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.measurement_activity);
        sensorManager = new MeasurementSensorManager();
        sensorManager.setSensorManager((SensorManager)getSystemService(SENSOR_SERVICE));
    }

}