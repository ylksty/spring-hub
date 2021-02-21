package com.ylkget.mybatisplus.service;


import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylkget.mybatisplus.BootOrmMybatisPlusApplicationTests;
import com.ylkget.mybatisplus.entity.OrmUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserServiceTest extends BootOrmMybatisPlusApplicationTests {
    @Autowired
    private UserService userService;

    /**
     * 测试Mybatis-Plus 查询全部
     */
    @Test
    public void testQueryAll() {
        List<OrmUserEntity> list = userService.list(new QueryWrapper<>());
        Assert.assertTrue(CollUtil.isNotEmpty(list));
        log.debug("【list】= {}", list);
    }
}