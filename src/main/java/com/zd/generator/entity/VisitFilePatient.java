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
 * 就诊人健康档案
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_patient")
@ApiModel(value = "VisitFilePatient对象", description = "就诊人健康档案")
public class VisitFilePatient extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "patient_id", type = IdType.AUTO)
    private Long patientId;

    private Long userId;

    @ApiModelProperty("就诊人id")
    private String patientPid;

    @ApiModelProperty("就诊人门诊号")
    private String patientNo;

    @ApiModelProperty("就诊人号")
    private String patientCode;

    @ApiModelProperty("就诊人姓名")
    private String patientName;

    @ApiModelProperty("就诊人性别")
    private Integer patientSex;

    @ApiModelProperty("医院code")
    private String hospCode;

    @ApiModelProperty("医院name")
    private String hospName;

    @ApiModelProperty("科室code")
    private String deptCode;

    @ApiModelProperty("科室name")
    private String deptName;

    @ApiModelProperty("联系方式")
    private String contact;

    @ApiModelProperty("出生日期")
    private String birthday;

    @ApiModelProperty("预产日期")
    private String dueDate;

    @ApiModelProperty("分娩方式")
    private String deliveryMethod;

    @ApiModelProperty("出生孕周")
    private String pregnancyWeek;

    @ApiModelProperty("胎次")
    private Integer parity;

    @ApiModelProperty("是否多胞胎 0否 1是")
    private Integer multipleBirths;

    @ApiModelProperty("出生体重(克）")
    private String birthWeight;

    @ApiModelProperty("出生身长(厘米)")
    private String birthLength;

    @ApiModelProperty("出生头围(厘米)")
    private String birthHeadht;

    @ApiModelProperty("是否怀孕（1是0否）")
    private String isPregnancy;

    @ApiModelProperty("孕前体重")
    private String pregnancyWeight;

    @ApiModelProperty("末次月经时间")
    private String lastPeriodTime;

    @ApiModelProperty("状态")
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
	 * 就诊人id		
     */
    public String getPatientPid() {
        return patientPid;
    }

    /**		
	 * 就诊人id		
     */
    public void setPatientPid(String patientPid) {
        this.patientPid = patientPid;
    }
    /**		
	 * 就诊人门诊号		
     */
    public String getPatientNo() {
        return patientNo;
    }

    /**		
	 * 就诊人门诊号		
     */
    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }
    /**		
	 * 就诊人号		
     */
    public String getPatientCode() {
        return patientCode;
    }

    /**		
	 * 就诊人号		
     */
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }
    /**		
	 * 就诊人姓名		
     */
    public String getPatientName() {
        return patientName;
    }

    /**		
	 * 就诊人姓名		
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**		
	 * 就诊人性别		
     */
    public Integer getPatientSex() {
        return patientSex;
    }

    /**		
	 * 就诊人性别		
     */
    public void setPatientSex(Integer patientSex) {
        this.patientSex = patientSex;
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
	 * 联系方式		
     */
    public String getContact() {
        return contact;
    }

    /**		
	 * 联系方式		
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    /**		
	 * 出生日期		
     */
    public String getBirthday() {
        return birthday;
    }

    /**		
	 * 出生日期		
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**		
	 * 预产日期		
     */
    public String getDueDate() {
        return dueDate;
    }

    /**		
	 * 预产日期		
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    /**		
	 * 分娩方式		
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**		
	 * 分娩方式		
     */
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
    /**		
	 * 出生孕周		
     */
    public String getPregnancyWeek() {
        return pregnancyWeek;
    }

    /**		
	 * 出生孕周		
     */
    public void setPregnancyWeek(String pregnancyWeek) {
        this.pregnancyWeek = pregnancyWeek;
    }
    /**		
	 * 胎次		
     */
    public Integer getParity() {
        return parity;
    }

    /**		
	 * 胎次		
     */
    public void setParity(Integer parity) {
        this.parity = parity;
    }
    /**		
	 * 是否多胞胎 0否 1是		
     */
    public Integer getMultipleBirths() {
        return multipleBirths;
    }

    /**		
	 * 是否多胞胎 0否 1是		
     */
    public void setMultipleBirths(Integer multipleBirths) {
        this.multipleBirths = multipleBirths;
    }
    /**		
	 * 出生体重(克）		
     */
    public String getBirthWeight() {
        return birthWeight;
    }

    /**		
	 * 出生体重(克）		
     */
    public void setBirthWeight(String birthWeight) {
        this.birthWeight = birthWeight;
    }
    /**		
	 * 出生身长(厘米)		
     */
    public String getBirthLength() {
        return birthLength;
    }

    /**		
	 * 出生身长(厘米)		
     */
    public void setBirthLength(String birthLength) {
        this.birthLength = birthLength;
    }
    /**		
	 * 出生头围(厘米)		
     */
    public String getBirthHeadht() {
        return birthHeadht;
    }

    /**		
	 * 出生头围(厘米)		
     */
    public void setBirthHeadht(String birthHeadht) {
        this.birthHeadht = birthHeadht;
    }
    /**		
	 * 是否怀孕（1是0否）		
     */
    public String getIsPregnancy() {
        return isPregnancy;
    }

    /**		
	 * 是否怀孕（1是0否）		
     */
    public void setIsPregnancy(String isPregnancy) {
        this.isPregnancy = isPregnancy;
    }
    /**		
	 * 孕前体重		
     */
    public String getPregnancyWeight() {
        return pregnancyWeight;
    }

    /**		
	 * 孕前体重		
     */
    public void setPregnancyWeight(String pregnancyWeight) {
        this.pregnancyWeight = pregnancyWeight;
    }
    /**		
	 * 末次月经时间		
     */
    public String getLastPeriodTime() {
        return lastPeriodTime;
    }

    /**		
	 * 末次月经时间		
     */
    public void setLastPeriodTime(String lastPeriodTime) {
        this.lastPeriodTime = lastPeriodTime;
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
        return "VisitFilePatient{" +
            "patientId=" + patientId +
            ", userId=" + userId +
            ", patientPid=" + patientPid +
            ", patientNo=" + patientNo +
            ", patientCode=" + patientCode +
            ", patientName=" + patientName +
            ", patientSex=" + patientSex +
            ", hospCode=" + hospCode +
            ", hospName=" + hospName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", contact=" + contact +
            ", birthday=" + birthday +
            ", dueDate=" + dueDate +
            ", deliveryMethod=" + deliveryMethod +
            ", pregnancyWeek=" + pregnancyWeek +
            ", parity=" + parity +
            ", multipleBirths=" + multipleBirths +
            ", birthWeight=" + birthWeight +
            ", birthLength=" + birthLength +
            ", birthHeadht=" + birthHeadht +
            ", isPregnancy=" + isPregnancy +
            ", pregnancyWeight=" + pregnancyWeight +
            ", lastPeriodTime=" + lastPeriodTime +
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
