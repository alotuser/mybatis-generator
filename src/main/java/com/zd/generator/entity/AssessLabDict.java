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
 * 实验室项目字典
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_lab_dict")
@ApiModel(value = "AssessLabDict对象", description = "实验室项目字典")
public class AssessLabDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK")
    @TableId(value = "ld_id", type = IdType.AUTO)
    private Long ldId;

    @ApiModelProperty("类型编码")
    private String itemClassCode;

    @ApiModelProperty("类型名字")
    private String itemClassName;

    @ApiModelProperty("项目编码可能是英文简写或者接口内部编码")
    private String itemCode;

    @ApiModelProperty("项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏")
    private String itemEngCode;

    @ApiModelProperty("项目名字")
    private String itemName;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("参考标准")
    private String reference;

    @ApiModelProperty("逻辑删除标志1-删除 0或者空白 未删除")
    private String isDelete;

    @ApiModelProperty("操作者科室编码")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称")
    private String opeDeptName;

    @ApiModelProperty("操作者编码")
    private String userNo;

    @ApiModelProperty("操作者姓名")
    private String userName;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码")
    private String createUserCode;

    @ApiModelProperty("创建人名称")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码")
    private String updateUserCode;

    @ApiModelProperty("更新人名称")
    private String updateUserName;

    /**		
	 * PK		
     */
    public Long getLdId() {
        return ldId;
    }

    /**		
	 * PK		
     */
    public void setLdId(Long ldId) {
        this.ldId = ldId;
    }
    /**		
	 * 类型编码		
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**		
	 * 类型编码		
     */
    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }
    /**		
	 * 类型名字		
     */
    public String getItemClassName() {
        return itemClassName;
    }

    /**		
	 * 类型名字		
     */
    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName;
    }
    /**		
	 * 项目编码可能是英文简写或者接口内部编码		
     */
    public String getItemCode() {
        return itemCode;
    }

    /**		
	 * 项目编码可能是英文简写或者接口内部编码		
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**		
	 * 项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏		
     */
    public String getItemEngCode() {
        return itemEngCode;
    }

    /**		
	 * 项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏		
     */
    public void setItemEngCode(String itemEngCode) {
        this.itemEngCode = itemEngCode;
    }
    /**		
	 * 项目名字		
     */
    public String getItemName() {
        return itemName;
    }

    /**		
	 * 项目名字		
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    /**		
	 * 单位		
     */
    public String getUnit() {
        return unit;
    }

    /**		
	 * 单位		
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**		
	 * 参考标准		
     */
    public String getReference() {
        return reference;
    }

    /**		
	 * 参考标准		
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
    /**		
	 * 逻辑删除标志1-删除 0或者空白 未删除		
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**		
	 * 逻辑删除标志1-删除 0或者空白 未删除		
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    /**		
	 * 操作者科室编码		
     */
    public String getOpeDeptCode() {
        return opeDeptCode;
    }

    /**		
	 * 操作者科室编码		
     */
    public void setOpeDeptCode(String opeDeptCode) {
        this.opeDeptCode = opeDeptCode;
    }
    /**		
	 * 操作者科室名称		
     */
    public String getOpeDeptName() {
        return opeDeptName;
    }

    /**		
	 * 操作者科室名称		
     */
    public void setOpeDeptName(String opeDeptName) {
        this.opeDeptName = opeDeptName;
    }
    /**		
	 * 操作者编码		
     */
    public String getUserNo() {
        return userNo;
    }

    /**		
	 * 操作者编码		
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    /**		
	 * 操作者姓名		
     */
    public String getUserName() {
        return userName;
    }

    /**		
	 * 操作者姓名		
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
        return "AssessLabDict{" +
            "ldId=" + ldId +
            ", itemClassCode=" + itemClassCode +
            ", itemClassName=" + itemClassName +
            ", itemCode=" + itemCode +
            ", itemEngCode=" + itemEngCode +
            ", itemName=" + itemName +
            ", unit=" + unit +
            ", reference=" + reference +
            ", isDelete=" + isDelete +
            ", opeDeptCode=" + opeDeptCode +
            ", opeDeptName=" + opeDeptName +
            ", userNo=" + userNo +
            ", userName=" + userName +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
