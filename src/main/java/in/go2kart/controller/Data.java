package in.go2kart.controller;

import org.springframework.web.bind.annotation.RestController;

import in.go2kart.model.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//purpose of this controller is to send data to browser
@RestController 
public class Data {
    @RequestMapping("/get-user")
    public User getUser() {
        User user = new User("goku" , 5 , true);
        return user;
    }

    @RequestMapping("/add-user")
    public String addUser( @RequestBody User user ) {
        System.out.println(user);
        return "user added succssfully";
    }
    
}
