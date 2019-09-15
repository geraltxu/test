package geraltDemo.test.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Data
public class User {
    private String username;
    private String password;
    public User(){}
    public User(String username,String password){
        this.password=password;
        this.username=username;
    }
}
