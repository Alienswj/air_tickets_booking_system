package cn.cuit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@ApiModel(description = "购票订单信息")
@Data
@Mapper
public class TicketOrder {
    @ApiModelProperty("订单号")
    private String id;
    @ApiModelProperty(value = "订单对应旅客信息",notes ="用户可替别的旅客订票" )
    private String tid;
    @ApiModelProperty(value = "航班号",notes = "与航班日期共同确定是哪条航线")
    private String airId;
    @ApiModelProperty("航班日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date airDate;
    @ApiModelProperty(value = "订单对应的用户编号",notes = "关联购票账号信息")
    private String uid;
    @ApiModelProperty("订单创建时间")
    private Date createdAt;
}
