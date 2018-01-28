package myProject.booksStore.mapper;

import myProject.booksStore.model.entity.Author;
import myProject.booksStore.model.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Armine on 25/01/2018.
 */
public class BookMapper  implements RowMapper<Book>{
    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Integer bookID = resultSet.getInt("bookID");
        String title = resultSet.getString("title");
        Integer authorID = resultSet.getInt("authorID");
        String genre = resultSet.getString("genre");
        Integer publicationDate = resultSet.getInt("publication_date");
        Integer price = resultSet.getInt("price");

        Book book = new Book(bookID,title,authorID,genre,publicationDate,price);
        return book;
    }
}
