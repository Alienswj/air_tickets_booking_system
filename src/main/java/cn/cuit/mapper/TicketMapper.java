package cn.cuit.mapper;

import cn.cuit.model.FlightTicket;
import cn.cuit.model.QueryCondition;
import cn.cuit.model.Ticket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TicketMapper {
    List<FlightTicket> getAllTicketsWithDate(QueryCondition queryCondition);//联合ticket和flight表查出机票信息

}
