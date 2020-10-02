package dev.kprzybyla;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDao();
        bookDao.save();
        System.out.println(bookDao.get(1L));
    }
}
