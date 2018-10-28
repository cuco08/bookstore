package com.galeanos.bookstore.dao.com.galeanos.bookstore.dao.impl;

import com.galeanos.bookstore.dao.BookDAO;
import com.galeanos.bookstore.model.Book;

public class BookDAOImpl implements BookDAO {
    public int create(Book book) {
        System.out.println("Book created successfully!");
        return 0;
    }

    public Book read(int id) {
        Book book = new Book();
        System.out.println("Book was found!");
        return book;
    }

    public boolean update(Book book) {
        System.out.println("Book was updated successfully!");
        return false;
    }

    public boolean delete(int id) {
        System.out.println("Book was deleted successfully!");
        return false;
    }
}
