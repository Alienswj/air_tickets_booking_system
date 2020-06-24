package cn.cuit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Time;
import java.util.Date;

@Data
@Mapper
public class TicketOrderWithTravelerInfoAndFlightInfo {
    private String id;
    private String tid;
    private String airId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date airDate;
    private String departure;
    private String destination;
    private Time depTime;
    private Time landTime;
    private int price;
    @ApiModelProperty("购票账户")
    private String uid;
    @ApiModelProperty("出行人")
    private String name;
    private String telephone;

    private String idNumber;
    @ApiModelProperty("预定日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createdAt;
}
