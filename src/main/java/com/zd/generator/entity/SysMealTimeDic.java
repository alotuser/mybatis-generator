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
 * 餐次字典表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_meal_time_dic")
@ApiModel(value = "SysMealTimeDic对象", description = "餐次字典表")
public class SysMealTimeDic extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mtd_id", type = IdType.AUTO)
    private Long mtdId;

    @ApiModelProperty("餐次编码")
    private String mealTimeCode;

    @ApiModelProperty("餐次名称")
    private String mealTimeName;

    @ApiModelProperty("是否可见(1是 0否)")
    private String isVisible;

    @ApiModelProperty("餐次能量比")
    private BigDecimal energyRatio;

    /**		
	 * 		
     */
    public Long getMtdId() {
        return mtdId;
    }

    /**		
	 * 		
     */
    public void setMtdId(Long mtdId) {
        this.mtdId = mtdId;
    }
    /**		
	 * 餐次编码		
     */
    public String getMealTimeCode() {
        return mealTimeCode;
    }

    /**		
	 * 餐次编码		
     */
    public void setMealTimeCode(String mealTimeCode) {
        this.mealTimeCode = mealTimeCode;
    }
    /**		
	 * 餐次名称		
     */
    public String getMealTimeName() {
        return mealTimeName;
    }

    /**		
	 * 餐次名称		
     */
    public void setMealTimeName(String mealTimeName) {
        this.mealTimeName = mealTimeName;
    }
    /**		
	 * 是否可见(1是 0否)		
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**		
	 * 是否可见(1是 0否)		
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }
    /**		
	 * 餐次能量比		
     */
    public BigDecimal getEnergyRatio() {
        return energyRatio;
    }

    /**		
	 * 餐次能量比		
     */
    public void setEnergyRatio(BigDecimal energyRatio) {
        this.energyRatio = energyRatio;
    }

    @Override
    public String toString() {
        return "SysMealTimeDic{" +
            "mtdId=" + mtdId +
            ", mealTimeCode=" + mealTimeCode +
            ", mealTimeName=" + mealTimeName +
            ", isVisible=" + isVisible +
            ", energyRatio=" + energyRatio +
        "}";
    }
}
