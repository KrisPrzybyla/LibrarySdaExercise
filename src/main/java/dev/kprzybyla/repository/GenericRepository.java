package dev.kprzybyla.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class GenericRepository<T, K> {
    protected final EntityManager entityManager;
    protected final Class<T> entityClass;
    protected final EntityTransaction transaction;

    protected GenericRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        this.entityManager = EntityManagerUtil.entityManager();
        this.transaction = entityManager.getTransaction();
    }

    public void add(T entity) {
        transaction.begin();
        entityManager.persist(entity);
        transaction.commit();
    }

    public T find(K id) {
        return entityManager.find(entityClass, id);
    }

    public List<T> findAll() {
        return entityManager.createQuery("select b from " + entityClass.getSimpleName() + " b", entityClass)
                .getResultList();
    }

    public T update(T entity) {
        transaction.begin();
        entityManager.merge(entity);
        transaction.commit();
        return entity;
    }

    public void delete(K id) {
        transaction.begin();
        T read = find(id);
        entityManager .remove(read);
        transaction.commit();
    }
}
