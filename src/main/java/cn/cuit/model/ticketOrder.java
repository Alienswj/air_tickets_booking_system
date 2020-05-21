package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;


@Data
@Mapper
public class ticketOrder {
    private String id;
    private String tid;
    private String airId;
    private Date airDate;
    private String uid;
    private Date createdAt;
}
