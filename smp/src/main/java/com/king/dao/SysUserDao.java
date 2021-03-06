package com.king.dao;

import java.util.List;
import java.util.Map;

import com.king.dal.gen.dao.BaseDao;
import com.king.dal.gen.model.smp.SysUser;

/**
 * 系统用户
 * @author King chen
 * @email 396885563@qq.com
 * @date 2017年12月29日
 */
public interface SysUserDao extends BaseDao<SysUser> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Object userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Object userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUser queryByUserName(String username);
	
	/**
	 * 修改密码
	 */
	int updatePassword(Map<String, Object> map);
	
	/**
	 * 根据部门查询用户
	 * @param deptId
	 * @return
	 */
	List<SysUser> queryByDeptId(Object deptId);
	
	/**
	 * 根据部门递归查询所属及下属部门用户
	 * @param deptIdList
	 * @return
	 */
	List<SysUser> queryByDeptIds(Object[] deptIdList);
	
	/**
	 * 根据角色Id查询用户
	 * @param roleId
	 * @return
	 */
	List<SysUser> queryByRoleId(Object roleId);
}
