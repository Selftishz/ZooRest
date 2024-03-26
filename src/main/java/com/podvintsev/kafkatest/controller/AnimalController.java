package com.podvintsev.kafkatest.controller;

import com.podvintsev.kafkatest.entity.Animal;
import com.podvintsev.kafkatest.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AnimalController {
    private final AnimalService animalService;
    @GetMapping("/getAnimal/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping("/deleteAnimal/{id}")
    public Animal deleteAnimalById(@PathVariable int id) {
        return animalService.deleteAnimalById(id);
    }

    @PostMapping("/addAnimal")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }
}
