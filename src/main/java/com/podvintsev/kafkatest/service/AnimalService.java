package com.podvintsev.kafkatest.service;

import com.podvintsev.kafkatest.entity.Animal;
import com.podvintsev.kafkatest.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AnimalService {
    private final AnimalRepository animalRepository;

    public Animal getAnimalById(int id) {
        return animalRepository.getReferenceById(id);
    }

    public Animal deleteAnimalById(int id) {
        Animal deletedAnimal = animalRepository.getReferenceById(id);
        animalRepository.deleteById(id);
        return deletedAnimal;
    }

    public Animal addAnimal(Animal animal) {
        animalRepository.save(animal);
        return animal;
    }
}
