package cn.cuit.mapper;

import cn.cuit.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Mapper
public interface TicketMapper {
    List<FlightTicket> getAllTicketsWithDate(QueryCondition queryCondition);//联合ticket和flight表查出机票信息
    int insertTicketOrder(TicketOrder ticketOrder);
    int updateTicketCapacityByAirIdAndAirDate(String airId, Date airDate,int quantity);
    int updateTicketOrderSelectiveById(String id,TicketOrder ticketOrder);//改签
    int deleteTicketOrderById(String id);//退票
    List<TicketOrderWithTravelerInfo> getAllTicketOrdersWithTravelerInfoByUid(String uid);//查询订单
}
