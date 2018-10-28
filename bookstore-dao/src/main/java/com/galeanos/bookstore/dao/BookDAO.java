package com.galeanos.bookstore.dao;

import com.galeanos.bookstore.model.Book;

public interface BookDAO {
    int create(Book book);

    Book read(int id);

    boolean update(Book book);

    boolean delete(int id);
}
