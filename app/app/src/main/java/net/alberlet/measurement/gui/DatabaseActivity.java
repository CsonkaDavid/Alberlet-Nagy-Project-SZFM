package net.alberlet.measurement.gui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.measurement.R;
import net.alberlet.measurement.database.MeasurementDatabase;
import net.alberlet.measurement.database.entity.Measurement;

public class DatabaseActivity extends AppCompatActivity {


    LinearLayout measurementList;
    MeasurementDatabase database;
    TextView t1;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        database=new MeasurementDatabase(this);
        measurementList=findViewById(R.id.dataBaseLayout);
        t1=findViewById(R.id.textViewasd);
        t2=findViewById(R.id.textView2asd);
    }


    private void fillViewWithDatas(){
        for(int i=0; i<database.getMeasurements().size();i++){
            Measurement current = database.getMeasurements().get(i);
            TextView t1 = new TextView(this,null, R.attr.text_view_style);
            TextView t2 = new TextView(this,null, R.attr.text_view_style);
            t1.setText(current.date);
            t2.setText(Double.toString(current.meter));
            LinearLayout l= new LinearLayout(this);
            l.addView(t1);
            l.addView(t2);
            measurementList.addView(l);
        }
    }
}