package cn.cuit.mapper;

import cn.cuit.model.Role;
import cn.cuit.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    int insertUser(User user);
    int insertUserSelective(User user); //
    List<User> getAllUsers();
    List<Role> getUserRolesById(String id);
    User loadUserByUsername(String username);

    int deleteUserById(String id); //
    int deleteUserByUsername(String username); //
    int updateUserSelective(User user); //
    int updateUserByUsername(User user); //
}
