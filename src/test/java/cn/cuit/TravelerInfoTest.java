package cn.cuit;

import cn.cuit.model.TravelerInfo;
import cn.cuit.service.forestage.TravelerInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TravelerInfoTest {
    @Autowired
    TravelerInfoService travelerInfoService;

    @Test
    public void putTravelerInfoTest(){
        TravelerInfo travelerInfo=new TravelerInfo("0","时伟建","1111","2222","052e7a8c86194fb19df9ff310835d576");

    }

}
