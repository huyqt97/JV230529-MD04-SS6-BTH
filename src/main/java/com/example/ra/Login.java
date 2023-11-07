package com.example.ra;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        if("admin".equals(userName) && "admin".equals(password)) {
            writer.println("<h1> Chào " + userName + "</h1>");
        } else if (userName.equals("") || password.equals("")){
            writer.println("<h2> Login Error </h2>");
        }
        else {
            writer.println("<b> Xin chào " + userName + " </b>" );
        }
        writer.println("</html>");
    }

}