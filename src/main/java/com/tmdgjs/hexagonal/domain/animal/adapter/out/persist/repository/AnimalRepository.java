package com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.repository;

import com.tmdgjs.hexagonal.domain.animal.adapter.out.persist.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
