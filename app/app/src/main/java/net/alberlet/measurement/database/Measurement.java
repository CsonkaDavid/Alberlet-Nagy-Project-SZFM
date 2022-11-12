package net.alberlet.measurement.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Measurement {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "meter")
    public String meter;
}
