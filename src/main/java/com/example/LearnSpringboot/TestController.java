package com.example.LearnSpringboot;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @InitBinder
    protected void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class ,"name" , new NamePropertyEditor());
    }


    @GetMapping("/userDetails/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable(name = "userId", required = true) Integer userId,
                                         @RequestParam(name = "name", required  = false) String name,
                                         @RequestParam(name = "Age") Integer age,
                                         @RequestParam(name = "Salary") Integer Salary,
                                         @RequestBody Todo todo){
        String output  = name + " "+ age + " " + Salary + " "+ userId + " "+ todo.getFirstname();
        //return name + " "+ age + " " + Salary + " "+ userId + " "+ todo.getFirstname();
        return ResponseEntity.ok(output);
    }
}
