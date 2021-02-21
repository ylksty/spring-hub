package com.ylkget.mybatisplus.dao;

import com.ylkget.mybatisplus.entity.OrmRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Spring Boot Demo Orm 系列示例表
 * 
 * @author yanglk
 * @email ylksty@163.com
 * @date 2021-02-21 18:56:41
 */
@Mapper
public interface OrmRoleDao extends BaseMapper<OrmRoleEntity> {
	
}
