package myProject.booksStore.model.entity;



/**
 * Created by Armine on 25/01/2018.
 */

public class Book {
    private Integer bookID;
    private String title;
    private Integer authorID;
    private String  genre;
    private Integer publicationDate;
    private  Integer price;

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

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book() {

    }

    public Book(Integer bookID, String title, Integer authorID, String genre, Integer publicationDate, Integer price) {
        this.bookID = bookID;
        this.title = title;
        this.authorID = authorID;
        this.genre = genre;
        this.publicationDate = publicationDate;
        this.price = price;
    }
}
