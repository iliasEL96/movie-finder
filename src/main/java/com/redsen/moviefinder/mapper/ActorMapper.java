package com.redsen.moviefinder.mapper;

import com.redsen.moviefinder.model.Actor;
import com.redsen.moviefinder.model.dto.ActorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorMapper {

    ActorDTO toDto(Actor actor);

    Actor toEntity(ActorDTO dto);
}
