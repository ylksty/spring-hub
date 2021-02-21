package com.ylkget.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>
 * MybatisPlusConfig
 * </p>
 *
 * @author joe 2021/2/21 17:17
 */
@Configuration
@MapperScan(basePackages = {"com.ylkget.mybatisplus.mapper"})
@EnableTransactionManagement
public class MybatisPlusConfig {
}
