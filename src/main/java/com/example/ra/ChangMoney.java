package com.example.ra;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ChangMoney", value = "/changmoney")
public class ChangMoney extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Float VND = Float.valueOf(req.getParameter("vnd"));
        Float USD = Float.valueOf(req.getParameter("usd"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if(VND != 0 && USD == 0) {
            writer.println("<h3>Chuyển đổi " +VND+  " VND sang USD bằng: "+ VND/22000 + "</h3>");
        } else if (VND == 0 && USD != 0) {
            writer.println("<h3>Chuyển đổi " +USD+  " USD sang VND bằng: "+ USD*22000 + "</h3>");
        } else {
            writer.println("<h3>Không thể chuyển đổi.</h3>");
        }
        writer.println("</html>");
    }

}