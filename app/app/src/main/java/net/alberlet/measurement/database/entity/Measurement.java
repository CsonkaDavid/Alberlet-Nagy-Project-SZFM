package net.alberlet.measurement.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Measurement {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public Measurement() {}

    public Measurement(String date, double centimeter) {
        this.date = date;
        this.centimeter = centimeter;
    }

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "centimeter")
    public double centimeter;
}
