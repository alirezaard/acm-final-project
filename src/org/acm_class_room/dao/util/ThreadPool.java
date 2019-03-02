package org.acm_class_room.dao.util;

import org.acm_class_room.logger.MyLogger;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ThreadPool {
    private static final ExecutorService EXECUTOR_SERVICE;
    private static final int Max_Number_Of_Thread;
    private static final Logger logger;

    static {
        Properties props = new Properties();
        logger = MyLogger.loggerRegister();
        try {
            props.load(Properties.class.getResourceAsStream("/config.properties"));
        } catch (IOException ex) {
            logger.log(Level.WARNING, "WE Have an Error On read properties file!!!");
        }
        final String maxNumberOfThread = props.getProperty("Max_Number_Of_Thread");
        Max_Number_Of_Thread = Integer.valueOf(maxNumberOfThread);
        EXECUTOR_SERVICE = Executors.newFixedThreadPool(Max_Number_Of_Thread);
        logger.log(Level.FINE, "we have " + Max_Number_Of_Thread + " threads in Thread Pool");
    }

    public static ExecutorService getThreadPool() {
        return EXECUTOR_SERVICE;
    }
}
