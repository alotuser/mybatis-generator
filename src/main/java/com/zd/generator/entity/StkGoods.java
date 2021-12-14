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
 * 物品
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_goods")
@ApiModel(value = "StkGoods对象", description = "物品")
public class StkGoods extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gd_id", type = IdType.AUTO)
    private Long gdId;

    @ApiModelProperty("物品编号")
    private String goodCode;

    @ApiModelProperty("物品编号（关联）")
    private String productCode;

    @ApiModelProperty("物品名称")
    private String productName;

    @ApiModelProperty("单位code")
    private String unitCode;

    @ApiModelProperty("单位name")
    private String unitName;

    @ApiModelProperty("入库规格")
    private String specification;

    @ApiModelProperty("物品类目code")
    private String productCategoryCode;

    @ApiModelProperty("物品类目name")
    private String productCategoryName;

    @ApiModelProperty("品牌")
    private String brand;

    @ApiModelProperty("自动出库 0按入库日期优先 1按有效期优先")
    private String autoStock;

    @ApiModelProperty("库存上限")
    private Integer stockUpLimit;

    @ApiModelProperty("库存下限")
    private Integer stockDownLimit;

    @ApiModelProperty("是否库存预警")
    private String stockWarning;

    @ApiModelProperty("预警天数")
    private String warnDays;

    @ApiModelProperty("是否效期预警")
    private String validityWarning;

    @ApiModelProperty("有效期天数")
    private String validDays;

    @ApiModelProperty("基准采购价（含税）")
    private BigDecimal purchasePrice;

    @ApiModelProperty("基准销售价（含税）")
    private BigDecimal salesPrice;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("1.当前库存")
    private BigDecimal stock;

    @ApiModelProperty("1.使用单位code")
    private String useUnitCode;

    @ApiModelProperty("1.使用单位name")
    private String useUnitName;

    @ApiModelProperty("1.最小规格单位")
    private String minUnitCode;

    @ApiModelProperty("1.最小规格单位")
    private String minUnitName;

    @ApiModelProperty("1.使用单位价格（元）")
    private BigDecimal useUnitPrice;

    @ApiModelProperty("1.规格型号")
    private String specificationModel;

    @ApiModelProperty("1.规格单位价格（元）")
    private BigDecimal specificationUnitPrice;

    @ApiModelProperty("2.当前库存")
    private BigDecimal stocks;

    @ApiModelProperty("2.使用单位code")
    private String useUnitCodes;

    @ApiModelProperty("2.使用单位name")
    private String useUnitNames;

    @ApiModelProperty("2.最小规格单位")
    private String minUnitCodes;

    @ApiModelProperty("2.最小规格单位")
    private String minUnitNames;

    @ApiModelProperty("2.使用单位价格（元）")
    private BigDecimal useUnitPrices;

    @ApiModelProperty("2.规格型号")
    private String specificationModels;

    @ApiModelProperty("2.规格单位价格（元）")
    private BigDecimal specificationUnitPrices;

    @ApiModelProperty("物品状况设置 0 无效 1有效")
    private String status;

    @ApiModelProperty("图片附件")
    private String picAttachment;

    @ApiModelProperty("文档附件")
    private String docAttachment;

    @ApiModelProperty("是否删除  0否  1是")
    private String isDelete;

    @ApiModelProperty("是否关联  0否  1是")
    private String isRelation;

    @ApiModelProperty("关联时间")
    private LocalDateTime relationTime;

    @ApiModelProperty("关联人编码")
    private String relationUserCode;

    @ApiModelProperty("关联人名称")
    private String relationUserName;

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
	 * 物品编号（关联）		
     */
    public String getProductCode() {
        return productCode;
    }

    /**		
	 * 物品编号（关联）		
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
	 * 入库规格		
     */
    public String getSpecification() {
        return specification;
    }

    /**		
	 * 入库规格		
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    /**		
	 * 物品类目code		
     */
    public String getProductCategoryCode() {
        return productCategoryCode;
    }

    /**		
	 * 物品类目code		
     */
    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }
    /**		
	 * 物品类目name		
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**		
	 * 物品类目name		
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
	 * 自动出库 0按入库日期优先 1按有效期优先		
     */
    public String getAutoStock() {
        return autoStock;
    }

    /**		
	 * 自动出库 0按入库日期优先 1按有效期优先		
     */
    public void setAutoStock(String autoStock) {
        this.autoStock = autoStock;
    }
    /**		
	 * 库存上限		
     */
    public Integer getStockUpLimit() {
        return stockUpLimit;
    }

    /**		
	 * 库存上限		
     */
    public void setStockUpLimit(Integer stockUpLimit) {
        this.stockUpLimit = stockUpLimit;
    }
    /**		
	 * 库存下限		
     */
    public Integer getStockDownLimit() {
        return stockDownLimit;
    }

    /**		
	 * 库存下限		
     */
    public void setStockDownLimit(Integer stockDownLimit) {
        this.stockDownLimit = stockDownLimit;
    }
    /**		
	 * 是否库存预警		
     */
    public String getStockWarning() {
        return stockWarning;
    }

    /**		
	 * 是否库存预警		
     */
    public void setStockWarning(String stockWarning) {
        this.stockWarning = stockWarning;
    }
    /**		
	 * 预警天数		
     */
    public String getWarnDays() {
        return warnDays;
    }

    /**		
	 * 预警天数		
     */
    public void setWarnDays(String warnDays) {
        this.warnDays = warnDays;
    }
    /**		
	 * 是否效期预警		
     */
    public String getValidityWarning() {
        return validityWarning;
    }

    /**		
	 * 是否效期预警		
     */
    public void setValidityWarning(String validityWarning) {
        this.validityWarning = validityWarning;
    }
    /**		
	 * 有效期天数		
     */
    public String getValidDays() {
        return validDays;
    }

    /**		
	 * 有效期天数		
     */
    public void setValidDays(String validDays) {
        this.validDays = validDays;
    }
    /**		
	 * 基准采购价（含税）		
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**		
	 * 基准采购价（含税）		
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    /**		
	 * 基准销售价（含税）		
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**		
	 * 基准销售价（含税）		
     */
    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
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
	 * 1.当前库存		
     */
    public BigDecimal getStock() {
        return stock;
    }

    /**		
	 * 1.当前库存		
     */
    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }
    /**		
	 * 1.使用单位code		
     */
    public String getUseUnitCode() {
        return useUnitCode;
    }

    /**		
	 * 1.使用单位code		
     */
    public void setUseUnitCode(String useUnitCode) {
        this.useUnitCode = useUnitCode;
    }
    /**		
	 * 1.使用单位name		
     */
    public String getUseUnitName() {
        return useUnitName;
    }

    /**		
	 * 1.使用单位name		
     */
    public void setUseUnitName(String useUnitName) {
        this.useUnitName = useUnitName;
    }
    /**		
	 * 1.最小规格单位		
     */
    public String getMinUnitCode() {
        return minUnitCode;
    }

    /**		
	 * 1.最小规格单位		
     */
    public void setMinUnitCode(String minUnitCode) {
        this.minUnitCode = minUnitCode;
    }
    /**		
	 * 1.最小规格单位		
     */
    public String getMinUnitName() {
        return minUnitName;
    }

    /**		
	 * 1.最小规格单位		
     */
    public void setMinUnitName(String minUnitName) {
        this.minUnitName = minUnitName;
    }
    /**		
	 * 1.使用单位价格（元）		
     */
    public BigDecimal getUseUnitPrice() {
        return useUnitPrice;
    }

    /**		
	 * 1.使用单位价格（元）		
     */
    public void setUseUnitPrice(BigDecimal useUnitPrice) {
        this.useUnitPrice = useUnitPrice;
    }
    /**		
	 * 1.规格型号		
     */
    public String getSpecificationModel() {
        return specificationModel;
    }

    /**		
	 * 1.规格型号		
     */
    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }
    /**		
	 * 1.规格单位价格（元）		
     */
    public BigDecimal getSpecificationUnitPrice() {
        return specificationUnitPrice;
    }

    /**		
	 * 1.规格单位价格（元）		
     */
    public void setSpecificationUnitPrice(BigDecimal specificationUnitPrice) {
        this.specificationUnitPrice = specificationUnitPrice;
    }
    /**		
	 * 2.当前库存		
     */
    public BigDecimal getStocks() {
        return stocks;
    }

    /**		
	 * 2.当前库存		
     */
    public void setStocks(BigDecimal stocks) {
        this.stocks = stocks;
    }
    /**		
	 * 2.使用单位code		
     */
    public String getUseUnitCodes() {
        return useUnitCodes;
    }

    /**		
	 * 2.使用单位code		
     */
    public void setUseUnitCodes(String useUnitCodes) {
        this.useUnitCodes = useUnitCodes;
    }
    /**		
	 * 2.使用单位name		
     */
    public String getUseUnitNames() {
        return useUnitNames;
    }

    /**		
	 * 2.使用单位name		
     */
    public void setUseUnitNames(String useUnitNames) {
        this.useUnitNames = useUnitNames;
    }
    /**		
	 * 2.最小规格单位		
     */
    public String getMinUnitCodes() {
        return minUnitCodes;
    }

    /**		
	 * 2.最小规格单位		
     */
    public void setMinUnitCodes(String minUnitCodes) {
        this.minUnitCodes = minUnitCodes;
    }
    /**		
	 * 2.最小规格单位		
     */
    public String getMinUnitNames() {
        return minUnitNames;
    }

    /**		
	 * 2.最小规格单位		
     */
    public void setMinUnitNames(String minUnitNames) {
        this.minUnitNames = minUnitNames;
    }
    /**		
	 * 2.使用单位价格（元）		
     */
    public BigDecimal getUseUnitPrices() {
        return useUnitPrices;
    }

    /**		
	 * 2.使用单位价格（元）		
     */
    public void setUseUnitPrices(BigDecimal useUnitPrices) {
        this.useUnitPrices = useUnitPrices;
    }
    /**		
	 * 2.规格型号		
     */
    public String getSpecificationModels() {
        return specificationModels;
    }

    /**		
	 * 2.规格型号		
     */
    public void setSpecificationModels(String specificationModels) {
        this.specificationModels = specificationModels;
    }
    /**		
	 * 2.规格单位价格（元）		
     */
    public BigDecimal getSpecificationUnitPrices() {
        return specificationUnitPrices;
    }

    /**		
	 * 2.规格单位价格（元）		
     */
    public void setSpecificationUnitPrices(BigDecimal specificationUnitPrices) {
        this.specificationUnitPrices = specificationUnitPrices;
    }
    /**		
	 * 物品状况设置 0 无效 1有效		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 物品状况设置 0 无效 1有效		
     */
    public void setStatus(String status) {
        this.status = status;
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
	 * 是否关联  0否  1是		
     */
    public String getIsRelation() {
        return isRelation;
    }

    /**		
	 * 是否关联  0否  1是		
     */
    public void setIsRelation(String isRelation) {
        this.isRelation = isRelation;
    }
    /**		
	 * 关联时间		
     */
    public LocalDateTime getRelationTime() {
        return relationTime;
    }

    /**		
	 * 关联时间		
     */
    public void setRelationTime(LocalDateTime relationTime) {
        this.relationTime = relationTime;
    }
    /**		
	 * 关联人编码		
     */
    public String getRelationUserCode() {
        return relationUserCode;
    }

    /**		
	 * 关联人编码		
     */
    public void setRelationUserCode(String relationUserCode) {
        this.relationUserCode = relationUserCode;
    }
    /**		
	 * 关联人名称		
     */
    public String getRelationUserName() {
        return relationUserName;
    }

    /**		
	 * 关联人名称		
     */
    public void setRelationUserName(String relationUserName) {
        this.relationUserName = relationUserName;
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
        return "StkGoods{" +
            "gdId=" + gdId +
            ", goodCode=" + goodCode +
            ", productCode=" + productCode +
            ", productName=" + productName +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", specification=" + specification +
            ", productCategoryCode=" + productCategoryCode +
            ", productCategoryName=" + productCategoryName +
            ", brand=" + brand +
            ", autoStock=" + autoStock +
            ", stockUpLimit=" + stockUpLimit +
            ", stockDownLimit=" + stockDownLimit +
            ", stockWarning=" + stockWarning +
            ", warnDays=" + warnDays +
            ", validityWarning=" + validityWarning +
            ", validDays=" + validDays +
            ", purchasePrice=" + purchasePrice +
            ", salesPrice=" + salesPrice +
            ", remark=" + remark +
            ", stock=" + stock +
            ", useUnitCode=" + useUnitCode +
            ", useUnitName=" + useUnitName +
            ", minUnitCode=" + minUnitCode +
            ", minUnitName=" + minUnitName +
            ", useUnitPrice=" + useUnitPrice +
            ", specificationModel=" + specificationModel +
            ", specificationUnitPrice=" + specificationUnitPrice +
            ", stocks=" + stocks +
            ", useUnitCodes=" + useUnitCodes +
            ", useUnitNames=" + useUnitNames +
            ", minUnitCodes=" + minUnitCodes +
            ", minUnitNames=" + minUnitNames +
            ", useUnitPrices=" + useUnitPrices +
            ", specificationModels=" + specificationModels +
            ", specificationUnitPrices=" + specificationUnitPrices +
            ", status=" + status +
            ", picAttachment=" + picAttachment +
            ", docAttachment=" + docAttachment +
            ", isDelete=" + isDelete +
            ", isRelation=" + isRelation +
            ", relationTime=" + relationTime +
            ", relationUserCode=" + relationUserCode +
            ", relationUserName=" + relationUserName +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
