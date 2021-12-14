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
 * 健康档案饮食
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_diet")
@ApiModel(value = "VisitFileDiet对象", description = "健康档案饮食")
public class VisitFileDiet extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "diet_id", type = IdType.AUTO)
    private Long dietId;

    private Long upcomingDetailId;

    private Long patientId;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("记录日期")
    private String fileDate;

    @ApiModelProperty("餐次")
    private String mealCode;

    @ApiModelProperty("餐次name")
    private String mealName;

    @ApiModelProperty("能量")
    private String energy;

    @ApiModelProperty("图片路径")
    private String imgPath;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态(备用)")
    private String status;

    @ApiModelProperty("是否删除 0否 1是")
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
    public Long getDietId() {
        return dietId;
    }

    /**		
	 * 		
     */
    public void setDietId(Long dietId) {
        this.dietId = dietId;
    }
    /**		
	 * 		
     */
    public Long getUpcomingDetailId() {
        return upcomingDetailId;
    }

    /**		
	 * 		
     */
    public void setUpcomingDetailId(Long upcomingDetailId) {
        this.upcomingDetailId = upcomingDetailId;
    }
    /**		
	 * 		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * 		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 姓名		
     */
    public String getPatientName() {
        return patientName;
    }

    /**		
	 * 姓名		
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**		
	 * 记录日期		
     */
    public String getFileDate() {
        return fileDate;
    }

    /**		
	 * 记录日期		
     */
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
    /**		
	 * 餐次		
     */
    public String getMealCode() {
        return mealCode;
    }

    /**		
	 * 餐次		
     */
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }
    /**		
	 * 餐次name		
     */
    public String getMealName() {
        return mealName;
    }

    /**		
	 * 餐次name		
     */
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    /**		
	 * 能量		
     */
    public String getEnergy() {
        return energy;
    }

    /**		
	 * 能量		
     */
    public void setEnergy(String energy) {
        this.energy = energy;
    }
    /**		
	 * 图片路径		
     */
    public String getImgPath() {
        return imgPath;
    }

    /**		
	 * 图片路径		
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    /**		
	 * 备注		
     */
    public String getRemark() {
        return remark;
    }

    /**		
	 * 备注		
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**		
	 * 状态(备用)		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态(备用)		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 是否删除 0否 1是		
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除 0否 1是		
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
        return "VisitFileDiet{" +
            "dietId=" + dietId +
            ", upcomingDetailId=" + upcomingDetailId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", fileDate=" + fileDate +
            ", mealCode=" + mealCode +
            ", mealName=" + mealName +
            ", energy=" + energy +
            ", imgPath=" + imgPath +
            ", remark=" + remark +
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
