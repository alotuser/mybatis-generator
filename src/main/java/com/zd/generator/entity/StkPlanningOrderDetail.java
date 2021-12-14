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
 * 采购计划详情明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_planning_order_detail")
@ApiModel(value = "StkPlanningOrderDetail对象", description = "采购计划详情明细")
public class StkPlanningOrderDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sod_id", type = IdType.AUTO)
    private Long sodId;

    @ApiModelProperty("shopping_order")
    private Long soId;

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

    @ApiModelProperty("单位")
    private String unitCode;

    @ApiModelProperty("单位")
    private String unitName;

    @ApiModelProperty("采购数量")
    private BigDecimal buyerAmount;

    @ApiModelProperty("使用单位")
    private String useUnitCode;

    @ApiModelProperty("使用单位")
    private String useUnitName;

    @ApiModelProperty("含税单价")
    private BigDecimal purchasePrice;

    @ApiModelProperty("价税合计")
    private BigDecimal sumPrice;

    @ApiModelProperty("计划交付日期")
    private LocalDateTime deliveryDate;

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
    public Long getSodId() {
        return sodId;
    }

    /**		
	 * 		
     */
    public void setSodId(Long sodId) {
        this.sodId = sodId;
    }
    /**		
	 * shopping_order		
     */
    public Long getSoId() {
        return soId;
    }

    /**		
	 * shopping_order		
     */
    public void setSoId(Long soId) {
        this.soId = soId;
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
	 * 采购数量		
     */
    public BigDecimal getBuyerAmount() {
        return buyerAmount;
    }

    /**		
	 * 采购数量		
     */
    public void setBuyerAmount(BigDecimal buyerAmount) {
        this.buyerAmount = buyerAmount;
    }
    /**		
	 * 使用单位		
     */
    public String getUseUnitCode() {
        return useUnitCode;
    }

    /**		
	 * 使用单位		
     */
    public void setUseUnitCode(String useUnitCode) {
        this.useUnitCode = useUnitCode;
    }
    /**		
	 * 使用单位		
     */
    public String getUseUnitName() {
        return useUnitName;
    }

    /**		
	 * 使用单位		
     */
    public void setUseUnitName(String useUnitName) {
        this.useUnitName = useUnitName;
    }
    /**		
	 * 含税单价		
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**		
	 * 含税单价		
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    /**		
	 * 价税合计		
     */
    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    /**		
	 * 价税合计		
     */
    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }
    /**		
	 * 计划交付日期		
     */
    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    /**		
	 * 计划交付日期		
     */
    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
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
        return "StkPlanningOrderDetail{" +
            "sodId=" + sodId +
            ", soId=" + soId +
            ", gdId=" + gdId +
            ", serialNum=" + serialNum +
            ", goodCode=" + goodCode +
            ", productCode=" + productCode +
            ", productName=" + productName +
            ", specification=" + specification +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", buyerAmount=" + buyerAmount +
            ", useUnitCode=" + useUnitCode +
            ", useUnitName=" + useUnitName +
            ", purchasePrice=" + purchasePrice +
            ", sumPrice=" + sumPrice +
            ", deliveryDate=" + deliveryDate +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
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
