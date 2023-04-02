package ru.javarush.november.sukharev.questnovember.servlet;

import ru.javarush.november.sukharev.questnovember.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletRegistration", value = "/registration")
public class ServletRegistration extends HttpServlet {

    private static int ID = 1;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        User user = new User(username, ID++);

        request.setAttribute("user", user);
        getServletContext()
                .getRequestDispatcher("/hello.jsp")
                .forward(request, response);
    }
}
