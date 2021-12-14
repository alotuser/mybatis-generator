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
 * 调拨单
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_transfer_order")
@ApiModel(value = "StkTransferOrder对象", description = "调拨单")
public class StkTransferOrder extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "to_id", type = IdType.AUTO)
    private Long toId;

    @ApiModelProperty("调拨单号")
    private String transferNo;

    @ApiModelProperty("复制调拨单号")
    private String copyTransferNo;

    @ApiModelProperty("调拨日期")
    private LocalDateTime transferDate;

    @ApiModelProperty("调入仓库")
    private String transferWarehouseCode;

    @ApiModelProperty("调入仓库")
    private String transferWarehouseName;

    @ApiModelProperty("调出仓库")
    private String outWarehouseCode;

    @ApiModelProperty("调出仓库")
    private String outWarehouseName;

    @ApiModelProperty("经办方")
    private String manager;

    @ApiModelProperty("经办人")
    private String operator;

    @ApiModelProperty("经办人电话")
    private String operatorPhone;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("图片附件")
    private String picAttachment;

    @ApiModelProperty("文档附件")
    private String docAttachment;

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
    public Long getToId() {
        return toId;
    }

    /**		
	 * 		
     */
    public void setToId(Long toId) {
        this.toId = toId;
    }
    /**		
	 * 调拨单号		
     */
    public String getTransferNo() {
        return transferNo;
    }

    /**		
	 * 调拨单号		
     */
    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }
    /**		
	 * 复制调拨单号		
     */
    public String getCopyTransferNo() {
        return copyTransferNo;
    }

    /**		
	 * 复制调拨单号		
     */
    public void setCopyTransferNo(String copyTransferNo) {
        this.copyTransferNo = copyTransferNo;
    }
    /**		
	 * 调拨日期		
     */
    public LocalDateTime getTransferDate() {
        return transferDate;
    }

    /**		
	 * 调拨日期		
     */
    public void setTransferDate(LocalDateTime transferDate) {
        this.transferDate = transferDate;
    }
    /**		
	 * 调入仓库		
     */
    public String getTransferWarehouseCode() {
        return transferWarehouseCode;
    }

    /**		
	 * 调入仓库		
     */
    public void setTransferWarehouseCode(String transferWarehouseCode) {
        this.transferWarehouseCode = transferWarehouseCode;
    }
    /**		
	 * 调入仓库		
     */
    public String getTransferWarehouseName() {
        return transferWarehouseName;
    }

    /**		
	 * 调入仓库		
     */
    public void setTransferWarehouseName(String transferWarehouseName) {
        this.transferWarehouseName = transferWarehouseName;
    }
    /**		
	 * 调出仓库		
     */
    public String getOutWarehouseCode() {
        return outWarehouseCode;
    }

    /**		
	 * 调出仓库		
     */
    public void setOutWarehouseCode(String outWarehouseCode) {
        this.outWarehouseCode = outWarehouseCode;
    }
    /**		
	 * 调出仓库		
     */
    public String getOutWarehouseName() {
        return outWarehouseName;
    }

    /**		
	 * 调出仓库		
     */
    public void setOutWarehouseName(String outWarehouseName) {
        this.outWarehouseName = outWarehouseName;
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
	 * 图片附件		
     */
    public String getPicAttachment() {
        return picAttachment;
    }

    /**		
	 * 图片附件		
     */
    public void setPicAttachment(String picAttachment) {
        this.picAttachment = picAttachment;
    }
    /**		
	 * 文档附件		
     */
    public String getDocAttachment() {
        return docAttachment;
    }

    /**		
	 * 文档附件		
     */
    public void setDocAttachment(String docAttachment) {
        this.docAttachment = docAttachment;
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
        return "StkTransferOrder{" +
            "toId=" + toId +
            ", transferNo=" + transferNo +
            ", copyTransferNo=" + copyTransferNo +
            ", transferDate=" + transferDate +
            ", transferWarehouseCode=" + transferWarehouseCode +
            ", transferWarehouseName=" + transferWarehouseName +
            ", outWarehouseCode=" + outWarehouseCode +
            ", outWarehouseName=" + outWarehouseName +
            ", manager=" + manager +
            ", operator=" + operator +
            ", operatorPhone=" + operatorPhone +
            ", remark=" + remark +
            ", picAttachment=" + picAttachment +
            ", docAttachment=" + docAttachment +
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
