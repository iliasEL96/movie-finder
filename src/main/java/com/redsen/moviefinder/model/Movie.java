package com.redsen.moviefinder.model;

import com.redsen.moviefinder.model.enums.Genre;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;
import java.util.List;

@Table("movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    @Id
    private Long id;
    private String name;
    private Genre genre;
    private LocalDate publicationDate;

    @Transient
    private List<Actor> actors;
}