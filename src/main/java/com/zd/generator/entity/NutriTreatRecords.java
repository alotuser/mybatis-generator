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
 * 营养治疗病历表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("nutri_treat_records")
@ApiModel(value = "NutriTreatRecords对象", description = "营养治疗病历表")
public class NutriTreatRecords extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ntr_id", type = IdType.AUTO)
    private Long ntrId;

    @ApiModelProperty("唯一主键")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

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

    @ApiModelProperty("标准体重")
    private BigDecimal standardWeight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("入院日期")
    private String admissionDate;

    @ApiModelProperty("出院日期")
    private String dischargeDate;

    @ApiModelProperty("入icu日期")
    private String intoIcuDate;

    @ApiModelProperty("出icu日期")
    private String outIcuDate;

    @ApiModelProperty("开始营养治疗日期")
    private String startNutriTreatDate;

    @ApiModelProperty("结束营养治疗日期")
    private String endNutriTreatDate;

    @ApiModelProperty("入院诊断")
    private String diagnosisRecord;

    @ApiModelProperty("主要治疗措施")
    private String treatmentProcess;

    @ApiModelProperty("手术/并发症（吻合口瘘、胆瘘、肠瘘、其他）")
    private String surgeryComplications;

    @ApiModelProperty("入院营养状况和营养不良诊断（按国际疾病分类编码系统，icd-10)(0正常；1营养风险 2营养不良  多个以|分割)	")
    private String nutriMalnutritionDiagnosis;

    @ApiModelProperty("1营养风险")
    private String nutriMalnutritionRisk;

    @ApiModelProperty("2营养不良")
    private String nutriMalnutritionBad;

    @ApiModelProperty("营养治疗方式/途径")
    private String nutriTreat;

    @ApiModelProperty("营养治疗并发症")
    private String nutriComplications;

    @ApiModelProperty("出院诊断")
    private String dischargeDiagnosis;

    @ApiModelProperty("出院营养状况和营养不良诊断  (0正常；1营养风险；2营养风险 多个以|分割)")
    private String nutriStatusDiagnosis;

    @ApiModelProperty("1营养风险")
    private String nutriStatusRisk1;

    @ApiModelProperty("2营养风险")
    private String nutriStatusRisk2;

    @ApiModelProperty("出院小结")
    private String dischargeSummary;

    @ApiModelProperty("出院营养干预建议")
    private String nutriRecommendations;

    private String recordDoctorCode;

    private String recordDoctorName;

    private String recordDoctorTime;

    private String superDoctorCode;

    private String superDoctorName;

    private String superDoctorTime;

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
    public Long getNtrId() {
        return ntrId;
    }

    /**		
	 * 		
     */
    public void setNtrId(Long ntrId) {
        this.ntrId = ntrId;
    }
    /**		
	 * 唯一主键		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 唯一主键		
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
	 * 标准体重		
     */
    public BigDecimal getStandardWeight() {
        return standardWeight;
    }

    /**		
	 * 标准体重		
     */
    public void setStandardWeight(BigDecimal standardWeight) {
        this.standardWeight = standardWeight;
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
	 * 入院日期		
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**		
	 * 入院日期		
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
    /**		
	 * 出院日期		
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**		
	 * 出院日期		
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    /**		
	 * 入icu日期		
     */
    public String getIntoIcuDate() {
        return intoIcuDate;
    }

    /**		
	 * 入icu日期		
     */
    public void setIntoIcuDate(String intoIcuDate) {
        this.intoIcuDate = intoIcuDate;
    }
    /**		
	 * 出icu日期		
     */
    public String getOutIcuDate() {
        return outIcuDate;
    }

    /**		
	 * 出icu日期		
     */
    public void setOutIcuDate(String outIcuDate) {
        this.outIcuDate = outIcuDate;
    }
    /**		
	 * 开始营养治疗日期		
     */
    public String getStartNutriTreatDate() {
        return startNutriTreatDate;
    }

    /**		
	 * 开始营养治疗日期		
     */
    public void setStartNutriTreatDate(String startNutriTreatDate) {
        this.startNutriTreatDate = startNutriTreatDate;
    }
    /**		
	 * 结束营养治疗日期		
     */
    public String getEndNutriTreatDate() {
        return endNutriTreatDate;
    }

    /**		
	 * 结束营养治疗日期		
     */
    public void setEndNutriTreatDate(String endNutriTreatDate) {
        this.endNutriTreatDate = endNutriTreatDate;
    }
    /**		
	 * 入院诊断		
     */
    public String getDiagnosisRecord() {
        return diagnosisRecord;
    }

    /**		
	 * 入院诊断		
     */
    public void setDiagnosisRecord(String diagnosisRecord) {
        this.diagnosisRecord = diagnosisRecord;
    }
    /**		
	 * 主要治疗措施		
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**		
	 * 主要治疗措施		
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }
    /**		
	 * 手术/并发症（吻合口瘘、胆瘘、肠瘘、其他）		
     */
    public String getSurgeryComplications() {
        return surgeryComplications;
    }

    /**		
	 * 手术/并发症（吻合口瘘、胆瘘、肠瘘、其他）		
     */
    public void setSurgeryComplications(String surgeryComplications) {
        this.surgeryComplications = surgeryComplications;
    }
    /**		
	 * 入院营养状况和营养不良诊断（按国际疾病分类编码系统，icd-10)(0正常；1营养风险 2营养不良  多个以|分割)			
     */
    public String getNutriMalnutritionDiagnosis() {
        return nutriMalnutritionDiagnosis;
    }

    /**		
	 * 入院营养状况和营养不良诊断（按国际疾病分类编码系统，icd-10)(0正常；1营养风险 2营养不良  多个以|分割)			
     */
    public void setNutriMalnutritionDiagnosis(String nutriMalnutritionDiagnosis) {
        this.nutriMalnutritionDiagnosis = nutriMalnutritionDiagnosis;
    }
    /**		
	 * 1营养风险		
     */
    public String getNutriMalnutritionRisk() {
        return nutriMalnutritionRisk;
    }

    /**		
	 * 1营养风险		
     */
    public void setNutriMalnutritionRisk(String nutriMalnutritionRisk) {
        this.nutriMalnutritionRisk = nutriMalnutritionRisk;
    }
    /**		
	 * 2营养不良		
     */
    public String getNutriMalnutritionBad() {
        return nutriMalnutritionBad;
    }

    /**		
	 * 2营养不良		
     */
    public void setNutriMalnutritionBad(String nutriMalnutritionBad) {
        this.nutriMalnutritionBad = nutriMalnutritionBad;
    }
    /**		
	 * 营养治疗方式/途径		
     */
    public String getNutriTreat() {
        return nutriTreat;
    }

    /**		
	 * 营养治疗方式/途径		
     */
    public void setNutriTreat(String nutriTreat) {
        this.nutriTreat = nutriTreat;
    }
    /**		
	 * 营养治疗并发症		
     */
    public String getNutriComplications() {
        return nutriComplications;
    }

    /**		
	 * 营养治疗并发症		
     */
    public void setNutriComplications(String nutriComplications) {
        this.nutriComplications = nutriComplications;
    }
    /**		
	 * 出院诊断		
     */
    public String getDischargeDiagnosis() {
        return dischargeDiagnosis;
    }

    /**		
	 * 出院诊断		
     */
    public void setDischargeDiagnosis(String dischargeDiagnosis) {
        this.dischargeDiagnosis = dischargeDiagnosis;
    }
    /**		
	 * 出院营养状况和营养不良诊断  (0正常；1营养风险；2营养风险 多个以|分割)		
     */
    public String getNutriStatusDiagnosis() {
        return nutriStatusDiagnosis;
    }

    /**		
	 * 出院营养状况和营养不良诊断  (0正常；1营养风险；2营养风险 多个以|分割)		
     */
    public void setNutriStatusDiagnosis(String nutriStatusDiagnosis) {
        this.nutriStatusDiagnosis = nutriStatusDiagnosis;
    }
    /**		
	 * 1营养风险		
     */
    public String getNutriStatusRisk1() {
        return nutriStatusRisk1;
    }

    /**		
	 * 1营养风险		
     */
    public void setNutriStatusRisk1(String nutriStatusRisk1) {
        this.nutriStatusRisk1 = nutriStatusRisk1;
    }
    /**		
	 * 2营养风险		
     */
    public String getNutriStatusRisk2() {
        return nutriStatusRisk2;
    }

    /**		
	 * 2营养风险		
     */
    public void setNutriStatusRisk2(String nutriStatusRisk2) {
        this.nutriStatusRisk2 = nutriStatusRisk2;
    }
    /**		
	 * 出院小结		
     */
    public String getDischargeSummary() {
        return dischargeSummary;
    }

    /**		
	 * 出院小结		
     */
    public void setDischargeSummary(String dischargeSummary) {
        this.dischargeSummary = dischargeSummary;
    }
    /**		
	 * 出院营养干预建议		
     */
    public String getNutriRecommendations() {
        return nutriRecommendations;
    }

    /**		
	 * 出院营养干预建议		
     */
    public void setNutriRecommendations(String nutriRecommendations) {
        this.nutriRecommendations = nutriRecommendations;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorCode() {
        return recordDoctorCode;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorCode(String recordDoctorCode) {
        this.recordDoctorCode = recordDoctorCode;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorName() {
        return recordDoctorName;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorName(String recordDoctorName) {
        this.recordDoctorName = recordDoctorName;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorTime() {
        return recordDoctorTime;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorTime(String recordDoctorTime) {
        this.recordDoctorTime = recordDoctorTime;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorCode() {
        return superDoctorCode;
    }

    /**		
	 * 		
     */
    public void setSuperDoctorCode(String superDoctorCode) {
        this.superDoctorCode = superDoctorCode;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorName() {
        return superDoctorName;
    }

    /**		
	 * 		
     */
    public void setSuperDoctorName(String superDoctorName) {
        this.superDoctorName = superDoctorName;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorTime() {
        return superDoctorTime;
    }

    /**		
	 * 		
     */
    public void setSuperDoctorTime(String superDoctorTime) {
        this.superDoctorTime = superDoctorTime;
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
        return "NutriTreatRecords{" +
            "ntrId=" + ntrId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
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
            ", standardWeight=" + standardWeight +
            ", bmi=" + bmi +
            ", admissionDate=" + admissionDate +
            ", dischargeDate=" + dischargeDate +
            ", intoIcuDate=" + intoIcuDate +
            ", outIcuDate=" + outIcuDate +
            ", startNutriTreatDate=" + startNutriTreatDate +
            ", endNutriTreatDate=" + endNutriTreatDate +
            ", diagnosisRecord=" + diagnosisRecord +
            ", treatmentProcess=" + treatmentProcess +
            ", surgeryComplications=" + surgeryComplications +
            ", nutriMalnutritionDiagnosis=" + nutriMalnutritionDiagnosis +
            ", nutriMalnutritionRisk=" + nutriMalnutritionRisk +
            ", nutriMalnutritionBad=" + nutriMalnutritionBad +
            ", nutriTreat=" + nutriTreat +
            ", nutriComplications=" + nutriComplications +
            ", dischargeDiagnosis=" + dischargeDiagnosis +
            ", nutriStatusDiagnosis=" + nutriStatusDiagnosis +
            ", nutriStatusRisk1=" + nutriStatusRisk1 +
            ", nutriStatusRisk2=" + nutriStatusRisk2 +
            ", dischargeSummary=" + dischargeSummary +
            ", nutriRecommendations=" + nutriRecommendations +
            ", recordDoctorCode=" + recordDoctorCode +
            ", recordDoctorName=" + recordDoctorName +
            ", recordDoctorTime=" + recordDoctorTime +
            ", superDoctorCode=" + superDoctorCode +
            ", superDoctorName=" + superDoctorName +
            ", superDoctorTime=" + superDoctorTime +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
