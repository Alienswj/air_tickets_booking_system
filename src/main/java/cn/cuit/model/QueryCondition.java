package cn.cuit.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description = "查询机票的条件")
@Data
@AllArgsConstructor
@NoArgsConstructor()
public class QueryCondition {
    String departure;
    String destination;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    Date airDate;
}
