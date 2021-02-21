package com.ylkget.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylkget.mybatisplus.entity.OrmUserEntity;
import com.ylkget.mybatisplus.mapper.UserMapper;
import com.ylkget.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/2/21 17:52
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, OrmUserEntity> implements UserService {
}
