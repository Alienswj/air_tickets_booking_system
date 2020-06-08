package cn.cuit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
@Mapper
public class TicketOrderWithTravelerInfo {
    private String id;
    private String tid;
    private String airId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date airDate;
    private String uid;
    private String name;
    private String telephone;
    private String idNumber;
    private Date createdAt;
}
