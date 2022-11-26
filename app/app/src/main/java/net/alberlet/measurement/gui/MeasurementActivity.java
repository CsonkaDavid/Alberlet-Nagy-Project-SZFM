package net.alberlet.measurement.gui;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import net.alberlet.measurement.R;
import net.alberlet.measurement.database.MeasurementDatabase;
import net.alberlet.measurement.state.MeasurementSensorManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MeasurementActivity extends AppCompatActivity implements View.OnClickListener {

    private MeasurementSensorManager sensorManager;

    private AppCompatButton measurementButton;

    private TextView measurementTextView;

    private MeasurementDatabase measurementDatabase;

    private SimpleDateFormat simpleDateFormat;

    private boolean isMeasuring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement);
        measurementDatabase = MeasurementDatabase.getInstance(this);
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sensorManager = new MeasurementSensorManager((SensorManager)getSystemService(SENSOR_SERVICE));
        measurementButton = findViewById(R.id.button_toggle_measurement);
        measurementTextView = findViewById(R.id.text_view_measurement);
        measurementTextView.setText("0 m");
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
        float result = sensorManager.unregisterListenersAndGetResult();
        measurementButton.setText("Indítás");
        measurementButton.setBackgroundResource(R.drawable.measurement_button_background);
        measurementTextView.setText(String.format("%.2f", result) + " cm");
        Date date = new Date();
        String formattedDate = simpleDateFormat.format(date);
        measurementDatabase.insertMeasurement(formattedDate,result);
    }

}