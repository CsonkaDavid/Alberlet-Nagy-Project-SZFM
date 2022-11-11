package net.alberlet.measurement.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import net.alberlet.measurement.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onStartButtonClick(View view) {
        Intent intent = new Intent(this, MeasurementActivity.class);
        startActivity(intent);
    }

    public void onDatabaseButtonClick(View view) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void onQuitButtonClick(View view) {
        finish();
        System.exit(0);
    }
}