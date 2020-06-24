package cn.cuit;

import cn.cuit.model.RegistrationForm;
import cn.cuit.service.forestage.RegistrationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegistrationTest {
    @Autowired
    RegistrationService registrationService;

    @Test
    public void testRegister(){
        RegistrationForm registrationForm=new RegistrationForm();
        registrationForm.setUsername("dubaolong");
        registrationForm.setPassword("123456");
        registrationForm.setTelephone("123234234");
        registrationForm.setIdNumber("2345346223423523");
        System.out.println(registrationService.register(registrationForm));
    }
}
