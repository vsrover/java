//package com.vah.may.may_31;
//
//import javax.xml.bind.DatatypeConverter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.TimeZone;
//
//public class Main {
//    public static void main(String[] args) {
//        String startDate = "2021-05-19T00:00:00";
//        String endDate = "2021-05-20T00:00:00";
//        String date = "2021-05-20T00:00:00";
//        Date min = DatatypeConverter.parseDateTime(startDate).getTime();
//        Date max = DatatypeConverter.parseDateTime(endDate).getTime();
//        Date d = DatatypeConverter.parseDateTime(date).getTime();
//
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
////        String stringStartDate = simpleDateFormat.format(startDate);
//
////        System.out.println(!d.before(min) && !d.after(max));
//        Date date1 = fromString("");
//    }
//
//    public static Date fromString(String date) {
//        try {
//            TimeZone var0 = TimeZone.getTimeZone("UTC");
//            SimpleDateFormat var1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
//            var1.setTimeZone(var0);
//            return var1.parse(date);
//        } catch (ParseException ex) {
//            throw new RuntimeException(ex);
//        }
//    }
//}
