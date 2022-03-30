package co.simplon.codersparadizeapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.codersparadizeapi.dtos.BookThumb;
import co.simplon.codersparadizeapi.entities.Book;
import co.simplon.codersparadizeapi.services.BookService;

@RestController
@CrossOrigin("*")
public class BookController {
	private final BookService service;
	
	public BookController(BookService service) {
		this.service = service;
	}
	
	@GetMapping("/books")
	public List<BookThumb> books() {
		return service.books();
	}
}
