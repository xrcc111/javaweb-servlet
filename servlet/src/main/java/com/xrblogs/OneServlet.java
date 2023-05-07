package com.xrblogs;

import utils.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

/**
 * @author xurui
 * @create 2023-05-07 22:29
 */
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection =  JDBCUtil.getConnection();
        System.out.println(connection);
        resp.getWriter().write("Hello World");
    }
}
