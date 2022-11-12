package net.alberlet.measurement.database;

import androidx.room.RoomDatabase;

import net.alberlet.measurement.database.dao.MeasurementDao;
import net.alberlet.measurement.database.entity.Measurement;

@androidx.room.Database(entities = {Measurement.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MeasurementDao measurementDao();
}
