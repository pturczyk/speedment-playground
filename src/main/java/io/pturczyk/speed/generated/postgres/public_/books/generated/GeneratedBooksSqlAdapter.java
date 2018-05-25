package io.pturczyk.speed.generated.postgres.public_.books.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import io.pturczyk.speed.generated.postgres.public_.books.BooksImpl;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * io.pturczyk.speed.generated.postgres.public_.books.Books} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBooksSqlAdapter implements SqlAdapter<Books> {
    
    private final TableIdentifier<Books> tableIdentifier;
    
    protected GeneratedBooksSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("postgres", "public", "books");
    }
    
    protected Books apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setBId(       resultSet.getInt(1 + offset))
            .setBTitle(    resultSet.getString(2 + offset))
            .setBAuthorId( getInt(resultSet, 3 + offset))
            ;
    }
    
    protected BooksImpl createEntity() {
        return new BooksImpl();
    }
    
    @Override
    public TableIdentifier<Books> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Books> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Books> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}