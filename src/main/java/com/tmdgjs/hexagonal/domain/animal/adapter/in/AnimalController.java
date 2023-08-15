package com.tmdgjs.hexagonal.domain.animal.adapter.in;

import com.tmdgjs.hexagonal.domain.animal.application.port.in.AddAnimalUseCase;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.FindAllAnimalUseCase;
import com.tmdgjs.hexagonal.domain.animal.application.port.in.dto.AnimalDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AddAnimalUseCase addAnimalUseCase;
    private final FindAllAnimalUseCase findAllAnimalUseCase;

    @GetMapping
    public ResponseEntity<List<AnimalDto>> findAllAnimal() {
        return ResponseEntity.ok(findAllAnimalUseCase.findAllAnimals());
    }

    @GetMapping("/add")
    public ResponseEntity<AnimalDto> addAnimal(@RequestParam String name, @RequestParam String region) {
        return ResponseEntity.status(HttpStatus.CREATED).body(addAnimalUseCase.addAnimal(name, region));
    }

}
