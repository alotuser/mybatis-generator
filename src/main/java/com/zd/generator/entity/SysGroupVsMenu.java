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
 * 用户组与菜单对应关系表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_group_vs_menu")
@ApiModel(value = "SysGroupVsMenu对象", description = "用户组与菜单对应关系表")
public class SysGroupVsMenu extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gm_id", type = IdType.AUTO)
    private Integer gmId;

    @ApiModelProperty("用户组ID ")
    private Integer groupId;

    @ApiModelProperty("菜单ID   ")
    private Integer menuId;

    /**		
	 * 		
     */
    public Integer getGmId() {
        return gmId;
    }

    /**		
	 * 		
     */
    public void setGmId(Integer gmId) {
        this.gmId = gmId;
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
    public Integer getMenuId() {
        return menuId;
    }

    /**		
	 * 菜单ID   		
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "SysGroupVsMenu{" +
            "gmId=" + gmId +
            ", groupId=" + groupId +
            ", menuId=" + menuId +
        "}";
    }
}
