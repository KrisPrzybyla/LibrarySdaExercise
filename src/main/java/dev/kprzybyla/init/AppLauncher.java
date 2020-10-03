package dev.kprzybyla.init;

import dev.kprzybyla.model.Author;
import dev.kprzybyla.model.Book;
import dev.kprzybyla.model.BookCategory;
import dev.kprzybyla.repository.AuthorRepository;
import dev.kprzybyla.repository.BookRepository;
import dev.kprzybyla.repository.GenericRepository;

import java.lang.management.GarbageCollectorMXBean;

public class AppLauncher {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        AuthorRepository authorRepository = new AuthorRepository();

//        Author author = new Author();
//        author.setFirstName("Jo");
//        author.setLastName("Nesbø");
//        author.setBirthPlace("Oslo");
//
//        authorRepository.add(author);
//
//        Author author2 = new Author();
//        author2.setFirstName("Remigiusz");
//        author2.setLastName("Mróz");
//        author2.setBirthPlace("Opole");
//
//        authorRepository.add(author2);
//
//        Book book = new Book();
//        book.setBookCategory(BookCategory.CRIME);
//        book.setBorrow(false);
//        book.setIsbn("1");
//        book.setPages(123);
//        book.setSummary("Lorem ipsum");
//        book.setTitle("Czerwone gardło");
//        book.setReleaseDate(2000);
//        book.setAuthor(author);
//        bookRepository.add(book);
//
//        Book book2 = new Book();
//        book2.setBookCategory(BookCategory.CRIME);
//        book2.setBorrow(false);
//        book2.setIsbn("2");
//        book2.setPages(123);
//        book2.setSummary("Lorem ipsum");
//        book2.setTitle("Upiory");
//        book2.setReleaseDate(2011);
//        book2.setAuthor(author);
//        bookRepository.add(book2);

        for (Book book : bookRepository.findAll()) {
            System.out.println(book.toString() + "\n");
        }
    }
}
