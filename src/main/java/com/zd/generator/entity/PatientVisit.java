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
 * 病人住院记录表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("patient_visit")
@ApiModel(value = "PatientVisit对象", description = "病人住院记录表")
public class PatientVisit extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pvid", type = IdType.AUTO)
    private Long pvid;

    @ApiModelProperty("病人ID	PK	是	  ")
    private String patientId;

    @ApiModelProperty("入院次数病人每次住院，分配一个不同的标识，与病人标识一起，构成一个病人一次住院的唯一标识。可使用住院次数的绝对值或相对值(有些系统没有入院次数概念故设计为VARCHAR类型)")
    private String visitId;

    @ApiModelProperty("机构编码   ")
    private String orgCode;

    @ApiModelProperty("机构名称   ")
    private String orgName;

    @ApiModelProperty("科别编码   ")
    private String deptCode;

    @ApiModelProperty("科别名字			 ")
    private String deptName;

    @ApiModelProperty("病区/房号  ")
    private String wardCode;

    @ApiModelProperty("病区名字			 ")
    private String wardName;

    @ApiModelProperty("床号可能有+等字符 ")
    private String bedNo;

    @ApiModelProperty("年龄")
    private BigDecimal ageOfYear;

    @ApiModelProperty("月数儿童用 ")
    private BigDecimal ageOfMonth;

    @ApiModelProperty("年龄（天）儿童用  ")
    private BigDecimal ageOfDay;

    @ApiModelProperty("劳动强度默认10-卧床1-轻度体力劳动2-中度体力劳动3-重度体力劳动，")
    private String isLieBed;

    @ApiModelProperty("住院号 ")
    private String inpNo;

    @ApiModelProperty("入院日期   ")
    private LocalDateTime inHosDate;

    @ApiModelProperty("出院日期备用  ")
    private LocalDateTime outHosDate;

    @ApiModelProperty("饮食医嘱			 ")
    private String orderText;

    @ApiModelProperty("疾病编码")
    private String illCode;

    @ApiModelProperty("疾病名称")
    private String illName;

    @ApiModelProperty("BEE			  ")
    private BigDecimal bee;

    @ApiModelProperty("BMR			  ")
    private BigDecimal bmr;

    @ApiModelProperty("身高		  ")
    private BigDecimal height;

    @ApiModelProperty("体重		  ")
    private BigDecimal weight;

    @ApiModelProperty("BMI			  ")
    private BigDecimal bmi;

    @ApiModelProperty("BMI评估			  ")
    private String bmiAssess;

    @ApiModelProperty("标准体重			 ")
    private BigDecimal standardWeight;

    @ApiModelProperty("体重占理想体重比			")
    private String standardWeightPer;

    @ApiModelProperty("诊断记录json字符串存储；diag_date,diag_name,diag_detail ")
    private String diagnosisRecord;

    @ApiModelProperty("主诉			  ")
    private String mainSuit;

    @ApiModelProperty("现病史			  ")
    private String presentHistory;

    @ApiModelProperty("既往史		  ")
    private String previousHistory;

    @ApiModelProperty("家族史			  ")
    private String familyHistory;

    @ApiModelProperty("个人史			  ")
    private String personalHistory;

    @ApiModelProperty("备注			  ")
    private String remark;

    @ApiModelProperty("治疗过程			 ")
    private String treatmentProcess;

    @ApiModelProperty("手术记录json字符串存储；ope_date,ope_text,ope_doctor ")
    private String operationRecord;

    @ApiModelProperty("末次月经日期			 ")
    private LocalDateTime lmp;

    @ApiModelProperty("患者状态 1、孕妇   其他情况留空")
    private String patStatus;

    @ApiModelProperty("预产期			  ")
    private LocalDateTime edc;

    @ApiModelProperty("孕前体重			 ")
    private String progestationalWeight;

    @ApiModelProperty("孕周			  ")
    private String gestationalWeek;

    @ApiModelProperty("孕产期备用0- 不属于下面情况1孕前期2孕早期3孕中期4孕末期5 哺乳期")
    private String gestation;

    @ApiModelProperty("纠正年龄（周）")
    private String correctWeek;

    @ApiModelProperty("纠正年龄（日）")
    private String correctDay;

    @ApiModelProperty("创建时间   ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码 ")
    private String createUserCode;

    @ApiModelProperty("创建人名称 ")
    private String createUserName;

    @ApiModelProperty("更新时间   ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码 ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称 ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getPvid() {
        return pvid;
    }

    /**		
	 * 		
     */
    public void setPvid(Long pvid) {
        this.pvid = pvid;
    }
    /**		
	 * 病人ID	PK	是	  		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 病人ID	PK	是	  		
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 入院次数病人每次住院，分配一个不同的标识，与病人标识一起，构成一个病人一次住院的唯一标识。可使用住院次数的绝对值或相对值(有些系统没有入院次数概念故设计为VARCHAR类型)		
     */
    public String getVisitId() {
        return visitId;
    }

    /**		
	 * 入院次数病人每次住院，分配一个不同的标识，与病人标识一起，构成一个病人一次住院的唯一标识。可使用住院次数的绝对值或相对值(有些系统没有入院次数概念故设计为VARCHAR类型)		
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
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
	 * 年龄		
     */
    public BigDecimal getAgeOfYear() {
        return ageOfYear;
    }

    /**		
	 * 年龄		
     */
    public void setAgeOfYear(BigDecimal ageOfYear) {
        this.ageOfYear = ageOfYear;
    }
    /**		
	 * 月数儿童用 		
     */
    public BigDecimal getAgeOfMonth() {
        return ageOfMonth;
    }

    /**		
	 * 月数儿童用 		
     */
    public void setAgeOfMonth(BigDecimal ageOfMonth) {
        this.ageOfMonth = ageOfMonth;
    }
    /**		
	 * 年龄（天）儿童用  		
     */
    public BigDecimal getAgeOfDay() {
        return ageOfDay;
    }

    /**		
	 * 年龄（天）儿童用  		
     */
    public void setAgeOfDay(BigDecimal ageOfDay) {
        this.ageOfDay = ageOfDay;
    }
    /**		
	 * 劳动强度默认10-卧床1-轻度体力劳动2-中度体力劳动3-重度体力劳动，		
     */
    public String getIsLieBed() {
        return isLieBed;
    }

    /**		
	 * 劳动强度默认10-卧床1-轻度体力劳动2-中度体力劳动3-重度体力劳动，		
     */
    public void setIsLieBed(String isLieBed) {
        this.isLieBed = isLieBed;
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
	 * 入院日期   		
     */
    public LocalDateTime getInHosDate() {
        return inHosDate;
    }

    /**		
	 * 入院日期   		
     */
    public void setInHosDate(LocalDateTime inHosDate) {
        this.inHosDate = inHosDate;
    }
    /**		
	 * 出院日期备用  		
     */
    public LocalDateTime getOutHosDate() {
        return outHosDate;
    }

    /**		
	 * 出院日期备用  		
     */
    public void setOutHosDate(LocalDateTime outHosDate) {
        this.outHosDate = outHosDate;
    }
    /**		
	 * 饮食医嘱			 		
     */
    public String getOrderText() {
        return orderText;
    }

    /**		
	 * 饮食医嘱			 		
     */
    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }
    /**		
	 * 疾病编码		
     */
    public String getIllCode() {
        return illCode;
    }

    /**		
	 * 疾病编码		
     */
    public void setIllCode(String illCode) {
        this.illCode = illCode;
    }
    /**		
	 * 疾病名称		
     */
    public String getIllName() {
        return illName;
    }

    /**		
	 * 疾病名称		
     */
    public void setIllName(String illName) {
        this.illName = illName;
    }
    /**		
	 * BEE			  		
     */
    public BigDecimal getBee() {
        return bee;
    }

    /**		
	 * BEE			  		
     */
    public void setBee(BigDecimal bee) {
        this.bee = bee;
    }
    /**		
	 * BMR			  		
     */
    public BigDecimal getBmr() {
        return bmr;
    }

    /**		
	 * BMR			  		
     */
    public void setBmr(BigDecimal bmr) {
        this.bmr = bmr;
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
	 * BMI			  		
     */
    public BigDecimal getBmi() {
        return bmi;
    }

    /**		
	 * BMI			  		
     */
    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }
    /**		
	 * BMI评估			  		
     */
    public String getBmiAssess() {
        return bmiAssess;
    }

    /**		
	 * BMI评估			  		
     */
    public void setBmiAssess(String bmiAssess) {
        this.bmiAssess = bmiAssess;
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
	 * 体重占理想体重比					
     */
    public String getStandardWeightPer() {
        return standardWeightPer;
    }

    /**		
	 * 体重占理想体重比					
     */
    public void setStandardWeightPer(String standardWeightPer) {
        this.standardWeightPer = standardWeightPer;
    }
    /**		
	 * 诊断记录json字符串存储；diag_date,diag_name,diag_detail 		
     */
    public String getDiagnosisRecord() {
        return diagnosisRecord;
    }

    /**		
	 * 诊断记录json字符串存储；diag_date,diag_name,diag_detail 		
     */
    public void setDiagnosisRecord(String diagnosisRecord) {
        this.diagnosisRecord = diagnosisRecord;
    }
    /**		
	 * 主诉			  		
     */
    public String getMainSuit() {
        return mainSuit;
    }

    /**		
	 * 主诉			  		
     */
    public void setMainSuit(String mainSuit) {
        this.mainSuit = mainSuit;
    }
    /**		
	 * 现病史			  		
     */
    public String getPresentHistory() {
        return presentHistory;
    }

    /**		
	 * 现病史			  		
     */
    public void setPresentHistory(String presentHistory) {
        this.presentHistory = presentHistory;
    }
    /**		
	 * 既往史		  		
     */
    public String getPreviousHistory() {
        return previousHistory;
    }

    /**		
	 * 既往史		  		
     */
    public void setPreviousHistory(String previousHistory) {
        this.previousHistory = previousHistory;
    }
    /**		
	 * 家族史			  		
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**		
	 * 家族史			  		
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }
    /**		
	 * 个人史			  		
     */
    public String getPersonalHistory() {
        return personalHistory;
    }

    /**		
	 * 个人史			  		
     */
    public void setPersonalHistory(String personalHistory) {
        this.personalHistory = personalHistory;
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
	 * 治疗过程			 		
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**		
	 * 治疗过程			 		
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }
    /**		
	 * 手术记录json字符串存储；ope_date,ope_text,ope_doctor 		
     */
    public String getOperationRecord() {
        return operationRecord;
    }

    /**		
	 * 手术记录json字符串存储；ope_date,ope_text,ope_doctor 		
     */
    public void setOperationRecord(String operationRecord) {
        this.operationRecord = operationRecord;
    }
    /**		
	 * 末次月经日期			 		
     */
    public LocalDateTime getLmp() {
        return lmp;
    }

    /**		
	 * 末次月经日期			 		
     */
    public void setLmp(LocalDateTime lmp) {
        this.lmp = lmp;
    }
    /**		
	 * 患者状态 1、孕妇   其他情况留空		
     */
    public String getPatStatus() {
        return patStatus;
    }

    /**		
	 * 患者状态 1、孕妇   其他情况留空		
     */
    public void setPatStatus(String patStatus) {
        this.patStatus = patStatus;
    }
    /**		
	 * 预产期			  		
     */
    public LocalDateTime getEdc() {
        return edc;
    }

    /**		
	 * 预产期			  		
     */
    public void setEdc(LocalDateTime edc) {
        this.edc = edc;
    }
    /**		
	 * 孕前体重			 		
     */
    public String getProgestationalWeight() {
        return progestationalWeight;
    }

    /**		
	 * 孕前体重			 		
     */
    public void setProgestationalWeight(String progestationalWeight) {
        this.progestationalWeight = progestationalWeight;
    }
    /**		
	 * 孕周			  		
     */
    public String getGestationalWeek() {
        return gestationalWeek;
    }

    /**		
	 * 孕周			  		
     */
    public void setGestationalWeek(String gestationalWeek) {
        this.gestationalWeek = gestationalWeek;
    }
    /**		
	 * 孕产期备用0- 不属于下面情况1孕前期2孕早期3孕中期4孕末期5 哺乳期		
     */
    public String getGestation() {
        return gestation;
    }

    /**		
	 * 孕产期备用0- 不属于下面情况1孕前期2孕早期3孕中期4孕末期5 哺乳期		
     */
    public void setGestation(String gestation) {
        this.gestation = gestation;
    }
    /**		
	 * 纠正年龄（周）		
     */
    public String getCorrectWeek() {
        return correctWeek;
    }

    /**		
	 * 纠正年龄（周）		
     */
    public void setCorrectWeek(String correctWeek) {
        this.correctWeek = correctWeek;
    }
    /**		
	 * 纠正年龄（日）		
     */
    public String getCorrectDay() {
        return correctDay;
    }

    /**		
	 * 纠正年龄（日）		
     */
    public void setCorrectDay(String correctDay) {
        this.correctDay = correctDay;
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
        return "PatientVisit{" +
            "pvid=" + pvid +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", orgCode=" + orgCode +
            ", orgName=" + orgName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", wardCode=" + wardCode +
            ", wardName=" + wardName +
            ", bedNo=" + bedNo +
            ", ageOfYear=" + ageOfYear +
            ", ageOfMonth=" + ageOfMonth +
            ", ageOfDay=" + ageOfDay +
            ", isLieBed=" + isLieBed +
            ", inpNo=" + inpNo +
            ", inHosDate=" + inHosDate +
            ", outHosDate=" + outHosDate +
            ", orderText=" + orderText +
            ", illCode=" + illCode +
            ", illName=" + illName +
            ", bee=" + bee +
            ", bmr=" + bmr +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", bmiAssess=" + bmiAssess +
            ", standardWeight=" + standardWeight +
            ", standardWeightPer=" + standardWeightPer +
            ", diagnosisRecord=" + diagnosisRecord +
            ", mainSuit=" + mainSuit +
            ", presentHistory=" + presentHistory +
            ", previousHistory=" + previousHistory +
            ", familyHistory=" + familyHistory +
            ", personalHistory=" + personalHistory +
            ", remark=" + remark +
            ", treatmentProcess=" + treatmentProcess +
            ", operationRecord=" + operationRecord +
            ", lmp=" + lmp +
            ", patStatus=" + patStatus +
            ", edc=" + edc +
            ", progestationalWeight=" + progestationalWeight +
            ", gestationalWeek=" + gestationalWeek +
            ", gestation=" + gestation +
            ", correctWeek=" + correctWeek +
            ", correctDay=" + correctDay +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
