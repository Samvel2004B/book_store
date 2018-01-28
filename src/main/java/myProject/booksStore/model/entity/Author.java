package myProject.booksStore.model.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by Armine on 25/01/2018.
 */

public class Author {
    private Integer authorID;
    private String name;
    private String nationality;

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Author() {

    }

    public Author(Integer authorID, String name, String nationality) {

        this.authorID = authorID;
        this.name = name;
        this.nationality = nationality;
    }
}
