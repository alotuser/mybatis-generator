package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 食物分类表(膳调用)
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_food_sort")
@ApiModel(value = "SysFoodSort对象", description = "食物分类表(膳调用)")
public class SysFoodSort extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fs_id", type = IdType.AUTO)
    private Integer fsId;

    @ApiModelProperty("食物分类名称")
    private String foodSortName;

    @ApiModelProperty("排序")
    private Integer orderIndex;

    @ApiModelProperty("是否可见 1是 0否")
    private String isVisible;

    @ApiModelProperty("逗号分隔食物类别")
    private String foodTypeList;

    /**		
	 * 		
     */
    public Integer getFsId() {
        return fsId;
    }

    /**		
	 * 		
     */
    public void setFsId(Integer fsId) {
        this.fsId = fsId;
    }
    /**		
	 * 食物分类名称		
     */
    public String getFoodSortName() {
        return foodSortName;
    }

    /**		
	 * 食物分类名称		
     */
    public void setFoodSortName(String foodSortName) {
        this.foodSortName = foodSortName;
    }
    /**		
	 * 排序		
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**		
	 * 排序		
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
    /**		
	 * 是否可见 1是 0否		
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**		
	 * 是否可见 1是 0否		
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }
    /**		
	 * 逗号分隔食物类别		
     */
    public String getFoodTypeList() {
        return foodTypeList;
    }

    /**		
	 * 逗号分隔食物类别		
     */
    public void setFoodTypeList(String foodTypeList) {
        this.foodTypeList = foodTypeList;
    }

    @Override
    public String toString() {
        return "SysFoodSort{" +
            "fsId=" + fsId +
            ", foodSortName=" + foodSortName +
            ", orderIndex=" + orderIndex +
            ", isVisible=" + isVisible +
            ", foodTypeList=" + foodTypeList +
        "}";
    }
}
