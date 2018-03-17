package jaguars.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getHello() {
        return "Hello World!";
    }

    @RequestMapping(method=RequestMethod.GET, value= "/jaguars/user/{userId}")
    public User getUser(@PathVariable("userId") String uid){
        System.out.println(uid);
        return userRepo.findOne(uid);
    }

    @RequestMapping(method=RequestMethod.POST, value= "/jaguars/user")
    public void postUser(@RequestBody User user){
        System.out.println(user);
        userRepo.save(user);
    }

}
