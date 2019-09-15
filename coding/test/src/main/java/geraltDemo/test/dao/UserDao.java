package geraltDemo.test.dao;

import geraltDemo.test.model.User;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserDao {
    public static List<User> userDB=new ArrayList<>();
    static {
        userDB.add(new User("xfh","xfh123"));
        userDB.add(new User("geralt","0923"));
    }
    public User getUser(String name,String password){
        User user=new User();
        user.setUsername(name);
        user.setPassword(password);
        return user;
    }
    public User findUser(String name){
        List<User> result=userDB.stream().filter(user-> user.getUsername().equalsIgnoreCase(name)).collect(Collectors.toList());
        if (result.isEmpty()){
            return null;
        }else
            return result.get(0);
    }
    public List<User> insertUser(){
        userDB.add(new User("John","123"));
        return userDB;
    }
}
