package cn.cuit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@ApiModel(description = "航班对应的机票信息")
@Data
public class FlightTicket {
    private String airId;
    private String airline;
    private String aircraftDesignation;
    private String departure;
    private String destination;
    private Time depTime;
    private Time landTime;
    private int price;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date airDate;
    private int capacity;
}
