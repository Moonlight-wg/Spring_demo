package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post方式下，设置编码，防止中文乱码
        req.setCharacterEncoding("UTF-8");
        String fname = req.getParameter("fname");
        String price = req.getParameter("price");
        Integer i = Integer.parseInt(price);
        String fcount = req.getParameter("fcount");
        Integer i1 = Integer.parseInt(fcount);
        String remark = req.getParameter("remark");

        System.out.println("fname = " + fname);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        System.out.println("remark = " + remark);
    }

}
