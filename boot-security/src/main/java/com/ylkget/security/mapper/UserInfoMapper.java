package com.ylkget.security.mapper;

import com.ylkget.security.entity.Menu;
import com.ylkget.security.entity.Role;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * UserInfoMapper$
 * </p>
 *
 * @author joe 2021-03-21 09:17
 */
@Repository
public interface UserInfoMapper {
    /**
     * 根据用户 Id 查询用户角色
     * @param userId
     * @return
     */
    List<Role> selectRoleByUserId(Long userId);
    /**
     * 根据用户 Id 查询菜单
     * @param userId
     * @return
     */
    List<Menu> selectMenuByUserId(Long userId);
}
