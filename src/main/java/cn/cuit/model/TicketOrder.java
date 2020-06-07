package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;


@Data
@Mapper
public class TicketOrder {
    private String id;
    private String tid;  //对应旅客信息（用户可替别的旅客订票）
    private String airId;
    private Date airDate;
    private String uid; //对应的是哪个用户购的票
    private Date createdAt;
}
