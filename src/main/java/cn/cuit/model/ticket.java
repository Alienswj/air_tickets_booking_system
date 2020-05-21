package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
@Mapper
public class ticket {
    private String airId;
    private Date airDate;
    private int capacity;
}
