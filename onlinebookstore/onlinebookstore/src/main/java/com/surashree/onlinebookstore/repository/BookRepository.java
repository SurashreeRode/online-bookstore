package com.surashree.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surashree.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
