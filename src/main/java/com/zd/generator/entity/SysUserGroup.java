package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户组表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_user_group")
@ApiModel(value = "SysUserGroup对象", description = "用户组表")
public class SysUserGroup extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "group_id", type = IdType.AUTO)
    private Integer groupId;

    @ApiModelProperty("名称")
    private String groupName;

    @ApiModelProperty("1 允许编辑0 不允许编辑(包括不准删除)   ")
    private String canEdit;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("是否删除1-删除0-没删除   ")
    private String isDelete;

    @ApiModelProperty("创建时间   ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码 ")
    private String createUserCode;

    @ApiModelProperty("创建人名称 ")
    private String createUserName;

    @ApiModelProperty("更新时间   ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码 ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称 ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**		
	 * 		
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    /**		
	 * 名称		
     */
    public String getGroupName() {
        return groupName;
    }

    /**		
	 * 名称		
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**		
	 * 1 允许编辑0 不允许编辑(包括不准删除)   		
     */
    public String getCanEdit() {
        return canEdit;
    }

    /**		
	 * 1 允许编辑0 不允许编辑(包括不准删除)   		
     */
    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }
    /**		
	 * 备注		
     */
    public String getRemark() {
        return remark;
    }

    /**		
	 * 备注		
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**		
	 * 是否删除1-删除0-没删除   		
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除1-删除0-没删除   		
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    /**		
	 * 创建时间   		
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**		
	 * 创建时间   		
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    /**		
	 * 创建人编码 		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 创建人编码 		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 创建人名称 		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 创建人名称 		
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    /**		
	 * 更新时间   		
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**		
	 * 更新时间   		
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    /**		
	 * 更新人编码 		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 更新人编码 		
     */
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
    /**		
	 * 更新人名称 		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 更新人名称 		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "SysUserGroup{" +
            "groupId=" + groupId +
            ", groupName=" + groupName +
            ", canEdit=" + canEdit +
            ", remark=" + remark +
            ", isDelete=" + isDelete +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
