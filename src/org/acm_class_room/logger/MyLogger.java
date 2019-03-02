package org.acm_class_room.logger;

import java.io.IOException;
import java.util.logging.*;

public class MyLogger {
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;

    static public Logger loggerRegister() {

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        logger.setLevel(Level.FINE);
        try {
            fileTxt = new FileHandler("log.txt");
            fileHTML = new FileHandler("log.html");
        } catch (IOException exp) {
            System.out.println(exp);
        }

        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

        formatterHTML = new MyHtmlFormatter();
        fileHTML.setFormatter(formatterHTML);
        logger.addHandler(fileHTML);
        return logger;
    }
}