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
 * 指征项目设置表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_item_set")
@ApiModel(value = "SysItemSet对象", description = "指征项目设置表")
public class SysItemSet extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键自增(从1开始)")
    @TableId(value = "item_id", type = IdType.AUTO)
    private Integer itemId;

    @ApiModelProperty("父code(顶层为sys，其他为具有意义的简写)")
    private String parentCode;

    @ApiModelProperty("父类别")
    private String parentName;

    @ApiModelProperty("编码   ")
    private String itemCode;

    @ApiModelProperty("名称   ")
    private String itemName;

    @ApiModelProperty("简称")
    private String itemDesc;

    @ApiModelProperty("推荐值上限")
    private String itemValUp;

    @ApiModelProperty("推荐值下限")
    private String itemValLow;

    @ApiModelProperty("单位")
    private String itemUnit;

    @ApiModelProperty("类别 (mna,mnasf,must,nrs,pgsga,sga,stamp,strongkids)")
    private String itemType;

    @ApiModelProperty("地址")
    private String itemUrl;

    private String itemVersion;

    @ApiModelProperty("扩展字段")
    private String expand;

    @ApiModelProperty("备注   ")
    private String remark;

    @ApiModelProperty("顺序   ")
    private Integer sort;

    @ApiModelProperty("是否默认(1是0否) ")
    private String isDefault;

    @ApiModelProperty("是否有效说明：1：有效 0：无效  ")
    private String isValid;

    @ApiModelProperty("创建时间  ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码")
    private String createUserCode;

    @ApiModelProperty("创建人名称")
    private String createUserName;

    @ApiModelProperty("更新时间  ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码")
    private String updateUserCode;

    @ApiModelProperty("更新人名称")
    private String updateUserName;

    /**		
	 * 主键自增(从1开始)		
     */
    public Integer getItemId() {
        return itemId;
    }

    /**		
	 * 主键自增(从1开始)		
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    /**		
	 * 父code(顶层为sys，其他为具有意义的简写)		
     */
    public String getParentCode() {
        return parentCode;
    }

    /**		
	 * 父code(顶层为sys，其他为具有意义的简写)		
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    /**		
	 * 父类别		
     */
    public String getParentName() {
        return parentName;
    }

    /**		
	 * 父类别		
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    /**		
	 * 编码   		
     */
    public String getItemCode() {
        return itemCode;
    }

    /**		
	 * 编码   		
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**		
	 * 名称   		
     */
    public String getItemName() {
        return itemName;
    }

    /**		
	 * 名称   		
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    /**		
	 * 简称		
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**		
	 * 简称		
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    /**		
	 * 推荐值上限		
     */
    public String getItemValUp() {
        return itemValUp;
    }

    /**		
	 * 推荐值上限		
     */
    public void setItemValUp(String itemValUp) {
        this.itemValUp = itemValUp;
    }
    /**		
	 * 推荐值下限		
     */
    public String getItemValLow() {
        return itemValLow;
    }

    /**		
	 * 推荐值下限		
     */
    public void setItemValLow(String itemValLow) {
        this.itemValLow = itemValLow;
    }
    /**		
	 * 单位		
     */
    public String getItemUnit() {
        return itemUnit;
    }

    /**		
	 * 单位		
     */
    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }
    /**		
	 * 类别 (mna,mnasf,must,nrs,pgsga,sga,stamp,strongkids)		
     */
    public String getItemType() {
        return itemType;
    }

    /**		
	 * 类别 (mna,mnasf,must,nrs,pgsga,sga,stamp,strongkids)		
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    /**		
	 * 地址		
     */
    public String getItemUrl() {
        return itemUrl;
    }

    /**		
	 * 地址		
     */
    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }
    /**		
	 * 		
     */
    public String getItemVersion() {
        return itemVersion;
    }

    /**		
	 * 		
     */
    public void setItemVersion(String itemVersion) {
        this.itemVersion = itemVersion;
    }
    /**		
	 * 扩展字段		
     */
    public String getExpand() {
        return expand;
    }

    /**		
	 * 扩展字段		
     */
    public void setExpand(String expand) {
        this.expand = expand;
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
	 * 顺序   		
     */
    public Integer getSort() {
        return sort;
    }

    /**		
	 * 顺序   		
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    /**		
	 * 是否默认(1是0否) 		
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**		
	 * 是否默认(1是0否) 		
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    /**		
	 * 是否有效说明：1：有效 0：无效  		
     */
    public String getIsValid() {
        return isValid;
    }

    /**		
	 * 是否有效说明：1：有效 0：无效  		
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid;
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
        return "SysItemSet{" +
            "itemId=" + itemId +
            ", parentCode=" + parentCode +
            ", parentName=" + parentName +
            ", itemCode=" + itemCode +
            ", itemName=" + itemName +
            ", itemDesc=" + itemDesc +
            ", itemValUp=" + itemValUp +
            ", itemValLow=" + itemValLow +
            ", itemUnit=" + itemUnit +
            ", itemType=" + itemType +
            ", itemUrl=" + itemUrl +
            ", itemVersion=" + itemVersion +
            ", expand=" + expand +
            ", remark=" + remark +
            ", sort=" + sort +
            ", isDefault=" + isDefault +
            ", isValid=" + isValid +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
