package io.pturczyk.speed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorDTO {
    private Integer id;
    private String firstName;
    private String lastName;
}
