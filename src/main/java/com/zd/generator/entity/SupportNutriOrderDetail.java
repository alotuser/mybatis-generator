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
 * 营养医嘱明细表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_nutri_order_detail")
@ApiModel(value = "SupportNutriOrderDetail对象", description = "营养医嘱明细表")
public class SupportNutriOrderDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nod_id", type = IdType.AUTO)
    private Long nodId;

    @ApiModelProperty("关联support_nutri_order表的no_id")
    private Long noId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    private String foodId;

    private String foodCode;

    private String foodName;

    @ApiModelProperty("支持日期")
    private LocalDateTime supportDate;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("医嘱组号,每个人从1开始")
    private String groupNo;

    @ApiModelProperty("医嘱号,每组内从1开始")
    private String orderNo;

    @ApiModelProperty("HIS系统医嘱号,对接HIS系统时使用")
    private String hisOrderNo;

    @ApiModelProperty("套餐名称")
    private String setName;

    @ApiModelProperty("医嘱编码")
    private String orderCode;

    @ApiModelProperty("医嘱内容")
    private String orderText;

    @ApiModelProperty("医嘱量")
    private BigDecimal orderQty;

    @ApiModelProperty("整取数量")
    private BigDecimal wholePackageQty;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("单位code")
    private String unitType;

    @ApiModelProperty("剂型编码,空")
    private String dosageFormCode;

    @ApiModelProperty("剂型名称,空")
    private String dosageFormName;

    @ApiModelProperty("最小用量单位")
    private String minQtyUnit;

    @ApiModelProperty("最小用量单价")
    private BigDecimal minQtyUnitPrice;

    @ApiModelProperty("小计价格,针对单个制剂")
    private BigDecimal subtotalPrice;

    @ApiModelProperty("库存数量,仅做登记用")
    private BigDecimal inventoryQty;

    @ApiModelProperty("营养素量,PN用")
    private BigDecimal nutrientQty;

    @ApiModelProperty("规格")
    private String specification;

    @ApiModelProperty("医嘱类别,en或者pn")
    private String orderClass;

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
    public Long getNodId() {
        return nodId;
    }

    /**		
	 * 		
     */
    public void setNodId(Long nodId) {
        this.nodId = nodId;
    }
    /**		
	 * 关联support_nutri_order表的no_id		
     */
    public Long getNoId() {
        return noId;
    }

    /**		
	 * 关联support_nutri_order表的no_id		
     */
    public void setNoId(Long noId) {
        this.noId = noId;
    }
    /**		
	 * 病人唯一识别号		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 病人唯一识别号		
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 入院次数		
     */
    public String getVisitId() {
        return visitId;
    }

    /**		
	 * 入院次数		
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**		
	 * 		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * 		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**		
	 * 		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * 		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 		
     */
    public String getFoodName() {
        return foodName;
    }

    /**		
	 * 		
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    /**		
	 * 支持日期		
     */
    public LocalDateTime getSupportDate() {
        return supportDate;
    }

    /**		
	 * 支持日期		
     */
    public void setSupportDate(LocalDateTime supportDate) {
        this.supportDate = supportDate;
    }
    /**		
	 * 住院号		
     */
    public String getInpNo() {
        return inpNo;
    }

    /**		
	 * 住院号		
     */
    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }
    /**		
	 * 医嘱组号,每个人从1开始		
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**		
	 * 医嘱组号,每个人从1开始		
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }
    /**		
	 * 医嘱号,每组内从1开始		
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**		
	 * 医嘱号,每组内从1开始		
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    /**		
	 * HIS系统医嘱号,对接HIS系统时使用		
     */
    public String getHisOrderNo() {
        return hisOrderNo;
    }

    /**		
	 * HIS系统医嘱号,对接HIS系统时使用		
     */
    public void setHisOrderNo(String hisOrderNo) {
        this.hisOrderNo = hisOrderNo;
    }
    /**		
	 * 套餐名称		
     */
    public String getSetName() {
        return setName;
    }

    /**		
	 * 套餐名称		
     */
    public void setSetName(String setName) {
        this.setName = setName;
    }
    /**		
	 * 医嘱编码		
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**		
	 * 医嘱编码		
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
    /**		
	 * 医嘱内容		
     */
    public String getOrderText() {
        return orderText;
    }

    /**		
	 * 医嘱内容		
     */
    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }
    /**		
	 * 医嘱量		
     */
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    /**		
	 * 医嘱量		
     */
    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }
    /**		
	 * 整取数量		
     */
    public BigDecimal getWholePackageQty() {
        return wholePackageQty;
    }

    /**		
	 * 整取数量		
     */
    public void setWholePackageQty(BigDecimal wholePackageQty) {
        this.wholePackageQty = wholePackageQty;
    }
    /**		
	 * 单位		
     */
    public String getUnit() {
        return unit;
    }

    /**		
	 * 单位		
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**		
	 * 单位code		
     */
    public String getUnitType() {
        return unitType;
    }

    /**		
	 * 单位code		
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }
    /**		
	 * 剂型编码,空		
     */
    public String getDosageFormCode() {
        return dosageFormCode;
    }

    /**		
	 * 剂型编码,空		
     */
    public void setDosageFormCode(String dosageFormCode) {
        this.dosageFormCode = dosageFormCode;
    }
    /**		
	 * 剂型名称,空		
     */
    public String getDosageFormName() {
        return dosageFormName;
    }

    /**		
	 * 剂型名称,空		
     */
    public void setDosageFormName(String dosageFormName) {
        this.dosageFormName = dosageFormName;
    }
    /**		
	 * 最小用量单位		
     */
    public String getMinQtyUnit() {
        return minQtyUnit;
    }

    /**		
	 * 最小用量单位		
     */
    public void setMinQtyUnit(String minQtyUnit) {
        this.minQtyUnit = minQtyUnit;
    }
    /**		
	 * 最小用量单价		
     */
    public BigDecimal getMinQtyUnitPrice() {
        return minQtyUnitPrice;
    }

    /**		
	 * 最小用量单价		
     */
    public void setMinQtyUnitPrice(BigDecimal minQtyUnitPrice) {
        this.minQtyUnitPrice = minQtyUnitPrice;
    }
    /**		
	 * 小计价格,针对单个制剂		
     */
    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    /**		
	 * 小计价格,针对单个制剂		
     */
    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }
    /**		
	 * 库存数量,仅做登记用		
     */
    public BigDecimal getInventoryQty() {
        return inventoryQty;
    }

    /**		
	 * 库存数量,仅做登记用		
     */
    public void setInventoryQty(BigDecimal inventoryQty) {
        this.inventoryQty = inventoryQty;
    }
    /**		
	 * 营养素量,PN用		
     */
    public BigDecimal getNutrientQty() {
        return nutrientQty;
    }

    /**		
	 * 营养素量,PN用		
     */
    public void setNutrientQty(BigDecimal nutrientQty) {
        this.nutrientQty = nutrientQty;
    }
    /**		
	 * 规格		
     */
    public String getSpecification() {
        return specification;
    }

    /**		
	 * 规格		
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    /**		
	 * 医嘱类别,en或者pn		
     */
    public String getOrderClass() {
        return orderClass;
    }

    /**		
	 * 医嘱类别,en或者pn		
     */
    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
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
        return "SupportNutriOrderDetail{" +
            "nodId=" + nodId +
            ", noId=" + noId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", foodId=" + foodId +
            ", foodCode=" + foodCode +
            ", foodName=" + foodName +
            ", supportDate=" + supportDate +
            ", inpNo=" + inpNo +
            ", groupNo=" + groupNo +
            ", orderNo=" + orderNo +
            ", hisOrderNo=" + hisOrderNo +
            ", setName=" + setName +
            ", orderCode=" + orderCode +
            ", orderText=" + orderText +
            ", orderQty=" + orderQty +
            ", wholePackageQty=" + wholePackageQty +
            ", unit=" + unit +
            ", unitType=" + unitType +
            ", dosageFormCode=" + dosageFormCode +
            ", dosageFormName=" + dosageFormName +
            ", minQtyUnit=" + minQtyUnit +
            ", minQtyUnitPrice=" + minQtyUnitPrice +
            ", subtotalPrice=" + subtotalPrice +
            ", inventoryQty=" + inventoryQty +
            ", nutrientQty=" + nutrientQty +
            ", specification=" + specification +
            ", orderClass=" + orderClass +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
