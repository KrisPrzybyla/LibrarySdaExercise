package dev.kprzybyla;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id_book;
    private boolean borrow;
    private String category;
    private String isbn;
    private int pages;
    private int release_date;
    private String summary;
    private String title;
    private int author_id;

    public Book() {}

    public Book(int id_book, boolean borrow, String category, String isbn, int pages,
                int release_date, String summary, String title, int author_id) {
        this.id_book = id_book;
        this.borrow = borrow;
        this.category = category;
        this.isbn = isbn;
        this.pages = pages;
        this.release_date = release_date;
        this.summary = summary;
        this.title = title;
        this.author_id = author_id;
    }

    public Book(long bookId, String title) {
        this.id_book = bookId;
        this.title = title;
    }

    public long getId_book() {
        return id_book;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public String getCategory() {
        return category;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public int getRelease_date() {
        return release_date;
    }

    public String getSummary() {
        return summary;
    }

    public String getTitle() {
        return title;
    }

    public int getAuthor_id() {
        return author_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id_book=" + id_book +
                ", borrow=" + borrow +
                ", category='" + category + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", release_date=" + release_date +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", author_id=" + author_id +
                '}';
    }
}
