package geraltDemo.test.controller;

import geraltDemo.test.dao.UserDao;
import geraltDemo.test.model.StatusDTO;
import geraltDemo.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

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
    @GetMapping("/find/{name}")
    public ResponseEntity<StatusDTO> findUser(@PathVariable("name") String name){
        StatusDTO dto=new StatusDTO();
        User user= userDao.findUser(name);

        if(user==null){
            dto.setStatus("not found");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            dto.setStatus("find");
            return new ResponseEntity<>(dto,HttpStatus.ACCEPTED);
        }
    }
    @GetMapping("/insert")
    public List<User> insertUser(){
        return userDao.insertUser();
    }

}
