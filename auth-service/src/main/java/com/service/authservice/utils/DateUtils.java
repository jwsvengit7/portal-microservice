package com.service.authservice.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class DateUtils {

    public static String converted(LocalDate localDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(localDate);

    }
}
