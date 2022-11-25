package com.haruma.seatcharter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    private SimpleDateFormat dateTimeFormat;
    private Date date;
    public DateTimeUtil() {
        date = new Date();
    }
    public String getTimeWithMil() {
        dateTimeFormat = new SimpleDateFormat("HH::mm:ss.SS");
        return dateTimeFormat.format(date);
    }
}
