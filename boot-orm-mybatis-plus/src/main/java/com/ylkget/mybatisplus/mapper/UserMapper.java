package com.ylkget.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylkget.mybatisplus.entity.OrmUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * UserMapper
 * </p>
 *
 * @author joe 2021/2/21 17:54
 */
@Mapper
public interface UserMapper extends BaseMapper<OrmUserEntity> {
}
