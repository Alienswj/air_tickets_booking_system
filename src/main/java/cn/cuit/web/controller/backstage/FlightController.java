package cn.cuit.web.controller.backstage;

import cn.cuit.model.Flight;
import cn.cuit.model.ManageSearchFlight;
import cn.cuit.model.RespBean;
import cn.cuit.service.backstage.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manage/flight")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/getFilghtsCount")
    public int getFlightsCount(){
        return flightService.getFlightsCount();
    }

    @GetMapping("/getAllAirLine")
    public List<String> getAllAirLine(){
        return flightService.getAllAirLine();
    }

    @GetMapping("/getAirLineCount")
    public int getAirLineNum(){
        return flightService.getAirLineCount();
    }
    @PostMapping("/getFlightSelective")
    public List<Flight> getFlightSelective(@RequestBody ManageSearchFlight manageSearchFlight){
        return flightService.getFlightSelective(manageSearchFlight);
    }

    @PutMapping("/updateFlightSelective")
    public RespBean updateFlightSelective(@RequestBody Flight flight){
        System.out.println(flight.toString());
        System.out.println(flight.getAirId());
        System.out.println(flight.getDepTime());
        if(flightService.updateFlightSelective(flight)){
            return RespBean.ok("更新成功！");
        } else{
            return RespBean.error("更新失败！");
        }
    }

    @DeleteMapping("/deleteFlightByAirId/{airId}")
    public RespBean deleteFlightByAirId(@PathVariable String airId){
        if(flightService.deleteFlightByAirId(airId)){
            return RespBean.ok("删除成功！");
        }else{
            return RespBean.error("删除失败！");
        }
    }
    @PostMapping("/insertFlight")
    public RespBean insertFlight(@RequestBody Flight flight){
        if (flightService.insertFlight(flight)){
            return RespBean.ok("新增成功！");
        }else{
            return RespBean.error("新增失败！");
        }
    }
}
