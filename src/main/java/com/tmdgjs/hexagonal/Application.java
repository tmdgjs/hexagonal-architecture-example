package com.tmdgjs.hexagonal;

import com.tmdgjs.hexagonal.domain.animal.application.port.in.AddAnimalUseCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	private final AddAnimalUseCase addAnimalUseCase;

	public Application(AddAnimalUseCase addAnimalUseCase) {
		this.addAnimalUseCase = addAnimalUseCase;
	}

	public static void main(String[] args) {
		SpringApplication.run(HexagonalExampleApplication.class, args);
	}

	@PostConstruct
	public void initialize(){
		addAnimalUseCase.addAnimal("panda", "china");
		addAnimalUseCase.addAnimal("tiger", "korea");
		addAnimalUseCase.addAnimal("monkey", "japan");
	}
}
