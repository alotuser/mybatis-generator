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
 * 健康档案体征
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_sign")
@ApiModel(value = "VisitFileSign对象", description = "健康档案体征")
public class VisitFileSign extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sign_id", type = IdType.AUTO)
    private Long signId;

    private Long upcomingDetailId;

    private Long patientId;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("记录日期")
    private String fileDate;

    @ApiModelProperty("血糖")
    private String bloodSugar;

    @ApiModelProperty("选择时间 0空腹1餐前2餐后2小时3睡前4空腹")
    private String bloodTime;

    @ApiModelProperty("高压")
    private String bloodPressureHigh;

    @ApiModelProperty("低压")
    private String bloodPressureLow;

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
    public Long getSignId() {
        return signId;
    }

    /**		
	 * 		
     */
    public void setSignId(Long signId) {
        this.signId = signId;
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
	 * 血糖		
     */
    public String getBloodSugar() {
        return bloodSugar;
    }

    /**		
	 * 血糖		
     */
    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }
    /**		
	 * 选择时间 0空腹1餐前2餐后2小时3睡前4空腹		
     */
    public String getBloodTime() {
        return bloodTime;
    }

    /**		
	 * 选择时间 0空腹1餐前2餐后2小时3睡前4空腹		
     */
    public void setBloodTime(String bloodTime) {
        this.bloodTime = bloodTime;
    }
    /**		
	 * 高压		
     */
    public String getBloodPressureHigh() {
        return bloodPressureHigh;
    }

    /**		
	 * 高压		
     */
    public void setBloodPressureHigh(String bloodPressureHigh) {
        this.bloodPressureHigh = bloodPressureHigh;
    }
    /**		
	 * 低压		
     */
    public String getBloodPressureLow() {
        return bloodPressureLow;
    }

    /**		
	 * 低压		
     */
    public void setBloodPressureLow(String bloodPressureLow) {
        this.bloodPressureLow = bloodPressureLow;
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
        return "VisitFileSign{" +
            "signId=" + signId +
            ", upcomingDetailId=" + upcomingDetailId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", fileDate=" + fileDate +
            ", bloodSugar=" + bloodSugar +
            ", bloodTime=" + bloodTime +
            ", bloodPressureHigh=" + bloodPressureHigh +
            ", bloodPressureLow=" + bloodPressureLow +
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
