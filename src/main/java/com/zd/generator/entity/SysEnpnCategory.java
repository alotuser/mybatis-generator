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
 * ENPN分类表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_enpn_category")
@ApiModel(value = "SysEnpnCategory对象", description = "ENPN分类表")
public class SysEnpnCategory extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ec_id", type = IdType.AUTO)
    private Integer ecId;

    @ApiModelProperty("类别编码")
    private String cateCode;

    @ApiModelProperty("类别名称")
    private String cateName;

    @ApiModelProperty("父类编码")
    private String parentCode;

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
	 * 		
     */
    public Integer getEcId() {
        return ecId;
    }

    /**		
	 * 		
     */
    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }
    /**		
	 * 类别编码		
     */
    public String getCateCode() {
        return cateCode;
    }

    /**		
	 * 类别编码		
     */
    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }
    /**		
	 * 类别名称		
     */
    public String getCateName() {
        return cateName;
    }

    /**		
	 * 类别名称		
     */
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    /**		
	 * 父类编码		
     */
    public String getParentCode() {
        return parentCode;
    }

    /**		
	 * 父类编码		
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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
        return "SysEnpnCategory{" +
            "ecId=" + ecId +
            ", cateCode=" + cateCode +
            ", cateName=" + cateName +
            ", parentCode=" + parentCode +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
