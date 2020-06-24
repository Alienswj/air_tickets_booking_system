package cn.cuit.mapper;


import cn.cuit.model.Flight;
import cn.cuit.model.ManageSearchFlight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface FlightMapper {
    List<Flight> getFlightsByAirId(String airId);
    int getFlightsCount();
    int getAirLineCount();
    List<String> getAllAirLine();
    List<Flight> getFlightSelective(ManageSearchFlight manageSearchFlight);
    int updateFlightSelective(Flight flight);
    int deleteFlightByAirId(String airId);
    int insertFlight(Flight flight);
}
