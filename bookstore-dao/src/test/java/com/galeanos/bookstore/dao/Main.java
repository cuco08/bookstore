package com.galeanos.bookstore.dao;

import com.galeanos.bookstore.dao.com.galeanos.bookstore.dao.impl.AuthorDAOSqlImpl;
import com.galeanos.bookstore.dao.com.galeanos.bookstore.dao.impl.AuthorDAOXMLImpl;
import com.galeanos.bookstore.model.Author;

import java.util.Date;

public class Main {

    public static void processAuthor(AuthorDAO authorDAO) {
        // 1. Create author
        Author author = new Author();
        author.setName("Jose");
        author.setLastName("Saramago");
        int id = authorDAO.create(author);

        // 2. Find author by id
        Author authorFound = authorDAO.read(id);

        // 3. Update author
        authorFound.setBirthday(new Date());
        authorDAO.update(authorFound);

        // 4. Delete author
        boolean success = authorDAO.delete(id);

        if(success) {
            System.out.println("Author processed successfully!");
        }
    }

    public static void main(String[] args) {
        AuthorDAO authorDAOXml = new AuthorDAOXMLImpl();
        //authorDAOXml.create(new Author());
        //authorDAOXml.read(0);
        //authorDAOXml.update(new Author());
        //authorDAOXml.delete(0);

        AuthorDAO authorDAOSql = new AuthorDAOSqlImpl();
        //authorDAOXml.create(new Author());
        //authorDAOXml.read(0);
        //authorDAOXml.update(new Author());
        //authorDAOXml.delete(0);

        processAuthor(authorDAOSql);
        // processAuthor(authorDAOTxt);
        // processAuthor(authorDAOSqlCassandra);
        // processAuthor(authorDAOSql);
    }
}
