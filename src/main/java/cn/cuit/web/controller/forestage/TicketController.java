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

    @ApiOperation(value = "查询所有机票")
    @GetMapping("/queryAllTickets")
    public List<FlightTicket> getAllTickets(@RequestBody QueryCondition queryCondition){
        return ticketService.getAllTickets(queryCondition);
    }
    @ApiOperation(value = "订票",notes = "订票业务流程：登录的账号选择账号中曾经保存的任意旅客信息，" +
            "如果没有可以临时添加，给该旅客订票")
    @PostMapping("/booking")
    public RespBean bookingTicket(@RequestBody TicketOrder ticketOrder){
        if(ticketOrder==null)
            return RespBean.error("订票失败");
        return RespBean.ok("订票成功");
    }





}
