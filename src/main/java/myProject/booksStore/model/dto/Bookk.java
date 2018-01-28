package myProject.booksStore.model.dto;

/**
 * Created by Armine on 25/01/2018.
 */
public class Bookk {
    private Integer bookID;
    private String title;
    private String author;
    private String  genre;
    private Integer publicationDate;

    public Bookk(Integer bookID, String title, String author, String genre, Integer publicationDate) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationDate = publicationDate;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Bookk() {

    }
}
