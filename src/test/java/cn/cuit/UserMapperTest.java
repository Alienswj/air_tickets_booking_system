package cn.cuit;

import cn.cuit.mapper.UserMapper;
import cn.cuit.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void getAllUserTest(){
        System.out.println(userMapper);
        List<User> users=userMapper.getAllUsers();
        for(User u:users)
            System.out.println(u);
    }
}
