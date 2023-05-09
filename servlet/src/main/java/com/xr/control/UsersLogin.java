package com.xr.control;

import com.xr.dto.UsersDto;
import com.xr.service.UsersService;
import com.xr.service.impl.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xurui
 * @create 2023-05-08 22:34
 */
// 添加注解
@WebServlet("/login")
public class UsersLogin extends HttpServlet {
    private UsersService usersService = new UsersServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UsersDto usersDto = usersService.login(username, password);
        if(usersDto.getCode() == -1) {
            req.setAttribute("usernameError","用户名不存在");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        if(usersDto.getCode() == -2) {
            req.setAttribute("passwordError","密码错误");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        if(usersDto.getCode() == 0) {
            System.out.println("登录成功");
        }
    }
}
