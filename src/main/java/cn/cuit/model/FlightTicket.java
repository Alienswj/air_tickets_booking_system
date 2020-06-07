package cn.cuit.model;

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
    private Date airDate;
    private int capacity;
}
