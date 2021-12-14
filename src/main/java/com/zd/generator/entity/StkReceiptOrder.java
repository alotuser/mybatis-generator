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
 * 出入库单
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_receipt_order")
@ApiModel(value = "StkReceiptOrder对象", description = "出入库单")
public class StkReceiptOrder extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wr_id", type = IdType.AUTO)
    private Long wrId;

    @ApiModelProperty("库单类型  出 out 入")
    private String receiptCalss;

    @ApiModelProperty("库单单号")
    private String receiptNo;

    @ApiModelProperty("出入库日期")
    private LocalDateTime receiptDate;

    @ApiModelProperty("出入库类型code")
    private String receiptTypeCode;

    @ApiModelProperty("出入库类型")
    private String receiptTypeName;

    @ApiModelProperty("仓库code")
    private String warehouseCode;

    @ApiModelProperty("仓库")
    private String warehouseName;

    @ApiModelProperty("业务路径code")
    private String businessPathCode;

    @ApiModelProperty("业务路径")
    private String businessPathName;

    @ApiModelProperty("经办方")
    private String manager;

    @ApiModelProperty("经办人")
    private String operator;

    @ApiModelProperty("经办人电话")
    private String operatorPhone;

    @ApiModelProperty("复制库单单号")
    private String copyReceiptNo;

    @ApiModelProperty("供应商编号")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("供应商联系人")
    private String supplierContact;

    @ApiModelProperty("供应商联系电话")
    private String supplierPhone;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("上传附件")
    private String attachmentsPath;

    @ApiModelProperty("是否删除  0否  1是")
    private String isDelete;

    @ApiModelProperty("状态")
    private String status;

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
    public Long getWrId() {
        return wrId;
    }

    /**		
	 * 		
     */
    public void setWrId(Long wrId) {
        this.wrId = wrId;
    }
    /**		
	 * 库单类型  出 out 入		
     */
    public String getReceiptCalss() {
        return receiptCalss;
    }

    /**		
	 * 库单类型  出 out 入		
     */
    public void setReceiptCalss(String receiptCalss) {
        this.receiptCalss = receiptCalss;
    }
    /**		
	 * 库单单号		
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**		
	 * 库单单号		
     */
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    /**		
	 * 出入库日期		
     */
    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    /**		
	 * 出入库日期		
     */
    public void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }
    /**		
	 * 出入库类型code		
     */
    public String getReceiptTypeCode() {
        return receiptTypeCode;
    }

    /**		
	 * 出入库类型code		
     */
    public void setReceiptTypeCode(String receiptTypeCode) {
        this.receiptTypeCode = receiptTypeCode;
    }
    /**		
	 * 出入库类型		
     */
    public String getReceiptTypeName() {
        return receiptTypeName;
    }

    /**		
	 * 出入库类型		
     */
    public void setReceiptTypeName(String receiptTypeName) {
        this.receiptTypeName = receiptTypeName;
    }
    /**		
	 * 仓库code		
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**		
	 * 仓库code		
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    /**		
	 * 仓库		
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**		
	 * 仓库		
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    /**		
	 * 业务路径code		
     */
    public String getBusinessPathCode() {
        return businessPathCode;
    }

    /**		
	 * 业务路径code		
     */
    public void setBusinessPathCode(String businessPathCode) {
        this.businessPathCode = businessPathCode;
    }
    /**		
	 * 业务路径		
     */
    public String getBusinessPathName() {
        return businessPathName;
    }

    /**		
	 * 业务路径		
     */
    public void setBusinessPathName(String businessPathName) {
        this.businessPathName = businessPathName;
    }
    /**		
	 * 经办方		
     */
    public String getManager() {
        return manager;
    }

    /**		
	 * 经办方		
     */
    public void setManager(String manager) {
        this.manager = manager;
    }
    /**		
	 * 经办人		
     */
    public String getOperator() {
        return operator;
    }

    /**		
	 * 经办人		
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }
    /**		
	 * 经办人电话		
     */
    public String getOperatorPhone() {
        return operatorPhone;
    }

    /**		
	 * 经办人电话		
     */
    public void setOperatorPhone(String operatorPhone) {
        this.operatorPhone = operatorPhone;
    }
    /**		
	 * 复制库单单号		
     */
    public String getCopyReceiptNo() {
        return copyReceiptNo;
    }

    /**		
	 * 复制库单单号		
     */
    public void setCopyReceiptNo(String copyReceiptNo) {
        this.copyReceiptNo = copyReceiptNo;
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
	 * 状态		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态		
     */
    public void setStatus(String status) {
        this.status = status;
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
        return "StkReceiptOrder{" +
            "wrId=" + wrId +
            ", receiptCalss=" + receiptCalss +
            ", receiptNo=" + receiptNo +
            ", receiptDate=" + receiptDate +
            ", receiptTypeCode=" + receiptTypeCode +
            ", receiptTypeName=" + receiptTypeName +
            ", warehouseCode=" + warehouseCode +
            ", warehouseName=" + warehouseName +
            ", businessPathCode=" + businessPathCode +
            ", businessPathName=" + businessPathName +
            ", manager=" + manager +
            ", operator=" + operator +
            ", operatorPhone=" + operatorPhone +
            ", copyReceiptNo=" + copyReceiptNo +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
            ", remark=" + remark +
            ", attachmentsPath=" + attachmentsPath +
            ", isDelete=" + isDelete +
            ", status=" + status +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
