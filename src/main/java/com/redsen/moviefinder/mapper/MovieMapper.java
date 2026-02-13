package com.redsen.moviefinder.mapper;

import com.redsen.moviefinder.model.Movie;
import com.redsen.moviefinder.model.dto.MovieDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ActorMapper.class})
public interface MovieMapper {

    MovieDTO toDto(Movie movie);

    Movie toEntity(MovieDTO dto);
}