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
 * 出入库单详情明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_receipt_order_detail")
@ApiModel(value = "StkReceiptOrderDetail对象", description = "出入库单详情明细")
public class StkReceiptOrderDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wrd_id", type = IdType.AUTO)
    private Long wrdId;

    @ApiModelProperty("warehouse_receipt")
    private Long wrId;

    private Long gdId;

    private Long todId;

    private Long oedId;

    @ApiModelProperty("序号，保证保存和显示顺序一致")
    private Integer serialNum;

    @ApiModelProperty("用于出库时关联入库的明细id")
    private Long refWrdId;

    @ApiModelProperty("关联业务单号")
    private String refReceiptNo;

    @ApiModelProperty("出入库单号")
    private String receiptNo;

    @ApiModelProperty("物品编号")
    private String goodCode;

    @ApiModelProperty("物品编号")
    private String productCode;

    @ApiModelProperty("物品名称")
    private String productName;

    @ApiModelProperty("规格型号")
    private String specification;

    @ApiModelProperty("单位类型 0.使用单位，1.最小单位")
    private String unitType;

    @ApiModelProperty("单位code")
    private String unitCode;

    @ApiModelProperty("单位name")
    private String unitName;

    @ApiModelProperty("当前数量")
    private BigDecimal currentAmount;

    private BigDecimal currentAmounts;

    @ApiModelProperty("入库数量")
    private BigDecimal receiptAmount;

    @ApiModelProperty("含税单价")
    private BigDecimal purchasePrice;

    @ApiModelProperty("价税合计")
    private BigDecimal sumPrice;

    @ApiModelProperty("供应商编号")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("供应商联系人")
    private String supplierContact;

    @ApiModelProperty("供应商联系电话")
    private String supplierPhone;

    @ApiModelProperty("供应商价格")
    private BigDecimal taxPrice;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("生产日期")
    private String productDate;

    @ApiModelProperty("有效期")
    private LocalDateTime validityDate;

    @ApiModelProperty("关联效期 0否 1是")
    private String isValidity;

    @ApiModelProperty("是否删除")
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
	 * warehouse_receipt		
     */
    public Long getWrId() {
        return wrId;
    }

    /**		
	 * warehouse_receipt		
     */
    public void setWrId(Long wrId) {
        this.wrId = wrId;
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
	 * 		
     */
    public Long getOedId() {
        return oedId;
    }

    /**		
	 * 		
     */
    public void setOedId(Long oedId) {
        this.oedId = oedId;
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
	 * 用于出库时关联入库的明细id		
     */
    public Long getRefWrdId() {
        return refWrdId;
    }

    /**		
	 * 用于出库时关联入库的明细id		
     */
    public void setRefWrdId(Long refWrdId) {
        this.refWrdId = refWrdId;
    }
    /**		
	 * 关联业务单号		
     */
    public String getRefReceiptNo() {
        return refReceiptNo;
    }

    /**		
	 * 关联业务单号		
     */
    public void setRefReceiptNo(String refReceiptNo) {
        this.refReceiptNo = refReceiptNo;
    }
    /**		
	 * 出入库单号		
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**		
	 * 出入库单号		
     */
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
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
	 * 单位类型 0.使用单位，1.最小单位		
     */
    public String getUnitType() {
        return unitType;
    }

    /**		
	 * 单位类型 0.使用单位，1.最小单位		
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
    /**		
	 * 单位code		
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**		
	 * 单位code		
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    /**		
	 * 单位name		
     */
    public String getUnitName() {
        return unitName;
    }

    /**		
	 * 单位name		
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
	 * 入库数量		
     */
    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    /**		
	 * 入库数量		
     */
    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
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
	 * 关联效期 0否 1是		
     */
    public String getIsValidity() {
        return isValidity;
    }

    /**		
	 * 关联效期 0否 1是		
     */
    public void setIsValidity(String isValidity) {
        this.isValidity = isValidity;
    }
    /**		
	 * 是否删除		
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除		
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
        return "StkReceiptOrderDetail{" +
            "wrdId=" + wrdId +
            ", wrId=" + wrId +
            ", gdId=" + gdId +
            ", todId=" + todId +
            ", oedId=" + oedId +
            ", serialNum=" + serialNum +
            ", refWrdId=" + refWrdId +
            ", refReceiptNo=" + refReceiptNo +
            ", receiptNo=" + receiptNo +
            ", goodCode=" + goodCode +
            ", productCode=" + productCode +
            ", productName=" + productName +
            ", specification=" + specification +
            ", unitType=" + unitType +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", currentAmount=" + currentAmount +
            ", currentAmounts=" + currentAmounts +
            ", receiptAmount=" + receiptAmount +
            ", purchasePrice=" + purchasePrice +
            ", sumPrice=" + sumPrice +
            ", supplierCode=" + supplierCode +
            ", supplierName=" + supplierName +
            ", supplierContact=" + supplierContact +
            ", supplierPhone=" + supplierPhone +
            ", taxPrice=" + taxPrice +
            ", remark=" + remark +
            ", productDate=" + productDate +
            ", validityDate=" + validityDate +
            ", isValidity=" + isValidity +
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
