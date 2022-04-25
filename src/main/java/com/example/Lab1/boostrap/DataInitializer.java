package com.example.Lab1.boostrap;

import com.example.Lab1.model.Author;
import com.example.Lab1.model.Country;
import com.example.Lab1.model.dto.BookDto;
import com.example.Lab1.model.enumerations.Category;
import com.example.Lab1.service.AuthorService;
import com.example.Lab1.service.BookService;
import com.example.Lab1.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private final BookService bookService;
    private final AuthorService authorService;
    private final CountryService countryService;

    public DataInitializer(BookService bookService, AuthorService authorService, CountryService countryService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.countryService = countryService;
    }

    @PostConstruct
    public void init() {
        Country country1 = new Country(1L,"North Macedonia", "Europe");
        countryService.save(country1);
        Country country2 = new Country(2L,"USA", "North America");
        countryService.save(country2);
        Author author1 = new Author(1L,"John", "Allegro", country1);
        authorService.save(author1);
        Author author2 = new Author(2L,"Brian", "Muraresku",country2);
        authorService.save(author2);
        Author author3 = new Author(3L,"Michael", "Pollan",country2);
        authorService.save(author3);
        bookService.save(new BookDto("The sacred mushroom and the Cross", Category.CLASSICS, 1L, 10));
        bookService.save(new BookDto("The immortality Key", Category.CLASSICS, 2L, 15));
        bookService.save(new BookDto("How to change your mind", Category.CLASSICS, 3L, 20));
    }
}
