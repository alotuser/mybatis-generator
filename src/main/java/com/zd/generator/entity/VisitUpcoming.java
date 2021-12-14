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
 * 待办
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_upcoming")
@ApiModel(value = "VisitUpcoming对象", description = "待办")
public class VisitUpcoming extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "upcoming_id", type = IdType.AUTO)
    private Long upcomingId;

    private Long userId;

    private Long patientId;

    @ApiModelProperty("类型1复诊2随访")
    private String type;

    @ApiModelProperty("待办日期")
    private String upcomingDate;

    @ApiModelProperty("结束日期")
    private String lastingDate;

    @ApiModelProperty("门诊号")
    private String patientNo;

    @ApiModelProperty("复诊日期")
    private String followDate;

    @ApiModelProperty("医院code")
    private String hospCode;

    @ApiModelProperty("医院name")
    private String hospName;

    @ApiModelProperty("科室code")
    private String deptCode;

    @ApiModelProperty("科室name")
    private String deptName;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("性别")
    private String patientSex;

    @ApiModelProperty("生日")
    private String patientBirthday;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("结果")
    private String result;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("说明")
    private String remark;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("通知提前(天)")
    private Integer advDay;

    @ApiModelProperty("复诊提醒频率（年 月 周）")
    private String advPer;

    @ApiModelProperty("通知状态,0,未通知，1.已通知，2系统已通知")
    private String advStatus;

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
    public Long getUpcomingId() {
        return upcomingId;
    }

    /**		
	 * 		
     */
    public void setUpcomingId(Long upcomingId) {
        this.upcomingId = upcomingId;
    }
    /**		
	 * 		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * 		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
	 * 类型1复诊2随访		
     */
    public String getType() {
        return type;
    }

    /**		
	 * 类型1复诊2随访		
     */
    public void setType(String type) {
        this.type = type;
    }
    /**		
	 * 待办日期		
     */
    public String getUpcomingDate() {
        return upcomingDate;
    }

    /**		
	 * 待办日期		
     */
    public void setUpcomingDate(String upcomingDate) {
        this.upcomingDate = upcomingDate;
    }
    /**		
	 * 结束日期		
     */
    public String getLastingDate() {
        return lastingDate;
    }

    /**		
	 * 结束日期		
     */
    public void setLastingDate(String lastingDate) {
        this.lastingDate = lastingDate;
    }
    /**		
	 * 门诊号		
     */
    public String getPatientNo() {
        return patientNo;
    }

    /**		
	 * 门诊号		
     */
    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }
    /**		
	 * 复诊日期		
     */
    public String getFollowDate() {
        return followDate;
    }

    /**		
	 * 复诊日期		
     */
    public void setFollowDate(String followDate) {
        this.followDate = followDate;
    }
    /**		
	 * 医院code		
     */
    public String getHospCode() {
        return hospCode;
    }

    /**		
	 * 医院code		
     */
    public void setHospCode(String hospCode) {
        this.hospCode = hospCode;
    }
    /**		
	 * 医院name		
     */
    public String getHospName() {
        return hospName;
    }

    /**		
	 * 医院name		
     */
    public void setHospName(String hospName) {
        this.hospName = hospName;
    }
    /**		
	 * 科室code		
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**		
	 * 科室code		
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    /**		
	 * 科室name		
     */
    public String getDeptName() {
        return deptName;
    }

    /**		
	 * 科室name		
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
	 * 性别		
     */
    public String getPatientSex() {
        return patientSex;
    }

    /**		
	 * 性别		
     */
    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }
    /**		
	 * 生日		
     */
    public String getPatientBirthday() {
        return patientBirthday;
    }

    /**		
	 * 生日		
     */
    public void setPatientBirthday(String patientBirthday) {
        this.patientBirthday = patientBirthday;
    }
    /**		
	 * 内容		
     */
    public String getContent() {
        return content;
    }

    /**		
	 * 内容		
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**		
	 * 结果		
     */
    public String getResult() {
        return result;
    }

    /**		
	 * 结果		
     */
    public void setResult(String result) {
        this.result = result;
    }
    /**		
	 * 手机号		
     */
    public String getPhone() {
        return phone;
    }

    /**		
	 * 手机号		
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**		
	 * 说明		
     */
    public String getRemark() {
        return remark;
    }

    /**		
	 * 说明		
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
	 * 通知提前(天)		
     */
    public Integer getAdvDay() {
        return advDay;
    }

    /**		
	 * 通知提前(天)		
     */
    public void setAdvDay(Integer advDay) {
        this.advDay = advDay;
    }
    /**		
	 * 复诊提醒频率（年 月 周）		
     */
    public String getAdvPer() {
        return advPer;
    }

    /**		
	 * 复诊提醒频率（年 月 周）		
     */
    public void setAdvPer(String advPer) {
        this.advPer = advPer;
    }
    /**		
	 * 通知状态,0,未通知，1.已通知，2系统已通知		
     */
    public String getAdvStatus() {
        return advStatus;
    }

    /**		
	 * 通知状态,0,未通知，1.已通知，2系统已通知		
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
        return "VisitUpcoming{" +
            "upcomingId=" + upcomingId +
            ", userId=" + userId +
            ", patientId=" + patientId +
            ", type=" + type +
            ", upcomingDate=" + upcomingDate +
            ", lastingDate=" + lastingDate +
            ", patientNo=" + patientNo +
            ", followDate=" + followDate +
            ", hospCode=" + hospCode +
            ", hospName=" + hospName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", patientName=" + patientName +
            ", patientSex=" + patientSex +
            ", patientBirthday=" + patientBirthday +
            ", content=" + content +
            ", result=" + result +
            ", phone=" + phone +
            ", remark=" + remark +
            ", status=" + status +
            ", advDay=" + advDay +
            ", advPer=" + advPer +
            ", advStatus=" + advStatus +
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
