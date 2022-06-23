package jp.rena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.rena.entity.Book;
import jp.rena.service.BookService;

@CrossOrigin
@RestController
// @RequestMapping("/book")
public class BookController {

    @Autowired
    // @Qualifier()
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> books() {
        List<Book> bookList = bookService.queryAllBook();
        return bookList;
    }

    // @GetMapping("/book")
    // public Book book() throws JsonProcessingException {
    // return new Book(1, "book1", 1, "detail1");
    // }

    @GetMapping("/book/{id}")
    public Book book(@PathVariable int id) {
        Book book = bookService.queryBookById(id);
        return book;
    }

    @PutMapping("/book")
    public Boolean saveBook(@RequestBody Book book) {
        int res = bookService.addBook(book);
        return res > 0;
    }

    @PatchMapping("/book/{id}")
    // @PutMapping("/book/{id}")
    public Boolean updateBook(@RequestBody Book book) {
        int res = bookService.updateBook(book);
        return res > 0;
    }

    @DeleteMapping("/book/{id}")
    public Boolean deleteBook(@PathVariable Integer id) {
        int res = bookService.deleteBookById(id);
        return res > 0;
    }

    // @GetMapping("/demo")
    // public String demo() {
    // return "test demo";
    // }

    // @GetMapping("/demo2")
    // public Book demo2() {
    // Book book = new Book(1, "23", 45, "detail");
    // return book;
    // }

}
