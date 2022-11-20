package net.alberlet.measurement.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import net.alberlet.measurement.database.entity.Measurement;

import java.util.List;

@Dao
public interface MeasurementDao {
    @Query("SELECT * from measurement")
    List<Measurement> getAllMeasurements();

    @Transaction
    @Insert
    void insertNewMeasurement(Measurement measurement);
}
