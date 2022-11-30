package com.spring.oauth2_resource_server.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import com.spring.oauth2_resource_server.model.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/foods")
public class FoodController {

    @GetMapping(value = "/{id}")
    public Food findOne(@PathVariable Long id) {
        return new Food(randomAlphabetic(55),Integer.parseInt(randomNumeric(23)) ,randomAlphabetic(4));
    }

    @GetMapping
    public List<Food> findAll(Principal principal) {

        System.out.println("Principal "+principal.getName() + "@mailinator.com");
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food(randomAlphabetic(55),Integer.parseInt(randomNumeric(3)) ,randomAlphabetic(2004)));
        foodList.add(new Food(randomAlphabetic(55),Integer.parseInt(randomNumeric(3)) ,randomAlphabetic(2004)));
        foodList.add(new Food(randomAlphabetic(55),Integer.parseInt(randomNumeric(3)) ,randomAlphabetic(2004)));
        return foodList;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Food newFoo) {
       log.info("Food created");
    }
}
