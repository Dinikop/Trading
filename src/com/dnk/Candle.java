package com.dnk;

public class Candle {
    private final String DATE;
    private final String TIME;
    private final float OPEN;
    private final float HIGH;
    private final float LOW;
    private final float CLOSE;
    private final int VOL;


    public Candle(String DATE, String TIME, float OPEN, float HIGH, float LOW, float CLOSE, int VOL) {
        this.DATE = DATE;
        this.TIME = TIME;
        this.OPEN = OPEN;
        this.HIGH = HIGH;
        this.LOW = LOW;
        this.CLOSE = CLOSE;
        this.VOL = VOL;
    }

    public Candle(String data) {
        //format
        //DATE, TIME, OPEN, HIGH, LOW, CLOSE, VOL

        //format DATE
        //YYYYMMDD

        //format TIME
        //HHMMSS

        this(data.split(",")[0],
                data.split(",")[1],
                Float.parseFloat(data.split(",")[2]),
                Float.parseFloat(data.split(",")[3]),
                Float.parseFloat(data.split(",")[4]),
                Float.parseFloat(data.split(",")[5]),
                Integer.parseInt(data.split(",")[6]));
    }

    public String getDATE() {
        return DATE;
    }

    public String getTIME() {
        return TIME;
    }

    public float getOPEN() {
        return OPEN;
    }

    public float getHIGH() {
        return HIGH;
    }

    public float getLOW() {
        return LOW;
    }

    public float getCLOSE() {
        return CLOSE;
    }

    public int getVOL() {
        return VOL;
    }
}
