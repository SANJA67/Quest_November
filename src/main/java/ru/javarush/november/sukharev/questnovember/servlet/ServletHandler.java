package ru.javarush.november.sukharev.questnovember.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletHandler", value = "/handler")
public class ServletHandler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = request.getParameter("result");
        System.out.println(request.getAttribute("expression"));
        System.out.println(result);
        //if (requestScope.)
    }
}
