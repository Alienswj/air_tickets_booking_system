package cn.cuit.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
@ApiModel(description = "用户对应角色")
@Data
@Mapper
public class UserRole {
    private String id;
    @ApiModelProperty("用户编号")
    private String uid;
    @ApiModelProperty("角色编号")
    private String rid;
}
