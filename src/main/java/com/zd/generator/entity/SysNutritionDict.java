package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 营养素字典表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_nutrition_dict")
@ApiModel(value = "SysNutritionDict对象", description = "营养素字典表")
public class SysNutritionDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nd_id", type = IdType.AUTO)
    private Long ndId;

    @ApiModelProperty("营养素编码")
    private String nutritionCode;

    @ApiModelProperty("营养素名称")
    private String nutritionName;

    @ApiModelProperty("营养素单位")
    private String nutritionUnit;

    @ApiModelProperty("排序")
    private BigDecimal orderIndex;

    @ApiModelProperty("是否显示(1显示0 不显示)")
    private String isVisible;

    @ApiModelProperty("是否打印(1打印0 不打印)")
    private String isPrint;

    @ApiModelProperty("合理范围最低百分比值")
    private Double minPercent;

    @ApiModelProperty("合理范围最高百分比值")
    private Double maxPercent;

    @ApiModelProperty("是否有建议(1有 0 无)")
    private String hasAdvice;

    @ApiModelProperty("正常范围内建议")
    private String advice;

    @ApiModelProperty("低于合理范围的建议")
    private String minAdvice;

    @ApiModelProperty("高于合理范围的建议")
    private String maxAdvice;

    @ApiModelProperty("是否有儿童建议(1有 0 无)")
    private String hasChildAdvice;

    @ApiModelProperty("0到6月儿童正常范围内建议")
    private String adviceM0M6;

    @ApiModelProperty("0到6月儿童低于正常范围内建议")
    private String minAdviceM0M6;

    @ApiModelProperty("0到6月儿童高于正常范围内建议")
    private String maxAdviceM0M6;

    @ApiModelProperty("6到12月儿童正常范围内建议")
    private String adviceM6M12;

    @ApiModelProperty("6到12月儿童低于正常范围内建议")
    private String minAdviceM6M12;

    @ApiModelProperty("6到12月儿童高于正常范围内建议")
    private String maxAdviceM6M12;

    @ApiModelProperty("1到2岁儿童正常范围内建议")
    private String adviceY1Y2;

    @ApiModelProperty("1到2岁儿童低于正常范围内建议")
    private String minAdviceY1Y2;

    @ApiModelProperty("1到2岁儿童高于正常范围内建议")
    private String maxAdviceY1Y2;

    @ApiModelProperty("2到5岁儿童正常范围内建议")
    private String adviceY2Y5;

    @ApiModelProperty("2到5岁儿童低于正常范围内建议")
    private String minAdviceY2Y5;

    @ApiModelProperty("2到5岁儿童高于正常范围内建议")
    private String maxAdviceY2Y5;

    private String drisCode;

    /**		
	 * 		
     */
    public Long getNdId() {
        return ndId;
    }

    /**		
	 * 		
     */
    public void setNdId(Long ndId) {
        this.ndId = ndId;
    }
    /**		
	 * 营养素编码		
     */
    public String getNutritionCode() {
        return nutritionCode;
    }

    /**		
	 * 营养素编码		
     */
    public void setNutritionCode(String nutritionCode) {
        this.nutritionCode = nutritionCode;
    }
    /**		
	 * 营养素名称		
     */
    public String getNutritionName() {
        return nutritionName;
    }

    /**		
	 * 营养素名称		
     */
    public void setNutritionName(String nutritionName) {
        this.nutritionName = nutritionName;
    }
    /**		
	 * 营养素单位		
     */
    public String getNutritionUnit() {
        return nutritionUnit;
    }

    /**		
	 * 营养素单位		
     */
    public void setNutritionUnit(String nutritionUnit) {
        this.nutritionUnit = nutritionUnit;
    }
    /**		
	 * 排序		
     */
    public BigDecimal getOrderIndex() {
        return orderIndex;
    }

    /**		
	 * 排序		
     */
    public void setOrderIndex(BigDecimal orderIndex) {
        this.orderIndex = orderIndex;
    }
    /**		
	 * 是否显示(1显示0 不显示)		
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**		
	 * 是否显示(1显示0 不显示)		
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }
    /**		
	 * 是否打印(1打印0 不打印)		
     */
    public String getIsPrint() {
        return isPrint;
    }

    /**		
	 * 是否打印(1打印0 不打印)		
     */
    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }
    /**		
	 * 合理范围最低百分比值		
     */
    public Double getMinPercent() {
        return minPercent;
    }

    /**		
	 * 合理范围最低百分比值		
     */
    public void setMinPercent(Double minPercent) {
        this.minPercent = minPercent;
    }
    /**		
	 * 合理范围最高百分比值		
     */
    public Double getMaxPercent() {
        return maxPercent;
    }

    /**		
	 * 合理范围最高百分比值		
     */
    public void setMaxPercent(Double maxPercent) {
        this.maxPercent = maxPercent;
    }
    /**		
	 * 是否有建议(1有 0 无)		
     */
    public String getHasAdvice() {
        return hasAdvice;
    }

    /**		
	 * 是否有建议(1有 0 无)		
     */
    public void setHasAdvice(String hasAdvice) {
        this.hasAdvice = hasAdvice;
    }
    /**		
	 * 正常范围内建议		
     */
    public String getAdvice() {
        return advice;
    }

    /**		
	 * 正常范围内建议		
     */
    public void setAdvice(String advice) {
        this.advice = advice;
    }
    /**		
	 * 低于合理范围的建议		
     */
    public String getMinAdvice() {
        return minAdvice;
    }

    /**		
	 * 低于合理范围的建议		
     */
    public void setMinAdvice(String minAdvice) {
        this.minAdvice = minAdvice;
    }
    /**		
	 * 高于合理范围的建议		
     */
    public String getMaxAdvice() {
        return maxAdvice;
    }

    /**		
	 * 高于合理范围的建议		
     */
    public void setMaxAdvice(String maxAdvice) {
        this.maxAdvice = maxAdvice;
    }
    /**		
	 * 是否有儿童建议(1有 0 无)		
     */
    public String getHasChildAdvice() {
        return hasChildAdvice;
    }

    /**		
	 * 是否有儿童建议(1有 0 无)		
     */
    public void setHasChildAdvice(String hasChildAdvice) {
        this.hasChildAdvice = hasChildAdvice;
    }
    /**		
	 * 0到6月儿童正常范围内建议		
     */
    public String getAdviceM0M6() {
        return adviceM0M6;
    }

    /**		
	 * 0到6月儿童正常范围内建议		
     */
    public void setAdviceM0M6(String adviceM0M6) {
        this.adviceM0M6 = adviceM0M6;
    }
    /**		
	 * 0到6月儿童低于正常范围内建议		
     */
    public String getMinAdviceM0M6() {
        return minAdviceM0M6;
    }

    /**		
	 * 0到6月儿童低于正常范围内建议		
     */
    public void setMinAdviceM0M6(String minAdviceM0M6) {
        this.minAdviceM0M6 = minAdviceM0M6;
    }
    /**		
	 * 0到6月儿童高于正常范围内建议		
     */
    public String getMaxAdviceM0M6() {
        return maxAdviceM0M6;
    }

    /**		
	 * 0到6月儿童高于正常范围内建议		
     */
    public void setMaxAdviceM0M6(String maxAdviceM0M6) {
        this.maxAdviceM0M6 = maxAdviceM0M6;
    }
    /**		
	 * 6到12月儿童正常范围内建议		
     */
    public String getAdviceM6M12() {
        return adviceM6M12;
    }

    /**		
	 * 6到12月儿童正常范围内建议		
     */
    public void setAdviceM6M12(String adviceM6M12) {
        this.adviceM6M12 = adviceM6M12;
    }
    /**		
	 * 6到12月儿童低于正常范围内建议		
     */
    public String getMinAdviceM6M12() {
        return minAdviceM6M12;
    }

    /**		
	 * 6到12月儿童低于正常范围内建议		
     */
    public void setMinAdviceM6M12(String minAdviceM6M12) {
        this.minAdviceM6M12 = minAdviceM6M12;
    }
    /**		
	 * 6到12月儿童高于正常范围内建议		
     */
    public String getMaxAdviceM6M12() {
        return maxAdviceM6M12;
    }

    /**		
	 * 6到12月儿童高于正常范围内建议		
     */
    public void setMaxAdviceM6M12(String maxAdviceM6M12) {
        this.maxAdviceM6M12 = maxAdviceM6M12;
    }
    /**		
	 * 1到2岁儿童正常范围内建议		
     */
    public String getAdviceY1Y2() {
        return adviceY1Y2;
    }

    /**		
	 * 1到2岁儿童正常范围内建议		
     */
    public void setAdviceY1Y2(String adviceY1Y2) {
        this.adviceY1Y2 = adviceY1Y2;
    }
    /**		
	 * 1到2岁儿童低于正常范围内建议		
     */
    public String getMinAdviceY1Y2() {
        return minAdviceY1Y2;
    }

    /**		
	 * 1到2岁儿童低于正常范围内建议		
     */
    public void setMinAdviceY1Y2(String minAdviceY1Y2) {
        this.minAdviceY1Y2 = minAdviceY1Y2;
    }
    /**		
	 * 1到2岁儿童高于正常范围内建议		
     */
    public String getMaxAdviceY1Y2() {
        return maxAdviceY1Y2;
    }

    /**		
	 * 1到2岁儿童高于正常范围内建议		
     */
    public void setMaxAdviceY1Y2(String maxAdviceY1Y2) {
        this.maxAdviceY1Y2 = maxAdviceY1Y2;
    }
    /**		
	 * 2到5岁儿童正常范围内建议		
     */
    public String getAdviceY2Y5() {
        return adviceY2Y5;
    }

    /**		
	 * 2到5岁儿童正常范围内建议		
     */
    public void setAdviceY2Y5(String adviceY2Y5) {
        this.adviceY2Y5 = adviceY2Y5;
    }
    /**		
	 * 2到5岁儿童低于正常范围内建议		
     */
    public String getMinAdviceY2Y5() {
        return minAdviceY2Y5;
    }

    /**		
	 * 2到5岁儿童低于正常范围内建议		
     */
    public void setMinAdviceY2Y5(String minAdviceY2Y5) {
        this.minAdviceY2Y5 = minAdviceY2Y5;
    }
    /**		
	 * 2到5岁儿童高于正常范围内建议		
     */
    public String getMaxAdviceY2Y5() {
        return maxAdviceY2Y5;
    }

    /**		
	 * 2到5岁儿童高于正常范围内建议		
     */
    public void setMaxAdviceY2Y5(String maxAdviceY2Y5) {
        this.maxAdviceY2Y5 = maxAdviceY2Y5;
    }
    /**		
	 * 		
     */
    public String getDrisCode() {
        return drisCode;
    }

    /**		
	 * 		
     */
    public void setDrisCode(String drisCode) {
        this.drisCode = drisCode;
    }

    @Override
    public String toString() {
        return "SysNutritionDict{" +
            "ndId=" + ndId +
            ", nutritionCode=" + nutritionCode +
            ", nutritionName=" + nutritionName +
            ", nutritionUnit=" + nutritionUnit +
            ", orderIndex=" + orderIndex +
            ", isVisible=" + isVisible +
            ", isPrint=" + isPrint +
            ", minPercent=" + minPercent +
            ", maxPercent=" + maxPercent +
            ", hasAdvice=" + hasAdvice +
            ", advice=" + advice +
            ", minAdvice=" + minAdvice +
            ", maxAdvice=" + maxAdvice +
            ", hasChildAdvice=" + hasChildAdvice +
            ", adviceM0M6=" + adviceM0M6 +
            ", minAdviceM0M6=" + minAdviceM0M6 +
            ", maxAdviceM0M6=" + maxAdviceM0M6 +
            ", adviceM6M12=" + adviceM6M12 +
            ", minAdviceM6M12=" + minAdviceM6M12 +
            ", maxAdviceM6M12=" + maxAdviceM6M12 +
            ", adviceY1Y2=" + adviceY1Y2 +
            ", minAdviceY1Y2=" + minAdviceY1Y2 +
            ", maxAdviceY1Y2=" + maxAdviceY1Y2 +
            ", adviceY2Y5=" + adviceY2Y5 +
            ", minAdviceY2Y5=" + minAdviceY2Y5 +
            ", maxAdviceY2Y5=" + maxAdviceY2Y5 +
            ", drisCode=" + drisCode +
        "}";
    }
}
