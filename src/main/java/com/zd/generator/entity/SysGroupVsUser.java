package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户组与用户对应关系表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_group_vs_user")
@ApiModel(value = "SysGroupVsUser对象", description = "用户组与用户对应关系表")
public class SysGroupVsUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK	   ")
    @TableId(value = "gu_id", type = IdType.AUTO)
    private Integer guId;

    @ApiModelProperty("用户组ID  ")
    private Integer groupId;

    @ApiModelProperty("菜单ID ")
    private Integer userId;

    /**		
	 * PK	   		
     */
    public Integer getGuId() {
        return guId;
    }

    /**		
	 * PK	   		
     */
    public void setGuId(Integer guId) {
        this.guId = guId;
    }
    /**		
	 * 用户组ID  		
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**		
	 * 用户组ID  		
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    /**		
	 * 菜单ID 		
     */
    public Integer getUserId() {
        return userId;
    }

    /**		
	 * 菜单ID 		
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "SysGroupVsUser{" +
            "guId=" + guId +
            ", groupId=" + groupId +
            ", userId=" + userId +
        "}";
    }
}
