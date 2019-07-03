package com.matias.bookings.repository;

import java.util.List;

public interface IRepository<T, A> {

    List<T> findAll();

    void save(T entity);

    void update(T entity);

    T findById(A id);
}
