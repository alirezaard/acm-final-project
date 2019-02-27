package org.acm_class_room.dao.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HibernateUtility {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static SessionFactory factory;

    public static Session getSession() {

        factory = new Configuration().configure("config.properties").buildSessionFactory();
        logger.log(Level.INFO, "try to get session and transaction");
        if (factory.getCurrentSession() == null) {
            return factory.openSession();
        }
        return factory.getCurrentSession();
    }

}
