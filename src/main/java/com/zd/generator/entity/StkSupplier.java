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
 * 供应商
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_supplier")
@ApiModel(value = "StkSupplier对象", description = "供应商")
public class StkSupplier extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "supplier_id", type = IdType.AUTO)
    private Long supplierId;

    @ApiModelProperty("供应商编号")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("供应商类型code")
    private String supplierTypeCode;

    @ApiModelProperty("供应商类型")
    private String supplierTypeName;

    @ApiModelProperty("供应商联系人")
    private String supplierContact;

    @ApiModelProperty("供应商联系电话")
    private String supplierPhone;

    @ApiModelProperty("供应商状况设置 0无效 1有效")
    private String status;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("上传附件")
    private String attachmentsPath;

    @ApiModelProperty("是否删除  0否  1是")
    private String isDelete;

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
    public Long getSupplierId() {
        return supplierId;
    }

    /**		
	 * 		
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    /**		
	 * 供应商编号		
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**		
	 * 供应商编号		
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }
    /**		
	 * 供应商名称		
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**		
	 * 供应商名称		
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    /**		
	 * 供应商类型code		
     */
    public String getSupplierTypeCode() {
        return supplierTypeCode;
    }

    /**		
	 * 供应商类型code		
     */
    public void setSupplierTypeCode(String supplierTypeCode) {
        this.supplierTypeCode = supplierTypeCode;
    }
    /**		
	 * 供应商类型		
     */
    public String getSupplierTypeName() {
        return supplierTypeName;
    }

    /**		
	 * 供应商类型		
     */
    public void setSupplierTypeName(String supplierTypeName) {
        this.supplierTypeName = supplierTypeName;
    }
    /**		
	 * 供应商联系人		
     */
    public String getSupplierContact() {
        return supplierContact;
    }

    /**		
	 * 供应商联系人		
     */
    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }
    /**		
	 * 供应商联系电话		
     */
    public String getSupplierPhone() {
        return supplierPhone;
    }

    /**		
	 * 供应商联系电话		
     */
    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
    /**		
	 * 供应商状况设置 0无效 1有效		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 供应商状况设置 0无效 1有效		
     */
    public void setStatus(String status) {
        this.status = status;
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
	 * 上传附件		
     */
    public String getAttachmentsPath() {
        return attachmentsPath;
    }

    /**		
	 * 上传附件		
     */
    public void setAttachmentsPath(String attachmentsPath) {
        this.attachmentsPath = attachmentsPath;
    }
    /**		
	 * 是否删除  0否  1是		
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除  0否  1是		
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
        return "StkSupplier{" +
            "supplierId=" + supplierId +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierTypeCode=" + supplierTypeCode +
            ", supplierTypeName=" + supplierTypeName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
            ", status=" + status +
            ", remark=" + remark +
            ", attachmentsPath=" + attachmentsPath +
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
