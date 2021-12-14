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
 * 疾病字典表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_ill_dict")
@ApiModel(value = "SysIllDict对象", description = "疾病字典表")
public class SysIllDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id_id", type = IdType.AUTO)
    private Long idId;

    @ApiModelProperty("疾病编码")
    private String illCode;

    @ApiModelProperty("疾病名称")
    private String illName;

    @ApiModelProperty("层级编码")
    private String levelCode;

    @ApiModelProperty("是否标记有下级内容(1有 0无)")
    private String isSign;

    @ApiModelProperty("种类")
    private BigDecimal kind;

    @ApiModelProperty("膳食种类编码")
    private String mealTypeCode;

    @ApiModelProperty("膳食种类名称")
    private String mealTypeName;

    @ApiModelProperty("脂肪推荐范围开始")
    private BigDecimal fatFrom;

    @ApiModelProperty("脂肪推荐范围结束")
    private BigDecimal fatTo;

    @ApiModelProperty("盐推荐范围开始")
    private BigDecimal saltFrom;

    @ApiModelProperty("盐推荐范围结束")
    private BigDecimal saltTo;

    @ApiModelProperty("是否可见(1是 0否)")
    private String isVisible;

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
    public Long getIdId() {
        return idId;
    }

    /**		
	 * 		
     */
    public void setIdId(Long idId) {
        this.idId = idId;
    }
    /**		
	 * 疾病编码		
     */
    public String getIllCode() {
        return illCode;
    }

    /**		
	 * 疾病编码		
     */
    public void setIllCode(String illCode) {
        this.illCode = illCode;
    }
    /**		
	 * 疾病名称		
     */
    public String getIllName() {
        return illName;
    }

    /**		
	 * 疾病名称		
     */
    public void setIllName(String illName) {
        this.illName = illName;
    }
    /**		
	 * 层级编码		
     */
    public String getLevelCode() {
        return levelCode;
    }

    /**		
	 * 层级编码		
     */
    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }
    /**		
	 * 是否标记有下级内容(1有 0无)		
     */
    public String getIsSign() {
        return isSign;
    }

    /**		
	 * 是否标记有下级内容(1有 0无)		
     */
    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }
    /**		
	 * 种类		
     */
    public BigDecimal getKind() {
        return kind;
    }

    /**		
	 * 种类		
     */
    public void setKind(BigDecimal kind) {
        this.kind = kind;
    }
    /**		
	 * 膳食种类编码		
     */
    public String getMealTypeCode() {
        return mealTypeCode;
    }

    /**		
	 * 膳食种类编码		
     */
    public void setMealTypeCode(String mealTypeCode) {
        this.mealTypeCode = mealTypeCode;
    }
    /**		
	 * 膳食种类名称		
     */
    public String getMealTypeName() {
        return mealTypeName;
    }

    /**		
	 * 膳食种类名称		
     */
    public void setMealTypeName(String mealTypeName) {
        this.mealTypeName = mealTypeName;
    }
    /**		
	 * 脂肪推荐范围开始		
     */
    public BigDecimal getFatFrom() {
        return fatFrom;
    }

    /**		
	 * 脂肪推荐范围开始		
     */
    public void setFatFrom(BigDecimal fatFrom) {
        this.fatFrom = fatFrom;
    }
    /**		
	 * 脂肪推荐范围结束		
     */
    public BigDecimal getFatTo() {
        return fatTo;
    }

    /**		
	 * 脂肪推荐范围结束		
     */
    public void setFatTo(BigDecimal fatTo) {
        this.fatTo = fatTo;
    }
    /**		
	 * 盐推荐范围开始		
     */
    public BigDecimal getSaltFrom() {
        return saltFrom;
    }

    /**		
	 * 盐推荐范围开始		
     */
    public void setSaltFrom(BigDecimal saltFrom) {
        this.saltFrom = saltFrom;
    }
    /**		
	 * 盐推荐范围结束		
     */
    public BigDecimal getSaltTo() {
        return saltTo;
    }

    /**		
	 * 盐推荐范围结束		
     */
    public void setSaltTo(BigDecimal saltTo) {
        this.saltTo = saltTo;
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
        return "SysIllDict{" +
            "idId=" + idId +
            ", illCode=" + illCode +
            ", illName=" + illName +
            ", levelCode=" + levelCode +
            ", isSign=" + isSign +
            ", kind=" + kind +
            ", mealTypeCode=" + mealTypeCode +
            ", mealTypeName=" + mealTypeName +
            ", fatFrom=" + fatFrom +
            ", fatTo=" + fatTo +
            ", saltFrom=" + saltFrom +
            ", saltTo=" + saltTo +
            ", isVisible=" + isVisible +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
