package net.alberlet.measurement.gui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.measurement.R;
import net.alberlet.measurement.database.MeasurementDatabase;
import net.alberlet.measurement.database.entity.Measurement;

import java.util.List;

public class DatabaseActivity extends AppCompatActivity {

    LinearLayout measurementList;
    MeasurementDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        database = MeasurementDatabase.getInstance(this);
        measurementList = findViewById(R.id.dataBaseLayout);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        fillScrollViewWithData();
    }

    private void fillScrollViewWithData() {
        List<Measurement> measurements = database.getMeasurements();

        for (int i = 0; i < measurements.size(); i++) {
            Measurement measurement = measurements.get(i);
            TextView t1 = new TextView(this);
            TextView t2 = new TextView(this);
            t1.setText(measurement.date);
            t2.setText(Double.toString(measurement.centimeter));
            t1.setTextColor(Color.WHITE);
            t2.setTextColor(Color.WHITE);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            int headerLayoutWidth = measurementList.getWidth();

            t1.setWidth(headerLayoutWidth/2);
            t2.setWidth(headerLayoutWidth/2);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.addView(t1);
            linearLayout.addView(t2);
            measurementList.addView(linearLayout);
        }
    }
}