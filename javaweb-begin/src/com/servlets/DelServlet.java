package com.servlets;

import com.fruit.dao.FruitDAO;
import com.fruit.dao.impl.FruitDAOImpl;
import com.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del.do")
public class DelServlet extends ViewBaseServlet{
    private FruitDAO fruitDAO = new FruitDAOImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        if (StringUtil.isNotEmpty(fid)){
            int fid1 = Integer.parseInt(fid);
            fruitDAO.delFruit(fid1);
//            super.processTemplate("index",req,resp);
            resp.sendRedirect("index");
        }
    }
}
