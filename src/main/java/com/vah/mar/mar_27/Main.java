package com.vah.mar.mar_27;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime timeOfDay = LocalTime.MIN.plusSeconds(60);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = timeOfDay.format(dateTimeFormatter);

        System.out.println(time);
    }
}
