package net.alberlet.measurement.state;

public class Dimensions {

    private final float x;

    private final float y;

    private final float z;

    private long timestamp;

    public Dimensions(float x, float y, float z, long timestamp) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.timestamp = timestamp;
    }

    public void correctTimestamp(float correction){
        this.timestamp-=correction;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public long getTimestamp() {
        return timestamp;
    }
}