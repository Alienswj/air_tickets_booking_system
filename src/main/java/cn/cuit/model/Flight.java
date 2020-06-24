package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Time;

@ApiModel(description = "航班信息")
@Data
public class Flight {
    @ApiModelProperty("航班号")
    private String airId;
    @ApiModelProperty("航司")
    private String airline;
    @ApiModelProperty("执飞机型")
    private String aircraftDesignation;
    @ApiModelProperty("起飞机场")
    private String departure;
    @ApiModelProperty("降落机场")
    private String destination;
    @ApiModelProperty("起飞时间")
    private Time depTime;
    @ApiModelProperty("到达时间")
    private Time landTime;
    @ApiModelProperty("票价")
    private int price;
}
