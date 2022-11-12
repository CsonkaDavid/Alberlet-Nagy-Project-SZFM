package net.alberlet.measurement.gui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import net.alberlet.measurement.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton MeasurementButton;

    private AppCompatButton DatabaseButton;

    private AppCompatButton QuitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MeasurementButton = findViewById(R.id.button_measurement);
        DatabaseButton = findViewById(R.id.button_database);
        QuitButton = findViewById(R.id.button_quit);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_measurement:
                onStartButtonClick(v);
                break;

            case R.id.button_database:
                onDatabaseButtonClick(v);
                break;

            case R.id.button_quit:
                onQuitButtonClick(v);
                break;

            default:
                break;
        }
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