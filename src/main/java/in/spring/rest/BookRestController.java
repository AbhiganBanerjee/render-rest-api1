package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Book;
import in.spring.service.BookService;

@RestController
public class BookRestController {
	//Inject the Service interface reference
	@Autowired
	private BookService service;
	
	//Create a GET-mapped method to get the book-details in json form
	@GetMapping(value = "/getBooks", produces = {"application/json"})
	public List<Book> getBooks(){
		//call the service method
		return service.getAllBookDetails();
	}
}