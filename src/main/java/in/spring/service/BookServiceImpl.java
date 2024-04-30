package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Book;
import in.spring.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	//Inject the Repository reference variable
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public List<Book> getAllBookDetails() {
		//Get all book documents from MongoDB
		return bookRepo.findAll();
	}
}