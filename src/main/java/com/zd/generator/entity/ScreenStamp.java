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
 *  STAMP筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_stamp")
@ApiModel(value = "ScreenStamp对象", description = " STAMP筛查")
public class ScreenStamp extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stamp_id", type = IdType.AUTO)
    private Long stampId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1")
    private Integer stampNo;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime stampDate;

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

    @ApiModelProperty("床号 可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别 男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("疾病诊断")
    private String diagnosis;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("评估时机 A-入院  T-转入  F-禁食禁水三天及以上  Po-大手术（开腔）后三天及以上  O-其它")
    private String stampAssessOpportunity;

    @ApiModelProperty("疾病风险")
    private Integer stampIll;

    @ApiModelProperty("疾病风险选项以;分割")
    private String stampIllVal;

    @ApiModelProperty("营养摄入")
    private Integer stampNutriIntake;

    @ApiModelProperty("生长状况")
    private Integer stampGrowStatus;

    @ApiModelProperty("总分")
    private Integer stampScore;

    @ApiModelProperty("评价")
    private String stampResult;

    @ApiModelProperty("是否有营养不良风险 0否 1是")
    private String stampVal;

    private Integer stampValue;

    private Integer stampDay;

    @ApiModelProperty("数据来源：0-系统内；1-页面嵌套")
    private String dataSource;

    @ApiModelProperty("操作者科室编码")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称")
    private String opeDeptName;

    @ApiModelProperty("操作者编码")
    private String userNo;

    @ApiModelProperty("操作者姓名")
    private String userName;

    @ApiModelProperty("复核者编码")
    private String recheckerCode;

    @ApiModelProperty("复核者姓名")
    private String recheckerName;

    @ApiModelProperty("是否会诊")
    private String isConsultation;

    @ApiModelProperty("是否发送通知")
    private String isSendNotice;

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

    @ApiModelProperty("更新人名称			                                                               ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getStampId() {
        return stampId;
    }

    /**		
	 * 		
     */
    public void setStampId(Long stampId) {
        this.stampId = stampId;
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
	 * 筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public Integer getStampNo() {
        return stampNo;
    }

    /**		
	 * 筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public void setStampNo(Integer stampNo) {
        this.stampNo = stampNo;
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
	 * 筛查日期		
     */
    public LocalDateTime getStampDate() {
        return stampDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setStampDate(LocalDateTime stampDate) {
        this.stampDate = stampDate;
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
	 * 床号 可能有+等字符		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号 可能有+等字符		
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
	 * 性别 男，女		
     */
    public String getSex() {
        return sex;
    }

    /**		
	 * 性别 男，女		
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
	 * 疾病诊断		
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**		
	 * 疾病诊断		
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
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
	 * 评估时机 A-入院  T-转入  F-禁食禁水三天及以上  Po-大手术（开腔）后三天及以上  O-其它		
     */
    public String getStampAssessOpportunity() {
        return stampAssessOpportunity;
    }

    /**		
	 * 评估时机 A-入院  T-转入  F-禁食禁水三天及以上  Po-大手术（开腔）后三天及以上  O-其它		
     */
    public void setStampAssessOpportunity(String stampAssessOpportunity) {
        this.stampAssessOpportunity = stampAssessOpportunity;
    }
    /**		
	 * 疾病风险		
     */
    public Integer getStampIll() {
        return stampIll;
    }

    /**		
	 * 疾病风险		
     */
    public void setStampIll(Integer stampIll) {
        this.stampIll = stampIll;
    }
    /**		
	 * 疾病风险选项以;分割		
     */
    public String getStampIllVal() {
        return stampIllVal;
    }

    /**		
	 * 疾病风险选项以;分割		
     */
    public void setStampIllVal(String stampIllVal) {
        this.stampIllVal = stampIllVal;
    }
    /**		
	 * 营养摄入		
     */
    public Integer getStampNutriIntake() {
        return stampNutriIntake;
    }

    /**		
	 * 营养摄入		
     */
    public void setStampNutriIntake(Integer stampNutriIntake) {
        this.stampNutriIntake = stampNutriIntake;
    }
    /**		
	 * 生长状况		
     */
    public Integer getStampGrowStatus() {
        return stampGrowStatus;
    }

    /**		
	 * 生长状况		
     */
    public void setStampGrowStatus(Integer stampGrowStatus) {
        this.stampGrowStatus = stampGrowStatus;
    }
    /**		
	 * 总分		
     */
    public Integer getStampScore() {
        return stampScore;
    }

    /**		
	 * 总分		
     */
    public void setStampScore(Integer stampScore) {
        this.stampScore = stampScore;
    }
    /**		
	 * 评价		
     */
    public String getStampResult() {
        return stampResult;
    }

    /**		
	 * 评价		
     */
    public void setStampResult(String stampResult) {
        this.stampResult = stampResult;
    }
    /**		
	 * 是否有营养不良风险 0否 1是		
     */
    public String getStampVal() {
        return stampVal;
    }

    /**		
	 * 是否有营养不良风险 0否 1是		
     */
    public void setStampVal(String stampVal) {
        this.stampVal = stampVal;
    }
    /**		
	 * 		
     */
    public Integer getStampValue() {
        return stampValue;
    }

    /**		
	 * 		
     */
    public void setStampValue(Integer stampValue) {
        this.stampValue = stampValue;
    }
    /**		
	 * 		
     */
    public Integer getStampDay() {
        return stampDay;
    }

    /**		
	 * 		
     */
    public void setStampDay(Integer stampDay) {
        this.stampDay = stampDay;
    }
    /**		
	 * 数据来源：0-系统内；1-页面嵌套		
     */
    public String getDataSource() {
        return dataSource;
    }

    /**		
	 * 数据来源：0-系统内；1-页面嵌套		
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
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
	 * 复核者编码		
     */
    public String getRecheckerCode() {
        return recheckerCode;
    }

    /**		
	 * 复核者编码		
     */
    public void setRecheckerCode(String recheckerCode) {
        this.recheckerCode = recheckerCode;
    }
    /**		
	 * 复核者姓名		
     */
    public String getRecheckerName() {
        return recheckerName;
    }

    /**		
	 * 复核者姓名		
     */
    public void setRecheckerName(String recheckerName) {
        this.recheckerName = recheckerName;
    }
    /**		
	 * 是否会诊		
     */
    public String getIsConsultation() {
        return isConsultation;
    }

    /**		
	 * 是否会诊		
     */
    public void setIsConsultation(String isConsultation) {
        this.isConsultation = isConsultation;
    }
    /**		
	 * 是否发送通知		
     */
    public String getIsSendNotice() {
        return isSendNotice;
    }

    /**		
	 * 是否发送通知		
     */
    public void setIsSendNotice(String isSendNotice) {
        this.isSendNotice = isSendNotice;
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
        return "ScreenStamp{" +
            "stampId=" + stampId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", stampNo=" + stampNo +
            ", inpNo=" + inpNo +
            ", stampDate=" + stampDate +
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
            ", diagnosis=" + diagnosis +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", stampAssessOpportunity=" + stampAssessOpportunity +
            ", stampIll=" + stampIll +
            ", stampIllVal=" + stampIllVal +
            ", stampNutriIntake=" + stampNutriIntake +
            ", stampGrowStatus=" + stampGrowStatus +
            ", stampScore=" + stampScore +
            ", stampResult=" + stampResult +
            ", stampVal=" + stampVal +
            ", stampValue=" + stampValue +
            ", stampDay=" + stampDay +
            ", dataSource=" + dataSource +
            ", opeDeptCode=" + opeDeptCode +
            ", opeDeptName=" + opeDeptName +
            ", userNo=" + userNo +
            ", userName=" + userName +
            ", recheckerCode=" + recheckerCode +
            ", recheckerName=" + recheckerName +
            ", isConsultation=" + isConsultation +
            ", isSendNotice=" + isSendNotice +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
