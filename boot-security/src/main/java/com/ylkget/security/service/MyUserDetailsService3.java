package com.ylkget.security.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylkget.security.entity.Menu;
import com.ylkget.security.entity.Role;
import com.ylkget.security.entity.Users;
import com.ylkget.security.mapper.UserInfoMapper;
import com.ylkget.security.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * MyUserDetailsService
 * </p>
 *
 * @author joe 2021/3/20 12:06
 */
@Service("userDetailsService")
public class MyUserDetailsService3 implements UserDetailsService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 判断用户名是否存在
        if (!"admin".equals(username)){
//            throw new UsernameNotFoundException("用户名不存在！");
        }
        //调用usersMapper方法，根据用户名查询数据库
        QueryWrapper<Users> wrapper = new QueryWrapper();
        // where username=?
        wrapper.eq("username",username);
        Users users = usersMapper.selectOne(wrapper);
        //判断
        if(users == null) {//数据库没有用户名，认证失败
            throw  new UsernameNotFoundException("用户名不存在！");
        }

        List<Role> roles = userInfoMapper.selectRoleByUserId(Long.valueOf(users.getId()));
        List<Menu> menus = userInfoMapper.selectMenuByUserId(Long.valueOf(users.getId()));

        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        for (Role role: roles) {
            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ROLE_" + role.getName());
            grantedAuthorities.add(simpleGrantedAuthority);
        }

        for (Menu menu: menus) {
            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(menu.getPermission());
            grantedAuthorities.add(simpleGrantedAuthority);
        }

        System.out.println(grantedAuthorities);
//        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("admin,person,ROLE_sale");
        //从查询数据库返回users对象，得到用户名和密码，返回
//        return new User(users.getUsername(), new BCryptPasswordEncoder().encode(users.getPassword()),auths);
        return new User(users.getUsername(), users.getPassword(),grantedAuthorities);
    }
}
