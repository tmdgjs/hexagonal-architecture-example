package com.tmdgjs.hexagonal.domain.animal.application.service;

import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.entity.Animal;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.AddAnimalUseCase;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.FindAllAnimalUseCase;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;
import com.tmdgjs.hexagonal.domain.animal.application.port.out.AddAnimalPort;
import com.tmdgjs.hexagonal.domain.animal.application.port.out.FindAllAnimalPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService implements FindAllAnimalUseCase, AddAnimalUseCase {

    private final FindAllAnimalPort findAllAnimalPort;
    private final AddAnimalPort addAnimalPort;

    @Override
    public AnimalDto addAnimal(String name, String region) {
        Animal animal = Animal.of(name, region);
        return addAnimalPort.addAnimal(animal);
    }

    @Override
    public List<AnimalDto> findAllAnimals() {
        return findAllAnimalPort.findAllAnimals();
    }
}
