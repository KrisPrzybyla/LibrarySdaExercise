package dev.kprzybyla.controller;

import dev.kprzybyla.model.Author;
import dev.kprzybyla.model.Book;
import dev.kprzybyla.model.BookCategory;
import dev.kprzybyla.repository.AuthorRepository;
import dev.kprzybyla.repository.BookRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AuthorRepository authorRepository = new AuthorRepository();
        List<Author> authorList = authorRepository.findAll();
        if (authorList != null) {
            for (Author  author: authorList) {
                System.out.println(author.toString());
            }
        }
        req.setAttribute("authors", authorList);
        req.setAttribute("categories", BookCategory.values());

        req.getRequestDispatcher("addBook.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookRepository bookRepository = new BookRepository();
        AuthorRepository authorRepository = new AuthorRepository();

        Book book = new Book();

        book.setTitle(request.getParameter("title"));
        book.setAuthor(authorRepository.find(Long.parseLong(request.getParameter("author"))));
        book.setBookCategory(BookCategory.valueOf(request.getParameter("category")));
        book.setReleaseDate(Integer.parseInt(request.getParameter("release")));
        book.setSummary(request.getParameter("summary"));
        book.setPages(Integer.parseInt(request.getParameter("pages")));
        book.setIsbn(request.getParameter("isbn"));

        bookRepository.add(book);

        response.sendRedirect("HomeServlet");
    }
}
