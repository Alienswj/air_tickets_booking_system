package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@ApiModel(description = "每个用户可以保存多个旅客信息")
@Data
@Mapper
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TravelerInfo {
    private String id;
    private String name;
    private String telephone;
    private String idNumber;
    private String uid;
}
