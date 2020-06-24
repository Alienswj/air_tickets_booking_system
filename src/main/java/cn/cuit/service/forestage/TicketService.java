package cn.cuit.service.forestage;


import cn.cuit.mapper.TicketMapper;
import cn.cuit.model.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketMapper ticketMapper;

    public List<FlightTicket> getAllTickets(QueryCondition queryCondition) {
        /*try {
            queryCondition.setAirDate(DateUtils.DateRemoveTime(queryCondition.getAirDate()));
            return ticketMapper.getAllTicketsWithDate(queryCondition);
        } catch (ParseException e) {
            return null;
        }*/
        return ticketMapper.getAllTicketsWithDate(queryCondition);
    }

    public PageInfo getAllTicketsByPage(QueryCondition queryCondition,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<FlightTicket> list=ticketMapper.getAllTicketsWithDate(queryCondition);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

}
