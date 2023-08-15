package com.tmdgjs.hexagonal.domain.animal.application.port.in;

import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;

public interface AddAnimalUseCase {
    /* 동물 추가 UseCase */
    AnimalDto addAnimal(String name, String region);
}
