package cn.cuit;

import cn.cuit.model.QueryCondition;
import cn.cuit.service.forestage.TicketService;
import cn.cuit.service.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;

@SpringBootTest
public class TicketsTest {
    @Autowired
    TicketService ticketService;

    @Test
    public void getAllTicketsByPages(){
        try {
            QueryCondition queryCondition=new QueryCondition("上海","成都", DateUtils.StringToDate("2020-06-17"));
            PageInfo pageInfo=ticketService.getAllTicketsByPage(queryCondition,1,5);
            System.out.println(pageInfo);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
