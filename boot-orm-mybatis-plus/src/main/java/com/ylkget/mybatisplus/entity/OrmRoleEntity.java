package com.ylkget.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Spring Boot Demo Orm 系列示例表
 * 
 * @author yanglk
 * @email ylksty@163.com
 * @date 2021-02-21 18:56:41
 */
@Data
@TableName("orm_role")
public class OrmRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 角色名
	 */
	private String name;

}
