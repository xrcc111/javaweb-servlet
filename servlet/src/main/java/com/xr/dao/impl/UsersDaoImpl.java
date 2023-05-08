package com.xr.dao.impl;

import com.sun.org.apache.regexp.internal.REUtil;
import com.xr.dao.UsersDao;
import com.xr.entity.Users;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xurui
 * @create 2023-05-08 22:56
 */
public class UsersDaoImpl implements UsersDao {
    @Override
    public Users findByUsersName(String username) {
        Connection connection  = JDBCUtil.getConnection();
        String sql = "select * from users where username = ?";

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,username);
            resultSet = statement.executeQuery();
            // 如果能查询到
            if(resultSet.next()) {
                int userId = resultSet.getInt(1);
                username = resultSet.getString(2);
                String password = resultSet.getString(3);
               return new Users(userId, username, password);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(connection, statement, resultSet);
        }
        return null;
    }
}
