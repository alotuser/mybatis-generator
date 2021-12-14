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
 * 盘点单详情明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_inventory_order_detail")
@ApiModel(value = "StkInventoryOrderDetail对象", description = "盘点单详情明细")
public class StkInventoryOrderDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "iod_id", type = IdType.AUTO)
    private Long iodId;

    @ApiModelProperty("inventory_order")
    private Long ioId;

    @ApiModelProperty("调拨单明细id")
    private Long todId;

    @ApiModelProperty("出入库单明细id")
    private Long wrdId;

    private Long gdId;

    @ApiModelProperty("序号，保证保存和显示顺序一致")
    private Integer serialNum;

    @ApiModelProperty("盘点单号")
    private String inventoryNo;

    @ApiModelProperty("关联盘点单号")
    private String refInventoryNo;

    @ApiModelProperty("物品编号")
    private String goodCode;

    @ApiModelProperty("物品编号")
    private String productCode;

    @ApiModelProperty("物品名称")
    private String productName;

    @ApiModelProperty("供应商code")
    private String supplierCode;

    @ApiModelProperty("供应商name")
    private String supplierName;

    @ApiModelProperty("联系人")
    private String supplierContact;

    @ApiModelProperty("电话")
    private String supplierPhone;

    @ApiModelProperty("规格型号")
    private String specification;

    @ApiModelProperty("规格型号")
    private String specificationModel;

    @ApiModelProperty("单位")
    private String unitCode;

    private String unitName;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("入库数量")
    private Long receiptAmount;

    @ApiModelProperty("系统数量")
    private Long systemAmount;

    @ApiModelProperty("实盘数量")
    private Long realAmount;

    @ApiModelProperty("盈亏数量")
    private Long lossAmount;

    @ApiModelProperty("当前数量")
    private Long currentAmount;

    @ApiModelProperty("盘点结果")
    private String result;

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
    public Long getIodId() {
        return iodId;
    }

    /**		
	 * 		
     */
    public void setIodId(Long iodId) {
        this.iodId = iodId;
    }
    /**		
	 * inventory_order		
     */
    public Long getIoId() {
        return ioId;
    }

    /**		
	 * inventory_order		
     */
    public void setIoId(Long ioId) {
        this.ioId = ioId;
    }
    /**		
	 * 调拨单明细id		
     */
    public Long getTodId() {
        return todId;
    }

    /**		
	 * 调拨单明细id		
     */
    public void setTodId(Long todId) {
        this.todId = todId;
    }
    /**		
	 * 出入库单明细id		
     */
    public Long getWrdId() {
        return wrdId;
    }

    /**		
	 * 出入库单明细id		
     */
    public void setWrdId(Long wrdId) {
        this.wrdId = wrdId;
    }
    /**		
	 * 		
     */
    public Long getGdId() {
        return gdId;
    }

    /**		
	 * 		
     */
    public void setGdId(Long gdId) {
        this.gdId = gdId;
    }
    /**		
	 * 序号，保证保存和显示顺序一致		
     */
    public Integer getSerialNum() {
        return serialNum;
    }

    /**		
	 * 序号，保证保存和显示顺序一致		
     */
    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
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
	 * 关联盘点单号		
     */
    public String getRefInventoryNo() {
        return refInventoryNo;
    }

    /**		
	 * 关联盘点单号		
     */
    public void setRefInventoryNo(String refInventoryNo) {
        this.refInventoryNo = refInventoryNo;
    }
    /**		
	 * 物品编号		
     */
    public String getGoodCode() {
        return goodCode;
    }

    /**		
	 * 物品编号		
     */
    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode;
    }
    /**		
	 * 物品编号		
     */
    public String getProductCode() {
        return productCode;
    }

    /**		
	 * 物品编号		
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    /**		
	 * 物品名称		
     */
    public String getProductName() {
        return productName;
    }

    /**		
	 * 物品名称		
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**		
	 * 供应商code		
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**		
	 * 供应商code		
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }
    /**		
	 * 供应商name		
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**		
	 * 供应商name		
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    /**		
	 * 联系人		
     */
    public String getSupplierContact() {
        return supplierContact;
    }

    /**		
	 * 联系人		
     */
    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }
    /**		
	 * 电话		
     */
    public String getSupplierPhone() {
        return supplierPhone;
    }

    /**		
	 * 电话		
     */
    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
    /**		
	 * 规格型号		
     */
    public String getSpecification() {
        return specification;
    }

    /**		
	 * 规格型号		
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    /**		
	 * 规格型号		
     */
    public String getSpecificationModel() {
        return specificationModel;
    }

    /**		
	 * 规格型号		
     */
    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }
    /**		
	 * 单位		
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**		
	 * 单位		
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    /**		
	 * 		
     */
    public String getUnitName() {
        return unitName;
    }

    /**		
	 * 		
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    /**		
	 * 品牌		
     */
    public String getBrand() {
        return brand;
    }

    /**		
	 * 品牌		
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**		
	 * 入库数量		
     */
    public Long getReceiptAmount() {
        return receiptAmount;
    }

    /**		
	 * 入库数量		
     */
    public void setReceiptAmount(Long receiptAmount) {
        this.receiptAmount = receiptAmount;
    }
    /**		
	 * 系统数量		
     */
    public Long getSystemAmount() {
        return systemAmount;
    }

    /**		
	 * 系统数量		
     */
    public void setSystemAmount(Long systemAmount) {
        this.systemAmount = systemAmount;
    }
    /**		
	 * 实盘数量		
     */
    public Long getRealAmount() {
        return realAmount;
    }

    /**		
	 * 实盘数量		
     */
    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }
    /**		
	 * 盈亏数量		
     */
    public Long getLossAmount() {
        return lossAmount;
    }

    /**		
	 * 盈亏数量		
     */
    public void setLossAmount(Long lossAmount) {
        this.lossAmount = lossAmount;
    }
    /**		
	 * 当前数量		
     */
    public Long getCurrentAmount() {
        return currentAmount;
    }

    /**		
	 * 当前数量		
     */
    public void setCurrentAmount(Long currentAmount) {
        this.currentAmount = currentAmount;
    }
    /**		
	 * 盘点结果		
     */
    public String getResult() {
        return result;
    }

    /**		
	 * 盘点结果		
     */
    public void setResult(String result) {
        this.result = result;
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
        return "StkInventoryOrderDetail{" +
            "iodId=" + iodId +
            ", ioId=" + ioId +
            ", todId=" + todId +
            ", wrdId=" + wrdId +
            ", gdId=" + gdId +
            ", serialNum=" + serialNum +
            ", inventoryNo=" + inventoryNo +
            ", refInventoryNo=" + refInventoryNo +
            ", goodCode=" + goodCode +
            ", productCode=" + productCode +
            ", productName=" + productName +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
            ", specification=" + specification +
            ", specificationModel=" + specificationModel +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", brand=" + brand +
            ", receiptAmount=" + receiptAmount +
            ", systemAmount=" + systemAmount +
            ", realAmount=" + realAmount +
            ", lossAmount=" + lossAmount +
            ", currentAmount=" + currentAmount +
            ", result=" + result +
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
