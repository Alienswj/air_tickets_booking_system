package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@ApiModel(description = "机票信息")
@Data
@Mapper
public class Ticket {
    @ApiModelProperty("航班号")
    private String airId;
    @ApiModelProperty("该航班执飞日期")
    private Date airDate;
    @ApiModelProperty("余票量")
    private int capacity;
    @ApiModelProperty("机票对应的航班信息")
    private Flight flight;
}
