package cn.cuit.service.backstage;

import cn.cuit.mapper.UserMapper;
import cn.cuit.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    final static Logger logger= LoggerFactory.getLogger(UserService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername:"+username);
        User user=userMapper.loadUserByUsername(username);
        if(user==null){
            System.out.println("null");
            throw new UsernameNotFoundException("用户名不存在");
        }else{
            logger.info(user.toString());
        }
        user.setRoles(userMapper.getUserRolesById(user.getId()));
        return user;
    }

    public List<User> getAllUsers(){
        System.out.println(userMapper);
        return userMapper.getAllUsers();
    }
}
