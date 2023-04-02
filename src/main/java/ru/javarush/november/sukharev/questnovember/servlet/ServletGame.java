package ru.javarush.november.sukharev.questnovember.servlet;

import ru.javarush.november.sukharev.questnovember.entity.MathematicalExpression;
import ru.javarush.november.sukharev.questnovember.service.MathematicalExpressionService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "ServletGame", value = "/game")
public class ServletGame extends HttpServlet {

    static private long counter;
    private final MathematicalExpressionService service = MathematicalExpressionService.MATH_SERVICE;
    private final Collection<MathematicalExpression> expressions = service.getAll();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (counter < expressions.size()) {
            String result = request.getParameter("result");
            if (result == null) {
                for (MathematicalExpression me: expressions) {
                    if (me.getId() == ++counter) {
                        request.setAttribute("expression", me);
                        break;
                    }
                }
                getServletContext()
                        .getRequestDispatcher("/game.jsp")
                        .forward(request, response);
            } else {
                for (MathematicalExpression me: expressions) {
                    if (me.getId() == counter) {
                        int meaning = Integer.parseInt(result);
                        if (meaning == me.getResult()) {
                            ++counter;
                            for (MathematicalExpression mathematicalExpression: expressions) {
                                if (mathematicalExpression.getId() == counter) {
                                    request.setAttribute("expression", mathematicalExpression);
                                }
                            }
                            getServletContext()
                                    .getRequestDispatcher("/game.jsp")
                                    .forward(request, response);
                        } else {
                            getServletContext()
                                    .getRequestDispatcher("/goodbye.jsp")
                                    .forward(request, response);
                        }
                    }
                }
            }
        } else {
            counter = 0;
            getServletContext()
                    .getRequestDispatcher("/goodbye.jsp")
                    .forward(request, response);
        }
    }
}
