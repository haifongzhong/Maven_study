package org.example.controller;

import org.example.sevice.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: UserServlet
 * @description: TODO
 * @author: haifongzhong
 * @date: 2023/03/08 11:21
 * @Company: Copyright© [2023/03/08] by [heifongzhong]
 **/

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.service(req, resp);
        System.out.println("UserServlet Test ...");
        // 调用maven_service模块的方法
        UserService.testService();
    }
}
