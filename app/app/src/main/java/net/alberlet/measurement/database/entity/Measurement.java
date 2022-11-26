package net.alberlet.measurement.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Measurement {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public Measurement() {}

    public Measurement(String date, double meter) {
        this.date = date;
        this.meter = meter;
    }

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "meter")
    public double meter;
}
