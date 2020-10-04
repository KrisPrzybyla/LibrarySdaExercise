package dev.kprzybyla.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value;
        resp.setContentType("text/html");
        value = req.getParameter("bookId");
        PrintWriter pw = resp.getWriter();
        pw.println("<html><body bgcolor=green>");
        pw.println("<h3>Book id =" + value);
    }
}
