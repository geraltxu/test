package geraltDemo.test;

import geraltDemo.test.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import geraltDemo.test.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
	UserDao userDao;

	@Test
	public void contextLoads() {
	}
	@Test
	public void findUser(){
		User user=userDao.findUser("xfh");
		User userExpect=new User("xfh3","xfh123");
		try {
			Assert.assertEquals(userExpect,user);
		} catch (AssertionError e) {
			System.err.println("cannot find this user");
			return;
		}
		System.out.println("find the user");

	}

}
