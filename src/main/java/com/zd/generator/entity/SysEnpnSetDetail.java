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
 * ENPN套餐明细表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_enpn_set_detail")
@ApiModel(value = "SysEnpnSetDetail对象", description = "ENPN套餐明细表")
public class SysEnpnSetDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "msd_id", type = IdType.AUTO)
    private Long msdId;

    @ApiModelProperty("对应主表id")
    private Long msId;

    @ApiModelProperty("食物编码")
    private String foodCode;

    @ApiModelProperty("食物id")
    private String foodId;

    @ApiModelProperty("食物名称")
    private String foodName;

    @ApiModelProperty("单位")
    private String foodUnit;

    @ApiModelProperty("数量")
    private BigDecimal foodQty;

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
    public Long getMsdId() {
        return msdId;
    }

    /**		
	 * 		
     */
    public void setMsdId(Long msdId) {
        this.msdId = msdId;
    }
    /**		
	 * 对应主表id		
     */
    public Long getMsId() {
        return msId;
    }

    /**		
	 * 对应主表id		
     */
    public void setMsId(Long msId) {
        this.msId = msId;
    }
    /**		
	 * 食物编码		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * 食物编码		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 食物id		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * 食物id		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
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
	 * 单位		
     */
    public String getFoodUnit() {
        return foodUnit;
    }

    /**		
	 * 单位		
     */
    public void setFoodUnit(String foodUnit) {
        this.foodUnit = foodUnit;
    }
    /**		
	 * 数量		
     */
    public BigDecimal getFoodQty() {
        return foodQty;
    }

    /**		
	 * 数量		
     */
    public void setFoodQty(BigDecimal foodQty) {
        this.foodQty = foodQty;
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
        return "SysEnpnSetDetail{" +
            "msdId=" + msdId +
            ", msId=" + msId +
            ", foodCode=" + foodCode +
            ", foodId=" + foodId +
            ", foodName=" + foodName +
            ", foodUnit=" + foodUnit +
            ", foodQty=" + foodQty +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
