package cn.cuit;

import cn.cuit.model.Flight;
import cn.cuit.service.backstage.FlightService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlightTest {
    @Autowired
    FlightService flightService;

    @Test
    public void getFlightsCountTest(){
        System.out.println(flightService.getFlightsCount());
    }
}
