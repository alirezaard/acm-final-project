package org.acmClassRoom.dao.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.logging.Logger;

public class HibernateUtility {
    final static Logger logger = Logger.getLogger(HibernateUtility.class.getName());

    private static SessionFactory factory;

    public static Session getSession() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        //logger.log("Try to get Session");
        factory = new Configuration().configure("config.properties").buildSessionFactory();
        if (factory.getCurrentSession() == null) {
            return factory.openSession();
        }
        return factory.getCurrentSession();
    }

}
