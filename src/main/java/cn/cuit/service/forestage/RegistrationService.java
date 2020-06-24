package cn.cuit.service.forestage;

import cn.cuit.mapper.UserMapper;
import cn.cuit.model.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegistrationService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean register(RegistrationForm form) {
        form.setId(UUID.randomUUID().toString().replace("-", ""));
        form.setPassword(passwordEncoder.encode(form.getPassword()));
        form.setEnabled(true);
        if (userMapper.insertUser(form.toUser()) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
