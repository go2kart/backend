package in.go2kart.controller;

import org.springframework.web.bind.annotation.RestController;

import in.go2kart.model.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



//purpose of this controller is to send data to browser
@RestController 
public class Data {
    @GetMapping("/get-user")
    public User getUser() {
        User user = new User("goku" , 5 , true);
        return user;
    }

    @GetMapping("/add-user")
    public String addUser( @RequestBody User user ) {
        System.out.println(user);
        return "user added succssfully";
    }

    @PostMapping("/add-user")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }

    @GetMapping("/get-all-user")
    @ResponseBody
    public ResponseEntity<String> getMethodName(@RequestBody String entity) {

        return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(entity);
    }
    
}
