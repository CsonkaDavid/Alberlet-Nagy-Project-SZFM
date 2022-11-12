package net.alberlet.measurement.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MeasurementDao {
    @Query("SELECT * from measurement")
    List<Measurement> getAllMeasurements();
    
    @Insert
    void insertNewMeasurement(Measurement measurement);
}
