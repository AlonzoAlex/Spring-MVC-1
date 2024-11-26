package es.pildoras.spring.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletJava")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.getWriter().println("Hola desde el servlet");

        RequestDispatcher dispatcher= req.getRequestDispatcher("/WEB-INF/vistas/indexSer.jsp");
        dispatcher.forward(req, resp);

    }
}