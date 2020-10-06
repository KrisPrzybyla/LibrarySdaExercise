package dev.kprzybyla.controller;

import dev.kprzybyla.model.Book;
import dev.kprzybyla.repository.BookRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditBook")
public class EditBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookRepository bookRepository =  new BookRepository();
        Book book = bookRepository.find(Long.parseLong(request.getParameter("bookId")));

        request.setAttribute("book", book);
        request.getRequestDispatcher("editBook.jsp").forward(request, response);
    }
}
