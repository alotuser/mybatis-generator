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
 * STRONGkids
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_strongkids")
@ApiModel(value = "ScreenStrongkids对象", description = "STRONGkids")
public class ScreenStrongkids extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "strongkids_id", type = IdType.AUTO)
    private Long strongkidsId;

    @ApiModelProperty("唯一主键")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("筛查序号")
    private Integer strongkidsNo;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime strongkidsDate;

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

    @ApiModelProperty("床号")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("临床评价得分")
    private Integer clinicalAssess;

    @ApiModelProperty("高风险疾病得分")
    private Integer highRiskIll;

    @ApiModelProperty("json疾病名称")
    private String illList;

    @ApiModelProperty("其它疾病")
    private String illOther;

    @ApiModelProperty("营养的摄取与丢失得分")
    private Integer nutriIntakeLoss;

    @ApiModelProperty("体重减轻/体重增长过缓得分")
    private Integer weightLoss;

    @ApiModelProperty("总分")
    private Integer strongkidsScore;

    @ApiModelProperty("评价")
    private String strongkidsResult;

    private Integer strongkidsValue;

    private Integer strongkidsDay;

    @ApiModelProperty("来源")
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

    @ApiModelProperty("更新人名称")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getStrongkidsId() {
        return strongkidsId;
    }

    /**		
	 * 		
     */
    public void setStrongkidsId(Long strongkidsId) {
        this.strongkidsId = strongkidsId;
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
	 * 筛查序号		
     */
    public Integer getStrongkidsNo() {
        return strongkidsNo;
    }

    /**		
	 * 筛查序号		
     */
    public void setStrongkidsNo(Integer strongkidsNo) {
        this.strongkidsNo = strongkidsNo;
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
    public LocalDateTime getStrongkidsDate() {
        return strongkidsDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setStrongkidsDate(LocalDateTime strongkidsDate) {
        this.strongkidsDate = strongkidsDate;
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
	 * 床号		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号		
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
	 * 性别		
     */
    public String getSex() {
        return sex;
    }

    /**		
	 * 性别		
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
	 * 临床评价得分		
     */
    public Integer getClinicalAssess() {
        return clinicalAssess;
    }

    /**		
	 * 临床评价得分		
     */
    public void setClinicalAssess(Integer clinicalAssess) {
        this.clinicalAssess = clinicalAssess;
    }
    /**		
	 * 高风险疾病得分		
     */
    public Integer getHighRiskIll() {
        return highRiskIll;
    }

    /**		
	 * 高风险疾病得分		
     */
    public void setHighRiskIll(Integer highRiskIll) {
        this.highRiskIll = highRiskIll;
    }
    /**		
	 * json疾病名称		
     */
    public String getIllList() {
        return illList;
    }

    /**		
	 * json疾病名称		
     */
    public void setIllList(String illList) {
        this.illList = illList;
    }
    /**		
	 * 其它疾病		
     */
    public String getIllOther() {
        return illOther;
    }

    /**		
	 * 其它疾病		
     */
    public void setIllOther(String illOther) {
        this.illOther = illOther;
    }
    /**		
	 * 营养的摄取与丢失得分		
     */
    public Integer getNutriIntakeLoss() {
        return nutriIntakeLoss;
    }

    /**		
	 * 营养的摄取与丢失得分		
     */
    public void setNutriIntakeLoss(Integer nutriIntakeLoss) {
        this.nutriIntakeLoss = nutriIntakeLoss;
    }
    /**		
	 * 体重减轻/体重增长过缓得分		
     */
    public Integer getWeightLoss() {
        return weightLoss;
    }

    /**		
	 * 体重减轻/体重增长过缓得分		
     */
    public void setWeightLoss(Integer weightLoss) {
        this.weightLoss = weightLoss;
    }
    /**		
	 * 总分		
     */
    public Integer getStrongkidsScore() {
        return strongkidsScore;
    }

    /**		
	 * 总分		
     */
    public void setStrongkidsScore(Integer strongkidsScore) {
        this.strongkidsScore = strongkidsScore;
    }
    /**		
	 * 评价		
     */
    public String getStrongkidsResult() {
        return strongkidsResult;
    }

    /**		
	 * 评价		
     */
    public void setStrongkidsResult(String strongkidsResult) {
        this.strongkidsResult = strongkidsResult;
    }
    /**		
	 * 		
     */
    public Integer getStrongkidsValue() {
        return strongkidsValue;
    }

    /**		
	 * 		
     */
    public void setStrongkidsValue(Integer strongkidsValue) {
        this.strongkidsValue = strongkidsValue;
    }
    /**		
	 * 		
     */
    public Integer getStrongkidsDay() {
        return strongkidsDay;
    }

    /**		
	 * 		
     */
    public void setStrongkidsDay(Integer strongkidsDay) {
        this.strongkidsDay = strongkidsDay;
    }
    /**		
	 * 来源		
     */
    public String getDataSource() {
        return dataSource;
    }

    /**		
	 * 来源		
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
        return "ScreenStrongkids{" +
            "strongkidsId=" + strongkidsId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", strongkidsNo=" + strongkidsNo +
            ", inpNo=" + inpNo +
            ", strongkidsDate=" + strongkidsDate +
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
            ", clinicalAssess=" + clinicalAssess +
            ", highRiskIll=" + highRiskIll +
            ", illList=" + illList +
            ", illOther=" + illOther +
            ", nutriIntakeLoss=" + nutriIntakeLoss +
            ", weightLoss=" + weightLoss +
            ", strongkidsScore=" + strongkidsScore +
            ", strongkidsResult=" + strongkidsResult +
            ", strongkidsValue=" + strongkidsValue +
            ", strongkidsDay=" + strongkidsDay +
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
