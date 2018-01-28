package myProject.booksStore.dao;

import myProject.booksStore.mapper.BookMapper;
import myProject.booksStore.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Armine on 25/01/2018.
 */
@Repository
public class BookDao {
    private  final JdbcTemplate jdbcTemplate;
   @Autowired
    public BookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> loadAll(){
       final String sql = "select * from books";
       List<Book> bookList = jdbcTemplate.query(sql,new BookMapper());
       return bookList;
    }
}
