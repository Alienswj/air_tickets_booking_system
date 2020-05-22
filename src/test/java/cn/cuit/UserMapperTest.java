package cn.cuit;

import cn.cuit.mapper.UserMapper;
import cn.cuit.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    PasswordEncoder encoder;

    @Test
    public void getAllUserTest(){
        System.out.println(userMapper);
        List<User> users=userMapper.getAllUsers();
        for(User u:users)
            System.out.println(u);
    }

    @Test
    public void loadUserByUsername(){
        System.out.println(userMapper.loadUserByUsername("admin"));
    }

    @Test
    public void matchesPassword(){

        System.out.println(encoder.matches("admin","$2a$10$K86RKEN.4zNUf/1ysnHXj.KicazDxt1TxX.5qtx2UhtZ0EP7ThnP6"));
    }
}
