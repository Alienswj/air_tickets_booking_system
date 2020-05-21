package cn.cuit.mapper;

import cn.cuit.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //int insert(User user);
    List<User> getAllUsers();


}
