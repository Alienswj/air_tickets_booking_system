package cn.cuit.service.forestage;


import cn.cuit.service.utils.DateUtils;
import cn.cuit.mapper.TicketMapper;
import cn.cuit.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
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

}
