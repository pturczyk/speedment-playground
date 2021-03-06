package io.pturczyk.speed.generated.postgres.public_.authors.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import io.pturczyk.speed.generated.postgres.public_.authors.Authors;
import io.pturczyk.speed.generated.postgres.public_.authors.AuthorsManager;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * io.pturczyk.speed.generated.postgres.public_.authors.Authors} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsManagerImpl 
extends AbstractManager<Authors> 
implements GeneratedAuthorsManager {
    
    private final TableIdentifier<Authors> tableIdentifier;
    
    protected GeneratedAuthorsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("postgres", "public", "authors");
    }
    
    @Override
    public TableIdentifier<Authors> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Authors>> fields() {
        return AuthorsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Authors>> primaryKeyFields() {
        return Stream.of(
            Authors.A_ID
        );
    }
}