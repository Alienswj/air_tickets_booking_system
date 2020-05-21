package cn.cuit.model;


import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
@Mapper
public class UserRole {
    private String id;
    private String uid;
    private String rid;
}
