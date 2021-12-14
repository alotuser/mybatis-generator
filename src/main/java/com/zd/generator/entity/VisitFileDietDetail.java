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
 * 健康档案饮食明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_diet_detail")
@ApiModel(value = "VisitFileDietDetail对象", description = "健康档案饮食明细")
public class VisitFileDietDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "diet_detail_id", type = IdType.AUTO)
    private Long dietDetailId;

    @ApiModelProperty("visit_file_diet")
    private Long dietId;

    @ApiModelProperty("日期时间")
    private String fileDate;

    @ApiModelProperty("菜谱UUID")
    private String menuType;

    @ApiModelProperty("菜谱code")
    private String menuCode;

    @ApiModelProperty("菜谱名称")
    private String menuName;

    @ApiModelProperty("食物类型0 sysfood,1 visitfood")
    private String foodType;

    @ApiModelProperty("食物code")
    private String foodCode;

    @ApiModelProperty("食物name")
    private String foodName;

    @ApiModelProperty("食物图片")
    private String foodImg;

    @ApiModelProperty("食物数量")
    private String foodAmount;

    @ApiModelProperty("食物能量")
    private String foodEnergy;

    @ApiModelProperty("食物介绍")
    private String foodInfo;

    @ApiModelProperty("食物备注")
    private String foodRemark;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("是否删除")
    private Integer isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人code")
    private String createUserCode;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人code")
    private String updateUserCode;

    @ApiModelProperty("更新人姓名")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getDietDetailId() {
        return dietDetailId;
    }

    /**		
	 * 		
     */
    public void setDietDetailId(Long dietDetailId) {
        this.dietDetailId = dietDetailId;
    }
    /**		
	 * visit_file_diet		
     */
    public Long getDietId() {
        return dietId;
    }

    /**		
	 * visit_file_diet		
     */
    public void setDietId(Long dietId) {
        this.dietId = dietId;
    }
    /**		
	 * 日期时间		
     */
    public String getFileDate() {
        return fileDate;
    }

    /**		
	 * 日期时间		
     */
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
    /**		
	 * 菜谱UUID		
     */
    public String getMenuType() {
        return menuType;
    }

    /**		
	 * 菜谱UUID		
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }
    /**		
	 * 菜谱code		
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**		
	 * 菜谱code		
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
    /**		
	 * 菜谱名称		
     */
    public String getMenuName() {
        return menuName;
    }

    /**		
	 * 菜谱名称		
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    /**		
	 * 食物类型0 sysfood,1 visitfood		
     */
    public String getFoodType() {
        return foodType;
    }

    /**		
	 * 食物类型0 sysfood,1 visitfood		
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
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
	 * 食物name		
     */
    public String getFoodName() {
        return foodName;
    }

    /**		
	 * 食物name		
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    /**		
	 * 食物图片		
     */
    public String getFoodImg() {
        return foodImg;
    }

    /**		
	 * 食物图片		
     */
    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }
    /**		
	 * 食物数量		
     */
    public String getFoodAmount() {
        return foodAmount;
    }

    /**		
	 * 食物数量		
     */
    public void setFoodAmount(String foodAmount) {
        this.foodAmount = foodAmount;
    }
    /**		
	 * 食物能量		
     */
    public String getFoodEnergy() {
        return foodEnergy;
    }

    /**		
	 * 食物能量		
     */
    public void setFoodEnergy(String foodEnergy) {
        this.foodEnergy = foodEnergy;
    }
    /**		
	 * 食物介绍		
     */
    public String getFoodInfo() {
        return foodInfo;
    }

    /**		
	 * 食物介绍		
     */
    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }
    /**		
	 * 食物备注		
     */
    public String getFoodRemark() {
        return foodRemark;
    }

    /**		
	 * 食物备注		
     */
    public void setFoodRemark(String foodRemark) {
        this.foodRemark = foodRemark;
    }
    /**		
	 * 状态		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 是否删除		
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除		
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
	 * 创建人code		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 创建人code		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 创建人姓名		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 创建人姓名		
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
	 * 更新人code		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 更新人code		
     */
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
    /**		
	 * 更新人姓名		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 更新人姓名		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "VisitFileDietDetail{" +
            "dietDetailId=" + dietDetailId +
            ", dietId=" + dietId +
            ", fileDate=" + fileDate +
            ", menuType=" + menuType +
            ", menuCode=" + menuCode +
            ", menuName=" + menuName +
            ", foodType=" + foodType +
            ", foodCode=" + foodCode +
            ", foodName=" + foodName +
            ", foodImg=" + foodImg +
            ", foodAmount=" + foodAmount +
            ", foodEnergy=" + foodEnergy +
            ", foodInfo=" + foodInfo +
            ", foodRemark=" + foodRemark +
            ", status=" + status +
            ", isDelete=" + isDelete +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
