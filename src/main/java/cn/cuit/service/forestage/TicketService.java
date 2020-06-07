package cn.cuit.service.forestage;


import cn.cuit.mapper.TicketMapper;
import cn.cuit.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketMapper ticketMapper;

    public List<FlightTicket> getAllTickets(QueryCondition queryCondition){
        return ticketMapper.getAllTicketsWithDate(queryCondition);
    }

    public boolean bookingTicket(TicketOrder ticketOrder){

        return true;
    }
}
