package com.matias.school.repository;

import java.util.List;

public interface IRepository<T> {

    List<T> findAll();

    void save(T entity);

}
