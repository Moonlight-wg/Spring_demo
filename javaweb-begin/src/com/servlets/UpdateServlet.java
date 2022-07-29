package com.servlets;

import com.fruit.dao.FruitDAO;
import com.fruit.dao.impl.FruitDAOImpl;
import com.fruit.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update.do")
public class UpdateServlet extends ViewBaseServlet{

    private FruitDAO fruitDAO = new FruitDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post方式下，设置编码，防止中文乱码
        req.setCharacterEncoding("UTF-8");
        String f = req.getParameter("fid");
        int fid = Integer.parseInt(f);
        String fname = req.getParameter("fname");
        String p = req.getParameter("price");
        Integer price = Integer.parseInt(p);
        String fc = req.getParameter("fcount");
        Integer fcount = Integer.parseInt(fc);
        String remark = req.getParameter("remark");

        fruitDAO.updateFruit(new Fruit(fid,fname,price,fcount,remark));

//        super.processTemplate("index",req,resp);
        resp.sendRedirect("index");
    }
}
