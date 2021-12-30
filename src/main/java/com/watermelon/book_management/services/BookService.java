package com.watermelon.book_management.services;

import com.watermelon.book_management.model.Book;
import com.watermelon.book_management.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public Book findBook(Integer id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Book with id of [" + id + "] was not found"));
    }

}
