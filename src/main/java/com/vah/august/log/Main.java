package com.vah.august.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    static int count = 0;
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("omg {}", new Object());

        for (int i = 0; i < 4; i++) {
            MDC.put("logFileName", getName());
            logger.error("hello");
            MDC.remove("logFileName");
        }

    }

    private static String getName() {
        count++;
        return "omg " + count;
    }


}
