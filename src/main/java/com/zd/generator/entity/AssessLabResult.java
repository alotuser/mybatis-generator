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
 * 实验室检查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_lab_result")
@ApiModel(value = "AssessLabResult对象", description = "实验室检查")
public class AssessLabResult extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK")
    @TableId(value = "lr_id", type = IdType.AUTO)
    private Long lrId;

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

    @ApiModelProperty("床号可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("报告日期")
    private LocalDateTime reportDate;

    @ApiModelProperty("报告单号")
    private String reportNo;

    @ApiModelProperty("报告子序号")
    private String reportSubNo;

    @ApiModelProperty("类型编码")
    private String itemClassCode;

    @ApiModelProperty("类型名字")
    private String itemClassName;

    @ApiModelProperty("项目编码可能是英文简写或者接口内部编码")
    private String itemCode;

    @ApiModelProperty("项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏")
    private String itemEngCode;

    @ApiModelProperty("项目名字")
    private String itemName;

    @ApiModelProperty("标本名称")
    private String sampleName;

    @ApiModelProperty("结果")
    private String result;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("异常状态0-偏低  1-正常 2-偏高 根据接口返回内容判断")
    private String unusualStatus;

    @ApiModelProperty("异常状态明细接口返回的具体内容记录，可能是↑↓或者其他标志")
    private String unusualStatusDetail;

    @ApiModelProperty("参考标准")
    private String reference;

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
    public Long getLrId() {
        return lrId;
    }

    /**		
	 * PK		
     */
    public void setLrId(Long lrId) {
        this.lrId = lrId;
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
	 * 性别男，女		
     */
    public String getSex() {
        return sex;
    }

    /**		
	 * 性别男，女		
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
	 * 报告日期		
     */
    public LocalDateTime getReportDate() {
        return reportDate;
    }

    /**		
	 * 报告日期		
     */
    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }
    /**		
	 * 报告单号		
     */
    public String getReportNo() {
        return reportNo;
    }

    /**		
	 * 报告单号		
     */
    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }
    /**		
	 * 报告子序号		
     */
    public String getReportSubNo() {
        return reportSubNo;
    }

    /**		
	 * 报告子序号		
     */
    public void setReportSubNo(String reportSubNo) {
        this.reportSubNo = reportSubNo;
    }
    /**		
	 * 类型编码		
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**		
	 * 类型编码		
     */
    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }
    /**		
	 * 类型名字		
     */
    public String getItemClassName() {
        return itemClassName;
    }

    /**		
	 * 类型名字		
     */
    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName;
    }
    /**		
	 * 项目编码可能是英文简写或者接口内部编码		
     */
    public String getItemCode() {
        return itemCode;
    }

    /**		
	 * 项目编码可能是英文简写或者接口内部编码		
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**		
	 * 项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏		
     */
    public String getItemEngCode() {
        return itemEngCode;
    }

    /**		
	 * 项目英文简写WBC，ALB等常用简写，如果没有则页面上“项目代号”列要隐藏		
     */
    public void setItemEngCode(String itemEngCode) {
        this.itemEngCode = itemEngCode;
    }
    /**		
	 * 项目名字		
     */
    public String getItemName() {
        return itemName;
    }

    /**		
	 * 项目名字		
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    /**		
	 * 标本名称		
     */
    public String getSampleName() {
        return sampleName;
    }

    /**		
	 * 标本名称		
     */
    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
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
	 * 单位		
     */
    public String getUnit() {
        return unit;
    }

    /**		
	 * 单位		
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**		
	 * 异常状态0-偏低  1-正常 2-偏高 根据接口返回内容判断		
     */
    public String getUnusualStatus() {
        return unusualStatus;
    }

    /**		
	 * 异常状态0-偏低  1-正常 2-偏高 根据接口返回内容判断		
     */
    public void setUnusualStatus(String unusualStatus) {
        this.unusualStatus = unusualStatus;
    }
    /**		
	 * 异常状态明细接口返回的具体内容记录，可能是↑↓或者其他标志		
     */
    public String getUnusualStatusDetail() {
        return unusualStatusDetail;
    }

    /**		
	 * 异常状态明细接口返回的具体内容记录，可能是↑↓或者其他标志		
     */
    public void setUnusualStatusDetail(String unusualStatusDetail) {
        this.unusualStatusDetail = unusualStatusDetail;
    }
    /**		
	 * 参考标准		
     */
    public String getReference() {
        return reference;
    }

    /**		
	 * 参考标准		
     */
    public void setReference(String reference) {
        this.reference = reference;
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
        return "AssessLabResult{" +
            "lrId=" + lrId +
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
            ", reportDate=" + reportDate +
            ", reportNo=" + reportNo +
            ", reportSubNo=" + reportSubNo +
            ", itemClassCode=" + itemClassCode +
            ", itemClassName=" + itemClassName +
            ", itemCode=" + itemCode +
            ", itemEngCode=" + itemEngCode +
            ", itemName=" + itemName +
            ", sampleName=" + sampleName +
            ", result=" + result +
            ", unit=" + unit +
            ", unusualStatus=" + unusualStatus +
            ", unusualStatusDetail=" + unusualStatusDetail +
            ", reference=" + reference +
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
