package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 调拨单详情明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_transfer_order_detail")
@ApiModel(value = "StkTransferOrderDetail对象", description = "调拨单详情明细")
public class StkTransferOrderDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tod_id", type = IdType.AUTO)
    private Long todId;

    @ApiModelProperty("transfer_order")
    private Long toId;

    private Long wrdId;

    private Long gdId;

    @ApiModelProperty("序号，保证保存和显示顺序一致")
    private Integer serialNum;

    @ApiModelProperty("物品编号")
    private String goodCode;

    @ApiModelProperty("物品编号")
    private String productCode;

    @ApiModelProperty("物品名称")
    private String productName;

    @ApiModelProperty("规格型号")
    private String specification;

    @ApiModelProperty("规格型号")
    private String specificationModel;

    @ApiModelProperty("单位")
    private String unitType;

    @ApiModelProperty("单位")
    private String unitCode;

    @ApiModelProperty("单位")
    private String unitName;

    @ApiModelProperty("入库单号")
    private String receiptNo;

    @ApiModelProperty("入库日期")
    private LocalDateTime receiptDate;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("供应商code")
    private String supplierCode;

    @ApiModelProperty("供应商name")
    private String supplierName;

    @ApiModelProperty("联系人")
    private String supplierContact;

    @ApiModelProperty("联系电话")
    private String supplierPhone;

    @ApiModelProperty("供应商价格")
    private BigDecimal taxPrice;

    @ApiModelProperty("入库数量")
    private BigDecimal transferAmount;

    @ApiModelProperty("当前数量")
    private BigDecimal currentAmount;

    private BigDecimal currentAmounts;

    @ApiModelProperty("生产日期")
    private String productDate;

    @ApiModelProperty("有效期")
    private LocalDateTime validityDate;

    @ApiModelProperty("备注")
    private String remark;

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
    public Long getTodId() {
        return todId;
    }

    /**		
	 * 		
     */
    public void setTodId(Long todId) {
        this.todId = todId;
    }
    /**		
	 * transfer_order		
     */
    public Long getToId() {
        return toId;
    }

    /**		
	 * transfer_order		
     */
    public void setToId(Long toId) {
        this.toId = toId;
    }
    /**		
	 * 		
     */
    public Long getWrdId() {
        return wrdId;
    }

    /**		
	 * 		
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
    public String getUnitType() {
        return unitType;
    }

    /**		
	 * 单位		
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
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
	 * 单位		
     */
    public String getUnitName() {
        return unitName;
    }

    /**		
	 * 单位		
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    /**		
	 * 入库单号		
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**		
	 * 入库单号		
     */
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    /**		
	 * 入库日期		
     */
    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    /**		
	 * 入库日期		
     */
    public void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
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
	 * 联系电话		
     */
    public String getSupplierPhone() {
        return supplierPhone;
    }

    /**		
	 * 联系电话		
     */
    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
    /**		
	 * 供应商价格		
     */
    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    /**		
	 * 供应商价格		
     */
    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }
    /**		
	 * 入库数量		
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**		
	 * 入库数量		
     */
    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }
    /**		
	 * 当前数量		
     */
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    /**		
	 * 当前数量		
     */
    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }
    /**		
	 * 		
     */
    public BigDecimal getCurrentAmounts() {
        return currentAmounts;
    }

    /**		
	 * 		
     */
    public void setCurrentAmounts(BigDecimal currentAmounts) {
        this.currentAmounts = currentAmounts;
    }
    /**		
	 * 生产日期		
     */
    public String getProductDate() {
        return productDate;
    }

    /**		
	 * 生产日期		
     */
    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }
    /**		
	 * 有效期		
     */
    public LocalDateTime getValidityDate() {
        return validityDate;
    }

    /**		
	 * 有效期		
     */
    public void setValidityDate(LocalDateTime validityDate) {
        this.validityDate = validityDate;
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
        return "StkTransferOrderDetail{" +
            "todId=" + todId +
            ", toId=" + toId +
            ", wrdId=" + wrdId +
            ", gdId=" + gdId +
            ", serialNum=" + serialNum +
            ", goodCode=" + goodCode +
            ", productCode=" + productCode +
            ", productName=" + productName +
            ", specification=" + specification +
            ", specificationModel=" + specificationModel +
            ", unitType=" + unitType +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", receiptNo=" + receiptNo +
            ", receiptDate=" + receiptDate +
            ", brand=" + brand +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
            ", taxPrice=" + taxPrice +
            ", transferAmount=" + transferAmount +
            ", currentAmount=" + currentAmount +
            ", currentAmounts=" + currentAmounts +
            ", productDate=" + productDate +
            ", validityDate=" + validityDate +
            ", remark=" + remark +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
