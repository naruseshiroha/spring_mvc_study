package jp.rena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.rena.entity.Book;
import jp.rena.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    // @Qualifier()
    private BookService bookService;

    @GetMapping("/listBooks")
    public List<Book> listBooks() {
        List<Book> bookList = bookService.queryAllBook();
        return bookList;
    }

    // @GetMapping("/book")
    // public Book book() throws JsonProcessingException {
    //     return new Book(1, "book1", 1, "detail1");
    // }

    @GetMapping("/demo")
    public String demo() {
        return "test demo";
    }

    @GetMapping("/demo2")
    public Book demo2() {
        Book book = new Book(1, "23", 45, "detail");
        return book;
    }

}
