package cn.cuit.web.controller.forestage;


import cn.cuit.model.*;

import cn.cuit.service.forestage.TicketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@Api(tags = "与机票相关的操作")
@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @ApiOperation(value = "查询航线上所有机票")
    @GetMapping("/queryAllTickets")
    public List<FlightTicket> getAllTickets(@RequestBody QueryCondition queryCondition){
        return ticketService.getAllTickets(queryCondition);
    }






}
