package cn.cuit.model;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@ApiModel("用户信息")
@Data
@Mapper
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
public class User implements UserDetails {

    private String id;
    private String username;
    private String password;
    private String name;
    private int gender;
    private String telephone;
    private String email;
    private String address;
    private boolean enabled;
    private String idNumber;
    private Date placedAt;
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities=new ArrayList<>(roles.size());
        for(Role role:roles)
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
