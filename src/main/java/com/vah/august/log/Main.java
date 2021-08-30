package com.vah.august.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Logger logger2 = LoggerFactory.getLogger("integration-transaction-err");

    public static void main(String[] args) {
        logger.error("omg {}", new Object());
        logger2.error(" fuck {}", new Analitic(1, "Fuck"));
    }
}

class Analitic {
    int i;
    String s;

    public Analitic(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Analitic{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}