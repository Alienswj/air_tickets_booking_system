package cn.cuit.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@ApiModel(description = "查询机票的条件")
@Data
public class QueryCondition {
    String departure;
    String destination;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    Date airDate;
}
