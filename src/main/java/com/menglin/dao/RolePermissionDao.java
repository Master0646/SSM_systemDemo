package com.menglin.dao;

import com.menglin.entity.RolePermission;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionDao {

    RolePermission selectByRoleIdAndPermissionId(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int insert(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int insertSelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    RolePermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int updateByPrimaryKey(RolePermission record);
}