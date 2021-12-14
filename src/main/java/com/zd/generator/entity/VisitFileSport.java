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
 * 健康档案运动
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_sport")
@ApiModel(value = "VisitFileSport对象", description = "健康档案运动")
public class VisitFileSport extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sport_id", type = IdType.AUTO)
    private Long sportId;

    private Long upcomingDetailId;

    @ApiModelProperty("id")
    private Long patientId;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("体重")
    private String patientWeight;

    @ApiModelProperty("运动日期")
    private String fileDate;

    @ApiModelProperty("运动类型")
    private String sportCode;

    @ApiModelProperty("运动名称")
    private String sportName;

    @ApiModelProperty("运动值")
    private String sportVal;

    @ApiModelProperty("能量")
    private String sportEnergy;

    @ApiModelProperty("时间")
    private String sportTime;

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
    public Long getSportId() {
        return sportId;
    }

    /**		
	 * 		
     */
    public void setSportId(Long sportId) {
        this.sportId = sportId;
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
	 * id		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * id		
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
	 * 体重		
     */
    public String getPatientWeight() {
        return patientWeight;
    }

    /**		
	 * 体重		
     */
    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight;
    }
    /**		
	 * 运动日期		
     */
    public String getFileDate() {
        return fileDate;
    }

    /**		
	 * 运动日期		
     */
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
    /**		
	 * 运动类型		
     */
    public String getSportCode() {
        return sportCode;
    }

    /**		
	 * 运动类型		
     */
    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }
    /**		
	 * 运动名称		
     */
    public String getSportName() {
        return sportName;
    }

    /**		
	 * 运动名称		
     */
    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    /**		
	 * 运动值		
     */
    public String getSportVal() {
        return sportVal;
    }

    /**		
	 * 运动值		
     */
    public void setSportVal(String sportVal) {
        this.sportVal = sportVal;
    }
    /**		
	 * 能量		
     */
    public String getSportEnergy() {
        return sportEnergy;
    }

    /**		
	 * 能量		
     */
    public void setSportEnergy(String sportEnergy) {
        this.sportEnergy = sportEnergy;
    }
    /**		
	 * 时间		
     */
    public String getSportTime() {
        return sportTime;
    }

    /**		
	 * 时间		
     */
    public void setSportTime(String sportTime) {
        this.sportTime = sportTime;
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
        return "VisitFileSport{" +
            "sportId=" + sportId +
            ", upcomingDetailId=" + upcomingDetailId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", patientWeight=" + patientWeight +
            ", fileDate=" + fileDate +
            ", sportCode=" + sportCode +
            ", sportName=" + sportName +
            ", sportVal=" + sportVal +
            ", sportEnergy=" + sportEnergy +
            ", sportTime=" + sportTime +
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
