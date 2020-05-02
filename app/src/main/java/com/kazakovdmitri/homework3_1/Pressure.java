package com.kazakovdmitri.homework3_1;

import java.util.Date;

public class Pressure {
    private int upPressure;
    private int downPressure;
    private int pulse;
    private String tachikardya;
    private String date;

    public Pressure(int upPressure, int downPressure, int pulse, String tachikardya, String date) {
        this.upPressure = upPressure;
        this.downPressure = downPressure;
        this.pulse = pulse;
        this.tachikardya = tachikardya;
        this.date = date;
    }

}
