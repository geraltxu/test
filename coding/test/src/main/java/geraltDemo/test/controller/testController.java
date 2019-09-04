package geraltDemo.test.controller;

import geraltDemo.test.dao.UserDao;
import geraltDemo.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    UserDao userDao;

    @GetMapping("/test")
    public String getTest(){
        return "this is docker test";
    }
    @GetMapping("/user/{name}/{password}")
    public User getUser(@PathVariable("name") String name,@PathVariable("password") String password){
        System.out.println("enter");
        return userDao.getUser(name,password);
    }

}
