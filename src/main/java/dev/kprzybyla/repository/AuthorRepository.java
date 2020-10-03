package dev.kprzybyla.repository;

import dev.kprzybyla.model.Author;
import dev.kprzybyla.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AuthorRepository extends GenericRepository<Author, Long>{
}
