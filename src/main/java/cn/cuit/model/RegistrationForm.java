package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel(description = "注册表单")
@Data
public class RegistrationForm {
    private String id;
    private String username;
    private String password;
    private String name;
    private int gender;
    private String telephone;
    private String email;
    private String address;
    private boolean enabled;
    private String idNumber;
    private Date placedAt;
    private List<Role> roles;

    public User toUser(){
        return new User(id,username,password,name,gender,telephone,email,address,enabled,idNumber,placedAt,roles);
    }
}
