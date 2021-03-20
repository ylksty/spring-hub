package com.ylkget.security.config;

import com.ylkget.security.service.MyUserDetailsService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <p>
 * SecurityConfig
 * </p>
 *
 * @author joe 2021/3/20 10:14
 */
@Configuration
public class SecurityConfig3 extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailsService3 userDetailsService;

    // 注入 PasswordEncoder 类到 spring 容器中
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // 可省略这个方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //退出
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/test/hello");

        //配置没有权限访问跳转自定义页面
        http.exceptionHandling()
                .accessDeniedPage("/unauth.html");

        // 配置认证
        http.formLogin()
                .loginPage("/login.html") // 配置哪个 url 为登录页面
                .loginProcessingUrl("/user/login") // 设置哪个是登录的 url。security接管，不用自己写Controller
                .defaultSuccessUrl("/test/index") // 登录成功之后跳转到哪个 url
                .failureUrl("/unauth.html") // 自定义403页面
        ;

        http.authorizeRequests()
                .antMatchers("/", "/login.html", "/user/login", "/test/hello") //表示配置请求路径
                .permitAll() // 指定 URL 无需保护。
                //当前登录用户，只有具有admins权限才可以访问这个路径
                //1 hasAuthority方法
                 .antMatchers("/test/admin").hasAuthority("admin")
                //2 hasAnyAuthority方法,可加多个权限
                 .antMatchers("/test/log").hasAnyAuthority("person,boss")
                //3 hasRole方法   ROLE_sale
                .antMatchers("/test/secret").hasRole("boss")
                //4 hasAnyRole方法   ROLE_sale
                .antMatchers("/test/sale").hasAnyRole("sale")
                .anyRequest() // 其他请求
                .authenticated(); //需要认证

        // 关闭 csrf
        http.csrf().disable();
    }
}
