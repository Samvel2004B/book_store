package myProject.booksStore.dao;

import myProject.booksStore.mapper.AuthorMapper;
import myProject.booksStore.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armine on 25/01/2018.
 */
@Repository
public class AuthorDao {
    private final JdbcTemplate jdbcTemplate;
@Autowired
    public AuthorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> loadAll(){
    final String sql = "select * from authors";
    List<Author> authorList = jdbcTemplate.query(sql,new AuthorMapper());
        return  authorList;
    }

    public String  getAuthorByID(Integer authorID) {
        final  String sql = "select * from authors where authorID = ?";
         return jdbcTemplate.queryForObject(sql,new AuthorMapper(),authorID).getName();
    }
}
