package org.acm_class_room.dao.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionPool {
    Connection getConnection() throws SQLException;

    boolean releaseConnection(Connection connection);

    String getUrl();

    String getUser();

    String getPassword();
}
