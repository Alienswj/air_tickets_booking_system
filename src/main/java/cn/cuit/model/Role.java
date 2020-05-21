package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

@Data
@Mapper
public class Role implements Serializable {
    private String id;
    private String name;
    private String nameZh;
}
