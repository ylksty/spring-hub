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
@TableName("orm_user")
public class OrmUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 用户名
	 */
	private String name;
	/**
	 * 加密后的密码
	 */
	private String password;
	/**
	 * 加密使用的盐
	 */
	private String salt;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号码
	 */
	private String phoneNumber;
	/**
	 * 状态，-1：逻辑删除，0：禁用，1：启用
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 上次登录时间
	 */
	private Date lastLoginTime;
	/**
	 * 上次更新时间
	 */
	private Date lastUpdateTime;

}
