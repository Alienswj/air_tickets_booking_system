package cn.cuit.service.forestage;

import cn.cuit.mapper.TicketMapper;
import cn.cuit.model.TicketOrder;
import cn.cuit.model.TicketOrderWithTravelerInfoAndFlightInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TicketOrderService {
    @Autowired
    TicketMapper ticketMapper;

    @Transactional
    public boolean bookingTicket(TicketOrder ticketOrder){
        return ticketMapper.updateTicketCapacityByAirIdAndAirDate(ticketOrder.getAirId(), ticketOrder.getAirDate(),-1) != 0 &&
                ticketMapper.insertTicketOrder(ticketOrder) != 0;
    }

    @Transactional
    public boolean refundTicket(TicketOrder ticketOrder){
        return ticketMapper.deleteTicketOrderById(ticketOrder.getId())!=0&&
                ticketMapper.updateTicketCapacityByAirIdAndAirDate(ticketOrder.getAirId(),ticketOrder.getAirDate(),1)!=0;
    }

    @Transactional
    public boolean changeTicket(TicketOrder ticketOrder){
        return ticketMapper.updateTicketOrderWithAirDate(ticketOrder)!=0;
    }

    public boolean deleteTicketOrderById(String id){
        return ticketMapper.deleteTicketOrderById(id)!=0;
    }

    public List<TicketOrderWithTravelerInfoAndFlightInfo> getAllTicketOrdersWithTravelerInfoByUid(String uid){
        return ticketMapper.getAllTicketOrdersWithTravelerInfoByUid(uid);
    }
}
