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
 * 菜单表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_menu")
@ApiModel(value = "SysMenu对象", description = "菜单表")
public class SysMenu extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("菜单ID   ")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Integer menuId;

    @ApiModelProperty("上级菜单ID  ")
    private Integer parentId;

    @ApiModelProperty("子系统code  ")
    private String subsysCode;

    @ApiModelProperty("子系统name  ")
    private String subsysName;

    @ApiModelProperty("菜单名称 ")
    private String menuName;

    @ApiModelProperty("图标路径 ")
    private String iconPath;

    @ApiModelProperty("页面相对地址(前端控制权限用)  ")
    private String pageUrl;

    @ApiModelProperty("控件ID属性(前端控制权限用)")
    private String ctlId;

    @ApiModelProperty("api相对地址(api控制权限用)")
    private String apiUrl;

    @ApiModelProperty("menu/page/button/other ")
    private String type;

    @ApiModelProperty("排序（同级有效）")
    private Integer sort;

    @ApiModelProperty("状态 1 启用 0 禁用 ")
    private String status;

    @ApiModelProperty("菜单说明 ")
    private String remarks;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码  ")
    private String createUserCode;

    @ApiModelProperty("创建人名称  ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码  ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称  ")
    private String updateUserName;

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
    /**		
	 * 上级菜单ID  		
     */
    public Integer getParentId() {
        return parentId;
    }

    /**		
	 * 上级菜单ID  		
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    /**		
	 * 子系统code  		
     */
    public String getSubsysCode() {
        return subsysCode;
    }

    /**		
	 * 子系统code  		
     */
    public void setSubsysCode(String subsysCode) {
        this.subsysCode = subsysCode;
    }
    /**		
	 * 子系统name  		
     */
    public String getSubsysName() {
        return subsysName;
    }

    /**		
	 * 子系统name  		
     */
    public void setSubsysName(String subsysName) {
        this.subsysName = subsysName;
    }
    /**		
	 * 菜单名称 		
     */
    public String getMenuName() {
        return menuName;
    }

    /**		
	 * 菜单名称 		
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    /**		
	 * 图标路径 		
     */
    public String getIconPath() {
        return iconPath;
    }

    /**		
	 * 图标路径 		
     */
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    /**		
	 * 页面相对地址(前端控制权限用)  		
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**		
	 * 页面相对地址(前端控制权限用)  		
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
    /**		
	 * 控件ID属性(前端控制权限用)		
     */
    public String getCtlId() {
        return ctlId;
    }

    /**		
	 * 控件ID属性(前端控制权限用)		
     */
    public void setCtlId(String ctlId) {
        this.ctlId = ctlId;
    }
    /**		
	 * api相对地址(api控制权限用)		
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**		
	 * api相对地址(api控制权限用)		
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
    /**		
	 * menu/page/button/other 		
     */
    public String getType() {
        return type;
    }

    /**		
	 * menu/page/button/other 		
     */
    public void setType(String type) {
        this.type = type;
    }
    /**		
	 * 排序（同级有效）		
     */
    public Integer getSort() {
        return sort;
    }

    /**		
	 * 排序（同级有效）		
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    /**		
	 * 状态 1 启用 0 禁用 		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态 1 启用 0 禁用 		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 菜单说明 		
     */
    public String getRemarks() {
        return remarks;
    }

    /**		
	 * 菜单说明 		
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        return "SysMenu{" +
            "menuId=" + menuId +
            ", parentId=" + parentId +
            ", subsysCode=" + subsysCode +
            ", subsysName=" + subsysName +
            ", menuName=" + menuName +
            ", iconPath=" + iconPath +
            ", pageUrl=" + pageUrl +
            ", ctlId=" + ctlId +
            ", apiUrl=" + apiUrl +
            ", type=" + type +
            ", sort=" + sort +
            ", status=" + status +
            ", remarks=" + remarks +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
