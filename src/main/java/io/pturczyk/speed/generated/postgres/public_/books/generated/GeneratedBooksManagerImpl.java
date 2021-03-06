package io.pturczyk.speed.generated.postgres.public_.books.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import io.pturczyk.speed.generated.postgres.public_.books.BooksManager;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * io.pturczyk.speed.generated.postgres.public_.books.Books} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBooksManagerImpl 
extends AbstractManager<Books> 
implements GeneratedBooksManager {
    
    private final TableIdentifier<Books> tableIdentifier;
    
    protected GeneratedBooksManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("postgres", "public", "books");
    }
    
    @Override
    public TableIdentifier<Books> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Books>> fields() {
        return BooksManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Books>> primaryKeyFields() {
        return Stream.of(
            Books.B_ID
        );
    }
}