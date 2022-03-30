package co.simplon.codersparadizeapi.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.simplon.codersparadizeapi.dtos.BookThumb;
import co.simplon.codersparadizeapi.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	@Query("SELECT b.id as id, b.cover as cover, b.title as title, b.price as price FROM Book b order by price")
	List<BookThumb> findBookThumbs();
	
}
