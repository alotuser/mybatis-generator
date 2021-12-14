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
 * 物品库存表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_goods_stock")
@ApiModel(value = "StkGoodsStock对象", description = "物品库存表")
public class StkGoodsStock extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gs_id", type = IdType.AUTO)
    private Long gsId;

    @ApiModelProperty("stk_goods")
    private Long gdId;

    @ApiModelProperty("仓库代码")
    private String warehouseCode;

    @ApiModelProperty("仓库名称")
    private String warehouseName;

    @ApiModelProperty("库存大")
    private BigDecimal stock;

    @ApiModelProperty("库存小")
    private BigDecimal stocks;

    @ApiModelProperty("状态；0.正常 1.负库存 2超出上限 3.低于下限")
    private Integer status;

    private LocalDateTime createTime;

    private String createUserCode;

    private String createUserName;

    private LocalDateTime updateTime;

    private String updateUserCode;

    private String updateUserName;

    /**		
	 * 		
     */
    public Long getGsId() {
        return gsId;
    }

    /**		
	 * 		
     */
    public void setGsId(Long gsId) {
        this.gsId = gsId;
    }
    /**		
	 * stk_goods		
     */
    public Long getGdId() {
        return gdId;
    }

    /**		
	 * stk_goods		
     */
    public void setGdId(Long gdId) {
        this.gdId = gdId;
    }
    /**		
	 * 仓库代码		
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**		
	 * 仓库代码		
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    /**		
	 * 仓库名称		
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**		
	 * 仓库名称		
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
    /**		
	 * 库存大		
     */
    public BigDecimal getStock() {
        return stock;
    }

    /**		
	 * 库存大		
     */
    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }
    /**		
	 * 库存小		
     */
    public BigDecimal getStocks() {
        return stocks;
    }

    /**		
	 * 库存小		
     */
    public void setStocks(BigDecimal stocks) {
        this.stocks = stocks;
    }
    /**		
	 * 状态；0.正常 1.负库存 2超出上限 3.低于下限		
     */
    public Integer getStatus() {
        return status;
    }

    /**		
	 * 状态；0.正常 1.负库存 2超出上限 3.低于下限		
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**		
	 * 		
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**		
	 * 		
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    /**		
	 * 		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 		
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    /**		
	 * 		
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**		
	 * 		
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    /**		
	 * 		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 		
     */
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
    /**		
	 * 		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "StkGoodsStock{" +
            "gsId=" + gsId +
            ", gdId=" + gdId +
            ", warehouseCode=" + warehouseCode +
            ", warehouseName=" + warehouseName +
            ", stock=" + stock +
            ", stocks=" + stocks +
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
