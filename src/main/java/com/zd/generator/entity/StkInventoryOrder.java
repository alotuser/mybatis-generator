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
 * 盘点单
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_inventory_order")
@ApiModel(value = "StkInventoryOrder对象", description = "盘点单")
public class StkInventoryOrder extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "io_id", type = IdType.AUTO)
    private Long ioId;

    @ApiModelProperty("盘点单号")
    private String inventoryNo;

    @ApiModelProperty("复制盘点单号")
    private String copyInventoryNo;

    @ApiModelProperty("盘点日期")
    private LocalDateTime inventoryDate;

    @ApiModelProperty("仓库code")
    private String warehouseCode;

    @ApiModelProperty("仓库")
    private String warehouseName;

    @ApiModelProperty("盘点开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("盘点结束时间")
    private LocalDateTime endTime;

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

    @ApiModelProperty("状态 0 暂存  1 结束盘点")
    private String status;

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
    public Long getIoId() {
        return ioId;
    }

    /**		
	 * 		
     */
    public void setIoId(Long ioId) {
        this.ioId = ioId;
    }
    /**		
	 * 盘点单号		
     */
    public String getInventoryNo() {
        return inventoryNo;
    }

    /**		
	 * 盘点单号		
     */
    public void setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo;
    }
    /**		
	 * 复制盘点单号		
     */
    public String getCopyInventoryNo() {
        return copyInventoryNo;
    }

    /**		
	 * 复制盘点单号		
     */
    public void setCopyInventoryNo(String copyInventoryNo) {
        this.copyInventoryNo = copyInventoryNo;
    }
    /**		
	 * 盘点日期		
     */
    public LocalDateTime getInventoryDate() {
        return inventoryDate;
    }

    /**		
	 * 盘点日期		
     */
    public void setInventoryDate(LocalDateTime inventoryDate) {
        this.inventoryDate = inventoryDate;
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
	 * 盘点开始时间		
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**		
	 * 盘点开始时间		
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    /**		
	 * 盘点结束时间		
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**		
	 * 盘点结束时间		
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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
	 * 状态 0 暂存  1 结束盘点		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态 0 暂存  1 结束盘点		
     */
    public void setStatus(String status) {
        this.status = status;
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
        return "StkInventoryOrder{" +
            "ioId=" + ioId +
            ", inventoryNo=" + inventoryNo +
            ", copyInventoryNo=" + copyInventoryNo +
            ", inventoryDate=" + inventoryDate +
            ", warehouseCode=" + warehouseCode +
            ", warehouseName=" + warehouseName +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", manager=" + manager +
            ", operator=" + operator +
            ", operatorPhone=" + operatorPhone +
            ", remark=" + remark +
            ", picAttachment=" + picAttachment +
            ", docAttachment=" + docAttachment +
            ", status=" + status +
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
