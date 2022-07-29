package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo03")
public class Demo03Service extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向session保存作用域保存数据
       req.getSession().setAttribute("name","kan");
        //进行客户端重定向
//        resp.sendRedirect("/demo02");
        req.getRequestDispatcher("/demo04").forward(req,resp);
    }
}
