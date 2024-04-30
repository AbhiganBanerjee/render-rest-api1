package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Book;

public interface BookRepository extends MongoRepository<Book, String> {
	
}