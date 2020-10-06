package dev.kprzybyla.controller;

import dev.kprzybyla.model.Book;
import dev.kprzybyla.repository.BookRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        BookRepository bookRepository = new BookRepository();

        List<Book> bookList = bookRepository.findAll();

        if (bookList != null) {
            for (Book book : bookList) {
                System.out.println(book.toString());
            }
        }

        request.setAttribute("books", bookList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
