package co.simplon.codersparadizeapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book extends AbstractEntity {
	
	public Book() {
	}
	
	@Column(name="id")
	private Long id;
	
	@Column(name="cover")
	private String cover;
	
	@Column(name="title")
	private String title;
	
	@Column(name="price")
	private Double price;

	public String getCover() {
		return cover;
	}

	public String getTitle() {
		return title;
	}

	public Double getPrice() {
		return price;
	}
	
}
