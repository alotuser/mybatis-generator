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
 * 膳食调查明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_diet_survey_detail")
@ApiModel(value = "AssessDietSurveyDetail对象", description = "膳食调查明细")
public class AssessDietSurveyDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dsd_id", type = IdType.AUTO)
    private Long dsdId;

    @ApiModelProperty("关联主表assess_diet_survey的ds_id")
    private Long dsId;

    @ApiModelProperty("序号，针对每个ds_id从1开始")
    private Integer orderNo;

    @ApiModelProperty("餐次编码，参考字典")
    private String mealTimeCode;

    @ApiModelProperty("餐次名称，参考字典")
    private String mealTimeName;

    @ApiModelProperty("菜谱编码，可能为空")
    private String menuCode;

    @ApiModelProperty("菜谱名称，可能为空")
    private String menuName;

    @ApiModelProperty("food_id")
    private String foodId;

    @ApiModelProperty("food_code")
    private String foodCode;

    @ApiModelProperty("食物名称")
    private String foodName;

    @ApiModelProperty("重量")
    private BigDecimal weight;

    @ApiModelProperty("是否是市品，1-是  0否")
    private String isCityProduct;

    @ApiModelProperty("操作者科室编码")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称")
    private String opeDeptName;

    @ApiModelProperty("操作者编码")
    private String userNo;

    @ApiModelProperty("操作者姓名")
    private String userName;

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
    public Long getDsdId() {
        return dsdId;
    }

    /**		
	 * 		
     */
    public void setDsdId(Long dsdId) {
        this.dsdId = dsdId;
    }
    /**		
	 * 关联主表assess_diet_survey的ds_id		
     */
    public Long getDsId() {
        return dsId;
    }

    /**		
	 * 关联主表assess_diet_survey的ds_id		
     */
    public void setDsId(Long dsId) {
        this.dsId = dsId;
    }
    /**		
	 * 序号，针对每个ds_id从1开始		
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**		
	 * 序号，针对每个ds_id从1开始		
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
    /**		
	 * 餐次编码，参考字典		
     */
    public String getMealTimeCode() {
        return mealTimeCode;
    }

    /**		
	 * 餐次编码，参考字典		
     */
    public void setMealTimeCode(String mealTimeCode) {
        this.mealTimeCode = mealTimeCode;
    }
    /**		
	 * 餐次名称，参考字典		
     */
    public String getMealTimeName() {
        return mealTimeName;
    }

    /**		
	 * 餐次名称，参考字典		
     */
    public void setMealTimeName(String mealTimeName) {
        this.mealTimeName = mealTimeName;
    }
    /**		
	 * 菜谱编码，可能为空		
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**		
	 * 菜谱编码，可能为空		
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
    /**		
	 * 菜谱名称，可能为空		
     */
    public String getMenuName() {
        return menuName;
    }

    /**		
	 * 菜谱名称，可能为空		
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    /**		
	 * food_id		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * food_id		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**		
	 * food_code		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * food_code		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 食物名称		
     */
    public String getFoodName() {
        return foodName;
    }

    /**		
	 * 食物名称		
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    /**		
	 * 重量		
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**		
	 * 重量		
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    /**		
	 * 是否是市品，1-是  0否		
     */
    public String getIsCityProduct() {
        return isCityProduct;
    }

    /**		
	 * 是否是市品，1-是  0否		
     */
    public void setIsCityProduct(String isCityProduct) {
        this.isCityProduct = isCityProduct;
    }
    /**		
	 * 操作者科室编码		
     */
    public String getOpeDeptCode() {
        return opeDeptCode;
    }

    /**		
	 * 操作者科室编码		
     */
    public void setOpeDeptCode(String opeDeptCode) {
        this.opeDeptCode = opeDeptCode;
    }
    /**		
	 * 操作者科室名称		
     */
    public String getOpeDeptName() {
        return opeDeptName;
    }

    /**		
	 * 操作者科室名称		
     */
    public void setOpeDeptName(String opeDeptName) {
        this.opeDeptName = opeDeptName;
    }
    /**		
	 * 操作者编码		
     */
    public String getUserNo() {
        return userNo;
    }

    /**		
	 * 操作者编码		
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    /**		
	 * 操作者姓名		
     */
    public String getUserName() {
        return userName;
    }

    /**		
	 * 操作者姓名		
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
        return "AssessDietSurveyDetail{" +
            "dsdId=" + dsdId +
            ", dsId=" + dsId +
            ", orderNo=" + orderNo +
            ", mealTimeCode=" + mealTimeCode +
            ", mealTimeName=" + mealTimeName +
            ", menuCode=" + menuCode +
            ", menuName=" + menuName +
            ", foodId=" + foodId +
            ", foodCode=" + foodCode +
            ", foodName=" + foodName +
            ", weight=" + weight +
            ", isCityProduct=" + isCityProduct +
            ", opeDeptCode=" + opeDeptCode +
            ", opeDeptName=" + opeDeptName +
            ", userNo=" + userNo +
            ", userName=" + userName +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
