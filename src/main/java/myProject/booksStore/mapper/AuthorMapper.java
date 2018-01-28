package myProject.booksStore.mapper;

import myProject.booksStore.model.entity.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 25/01/2018.
 */
public class AuthorMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Integer authorID = resultSet.getInt("authorID");
        String name = resultSet.getString("Name");
        String nationality = resultSet.getString("nationality");
        Author author = new Author(authorID, name,nationality);
        return author;
    }
}
