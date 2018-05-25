package io.pturczyk.speed.repository;

import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.JoinComponent;
import io.pturczyk.speed.generated.SpeedApplication;
import io.pturczyk.speed.generated.postgres.public_.authors.Authors;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import io.pturczyk.speed.generated.postgres.public_.books.BooksManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    private final BooksManager booksManager;
    private final JoinComponent join;

    @Autowired
    public BookRepository(final SpeedApplication speedApplication) {
        this.booksManager = speedApplication.getOrThrow(BooksManager.class);
        this.join = speedApplication.getOrThrow(JoinComponent.class);
    }

    public List<Tuple2<Books, Authors>> findAll() {
        return join.from(BooksManager.IDENTIFIER)
                .innerJoinOn(Authors.A_ID)
                .equal(Books.B_AUTHOR_ID)
                .build(Tuples::of)
                .stream()
                .collect(Collectors.toList());
    }

    public int delete(final int bookId) {

        Optional<Books> bookToDelete = booksManager.stream()
                .filter(Books.B_ID.equal(bookId))
                .findAny();

        bookToDelete.ifPresent(booksManager::remove);
        return bookToDelete.map(Books::getBId).orElse(0);
    }

    public int createBook(Books bookEntity) {
        return booksManager.persist(bookEntity).getBId();
    }
}
