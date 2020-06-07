package cn.cuit.mapper;


import cn.cuit.model.Flight;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FlightMapper {
    List<Flight> getFlightsByAirId(String airId);

}
