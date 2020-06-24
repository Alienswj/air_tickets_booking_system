package cn.cuit.web.controller.forestage;


import cn.cuit.model.*;

import cn.cuit.service.forestage.TicketService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import cn.cuit.service.utils.DateUtils;

@Api(tags = "与机票相关的操作")
@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @ApiOperation(value = "查询航线上所有机票")
    @GetMapping("/queryAllTickets")
//    public List<FlightTicket> getAllTickets(@RequestBody QueryCondition queryCondition){
//        return ticketService.getAllTickets(queryCondition);
//    }

    public PageInfo getAllTickets(@RequestParam("departure") String departure, @RequestParam("destination") String destination, @RequestParam("airDate") String airDate, @RequestParam("currentPage") int pageNum, @RequestParam("pageSize") int pageSize){
        QueryCondition queryCondition=new QueryCondition();
        queryCondition.setDeparture(departure);
        queryCondition.setDestination(destination);
        try {
            Date date=DateUtils.StringToDate(airDate);
            queryCondition.setAirDate(date);
        } catch (ParseException e) {
            return null;
        }
        System.out.println(queryCondition);
        return ticketService.getAllTicketsByPage(queryCondition,pageNum,pageSize);
        //return ticketService.getAllTickets(queryCondition);
    }


}
