package br.ufrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrj.model.Food;
import br.ufrj.repository.FoodRepository;

@RestController
@RequestMapping("/diet")
public class DietController {
	
	@Autowired
	private FoodRepository foodRepository;
    
    @PostMapping("/food")
    @CrossOrigin
    public Food createFood(@RequestBody Food food){

        return foodRepository.save(food);
    }
    
    @DeleteMapping("/food/{id}")
    @CrossOrigin
    public void deleteFood(@PathVariable(value = "id") Long foodId){

        foodRepository.deleteById(foodId);
    }
}
