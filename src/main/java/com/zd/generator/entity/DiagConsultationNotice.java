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
 * 会诊通知
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("diag_consultation_notice")
@ApiModel(value = "DiagConsultationNotice对象", description = "会诊通知")
public class DiagConsultationNotice extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dcn_id", type = IdType.AUTO)
    private Long dcnId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("检查日期")
    private LocalDateTime consultationDate;

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

    @ApiModelProperty("性别 男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("通知类型,暂定筛查简写，比如bca,nrs等")
    private String noticeType;

    @ApiModelProperty("通知级别,高风险，中风险等。")
    private String noticeLevel;

    @ApiModelProperty("通知内容")
    private String noticeContent;

    @ApiModelProperty("浏览过,1-浏览过 0或者空-没有浏览")
    private String isBrowsed;

    @ApiModelProperty("浏览者编码")
    private String browerUserNo;

    @ApiModelProperty("浏览者姓名")
    private String browerUserName;

    @ApiModelProperty("浏览时间,只保留第一次被浏览")
    private LocalDateTime browerTime;

    @ApiModelProperty("会诊过,1-会诊过 0或者空-没有会诊")
    private String isConsulted;

    @ApiModelProperty("会诊者编码")
    private String consultUserNo;

    @ApiModelProperty("会诊者姓名")
    private String consultUserName;

    @ApiModelProperty("会诊时间,只保留第一次会诊记录")
    private LocalDateTime consultTime;

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
    public Long getDcnId() {
        return dcnId;
    }

    /**		
	 * 		
     */
    public void setDcnId(Long dcnId) {
        this.dcnId = dcnId;
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
	 * 通知类型,暂定筛查简写，比如bca,nrs等		
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**		
	 * 通知类型,暂定筛查简写，比如bca,nrs等		
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }
    /**		
	 * 通知级别,高风险，中风险等。		
     */
    public String getNoticeLevel() {
        return noticeLevel;
    }

    /**		
	 * 通知级别,高风险，中风险等。		
     */
    public void setNoticeLevel(String noticeLevel) {
        this.noticeLevel = noticeLevel;
    }
    /**		
	 * 通知内容		
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**		
	 * 通知内容		
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    /**		
	 * 浏览过,1-浏览过 0或者空-没有浏览		
     */
    public String getIsBrowsed() {
        return isBrowsed;
    }

    /**		
	 * 浏览过,1-浏览过 0或者空-没有浏览		
     */
    public void setIsBrowsed(String isBrowsed) {
        this.isBrowsed = isBrowsed;
    }
    /**		
	 * 浏览者编码		
     */
    public String getBrowerUserNo() {
        return browerUserNo;
    }

    /**		
	 * 浏览者编码		
     */
    public void setBrowerUserNo(String browerUserNo) {
        this.browerUserNo = browerUserNo;
    }
    /**		
	 * 浏览者姓名		
     */
    public String getBrowerUserName() {
        return browerUserName;
    }

    /**		
	 * 浏览者姓名		
     */
    public void setBrowerUserName(String browerUserName) {
        this.browerUserName = browerUserName;
    }
    /**		
	 * 浏览时间,只保留第一次被浏览		
     */
    public LocalDateTime getBrowerTime() {
        return browerTime;
    }

    /**		
	 * 浏览时间,只保留第一次被浏览		
     */
    public void setBrowerTime(LocalDateTime browerTime) {
        this.browerTime = browerTime;
    }
    /**		
	 * 会诊过,1-会诊过 0或者空-没有会诊		
     */
    public String getIsConsulted() {
        return isConsulted;
    }

    /**		
	 * 会诊过,1-会诊过 0或者空-没有会诊		
     */
    public void setIsConsulted(String isConsulted) {
        this.isConsulted = isConsulted;
    }
    /**		
	 * 会诊者编码		
     */
    public String getConsultUserNo() {
        return consultUserNo;
    }

    /**		
	 * 会诊者编码		
     */
    public void setConsultUserNo(String consultUserNo) {
        this.consultUserNo = consultUserNo;
    }
    /**		
	 * 会诊者姓名		
     */
    public String getConsultUserName() {
        return consultUserName;
    }

    /**		
	 * 会诊者姓名		
     */
    public void setConsultUserName(String consultUserName) {
        this.consultUserName = consultUserName;
    }
    /**		
	 * 会诊时间,只保留第一次会诊记录		
     */
    public LocalDateTime getConsultTime() {
        return consultTime;
    }

    /**		
	 * 会诊时间,只保留第一次会诊记录		
     */
    public void setConsultTime(LocalDateTime consultTime) {
        this.consultTime = consultTime;
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
        return "DiagConsultationNotice{" +
            "dcnId=" + dcnId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
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
            ", noticeType=" + noticeType +
            ", noticeLevel=" + noticeLevel +
            ", noticeContent=" + noticeContent +
            ", isBrowsed=" + isBrowsed +
            ", browerUserNo=" + browerUserNo +
            ", browerUserName=" + browerUserName +
            ", browerTime=" + browerTime +
            ", isConsulted=" + isConsulted +
            ", consultUserNo=" + consultUserNo +
            ", consultUserName=" + consultUserName +
            ", consultTime=" + consultTime +
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
