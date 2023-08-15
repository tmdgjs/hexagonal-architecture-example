package com.tmdgjs.hexagonal.domain.animal.application.port.in.dto;

import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.entity.Animal;
import lombok.Getter;

@Getter
public class AnimalDto {

    private Long id;
    private String name;
    private String region;

    private AnimalDto(Long id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    public static AnimalDto of (Animal animal) {
        return new AnimalDto(animal.getId(), animal.getName(), animal.getRegion());
    }
}
