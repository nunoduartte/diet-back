package br.ufrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrj.model.Diet;
import br.ufrj.model.Food;
import br.ufrj.repository.DietRepository;
import br.ufrj.repository.FoodRepository;

@RestController
@RequestMapping("/diet")
public class DietController {
	
	@Autowired
	private DietRepository dietRepository;
	
	@Autowired
	private FoodRepository foodRepository;
    
    @PostMapping("/food")
    @CrossOrigin
    public Food createFood(@RequestBody Food food){

        return foodRepository.save(food);
    }
}
