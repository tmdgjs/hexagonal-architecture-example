package com.tmdgjs.hexagonal.domain.animal.adapter.out.persist;

import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.entity.Animal;
import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.repository.AnimalRepository;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;
import com.tmdgjs.hexagonal.domain.animal.application.port.out.AddAnimalPort;
import com.tmdgjs.hexagonal.domain.animal.application.port.out.FindAllAnimalPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AnimalAdapter implements FindAllAnimalPort, AddAnimalPort {

    private final AnimalRepository animalRepository;

    @Override
    public AnimalDto addAnimal(Animal animal) {
        return AnimalDto.of(animalRepository.save(animal));
    }

    @Override
    public List<AnimalDto> findAllAnimals() {
        List<Animal> animalList = animalRepository.findAll();
        if (ObjectUtils.isEmpty(animalList)) {
            return new ArrayList<>();
        }
        return animalList.stream()
                .map(AnimalDto::of)
                .collect(Collectors.toList());
    }
}
