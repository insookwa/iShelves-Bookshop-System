package com.niktec.ishealves.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niktec.ishealves.books.Books;

public interface booksRepository extends JpaRepository<Books,Integer> {

}
