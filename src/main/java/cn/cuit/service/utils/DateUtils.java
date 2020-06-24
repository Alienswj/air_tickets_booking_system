package cn.cuit.service.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
    public static Date DateRemoveTime(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(date);
        return sdf.parse(s);
    }

    public static Date StringToDate(String date) throws ParseException {
        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        fmt.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return fmt.parse(date);
    }
}
