package net.alberlet.measurement.gui;

import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.measurement.R;
import net.alberlet.measurement.state.MeasurementSensorManager;

public class MeasurementActivity extends AppCompatActivity {

    private MeasurementSensorManager sensorManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement);
        sensorManager = new MeasurementSensorManager((SensorManager)getSystemService(SENSOR_SERVICE));
    }

}