package io.pturczyk.speed.generated.postgres.public_.books.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * io.pturczyk.speed.generated.postgres.public_.books.Books} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedBooksManager extends Manager<Books> {
    
    TableIdentifier<Books> IDENTIFIER = TableIdentifier.of(
        "postgres",
        "public",
        "books"
    )
    ;
    List<Field<Books>> FIELDS = unmodifiableList(asList(
        Books.B_ID,
        Books.B_TITLE,
        Books.B_AUTHOR_ID
    ));
    
    @Override
    default Class<Books> getEntityClass() {
        return Books.class;
    }
}