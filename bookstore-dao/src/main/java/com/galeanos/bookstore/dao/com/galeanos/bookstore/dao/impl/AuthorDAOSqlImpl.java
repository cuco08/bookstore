package com.galeanos.bookstore.dao.com.galeanos.bookstore.dao.impl;

import com.galeanos.bookstore.dao.AuthorDAO;
import com.galeanos.bookstore.model.Author;

public class AuthorDAOSqlImpl implements AuthorDAO {
    public int create(Author author) {
        System.out.println("SQL | Author created successfully!");
        return 0;
    }

    public Author read(int id) {
        Author author = new Author();
        System.out.println("SQL | Author was found!");
        return author;
    }

    public boolean update(Author author) {
        System.out.println("SQL | Author was updated successfully!");
        return true;
    }

    public boolean delete(int id) {
        System.out.println("SQL | Author was deleted successfully!");
        return true;
    }
}
