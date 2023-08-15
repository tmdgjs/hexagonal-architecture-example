package com.tmdgjs.hexagonal.domain.animal.application.port.in;

import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;

import java.util.List;

public interface FindAllAnimalUseCase {

    /* 동물 목록 UseCase */
    List<AnimalDto> findAllAnimals();
}
