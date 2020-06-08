package cn.cuit.web.controller.forestage;

import cn.cuit.model.RespBean;
import cn.cuit.model.TicketOrder;
import cn.cuit.model.TicketOrderWithTravelerInfo;
import cn.cuit.service.forestage.TicketOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class TicketOrderController {
    @Autowired
    TicketOrderService ticketOrderService;

    @ApiOperation(value = "订票",notes = "订票业务流程：登录的账号选择账号中曾经保存的任意旅客信息，" +
            "如果没有可以临时添加，给该旅客订票")
    @PostMapping("/booking")
    public RespBean bookingTicket(@RequestBody TicketOrder ticketOrder){
        if(ticketOrderService.bookingTicket(ticketOrder)){
            return RespBean.ok("订票成功！");
        }else{
            return RespBean.error("订票失败！");
        }
    }

    @ApiOperation("退票")
    @DeleteMapping("/refund")
    public RespBean refundTicket(@RequestBody TicketOrder ticketOrder){
        if(ticketOrderService.refundTicket(ticketOrder)){
            return RespBean.ok("退票成功！");
        }else{
            return RespBean.error("退票失败！");
        }
    }

    @ApiOperation("查询所有订单")
    @GetMapping("/{uid}")
    public List<TicketOrderWithTravelerInfo> getAllTicketOrdersWithTravelerInfoByUid(@PathVariable String uid){
        return ticketOrderService.getAllTicketOrdersWithTravelerInfoByUid(uid);
    }
}
