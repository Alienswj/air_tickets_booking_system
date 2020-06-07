package cn.cuit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class AirTicketsBookingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirTicketsBookingSystemApplication.class, args);
    }

}
