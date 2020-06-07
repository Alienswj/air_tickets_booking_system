package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

@ApiModel(description = "角色")
@Data
@Mapper
public class Role implements Serializable {
    @ApiModelProperty("用户编号")
    private String id;
    @ApiModelProperty("角色英文名")
    private String name;
    @ApiModelProperty("角色中文名")
    private String nameZh;
}
