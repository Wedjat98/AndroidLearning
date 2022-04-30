package com.example.javademoapp.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateUtil {
    public static String getNowTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(new Date());
    }
}
