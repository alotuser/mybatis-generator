package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 食物分类表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_food_category")
@ApiModel(value = "SysFoodCategory对象", description = "食物分类表")
public class SysFoodCategory extends BaseModel {

    private static final long serialVersionUID = 1L;

    private String foodCateId;

    @ApiModelProperty("编号")
    private String foodCateCode;

    @ApiModelProperty("分类名称")
    private String foodCateName;

    @ApiModelProperty("显示级别")
    private String foodCateLevel;

    @ApiModelProperty("标记")
    private String foodCateSign;

    /**		
	 * 		
     */
    public String getFoodCateId() {
        return foodCateId;
    }

    /**		
	 * 		
     */
    public void setFoodCateId(String foodCateId) {
        this.foodCateId = foodCateId;
    }
    /**		
	 * 编号		
     */
    public String getFoodCateCode() {
        return foodCateCode;
    }

    /**		
	 * 编号		
     */
    public void setFoodCateCode(String foodCateCode) {
        this.foodCateCode = foodCateCode;
    }
    /**		
	 * 分类名称		
     */
    public String getFoodCateName() {
        return foodCateName;
    }

    /**		
	 * 分类名称		
     */
    public void setFoodCateName(String foodCateName) {
        this.foodCateName = foodCateName;
    }
    /**		
	 * 显示级别		
     */
    public String getFoodCateLevel() {
        return foodCateLevel;
    }

    /**		
	 * 显示级别		
     */
    public void setFoodCateLevel(String foodCateLevel) {
        this.foodCateLevel = foodCateLevel;
    }
    /**		
	 * 标记		
     */
    public String getFoodCateSign() {
        return foodCateSign;
    }

    /**		
	 * 标记		
     */
    public void setFoodCateSign(String foodCateSign) {
        this.foodCateSign = foodCateSign;
    }

    @Override
    public String toString() {
        return "SysFoodCategory{" +
            "foodCateId=" + foodCateId +
            ", foodCateCode=" + foodCateCode +
            ", foodCateName=" + foodCateName +
            ", foodCateLevel=" + foodCateLevel +
            ", foodCateSign=" + foodCateSign +
        "}";
    }
}
