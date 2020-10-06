package dev.kprzybyla.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BookOperations")
public class BookOperations extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        switch (action) {
            case "edit":
                req.getRequestDispatcher("EditBook").forward(req, resp);
                break;
            case "remove":
                resp.sendRedirect("pageNotFound.jsp");
                break;
            case "borrow":
                resp.sendRedirect("pageNotFound.jsp");
                break;
            default:
                resp.sendRedirect("pageNotFound.jsp");
        }
    }
}
