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
 * SGA筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_sga")
@ApiModel(value = "ScreenSga对象", description = "SGA筛查")
public class ScreenSga extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sga_id", type = IdType.AUTO)
    private Long sgaId;

    @ApiModelProperty("唯一主键 ")
    private String patientId;

    @ApiModelProperty("入院次数 ")
    private String visitId;

    @ApiModelProperty("筛查序号 ")
    private Integer sgaNo;

    @ApiModelProperty("筛查日期 ")
    private LocalDateTime sgaDate;

    @ApiModelProperty("机构编码 ")
    private String orgCode;

    @ApiModelProperty("机构名称 ")
    private String orgName;

    @ApiModelProperty("科别编码 ")
    private String deptCode;

    @ApiModelProperty("科别名字 ")
    private String deptName;

    @ApiModelProperty("病区/房号")
    private String wardCode;

    @ApiModelProperty("病区名字 ")
    private String wardName;

    @ApiModelProperty("床号  ")
    private String bedNo;

    @ApiModelProperty("姓名  ")
    private String name;

    @ApiModelProperty("性别  ")
    private String sex;

    @ApiModelProperty("年龄  ")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("6个月前的体重变化   ")
    private Integer sgaWeight1;

    @ApiModelProperty("近两周体重变化  ")
    private Integer sgaWeight2;

    @ApiModelProperty("进食量变化   ")
    private Integer sgaEat1;

    @ApiModelProperty("进食量持续时间  ")
    private Integer sgaEat2;

    @ApiModelProperty("胃肠道症状   ")
    private Integer sgaGastrointestinalTract;

    @ApiModelProperty("身体活动能力 ")
    private Integer sgaPhysicalActivity;

    @ApiModelProperty("代谢应激 ")
    private Integer sgaMetabolicStress;

    @ApiModelProperty("皮下脂肪1")
    private Integer sgaFat1;

    @ApiModelProperty("皮下脂肪2")
    private Integer sgaFat2;

    @ApiModelProperty("皮下脂肪3")
    private Integer sgaFat3;

    @ApiModelProperty("肌肉状况1")
    private Integer sgaMuscle1;

    @ApiModelProperty("肌肉状况2")
    private Integer sgaMuscle2;

    @ApiModelProperty("肌肉状况3")
    private Integer sgaMuscle3;

    @ApiModelProperty("肌肉状况4")
    private Integer sgaMuscle4;

    @ApiModelProperty("肌肉状况5")
    private Integer sgaMuscle5;

    @ApiModelProperty("肌肉状况6")
    private Integer sgaMuscle6;

    @ApiModelProperty("肌肉状况7")
    private Integer sgaMuscle7;

    @ApiModelProperty("肌肉状况8")
    private Integer sgaMuscle8;

    @ApiModelProperty("肌肉状况9")
    private Integer sgaMuscle9;

    @ApiModelProperty("水肿  ")
    private Integer sgaEdema;

    @ApiModelProperty("腹水  ")
    private Integer sgaAscites;

    @ApiModelProperty("总分  ")
    private Integer sgaScore;

    @ApiModelProperty("结果  ")
    private String sgaResult;

    @ApiModelProperty("是否复查")
    private Integer sgaValue;

    @ApiModelProperty("复查几天后")
    private Integer sgaDay;

    private String dataSource;

    @ApiModelProperty("操作者科室编码  ")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称  ")
    private String opeDeptName;

    @ApiModelProperty("操作者编码   ")
    private String userNo;

    @ApiModelProperty("操作者姓名   ")
    private String userName;

    @ApiModelProperty("复核者编码   ")
    private String recheckerCode;

    @ApiModelProperty("复核者姓名   ")
    private String recheckerName;

    @ApiModelProperty("是否会诊 ")
    private String isConsultation;

    @ApiModelProperty("是否发送通知 ")
    private String isSendNotice;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码   ")
    private String createUserCode;

    @ApiModelProperty("创建人名称   ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码   ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称   ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getSgaId() {
        return sgaId;
    }

    /**		
	 * 		
     */
    public void setSgaId(Long sgaId) {
        this.sgaId = sgaId;
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
    public Integer getSgaNo() {
        return sgaNo;
    }

    /**		
	 * 筛查序号 		
     */
    public void setSgaNo(Integer sgaNo) {
        this.sgaNo = sgaNo;
    }
    /**		
	 * 筛查日期 		
     */
    public LocalDateTime getSgaDate() {
        return sgaDate;
    }

    /**		
	 * 筛查日期 		
     */
    public void setSgaDate(LocalDateTime sgaDate) {
        this.sgaDate = sgaDate;
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
	 * 6个月前的体重变化   		
     */
    public Integer getSgaWeight1() {
        return sgaWeight1;
    }

    /**		
	 * 6个月前的体重变化   		
     */
    public void setSgaWeight1(Integer sgaWeight1) {
        this.sgaWeight1 = sgaWeight1;
    }
    /**		
	 * 近两周体重变化  		
     */
    public Integer getSgaWeight2() {
        return sgaWeight2;
    }

    /**		
	 * 近两周体重变化  		
     */
    public void setSgaWeight2(Integer sgaWeight2) {
        this.sgaWeight2 = sgaWeight2;
    }
    /**		
	 * 进食量变化   		
     */
    public Integer getSgaEat1() {
        return sgaEat1;
    }

    /**		
	 * 进食量变化   		
     */
    public void setSgaEat1(Integer sgaEat1) {
        this.sgaEat1 = sgaEat1;
    }
    /**		
	 * 进食量持续时间  		
     */
    public Integer getSgaEat2() {
        return sgaEat2;
    }

    /**		
	 * 进食量持续时间  		
     */
    public void setSgaEat2(Integer sgaEat2) {
        this.sgaEat2 = sgaEat2;
    }
    /**		
	 * 胃肠道症状   		
     */
    public Integer getSgaGastrointestinalTract() {
        return sgaGastrointestinalTract;
    }

    /**		
	 * 胃肠道症状   		
     */
    public void setSgaGastrointestinalTract(Integer sgaGastrointestinalTract) {
        this.sgaGastrointestinalTract = sgaGastrointestinalTract;
    }
    /**		
	 * 身体活动能力 		
     */
    public Integer getSgaPhysicalActivity() {
        return sgaPhysicalActivity;
    }

    /**		
	 * 身体活动能力 		
     */
    public void setSgaPhysicalActivity(Integer sgaPhysicalActivity) {
        this.sgaPhysicalActivity = sgaPhysicalActivity;
    }
    /**		
	 * 代谢应激 		
     */
    public Integer getSgaMetabolicStress() {
        return sgaMetabolicStress;
    }

    /**		
	 * 代谢应激 		
     */
    public void setSgaMetabolicStress(Integer sgaMetabolicStress) {
        this.sgaMetabolicStress = sgaMetabolicStress;
    }
    /**		
	 * 皮下脂肪1		
     */
    public Integer getSgaFat1() {
        return sgaFat1;
    }

    /**		
	 * 皮下脂肪1		
     */
    public void setSgaFat1(Integer sgaFat1) {
        this.sgaFat1 = sgaFat1;
    }
    /**		
	 * 皮下脂肪2		
     */
    public Integer getSgaFat2() {
        return sgaFat2;
    }

    /**		
	 * 皮下脂肪2		
     */
    public void setSgaFat2(Integer sgaFat2) {
        this.sgaFat2 = sgaFat2;
    }
    /**		
	 * 皮下脂肪3		
     */
    public Integer getSgaFat3() {
        return sgaFat3;
    }

    /**		
	 * 皮下脂肪3		
     */
    public void setSgaFat3(Integer sgaFat3) {
        this.sgaFat3 = sgaFat3;
    }
    /**		
	 * 肌肉状况1		
     */
    public Integer getSgaMuscle1() {
        return sgaMuscle1;
    }

    /**		
	 * 肌肉状况1		
     */
    public void setSgaMuscle1(Integer sgaMuscle1) {
        this.sgaMuscle1 = sgaMuscle1;
    }
    /**		
	 * 肌肉状况2		
     */
    public Integer getSgaMuscle2() {
        return sgaMuscle2;
    }

    /**		
	 * 肌肉状况2		
     */
    public void setSgaMuscle2(Integer sgaMuscle2) {
        this.sgaMuscle2 = sgaMuscle2;
    }
    /**		
	 * 肌肉状况3		
     */
    public Integer getSgaMuscle3() {
        return sgaMuscle3;
    }

    /**		
	 * 肌肉状况3		
     */
    public void setSgaMuscle3(Integer sgaMuscle3) {
        this.sgaMuscle3 = sgaMuscle3;
    }
    /**		
	 * 肌肉状况4		
     */
    public Integer getSgaMuscle4() {
        return sgaMuscle4;
    }

    /**		
	 * 肌肉状况4		
     */
    public void setSgaMuscle4(Integer sgaMuscle4) {
        this.sgaMuscle4 = sgaMuscle4;
    }
    /**		
	 * 肌肉状况5		
     */
    public Integer getSgaMuscle5() {
        return sgaMuscle5;
    }

    /**		
	 * 肌肉状况5		
     */
    public void setSgaMuscle5(Integer sgaMuscle5) {
        this.sgaMuscle5 = sgaMuscle5;
    }
    /**		
	 * 肌肉状况6		
     */
    public Integer getSgaMuscle6() {
        return sgaMuscle6;
    }

    /**		
	 * 肌肉状况6		
     */
    public void setSgaMuscle6(Integer sgaMuscle6) {
        this.sgaMuscle6 = sgaMuscle6;
    }
    /**		
	 * 肌肉状况7		
     */
    public Integer getSgaMuscle7() {
        return sgaMuscle7;
    }

    /**		
	 * 肌肉状况7		
     */
    public void setSgaMuscle7(Integer sgaMuscle7) {
        this.sgaMuscle7 = sgaMuscle7;
    }
    /**		
	 * 肌肉状况8		
     */
    public Integer getSgaMuscle8() {
        return sgaMuscle8;
    }

    /**		
	 * 肌肉状况8		
     */
    public void setSgaMuscle8(Integer sgaMuscle8) {
        this.sgaMuscle8 = sgaMuscle8;
    }
    /**		
	 * 肌肉状况9		
     */
    public Integer getSgaMuscle9() {
        return sgaMuscle9;
    }

    /**		
	 * 肌肉状况9		
     */
    public void setSgaMuscle9(Integer sgaMuscle9) {
        this.sgaMuscle9 = sgaMuscle9;
    }
    /**		
	 * 水肿  		
     */
    public Integer getSgaEdema() {
        return sgaEdema;
    }

    /**		
	 * 水肿  		
     */
    public void setSgaEdema(Integer sgaEdema) {
        this.sgaEdema = sgaEdema;
    }
    /**		
	 * 腹水  		
     */
    public Integer getSgaAscites() {
        return sgaAscites;
    }

    /**		
	 * 腹水  		
     */
    public void setSgaAscites(Integer sgaAscites) {
        this.sgaAscites = sgaAscites;
    }
    /**		
	 * 总分  		
     */
    public Integer getSgaScore() {
        return sgaScore;
    }

    /**		
	 * 总分  		
     */
    public void setSgaScore(Integer sgaScore) {
        this.sgaScore = sgaScore;
    }
    /**		
	 * 结果  		
     */
    public String getSgaResult() {
        return sgaResult;
    }

    /**		
	 * 结果  		
     */
    public void setSgaResult(String sgaResult) {
        this.sgaResult = sgaResult;
    }
    /**		
	 * 是否复查		
     */
    public Integer getSgaValue() {
        return sgaValue;
    }

    /**		
	 * 是否复查		
     */
    public void setSgaValue(Integer sgaValue) {
        this.sgaValue = sgaValue;
    }
    /**		
	 * 复查几天后		
     */
    public Integer getSgaDay() {
        return sgaDay;
    }

    /**		
	 * 复查几天后		
     */
    public void setSgaDay(Integer sgaDay) {
        this.sgaDay = sgaDay;
    }
    /**		
	 * 		
     */
    public String getDataSource() {
        return dataSource;
    }

    /**		
	 * 		
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
        return "ScreenSga{" +
            "sgaId=" + sgaId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", sgaNo=" + sgaNo +
            ", sgaDate=" + sgaDate +
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
            ", sgaWeight1=" + sgaWeight1 +
            ", sgaWeight2=" + sgaWeight2 +
            ", sgaEat1=" + sgaEat1 +
            ", sgaEat2=" + sgaEat2 +
            ", sgaGastrointestinalTract=" + sgaGastrointestinalTract +
            ", sgaPhysicalActivity=" + sgaPhysicalActivity +
            ", sgaMetabolicStress=" + sgaMetabolicStress +
            ", sgaFat1=" + sgaFat1 +
            ", sgaFat2=" + sgaFat2 +
            ", sgaFat3=" + sgaFat3 +
            ", sgaMuscle1=" + sgaMuscle1 +
            ", sgaMuscle2=" + sgaMuscle2 +
            ", sgaMuscle3=" + sgaMuscle3 +
            ", sgaMuscle4=" + sgaMuscle4 +
            ", sgaMuscle5=" + sgaMuscle5 +
            ", sgaMuscle6=" + sgaMuscle6 +
            ", sgaMuscle7=" + sgaMuscle7 +
            ", sgaMuscle8=" + sgaMuscle8 +
            ", sgaMuscle9=" + sgaMuscle9 +
            ", sgaEdema=" + sgaEdema +
            ", sgaAscites=" + sgaAscites +
            ", sgaScore=" + sgaScore +
            ", sgaResult=" + sgaResult +
            ", sgaValue=" + sgaValue +
            ", sgaDay=" + sgaDay +
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
