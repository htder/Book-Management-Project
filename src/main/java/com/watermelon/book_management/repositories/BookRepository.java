package com.watermelon.book_management.repositories;

import com.watermelon.book_management.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
