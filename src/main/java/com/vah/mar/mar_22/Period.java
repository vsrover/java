package com.vah.mar.mar_22;

import java.util.Date;

public final class Period {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException();
        }

//        this.start = start;
//        this.end = end;

    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(end);
        end.setYear(78);
        System.out.println(end);
        System.out.println(period);
    }

    public static void omg(){

    }

    public  void omg(int i){

    }
}