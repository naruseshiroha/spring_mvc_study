package jp.rena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.rena.entity.Book;
import jp.rena.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookMapper bookMapper = null;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        System.out.println(bookMapper);
        List<Book> bookList = bookMapper.queryAllBook();
        return bookList;
        // return bookMapper.queryAllBook();
    }

}
