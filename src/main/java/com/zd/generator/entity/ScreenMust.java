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
 * MUST筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_must")
@ApiModel(value = "ScreenMust对象", description = "MUST筛查")
public class ScreenMust extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "must_id", type = IdType.AUTO)
    private Long mustId;

    @ApiModelProperty("唯一主键")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("筛查序号")
    private Integer mustNo;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime mustDate;

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

    @ApiModelProperty("床号可能有+等字符 ")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别 男，女 ")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("bmi得分")
    private Integer mustBmi;

    @ApiModelProperty("体重下降")
    private Integer mustWeightDesc;

    @ApiModelProperty("禁食")
    private Integer mustFasting;

    @ApiModelProperty("总分")
    private Integer mustScore;

    @ApiModelProperty("评价")
    private String mustResult;

    private Integer mustValue;

    private Integer mustDay;

    @ApiModelProperty("来源数据来源：0-系统内；1-页面嵌套")
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
    public Long getMustId() {
        return mustId;
    }

    /**		
	 * 		
     */
    public void setMustId(Long mustId) {
        this.mustId = mustId;
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
    public Integer getMustNo() {
        return mustNo;
    }

    /**		
	 * 筛查序号		
     */
    public void setMustNo(Integer mustNo) {
        this.mustNo = mustNo;
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
    public LocalDateTime getMustDate() {
        return mustDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setMustDate(LocalDateTime mustDate) {
        this.mustDate = mustDate;
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
	 * bmi得分		
     */
    public Integer getMustBmi() {
        return mustBmi;
    }

    /**		
	 * bmi得分		
     */
    public void setMustBmi(Integer mustBmi) {
        this.mustBmi = mustBmi;
    }
    /**		
	 * 体重下降		
     */
    public Integer getMustWeightDesc() {
        return mustWeightDesc;
    }

    /**		
	 * 体重下降		
     */
    public void setMustWeightDesc(Integer mustWeightDesc) {
        this.mustWeightDesc = mustWeightDesc;
    }
    /**		
	 * 禁食		
     */
    public Integer getMustFasting() {
        return mustFasting;
    }

    /**		
	 * 禁食		
     */
    public void setMustFasting(Integer mustFasting) {
        this.mustFasting = mustFasting;
    }
    /**		
	 * 总分		
     */
    public Integer getMustScore() {
        return mustScore;
    }

    /**		
	 * 总分		
     */
    public void setMustScore(Integer mustScore) {
        this.mustScore = mustScore;
    }
    /**		
	 * 评价		
     */
    public String getMustResult() {
        return mustResult;
    }

    /**		
	 * 评价		
     */
    public void setMustResult(String mustResult) {
        this.mustResult = mustResult;
    }
    /**		
	 * 		
     */
    public Integer getMustValue() {
        return mustValue;
    }

    /**		
	 * 		
     */
    public void setMustValue(Integer mustValue) {
        this.mustValue = mustValue;
    }
    /**		
	 * 		
     */
    public Integer getMustDay() {
        return mustDay;
    }

    /**		
	 * 		
     */
    public void setMustDay(Integer mustDay) {
        this.mustDay = mustDay;
    }
    /**		
	 * 来源数据来源：0-系统内；1-页面嵌套		
     */
    public String getDataSource() {
        return dataSource;
    }

    /**		
	 * 来源数据来源：0-系统内；1-页面嵌套		
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
        return "ScreenMust{" +
            "mustId=" + mustId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", mustNo=" + mustNo +
            ", inpNo=" + inpNo +
            ", mustDate=" + mustDate +
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
            ", mustBmi=" + mustBmi +
            ", mustWeightDesc=" + mustWeightDesc +
            ", mustFasting=" + mustFasting +
            ", mustScore=" + mustScore +
            ", mustResult=" + mustResult +
            ", mustValue=" + mustValue +
            ", mustDay=" + mustDay +
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
