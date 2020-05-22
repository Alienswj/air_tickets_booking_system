package cn.cuit.web.controller;

import cn.cuit.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }
    @GetMapping("/hello")
    public String sayHello(){

        return "hello";
    }
}
