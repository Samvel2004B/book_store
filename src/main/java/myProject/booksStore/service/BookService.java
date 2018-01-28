package myProject.booksStore.service;

import myProject.booksStore.dao.AuthorDao;
import myProject.booksStore.dao.BookDao;
import myProject.booksStore.model.dto.Bookk;
import myProject.booksStore.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Armine on 25/01/2018.
 */
@Service
public class BookService {
    private final BookDao bookDao;
    private final AuthorDao authorDao;
    @Autowired
    public BookService(BookDao bookDao,AuthorDao authorDao) {
        this.bookDao = bookDao;
        this.authorDao=authorDao;
    }

    public List<Bookk> loadAll() {
        List<Book> books = bookDao.loadAll();
        List<Bookk> bookkList = new ArrayList<>();
        for(Book book : books){
            bookkList.add(new Bookk(book.getBookID(),
                    book.getTitle(),authorDao.getAuthorByID(book.getAuthorID()),
                    book.getGenre(),book.getPublicationDate(),book.getPrice()));
        }
        return bookkList;
    }
}
