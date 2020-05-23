package cn.cuit.web.controller;

import cn.cuit.mapper.UserMapper;
import cn.cuit.model.RegistrationForm;
import cn.cuit.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("/register")
public class RegistrationController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping
    public void toRegister(HttpServletResponse response){
        response.setStatus(302);
        response.setHeader("Location","http://localhost:8080/register.html");
    }

    @PostMapping
    public RespBean register(@RequestBody RegistrationForm form){
        form.setId(UUID.randomUUID().toString().replace("-",""));
        form.setPassword(passwordEncoder.encode(form.getPassword()));
        form.setEnabled(true);
        if(userMapper.insertUser(form.toUser())!=0){
            return RespBean.ok("注册成功！");
        }else{
            return RespBean.error("注册失败！");
        }
    }
}
