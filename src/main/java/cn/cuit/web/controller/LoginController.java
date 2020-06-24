package cn.cuit.web.controller;

import cn.cuit.model.RespBean;
import cn.cuit.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(tags="登录相关接口")

@RestController
public class LoginController {

    @ApiOperation("返回用户未登录的消息")
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }

    @GetMapping("/hello")
    public void sayHello(HttpServletRequest request, HttpServletResponse response){
        //response.setStatus(302);
        //response.setHeader("Location","/index.html");
        String names =request.getSession().getAttribute("SPRING_SECURITY_CONTEXT").toString();
        System.out.println(names);
        //return RespBean.error("hello");
        User user=(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name=user.getName();
        System.out.println(name);
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString());
    }
}
