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
 * 消化道评估B(child)
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_digestive_tract_child")
@ApiModel(value = "AssessDigestiveTractChild对象", description = "消化道评估B(child)")
public class AssessDigestiveTractChild extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK")
    @TableId(value = "dt_id", type = IdType.AUTO)
    private Long dtId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("评估日期")
    private LocalDateTime assessDate;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("机构编码")
    private String orgCode;

    @ApiModelProperty("机构名称")
    private String orgName;

    @ApiModelProperty("科别编码")
    private String deptCode;

    @ApiModelProperty("科别名字")
    private String deptName;

    @ApiModelProperty("病区/房号")
    private String wardCode;

    @ApiModelProperty("病区名字")
    private String wardName;

    @ApiModelProperty("床号,可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别,男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("不良记录")
    private String badRecord;

    @ApiModelProperty("静脉营养,有、无")
    private String havePn;

    @ApiModelProperty("饮食摄入,json数组保存名称，允许多选")
    private String dietInfo;

    @ApiModelProperty("饮食摄入其他")
    private String dietInfoOther;

    @ApiModelProperty("完成情况,已完成，部分完成，未完成。")
    private String completeStatus;

    @ApiModelProperty("完成情况说明")
    private String completeStatusDetail;

    @ApiModelProperty("消化道症状,允许多选，json数组")
    private String digestiveSymptom;

    @ApiModelProperty("其他")
    private String other;

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
	 * PK		
     */
    public Long getDtId() {
        return dtId;
    }

    /**		
	 * PK		
     */
    public void setDtId(Long dtId) {
        this.dtId = dtId;
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
	 * 评估日期		
     */
    public LocalDateTime getAssessDate() {
        return assessDate;
    }

    /**		
	 * 评估日期		
     */
    public void setAssessDate(LocalDateTime assessDate) {
        this.assessDate = assessDate;
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
	 * 床号,可能有+等字符		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号,可能有+等字符		
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
	 * 不良记录		
     */
    public String getBadRecord() {
        return badRecord;
    }

    /**		
	 * 不良记录		
     */
    public void setBadRecord(String badRecord) {
        this.badRecord = badRecord;
    }
    /**		
	 * 静脉营养,有、无		
     */
    public String getHavePn() {
        return havePn;
    }

    /**		
	 * 静脉营养,有、无		
     */
    public void setHavePn(String havePn) {
        this.havePn = havePn;
    }
    /**		
	 * 饮食摄入,json数组保存名称，允许多选		
     */
    public String getDietInfo() {
        return dietInfo;
    }

    /**		
	 * 饮食摄入,json数组保存名称，允许多选		
     */
    public void setDietInfo(String dietInfo) {
        this.dietInfo = dietInfo;
    }
    /**		
	 * 饮食摄入其他		
     */
    public String getDietInfoOther() {
        return dietInfoOther;
    }

    /**		
	 * 饮食摄入其他		
     */
    public void setDietInfoOther(String dietInfoOther) {
        this.dietInfoOther = dietInfoOther;
    }
    /**		
	 * 完成情况,已完成，部分完成，未完成。		
     */
    public String getCompleteStatus() {
        return completeStatus;
    }

    /**		
	 * 完成情况,已完成，部分完成，未完成。		
     */
    public void setCompleteStatus(String completeStatus) {
        this.completeStatus = completeStatus;
    }
    /**		
	 * 完成情况说明		
     */
    public String getCompleteStatusDetail() {
        return completeStatusDetail;
    }

    /**		
	 * 完成情况说明		
     */
    public void setCompleteStatusDetail(String completeStatusDetail) {
        this.completeStatusDetail = completeStatusDetail;
    }
    /**		
	 * 消化道症状,允许多选，json数组		
     */
    public String getDigestiveSymptom() {
        return digestiveSymptom;
    }

    /**		
	 * 消化道症状,允许多选，json数组		
     */
    public void setDigestiveSymptom(String digestiveSymptom) {
        this.digestiveSymptom = digestiveSymptom;
    }
    /**		
	 * 其他		
     */
    public String getOther() {
        return other;
    }

    /**		
	 * 其他		
     */
    public void setOther(String other) {
        this.other = other;
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
        return "AssessDigestiveTractChild{" +
            "dtId=" + dtId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", assessDate=" + assessDate +
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
            ", badRecord=" + badRecord +
            ", havePn=" + havePn +
            ", dietInfo=" + dietInfo +
            ", dietInfoOther=" + dietInfoOther +
            ", completeStatus=" + completeStatus +
            ", completeStatusDetail=" + completeStatusDetail +
            ", digestiveSymptom=" + digestiveSymptom +
            ", other=" + other +
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
