package net.alberlet.measurement.gui;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import net.alberlet.measurement.R;
import net.alberlet.measurement.state.MeasurementSensorManager;

public class MeasurementActivity extends AppCompatActivity implements View.OnClickListener {

    private MeasurementSensorManager sensorManager;

    private AppCompatButton measurementButton;

    private TextView measurementTextView;

    private boolean isMeasuring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement);
        sensorManager = new MeasurementSensorManager((SensorManager)getSystemService(SENSOR_SERVICE));
        measurementButton = findViewById(R.id.button_toggle_measurement);
        measurementTextView = findViewById(R.id.text_view_measurement);
        isMeasuring = false;
    }

    @Override
    public void onClick(View view) {
        if (!isMeasuring) {
            startMeasuring();
        } else {
            stopMeasuring();
        }
    }

    private void startMeasuring() {
        isMeasuring = true;
        sensorManager.registerListeners();
        measurementButton.setText("Leállítás");
        measurementButton.setBackgroundResource(R.drawable.measurement_stop_button_background);
    }

    private void stopMeasuring() {
        isMeasuring = false;
        sensorManager.unregisterListeners();
    }

}