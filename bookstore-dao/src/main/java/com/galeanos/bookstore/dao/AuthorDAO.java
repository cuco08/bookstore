package com.galeanos.bookstore.dao;

import com.galeanos.bookstore.model.Author;

public interface AuthorDAO {
    int create(Author author);

    Author read(int id);

    boolean update(Author author);

    boolean delete(int id);
}
