package com.example.ra;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Translate", value = "/translate")
public class Translate extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("txtSearch");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if(result != null){
            writer.println("Word: "+ search);
            writer.println("Result: "+ result);
        } else {
            writer.println("ERROR");
        }
        writer.println("</html>");

    }

}