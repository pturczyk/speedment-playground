package io.pturczyk.speed.generated.postgres.public_.authors.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import io.pturczyk.speed.generated.postgres.public_.authors.Authors;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * io.pturczyk.speed.generated.postgres.public_.authors.Authors}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsImpl implements Authors {
    
    private int aId;
    private String aFirstName;
    private String aLastName;
    
    protected GeneratedAuthorsImpl() {}
    
    @Override
    public int getAId() {
        return aId;
    }
    
    @Override
    public Optional<String> getAFirstName() {
        return Optional.ofNullable(aFirstName);
    }
    
    @Override
    public Optional<String> getALastName() {
        return Optional.ofNullable(aLastName);
    }
    
    @Override
    public Authors setAId(int aId) {
        this.aId = aId;
        return this;
    }
    
    @Override
    public Authors setAFirstName(String aFirstName) {
        this.aFirstName = aFirstName;
        return this;
    }
    
    @Override
    public Authors setALastName(String aLastName) {
        this.aLastName = aLastName;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("aId = "        + Objects.toString(getAId()));
        sj.add("aFirstName = " + Objects.toString(OptionalUtil.unwrap(getAFirstName())));
        sj.add("aLastName = "  + Objects.toString(OptionalUtil.unwrap(getALastName())));
        return "AuthorsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Authors)) { return false; }
        final Authors thatAuthors = (Authors)that;
        if (this.getAId() != thatAuthors.getAId()) { return false; }
        if (!Objects.equals(this.getAFirstName(), thatAuthors.getAFirstName())) { return false; }
        if (!Objects.equals(this.getALastName(), thatAuthors.getALastName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getAId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAFirstName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getALastName()));
        return hash;
    }
}