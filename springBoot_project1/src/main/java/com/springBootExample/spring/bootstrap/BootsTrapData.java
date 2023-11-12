package com.springBootExample.spring.bootstrap;

import com.springBootExample.spring.domain.Author;
import com.springBootExample.spring.domain.Book;
import com.springBootExample.spring.domain.Publisher;
import com.springBootExample.spring.repositories.AuthorRepository;
import com.springBootExample.spring.repositories.BookRepository;
import com.springBootExample.spring.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootsTrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootsTrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author john = new Author();
        john.setFirstname("John");
        john.setLastname("Johnson");

        Book book1 = new Book();
        book1.setIsbn("12345");
        book1.setTitle("First book");

        Author johnSaved = authorRepository.save(john);
        Book book1Saved = bookRepository.save(book1);

        Author jacob = new Author();
        jacob.setFirstname("Jacob");
        jacob.setLastname("Fisher");

        Book book2 = new Book();
        book2.setIsbn("54321");
        book2.setTitle("Second book");

        Author jacobSaved = authorRepository.save(jacob);
        Book book2Saved = bookRepository.save(book2);

        johnSaved.getBooks().add(book1Saved);
        jacobSaved.getBooks().add(book2Saved);
        book1Saved.getAuthors().add(johnSaved);
        book2Saved.getAuthors().add(jacobSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Main Publisher");
        publisher.setAddress("Main street");
        Publisher savedPublisher = publisherRepository.save(publisher);

        book1.setPublisher(publisher);
        book2.setPublisher(publisher);
        bookRepository.save(book1Saved);
        bookRepository.save(book2Saved);

        authorRepository.save(johnSaved);
        authorRepository.save(jacobSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());

    }
}
