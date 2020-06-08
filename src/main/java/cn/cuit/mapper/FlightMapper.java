package cn.cuit.mapper;


import cn.cuit.model.Flight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface FlightMapper {
    List<Flight> getFlightsByAirId(String airId);

}
