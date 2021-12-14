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
 * 字典表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_dict")
@ApiModel(value = "SysDict对象", description = "字典表")
public class SysDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键自增(从1开始)")
    @TableId(value = "dict_id", type = IdType.AUTO)
    private Integer dictId;

    @ApiModelProperty("父字典code(顶层为sys，其他为具有意义的简写)  ")
    private String parentCode;

    @ApiModelProperty("名称   ")
    private String dictName;

    @ApiModelProperty("编码   ")
    private String dictCode;

    @ApiModelProperty("拓展备用  ")
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
    public Integer getDictId() {
        return dictId;
    }

    /**		
	 * 主键自增(从1开始)		
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }
    /**		
	 * 父字典code(顶层为sys，其他为具有意义的简写)  		
     */
    public String getParentCode() {
        return parentCode;
    }

    /**		
	 * 父字典code(顶层为sys，其他为具有意义的简写)  		
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    /**		
	 * 名称   		
     */
    public String getDictName() {
        return dictName;
    }

    /**		
	 * 名称   		
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }
    /**		
	 * 编码   		
     */
    public String getDictCode() {
        return dictCode;
    }

    /**		
	 * 编码   		
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }
    /**		
	 * 拓展备用  		
     */
    public String getExpand() {
        return expand;
    }

    /**		
	 * 拓展备用  		
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
        return "SysDict{" +
            "dictId=" + dictId +
            ", parentCode=" + parentCode +
            ", dictName=" + dictName +
            ", dictCode=" + dictCode +
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
