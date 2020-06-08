package cn.cuit.service.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date DateRemoveTime(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(date);
        return sdf.parse(s);
    }
}
