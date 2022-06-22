package jp.rena.controller;

import java.util.List;

import org.apache.ibatis.javassist.CodeConverter.ArrayAccessReplacementMethodNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("listBooks")
    public List<Book> listBooks() {
        return bookService.queryAllBook();
    }

    
}
