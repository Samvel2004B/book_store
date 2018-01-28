package myProject.booksStore.controller;

import myProject.booksStore.model.dto.Bookk;
import myProject.booksStore.model.entity.Book;
import myProject.booksStore.service.AuthorService;
import myProject.booksStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Armine on 25/01/2018.
 */
@RestController
@RequestMapping(value = "/")
public class MainController {

    private final AuthorService authorService;
    private final BookService bookService;

    @Autowired
    public MainController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }



    @RequestMapping("/")
    public ModelAndView homepage(){
        List<Bookk> bookList = bookService.loadAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("bookList", bookList);

         return modelAndView;
    }
}
