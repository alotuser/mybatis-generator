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
 * 会诊记录
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("diag_consultation")
@ApiModel(value = "DiagConsultation对象", description = "会诊记录")
public class DiagConsultation extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dc_id", type = IdType.AUTO)
    private Long dcId;

    @ApiModelProperty("病人唯一识别号 ")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("会诊类型 a 意见不为空,b 意见为空, c 非his数据")
    private String type;

    @ApiModelProperty("检查日期")
    private LocalDateTime consultationDate;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("机构编码")
    private String orgCode;

    @ApiModelProperty("机构名称")
    private String orgName;

    @ApiModelProperty("科别编码 ")
    private String deptCode;

    @ApiModelProperty("科别名字")
    private String deptName;

    @ApiModelProperty("病区/房号")
    private String wardCode;

    @ApiModelProperty("病区名字")
    private String wardName;

    @ApiModelProperty("床号可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别,男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("申请会诊科别编码")
    private String applicationDeptCode;

    @ApiModelProperty("申请会诊科别名字")
    private String applicationDeptName;

    @ApiModelProperty("申请会诊医生编号")
    private String applicationDoctorCode;

    @ApiModelProperty("申请会诊医生名字")
    private String applicationDoctorName;

    @ApiModelProperty("申请会诊时间,希望会诊时间")
    private LocalDateTime applicationTime;

    @ApiModelProperty("会诊科别编码")
    private String consultationDeptCode;

    @ApiModelProperty("会诊科别名字")
    private String consultationDeptName;

    @ApiModelProperty("会诊医生编号")
    private String consultationDoctorCode;

    @ApiModelProperty("会诊医生名字")
    private String consultationDoctorName;

    @ApiModelProperty("病情概况")
    private String patientCondition;

    @ApiModelProperty("会诊意见")
    private String consultationOpinion;

    @ApiModelProperty("操作者科室编码")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称")
    private String opeDeptName;

    @ApiModelProperty("操作者编码")
    private String userNo;

    @ApiModelProperty("操作者姓名")
    private String userName;

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
    public Long getDcId() {
        return dcId;
    }

    /**		
	 * 		
     */
    public void setDcId(Long dcId) {
        this.dcId = dcId;
    }
    /**		
	 * 病人唯一识别号 		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 病人唯一识别号 		
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 入院次数		
     */
    public String getVisitId() {
        return visitId;
    }

    /**		
	 * 入院次数		
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**		
	 * 会诊类型 a 意见不为空,b 意见为空, c 非his数据		
     */
    public String getType() {
        return type;
    }

    /**		
	 * 会诊类型 a 意见不为空,b 意见为空, c 非his数据		
     */
    public void setType(String type) {
        this.type = type;
    }
    /**		
	 * 检查日期		
     */
    public LocalDateTime getConsultationDate() {
        return consultationDate;
    }

    /**		
	 * 检查日期		
     */
    public void setConsultationDate(LocalDateTime consultationDate) {
        this.consultationDate = consultationDate;
    }
    /**		
	 * 住院号		
     */
    public String getInpNo() {
        return inpNo;
    }

    /**		
	 * 住院号		
     */
    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }
    /**		
	 * 机构编码		
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**		
	 * 机构编码		
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    /**		
	 * 机构名称		
     */
    public String getOrgName() {
        return orgName;
    }

    /**		
	 * 机构名称		
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    /**		
	 * 科别编码 		
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**		
	 * 科别编码 		
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    /**		
	 * 科别名字		
     */
    public String getDeptName() {
        return deptName;
    }

    /**		
	 * 科别名字		
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    /**		
	 * 病区/房号		
     */
    public String getWardCode() {
        return wardCode;
    }

    /**		
	 * 病区/房号		
     */
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }
    /**		
	 * 病区名字		
     */
    public String getWardName() {
        return wardName;
    }

    /**		
	 * 病区名字		
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
    /**		
	 * 床号可能有+等字符		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号可能有+等字符		
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }
    /**		
	 * 姓名		
     */
    public String getName() {
        return name;
    }

    /**		
	 * 姓名		
     */
    public void setName(String name) {
        this.name = name;
    }
    /**		
	 * 性别,男，女		
     */
    public String getSex() {
        return sex;
    }

    /**		
	 * 性别,男，女		
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**		
	 * 年龄		
     */
    public Integer getAge() {
        return age;
    }

    /**		
	 * 年龄		
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**		
	 * 身高		
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**		
	 * 身高		
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }
    /**		
	 * 体重		
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**		
	 * 体重		
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    /**		
	 * 体质指数		
     */
    public BigDecimal getBmi() {
        return bmi;
    }

    /**		
	 * 体质指数		
     */
    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }
    /**		
	 * 申请会诊科别编码		
     */
    public String getApplicationDeptCode() {
        return applicationDeptCode;
    }

    /**		
	 * 申请会诊科别编码		
     */
    public void setApplicationDeptCode(String applicationDeptCode) {
        this.applicationDeptCode = applicationDeptCode;
    }
    /**		
	 * 申请会诊科别名字		
     */
    public String getApplicationDeptName() {
        return applicationDeptName;
    }

    /**		
	 * 申请会诊科别名字		
     */
    public void setApplicationDeptName(String applicationDeptName) {
        this.applicationDeptName = applicationDeptName;
    }
    /**		
	 * 申请会诊医生编号		
     */
    public String getApplicationDoctorCode() {
        return applicationDoctorCode;
    }

    /**		
	 * 申请会诊医生编号		
     */
    public void setApplicationDoctorCode(String applicationDoctorCode) {
        this.applicationDoctorCode = applicationDoctorCode;
    }
    /**		
	 * 申请会诊医生名字		
     */
    public String getApplicationDoctorName() {
        return applicationDoctorName;
    }

    /**		
	 * 申请会诊医生名字		
     */
    public void setApplicationDoctorName(String applicationDoctorName) {
        this.applicationDoctorName = applicationDoctorName;
    }
    /**		
	 * 申请会诊时间,希望会诊时间		
     */
    public LocalDateTime getApplicationTime() {
        return applicationTime;
    }

    /**		
	 * 申请会诊时间,希望会诊时间		
     */
    public void setApplicationTime(LocalDateTime applicationTime) {
        this.applicationTime = applicationTime;
    }
    /**		
	 * 会诊科别编码		
     */
    public String getConsultationDeptCode() {
        return consultationDeptCode;
    }

    /**		
	 * 会诊科别编码		
     */
    public void setConsultationDeptCode(String consultationDeptCode) {
        this.consultationDeptCode = consultationDeptCode;
    }
    /**		
	 * 会诊科别名字		
     */
    public String getConsultationDeptName() {
        return consultationDeptName;
    }

    /**		
	 * 会诊科别名字		
     */
    public void setConsultationDeptName(String consultationDeptName) {
        this.consultationDeptName = consultationDeptName;
    }
    /**		
	 * 会诊医生编号		
     */
    public String getConsultationDoctorCode() {
        return consultationDoctorCode;
    }

    /**		
	 * 会诊医生编号		
     */
    public void setConsultationDoctorCode(String consultationDoctorCode) {
        this.consultationDoctorCode = consultationDoctorCode;
    }
    /**		
	 * 会诊医生名字		
     */
    public String getConsultationDoctorName() {
        return consultationDoctorName;
    }

    /**		
	 * 会诊医生名字		
     */
    public void setConsultationDoctorName(String consultationDoctorName) {
        this.consultationDoctorName = consultationDoctorName;
    }
    /**		
	 * 病情概况		
     */
    public String getPatientCondition() {
        return patientCondition;
    }

    /**		
	 * 病情概况		
     */
    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }
    /**		
	 * 会诊意见		
     */
    public String getConsultationOpinion() {
        return consultationOpinion;
    }

    /**		
	 * 会诊意见		
     */
    public void setConsultationOpinion(String consultationOpinion) {
        this.consultationOpinion = consultationOpinion;
    }
    /**		
	 * 操作者科室编码		
     */
    public String getOpeDeptCode() {
        return opeDeptCode;
    }

    /**		
	 * 操作者科室编码		
     */
    public void setOpeDeptCode(String opeDeptCode) {
        this.opeDeptCode = opeDeptCode;
    }
    /**		
	 * 操作者科室名称		
     */
    public String getOpeDeptName() {
        return opeDeptName;
    }

    /**		
	 * 操作者科室名称		
     */
    public void setOpeDeptName(String opeDeptName) {
        this.opeDeptName = opeDeptName;
    }
    /**		
	 * 操作者编码		
     */
    public String getUserNo() {
        return userNo;
    }

    /**		
	 * 操作者编码		
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    /**		
	 * 操作者姓名		
     */
    public String getUserName() {
        return userName;
    }

    /**		
	 * 操作者姓名		
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
        return "DiagConsultation{" +
            "dcId=" + dcId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", type=" + type +
            ", consultationDate=" + consultationDate +
            ", inpNo=" + inpNo +
            ", orgCode=" + orgCode +
            ", orgName=" + orgName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", wardCode=" + wardCode +
            ", wardName=" + wardName +
            ", bedNo=" + bedNo +
            ", name=" + name +
            ", sex=" + sex +
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", applicationDeptCode=" + applicationDeptCode +
            ", applicationDeptName=" + applicationDeptName +
            ", applicationDoctorCode=" + applicationDoctorCode +
            ", applicationDoctorName=" + applicationDoctorName +
            ", applicationTime=" + applicationTime +
            ", consultationDeptCode=" + consultationDeptCode +
            ", consultationDeptName=" + consultationDeptName +
            ", consultationDoctorCode=" + consultationDoctorCode +
            ", consultationDoctorName=" + consultationDoctorName +
            ", patientCondition=" + patientCondition +
            ", consultationOpinion=" + consultationOpinion +
            ", opeDeptCode=" + opeDeptCode +
            ", opeDeptName=" + opeDeptName +
            ", userNo=" + userNo +
            ", userName=" + userName +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
