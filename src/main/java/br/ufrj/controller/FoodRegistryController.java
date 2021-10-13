package br.ufrj.controller;

import br.ufrj.model.FoodRegistry;
import br.ufrj.repository.FoodRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/foodRegistry")
public class FoodRegistryController {
    @Autowired
    private FoodRegistryRepository foodRegistryRepository;

    @CrossOrigin
    @GetMapping("/{id}")
    private List<FoodRegistry> getRegistries(@PathVariable(value = "id") Long userId){
        return foodRegistryRepository.findAllByUserIdInTheSameDay(userId);
    }

    @CrossOrigin
    @PostMapping
    private FoodRegistry createRegistry(@RequestBody FoodRegistry foodRegistry){
        return foodRegistryRepository.save(foodRegistry);
    }

    @CrossOrigin
    @PutMapping
    private FoodRegistry updateRegistry(@RequestBody FoodRegistry foodRegistry){
        return foodRegistryRepository.save(foodRegistry);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    private ResponseEntity deleteRegistry(@PathVariable(value = "id") Long foodRegistryId){
        foodRegistryRepository.deleteById(foodRegistryId);
        return ResponseEntity.noContent().build();
    }
}


