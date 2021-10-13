package br.ufrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrj.model.Food;
import br.ufrj.model.Meal;
import br.ufrj.repository.FoodRepository;
import br.ufrj.repository.MealRepository;

@RestController
@RequestMapping("/diet")
public class DietController {
	
	@Autowired
	private FoodRepository foodRepository;
    
	@Autowired
	private MealRepository mealRepository;
	
    @PostMapping("/food")
    @CrossOrigin
    public Food createFood(@RequestBody Food food){

        return foodRepository.save(food);
    }
    
    @PutMapping("/food")
    @CrossOrigin
    public Food updateFood(@RequestBody Food food){

        return foodRepository.save(food);
    }
    
    @DeleteMapping("/food/{id}")
    @CrossOrigin
    public void deleteFood(@PathVariable(value = "id") Long foodId){

        foodRepository.deleteById(foodId);
    }
    
    @PostMapping("/meal")
    @CrossOrigin
    public Meal createMeal(@RequestBody Meal food){

        return mealRepository.save(food);
    }
    
    @DeleteMapping("/meal/{id}")
    @CrossOrigin
    public void deleteMeal(@PathVariable(value = "id") Long mealId){

        mealRepository.deleteById(mealId);
    }
}
