package com.tmdgjs.hexagonal.domain.animal.application.port.out;

import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;

import java.util.List;

public interface FindAllAnimalPort {

    List<AnimalDto> findAllAnimals();
}
