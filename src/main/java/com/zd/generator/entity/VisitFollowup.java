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
 * 复诊随访信息表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_followup")
@ApiModel(value = "VisitFollowup对象", description = "复诊随访信息表")
public class VisitFollowup extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "followup_id", type = IdType.AUTO)
    private Long followupId;

    @ApiModelProperty("upcoming_id")
    private Long upcomingId;

    @ApiModelProperty("user_id")
    private Long userId;

    @ApiModelProperty("patient_id")
    private Long patientId;

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

    @ApiModelProperty("联系方式")
    private String phone;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("结果")
    private String result;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("通知状态 0未通知1已通知")
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
    public Long getFollowupId() {
        return followupId;
    }

    /**		
	 * 		
     */
    public void setFollowupId(Long followupId) {
        this.followupId = followupId;
    }
    /**		
	 * upcoming_id		
     */
    public Long getUpcomingId() {
        return upcomingId;
    }

    /**		
	 * upcoming_id		
     */
    public void setUpcomingId(Long upcomingId) {
        this.upcomingId = upcomingId;
    }
    /**		
	 * user_id		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * user_id		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**		
	 * patient_id		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * patient_id		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
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
	 * 联系方式		
     */
    public String getPhone() {
        return phone;
    }

    /**		
	 * 联系方式		
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
	 * 通知状态 0未通知1已通知		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 通知状态 0未通知1已通知		
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
        return "VisitFollowup{" +
            "followupId=" + followupId +
            ", upcomingId=" + upcomingId +
            ", userId=" + userId +
            ", patientId=" + patientId +
            ", patientNo=" + patientNo +
            ", followDate=" + followDate +
            ", hospCode=" + hospCode +
            ", hospName=" + hospName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", patientName=" + patientName +
            ", patientSex=" + patientSex +
            ", patientBirthday=" + patientBirthday +
            ", phone=" + phone +
            ", content=" + content +
            ", result=" + result +
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
