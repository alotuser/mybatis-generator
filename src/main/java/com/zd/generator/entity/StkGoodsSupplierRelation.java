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
 * 物品供应商关系表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_goods_supplier_relation")
@ApiModel(value = "StkGoodsSupplierRelation对象", description = "物品供应商关系表")
public class StkGoodsSupplierRelation extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gsr_id", type = IdType.AUTO)
    private Long gsrId;

    @ApiModelProperty("物品id")
    private Long gdId;

    @ApiModelProperty("供应商id")
    private Long supplierId;

    @ApiModelProperty("含税单价")
    private BigDecimal taxPrice;

    @ApiModelProperty("单价单位code")
    private String unitCode;

    @ApiModelProperty("单价单位name")
    private String unitName;

    @ApiModelProperty("状态")
    private String status;

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
    public Long getGsrId() {
        return gsrId;
    }

    /**		
	 * 		
     */
    public void setGsrId(Long gsrId) {
        this.gsrId = gsrId;
    }
    /**		
	 * 物品id		
     */
    public Long getGdId() {
        return gdId;
    }

    /**		
	 * 物品id		
     */
    public void setGdId(Long gdId) {
        this.gdId = gdId;
    }
    /**		
	 * 供应商id		
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**		
	 * 供应商id		
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    /**		
	 * 含税单价		
     */
    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    /**		
	 * 含税单价		
     */
    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }
    /**		
	 * 单价单位code		
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**		
	 * 单价单位code		
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    /**		
	 * 单价单位name		
     */
    public String getUnitName() {
        return unitName;
    }

    /**		
	 * 单价单位name		
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
        return "StkGoodsSupplierRelation{" +
            "gsrId=" + gsrId +
            ", gdId=" + gdId +
            ", supplierId=" + supplierId +
            ", taxPrice=" + taxPrice +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", status=" + status +
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
