package co.simplon.codersparadizeapi.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.codersparadizeapi.dtos.BookThumb;
import co.simplon.codersparadizeapi.entities.Book;
import co.simplon.codersparadizeapi.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	private final BookRepository repo;
	
	public BookServiceImpl(BookRepository repo) {
		this.repo = repo;
	}

	@Override
	@Transactional(readOnly = true)
	public List<BookThumb> books() {
		return repo.findBookThumbs();
	}
	
}
