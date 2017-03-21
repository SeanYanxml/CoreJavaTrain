package com.us.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
    private static final String formatStr = "HH:mm";
    private static SimpleDateFormat sdf=new SimpleDateFormat(formatStr);

    public static void main(String args[]) throws ParseException {
        String tS = "16:00";
        String tE = "16:10";
        if(isInZone(getLong(tS),getLong(tE),getCurrentTime())){
            // Your Code
        	System.out.println("Warn!");
        }
    }

    private static boolean isInZone(long tStart,long tEnd,long t) throws ParseException {
        return tStart <= t && t <= tEnd;
    }
    
    private static long getLong(String timeStr) throws ParseException {
        return sdf.parse(timeStr).getTime();
    }

    private static long getCurrentTime() throws ParseException {
        return getLong(sdf.format(new Date()));
    }

}
