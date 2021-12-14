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
 * 待办明细
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_upcoming_detail")
@ApiModel(value = "VisitUpcomingDetail对象", description = "待办明细")
public class VisitUpcomingDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "upcoming_detail_id", type = IdType.AUTO)
    private Long upcomingDetailId;

    @ApiModelProperty("visit_upcoming")
    private Long upcomingId;

    @ApiModelProperty("visit_patient")
    private Long patientId;

    @ApiModelProperty("就诊姓名")
    private String patientName;

    @ApiModelProperty("类型 diet phy quest sign sport")
    private String type;

    @ApiModelProperty("就诊时间")
    private String visitDate;

    @ApiModelProperty("就诊单位 (1周,2月)")
    private String visitArea;

    @ApiModelProperty("就诊第几数")
    private String visitDept;

    @ApiModelProperty("状态 0未完成，1已完成")
    private String status;

    @ApiModelProperty("通知状态")
    private String advStatus;

    @ApiModelProperty("是否删除")
    private Integer isDelete;

    private String isDaily;

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
	 * visit_upcoming		
     */
    public Long getUpcomingId() {
        return upcomingId;
    }

    /**		
	 * visit_upcoming		
     */
    public void setUpcomingId(Long upcomingId) {
        this.upcomingId = upcomingId;
    }
    /**		
	 * visit_patient		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * visit_patient		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 就诊姓名		
     */
    public String getPatientName() {
        return patientName;
    }

    /**		
	 * 就诊姓名		
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**		
	 * 类型 diet phy quest sign sport		
     */
    public String getType() {
        return type;
    }

    /**		
	 * 类型 diet phy quest sign sport		
     */
    public void setType(String type) {
        this.type = type;
    }
    /**		
	 * 就诊时间		
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**		
	 * 就诊时间		
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
    /**		
	 * 就诊单位 (1周,2月)		
     */
    public String getVisitArea() {
        return visitArea;
    }

    /**		
	 * 就诊单位 (1周,2月)		
     */
    public void setVisitArea(String visitArea) {
        this.visitArea = visitArea;
    }
    /**		
	 * 就诊第几数		
     */
    public String getVisitDept() {
        return visitDept;
    }

    /**		
	 * 就诊第几数		
     */
    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }
    /**		
	 * 状态 0未完成，1已完成		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态 0未完成，1已完成		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 通知状态		
     */
    public String getAdvStatus() {
        return advStatus;
    }

    /**		
	 * 通知状态		
     */
    public void setAdvStatus(String advStatus) {
        this.advStatus = advStatus;
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
	 * 		
     */
    public String getIsDaily() {
        return isDaily;
    }

    /**		
	 * 		
     */
    public void setIsDaily(String isDaily) {
        this.isDaily = isDaily;
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
        return "VisitUpcomingDetail{" +
            "upcomingDetailId=" + upcomingDetailId +
            ", upcomingId=" + upcomingId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", type=" + type +
            ", visitDate=" + visitDate +
            ", visitArea=" + visitArea +
            ", visitDept=" + visitDept +
            ", status=" + status +
            ", advStatus=" + advStatus +
            ", isDelete=" + isDelete +
            ", isDaily=" + isDaily +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
