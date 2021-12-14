package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("menu_detail")
@ApiModel(value = "MenuDetail对象", description = "")
public class MenuDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Integer menuDetailId;

    private String menuId;

    private String foodId;

    private String helpCode;

    private String stockName;

    private String weight;

    private String minWeight;

    private String maxWeight;

    private String everyAddWeight;

    private String isCityProduct;

    /**		
	 * 		
     */
    public Integer getMenuDetailId() {
        return menuDetailId;
    }

    /**		
	 * 		
     */
    public void setMenuDetailId(Integer menuDetailId) {
        this.menuDetailId = menuDetailId;
    }
    /**		
	 * 		
     */
    public String getMenuId() {
        return menuId;
    }

    /**		
	 * 		
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
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
    public String getHelpCode() {
        return helpCode;
    }

    /**		
	 * 		
     */
    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode;
    }
    /**		
	 * 		
     */
    public String getStockName() {
        return stockName;
    }

    /**		
	 * 		
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    /**		
	 * 		
     */
    public String getWeight() {
        return weight;
    }

    /**		
	 * 		
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /**		
	 * 		
     */
    public String getMinWeight() {
        return minWeight;
    }

    /**		
	 * 		
     */
    public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }
    /**		
	 * 		
     */
    public String getMaxWeight() {
        return maxWeight;
    }

    /**		
	 * 		
     */
    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }
    /**		
	 * 		
     */
    public String getEveryAddWeight() {
        return everyAddWeight;
    }

    /**		
	 * 		
     */
    public void setEveryAddWeight(String everyAddWeight) {
        this.everyAddWeight = everyAddWeight;
    }
    /**		
	 * 		
     */
    public String getIsCityProduct() {
        return isCityProduct;
    }

    /**		
	 * 		
     */
    public void setIsCityProduct(String isCityProduct) {
        this.isCityProduct = isCityProduct;
    }

    @Override
    public String toString() {
        return "MenuDetail{" +
            "menuDetailId=" + menuDetailId +
            ", menuId=" + menuId +
            ", foodId=" + foodId +
            ", helpCode=" + helpCode +
            ", stockName=" + stockName +
            ", weight=" + weight +
            ", minWeight=" + minWeight +
            ", maxWeight=" + maxWeight +
            ", everyAddWeight=" + everyAddWeight +
            ", isCityProduct=" + isCityProduct +
        "}";
    }
}
