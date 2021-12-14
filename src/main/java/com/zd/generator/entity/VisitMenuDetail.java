package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 菜谱明细表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_menu_detail")
@ApiModel(value = "VisitMenuDetail对象", description = "菜谱明细表")
public class VisitMenuDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "md_id", type = IdType.AUTO)
    private Integer mdId;

    @ApiModelProperty("菜谱id,对应主表id")
    private String menuId;

    @ApiModelProperty("食物ID ")
    private String foodId;

    @ApiModelProperty("食物code")
    private String foodCode;

    @ApiModelProperty("原料名称")
    private String foodName;

    @ApiModelProperty("数量（克）")
    private String weight;

    @ApiModelProperty("最小值（克）")
    private String minWeight;

    @ApiModelProperty("最大值（克）")
    private String maxWeight;

    @ApiModelProperty("每次增量（克）")
    private String everyAddWeight;

    @ApiModelProperty("市品、非市品,1-市品 0-非市品 ")
    private String isCityProduct;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码 ")
    private String createUserCode;

    @ApiModelProperty("创建人名称 ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码 ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称 ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Integer getMdId() {
        return mdId;
    }

    /**		
	 * 		
     */
    public void setMdId(Integer mdId) {
        this.mdId = mdId;
    }
    /**		
	 * 菜谱id,对应主表id		
     */
    public String getMenuId() {
        return menuId;
    }

    /**		
	 * 菜谱id,对应主表id		
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    /**		
	 * 食物ID 		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * 食物ID 		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**		
	 * 食物code		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * 食物code		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 原料名称		
     */
    public String getFoodName() {
        return foodName;
    }

    /**		
	 * 原料名称		
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    /**		
	 * 数量（克）		
     */
    public String getWeight() {
        return weight;
    }

    /**		
	 * 数量（克）		
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /**		
	 * 最小值（克）		
     */
    public String getMinWeight() {
        return minWeight;
    }

    /**		
	 * 最小值（克）		
     */
    public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }
    /**		
	 * 最大值（克）		
     */
    public String getMaxWeight() {
        return maxWeight;
    }

    /**		
	 * 最大值（克）		
     */
    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }
    /**		
	 * 每次增量（克）		
     */
    public String getEveryAddWeight() {
        return everyAddWeight;
    }

    /**		
	 * 每次增量（克）		
     */
    public void setEveryAddWeight(String everyAddWeight) {
        this.everyAddWeight = everyAddWeight;
    }
    /**		
	 * 市品、非市品,1-市品 0-非市品 		
     */
    public String getIsCityProduct() {
        return isCityProduct;
    }

    /**		
	 * 市品、非市品,1-市品 0-非市品 		
     */
    public void setIsCityProduct(String isCityProduct) {
        this.isCityProduct = isCityProduct;
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
        return "VisitMenuDetail{" +
            "mdId=" + mdId +
            ", menuId=" + menuId +
            ", foodId=" + foodId +
            ", foodCode=" + foodCode +
            ", foodName=" + foodName +
            ", weight=" + weight +
            ", minWeight=" + minWeight +
            ", maxWeight=" + maxWeight +
            ", everyAddWeight=" + everyAddWeight +
            ", isCityProduct=" + isCityProduct +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
