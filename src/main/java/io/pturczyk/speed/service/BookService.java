package io.pturczyk.speed.service;

import com.speedment.common.tuple.Tuple2;
import io.pturczyk.speed.generated.postgres.public_.authors.Authors;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import io.pturczyk.speed.generated.postgres.public_.books.BooksImpl;
import io.pturczyk.speed.dto.AuthorDTO;
import io.pturczyk.speed.dto.BookCreateDTO;
import io.pturczyk.speed.dto.BookDTO;
import io.pturczyk.speed.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class BookService {

    private static final String NOT_AVAILABLE = "n/a";

    private final BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public BookDTO createBook(final BookCreateDTO book) {
        final Books bookEntity = toBookEntity(book);
        int bookId = repository.createBook(bookEntity);
        return new BookDTO(bookId, book.getTitle(), null);
    }

    public int deleteBook(final int bookId) {
        return repository.delete(bookId);
    }

    public List<BookDTO> getBooks() {
        return repository.findAll().stream()
                .map(this::toBookDTO)
                .collect(toList());
    }

    private Books toBookEntity(final BookCreateDTO book) {
        // TODO: add support for author
        BooksImpl books = new BooksImpl();
        books.setBAuthorId(book.getId());
        books.setBTitle(book.getTitle());
        return books;
    }

    private BookDTO toBookDTO(final Tuple2<Books, Authors> tuple) {
        final Books book = tuple.get0();
        final Authors author = tuple.get1();
        return new BookDTO(
                book.getBId(),
                book.getBTitle(),
                toAuthorDTO(author)
        );
    }

    private AuthorDTO toAuthorDTO(final Authors author) {
        AuthorDTO authorDTO = null;
        if (author != null) {
            authorDTO = new AuthorDTO(
                    author.getAId(),
                    author.getAFirstName().orElse(NOT_AVAILABLE),
                    author.getALastName().orElse(NOT_AVAILABLE));
        }
        return authorDTO;
    }

}
