package io.pturczyk.speed.generated.postgres.public_.books.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import io.pturczyk.speed.generated.postgres.public_.authors.Authors;
import io.pturczyk.speed.generated.postgres.public_.books.Books;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * io.pturczyk.speed.generated.postgres.public_.books.Books}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBooksImpl implements Books {
    
    private int bId;
    private String bTitle;
    private Integer bAuthorId;
    
    protected GeneratedBooksImpl() {}
    
    @Override
    public int getBId() {
        return bId;
    }
    
    @Override
    public String getBTitle() {
        return bTitle;
    }
    
    @Override
    public OptionalInt getBAuthorId() {
        return OptionalUtil.ofNullable(bAuthorId);
    }
    
    @Override
    public Books setBId(int bId) {
        this.bId = bId;
        return this;
    }
    
    @Override
    public Books setBTitle(String bTitle) {
        this.bTitle = bTitle;
        return this;
    }
    
    @Override
    public Books setBAuthorId(Integer bAuthorId) {
        this.bAuthorId = bAuthorId;
        return this;
    }
    
    @Override
    public Optional<Authors> findBAuthorId(Manager<Authors> foreignManager) {
        if (getBAuthorId().isPresent()) {
            return foreignManager.stream().filter(Authors.A_ID.equal(getBAuthorId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("bId = "       + Objects.toString(getBId()));
        sj.add("bTitle = "    + Objects.toString(getBTitle()));
        sj.add("bAuthorId = " + Objects.toString(OptionalUtil.unwrap(getBAuthorId())));
        return "BooksImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Books)) { return false; }
        final Books thatBooks = (Books)that;
        if (this.getBId() != thatBooks.getBId()) { return false; }
        if (!Objects.equals(this.getBTitle(), thatBooks.getBTitle())) { return false; }
        if (!Objects.equals(this.getBAuthorId(), thatBooks.getBAuthorId())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getBId());
        hash = 31 * hash + Objects.hashCode(getBTitle());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getBAuthorId()));
        return hash;
    }
}