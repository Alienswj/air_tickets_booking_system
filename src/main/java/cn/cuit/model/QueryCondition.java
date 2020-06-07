package cn.cuit.model;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@ApiModel(description = "查询机票的条件")
@Data
public class QueryCondition {
    String departure;
    String destination;
    Date air_date;
}
