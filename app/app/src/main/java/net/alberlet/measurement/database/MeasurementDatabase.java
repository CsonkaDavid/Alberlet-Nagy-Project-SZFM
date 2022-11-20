package net.alberlet.measurement.database;

import android.app.Activity;

import androidx.room.Room;

import net.alberlet.measurement.database.entity.Measurement;

import java.util.List;

public class MeasurementDatabase {
    private final AppDatabase database;

    public MeasurementDatabase(Activity activity) {
        database = Room.databaseBuilder(activity.getApplicationContext(),
                AppDatabase.class, "MeasurementDatabase").allowMainThreadQueries().build();
    }

    public List<Measurement> getMeasurements() {
        return database.measurementDao().getAllMeasurements();
    }

    public void insertMeasurement(String date, double meters) {
        Measurement measurement = new Measurement(date, meters);

        database.measurementDao().insertNewMeasurement(measurement);
    }
}
