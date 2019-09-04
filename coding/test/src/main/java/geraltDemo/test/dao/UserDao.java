package geraltDemo.test.dao;

import geraltDemo.test.model.User;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User getUser(String name,String password){
        User user=new User();
        user.setUsername(name);
        user.setPassword(password);
        return user;
    }
}
