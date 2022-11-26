package net.alberlet.measurement.database;

import android.content.Context;

import androidx.room.Room;

import net.alberlet.measurement.database.entity.Measurement;

import java.util.List;

public class MeasurementDatabase {
    private AppDatabase database;
    private static MeasurementDatabase instance;

    private MeasurementDatabase(){}

    private MeasurementDatabase(Context context) {
        database = Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class, "MeasurementDatabase.db").allowMainThreadQueries().build();
    }

    public static MeasurementDatabase getInstance(Context context){
        if(instance==null){
            instance = new MeasurementDatabase(context);
        }
        return instance;
    }

    public List<Measurement> getMeasurements() {
        return database.measurementDao().getAllMeasurements();
    }

    public void insertMeasurement(String date, double meters) {
        Measurement measurement = new Measurement(date, meters);

        database.measurementDao().insertNewMeasurement(measurement);
    }

}
