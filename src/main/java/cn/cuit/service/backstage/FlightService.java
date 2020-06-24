package cn.cuit.service.backstage;

import cn.cuit.mapper.FlightMapper;
import cn.cuit.model.Flight;
import cn.cuit.model.ManageSearchFlight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightMapper flightMapper;

    public int getFlightsCount(){
        return flightMapper.getFlightsCount();
    }
    public List<String> getAllAirLine(){
        return flightMapper.getAllAirLine();
    }
    public int getAirLineCount(){
        return flightMapper.getAirLineCount();
    }
    public List<Flight> getFlightSelective(ManageSearchFlight manageSearchFlight){
        return flightMapper.getFlightSelective(manageSearchFlight);
    }
    @Transactional
    public boolean updateFlightSelective(Flight flight){
        return flightMapper.updateFlightSelective(flight)!=0;
    }
    public boolean deleteFlightByAirId(String airId){
        return flightMapper.deleteFlightByAirId(airId)!=0;
    }
    public boolean insertFlight(Flight flight){
        return flightMapper.insertFlight(flight)!=0;
    }
}
