package com.menglin.entity;

import java.util.Date;

public class RolePermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.id
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.role_id
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.permission_id
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Long permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.is_delete
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.creator
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.modifier
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.gmt_create
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.gmt_modify
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Date gmtModify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.id
     *
     * @return the value of role_permission.id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.id
     *
     * @param id the value for role_permission.id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.role_id
     *
     * @return the value of role_permission.role_id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.role_id
     *
     * @param roleId the value for role_permission.role_id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.permission_id
     *
     * @return the value of role_permission.permission_id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.permission_id
     *
     * @param permissionId the value for role_permission.permission_id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.is_delete
     *
     * @return the value of role_permission.is_delete
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.is_delete
     *
     * @param isDelete the value for role_permission.is_delete
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.creator
     *
     * @return the value of role_permission.creator
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.creator
     *
     * @param creator the value for role_permission.creator
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.modifier
     *
     * @return the value of role_permission.modifier
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.modifier
     *
     * @param modifier the value for role_permission.modifier
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.gmt_create
     *
     * @return the value of role_permission.gmt_create
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.gmt_create
     *
     * @param gmtCreate the value for role_permission.gmt_create
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.gmt_modify
     *
     * @return the value of role_permission.gmt_modify
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.gmt_modify
     *
     * @param gmtModify the value for role_permission.gmt_modify
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}