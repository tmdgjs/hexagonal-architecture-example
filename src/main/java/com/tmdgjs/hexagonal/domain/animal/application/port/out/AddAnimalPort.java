package com.tmdgjs.hexagonal.domain.animal.application.port.out;

import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.entity.Animal;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;

public interface AddAnimalPort {

    AnimalDto addAnimal(Animal animal);
}
