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
 * 治疗计划
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("diag_treatment_project")
@ApiModel(value = "DiagTreatmentProject对象", description = "治疗计划")
public class DiagTreatmentProject extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tp_id", type = IdType.AUTO)
    private Long tpId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("治疗日期")
    private LocalDateTime treatmentDate;

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

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("营养治疗原则")
    private String treatmentPrinciples;

    @ApiModelProperty("营养支持指征,显示复选框文本，多选的用英文逗号分隔")
    private String supportIndication;

    @ApiModelProperty("其他指征")
    private String otherIndication;

    @ApiModelProperty("禁食内容")
    private String fastContent;

    @ApiModelProperty("支持方式,支持多选，显示按钮文本内容，多选用英文逗号分隔")
    private String supportMethod;

    @ApiModelProperty("肠内营养途径,支持多选")
    private String enWay;

    @ApiModelProperty("肠内其他")
    private String enOther;

    @ApiModelProperty("肠内营养")
    private String enNutrition;

    @ApiModelProperty("肠外营养途径,支持多选")
    private String pnWay;

    @ApiModelProperty("肠外其他")
    private String pnOther;

    @ApiModelProperty("肠外营养")
    private String pnNutrition;

    @ApiModelProperty("膳食营养,下拉框单选，内容见字典dietorder")
    private String dietNutrition;

    @ApiModelProperty("膳食营养其他")
    private String dietOther;

    @ApiModelProperty("监测重点")
    private String monitorItems;

    @ApiModelProperty("其他")
    private String other;

    @ApiModelProperty("备注")
    private String remark;

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
    public Long getTpId() {
        return tpId;
    }

    /**		
	 * 		
     */
    public void setTpId(Long tpId) {
        this.tpId = tpId;
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
	 * 治疗日期		
     */
    public LocalDateTime getTreatmentDate() {
        return treatmentDate;
    }

    /**		
	 * 治疗日期		
     */
    public void setTreatmentDate(LocalDateTime treatmentDate) {
        this.treatmentDate = treatmentDate;
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
	 * 营养治疗原则		
     */
    public String getTreatmentPrinciples() {
        return treatmentPrinciples;
    }

    /**		
	 * 营养治疗原则		
     */
    public void setTreatmentPrinciples(String treatmentPrinciples) {
        this.treatmentPrinciples = treatmentPrinciples;
    }
    /**		
	 * 营养支持指征,显示复选框文本，多选的用英文逗号分隔		
     */
    public String getSupportIndication() {
        return supportIndication;
    }

    /**		
	 * 营养支持指征,显示复选框文本，多选的用英文逗号分隔		
     */
    public void setSupportIndication(String supportIndication) {
        this.supportIndication = supportIndication;
    }
    /**		
	 * 其他指征		
     */
    public String getOtherIndication() {
        return otherIndication;
    }

    /**		
	 * 其他指征		
     */
    public void setOtherIndication(String otherIndication) {
        this.otherIndication = otherIndication;
    }
    /**		
	 * 禁食内容		
     */
    public String getFastContent() {
        return fastContent;
    }

    /**		
	 * 禁食内容		
     */
    public void setFastContent(String fastContent) {
        this.fastContent = fastContent;
    }
    /**		
	 * 支持方式,支持多选，显示按钮文本内容，多选用英文逗号分隔		
     */
    public String getSupportMethod() {
        return supportMethod;
    }

    /**		
	 * 支持方式,支持多选，显示按钮文本内容，多选用英文逗号分隔		
     */
    public void setSupportMethod(String supportMethod) {
        this.supportMethod = supportMethod;
    }
    /**		
	 * 肠内营养途径,支持多选		
     */
    public String getEnWay() {
        return enWay;
    }

    /**		
	 * 肠内营养途径,支持多选		
     */
    public void setEnWay(String enWay) {
        this.enWay = enWay;
    }
    /**		
	 * 肠内其他		
     */
    public String getEnOther() {
        return enOther;
    }

    /**		
	 * 肠内其他		
     */
    public void setEnOther(String enOther) {
        this.enOther = enOther;
    }
    /**		
	 * 肠内营养		
     */
    public String getEnNutrition() {
        return enNutrition;
    }

    /**		
	 * 肠内营养		
     */
    public void setEnNutrition(String enNutrition) {
        this.enNutrition = enNutrition;
    }
    /**		
	 * 肠外营养途径,支持多选		
     */
    public String getPnWay() {
        return pnWay;
    }

    /**		
	 * 肠外营养途径,支持多选		
     */
    public void setPnWay(String pnWay) {
        this.pnWay = pnWay;
    }
    /**		
	 * 肠外其他		
     */
    public String getPnOther() {
        return pnOther;
    }

    /**		
	 * 肠外其他		
     */
    public void setPnOther(String pnOther) {
        this.pnOther = pnOther;
    }
    /**		
	 * 肠外营养		
     */
    public String getPnNutrition() {
        return pnNutrition;
    }

    /**		
	 * 肠外营养		
     */
    public void setPnNutrition(String pnNutrition) {
        this.pnNutrition = pnNutrition;
    }
    /**		
	 * 膳食营养,下拉框单选，内容见字典dietorder		
     */
    public String getDietNutrition() {
        return dietNutrition;
    }

    /**		
	 * 膳食营养,下拉框单选，内容见字典dietorder		
     */
    public void setDietNutrition(String dietNutrition) {
        this.dietNutrition = dietNutrition;
    }
    /**		
	 * 膳食营养其他		
     */
    public String getDietOther() {
        return dietOther;
    }

    /**		
	 * 膳食营养其他		
     */
    public void setDietOther(String dietOther) {
        this.dietOther = dietOther;
    }
    /**		
	 * 监测重点		
     */
    public String getMonitorItems() {
        return monitorItems;
    }

    /**		
	 * 监测重点		
     */
    public void setMonitorItems(String monitorItems) {
        this.monitorItems = monitorItems;
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
        return "DiagTreatmentProject{" +
            "tpId=" + tpId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", treatmentDate=" + treatmentDate +
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
            ", treatmentPrinciples=" + treatmentPrinciples +
            ", supportIndication=" + supportIndication +
            ", otherIndication=" + otherIndication +
            ", fastContent=" + fastContent +
            ", supportMethod=" + supportMethod +
            ", enWay=" + enWay +
            ", enOther=" + enOther +
            ", enNutrition=" + enNutrition +
            ", pnWay=" + pnWay +
            ", pnOther=" + pnOther +
            ", pnNutrition=" + pnNutrition +
            ", dietNutrition=" + dietNutrition +
            ", dietOther=" + dietOther +
            ", monitorItems=" + monitorItems +
            ", other=" + other +
            ", remark=" + remark +
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
