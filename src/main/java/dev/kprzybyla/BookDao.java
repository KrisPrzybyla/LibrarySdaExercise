package dev.kprzybyla;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDao {

    public Book get(Long id) {
        Session session = HibernateSession.INSTANCE.getSessionFactory().openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

    public void save() {
        Session session = HibernateSession.INSTANCE.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        try {
            session.save(new Book(1L, "AAA"));
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
