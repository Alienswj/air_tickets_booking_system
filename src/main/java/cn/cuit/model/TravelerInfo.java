package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
@Mapper
public class TravelerInfo {
    private String id;
    private String name;
    private String telephone;
    private String idNumber;
    private String uid;
}
