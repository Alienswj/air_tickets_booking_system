package cn.cuit.model;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Time;

@Data
@Mapper
public class Flight {
    private String airId;
    private String airline;
    private String aircraftDesignation;
    private String departure;
    private String destination;
    private Time depTime;
    private Time landTime;
    private int price;
}
