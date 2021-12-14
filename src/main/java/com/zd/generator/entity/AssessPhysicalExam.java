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
 * 体格检查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_physical_exam")
@ApiModel(value = "AssessPhysicalExam对象", description = "体格检查")
public class AssessPhysicalExam extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK	是")
    @TableId(value = "phy_id", type = IdType.AUTO)
    private Long phyId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("检查日期")
    private LocalDateTime examDate;

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

    @ApiModelProperty("床号 可能有+等字符")
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

    @ApiModelProperty("BMI评估")
    private String bmiAssess;

    @ApiModelProperty("标准体重")
    private BigDecimal standardWeight;

    @ApiModelProperty("体重占理想体重比")
    private String standardWeightPer;

    @ApiModelProperty("BEE")
    private BigDecimal bee;

    @ApiModelProperty("BMR")
    private BigDecimal bmr;

    @ApiModelProperty("体脂百分比(计算)")
    private BigDecimal bodyFatPercentCalc;

    @ApiModelProperty("体脂百分比(实测)")
    private BigDecimal bodyFatPercent;

    @ApiModelProperty("平时体重(kg)")
    private BigDecimal usualWeight;

    @ApiModelProperty("近期体重状态名称,字典中weightstatus，这里保存字典名字")
    private String weightStatus;

    @ApiModelProperty("体重变动(kg)")
    private BigDecimal weightChange;

    @ApiModelProperty("体重变动百分比(%)")
    private BigDecimal weightChangePercent;

    @ApiModelProperty("体重变化周期(月周)")
    private String weightChangeCycleType;

    @ApiModelProperty("体重变化周期(月周)")
    private String weightChangeCycleVal;

    @ApiModelProperty("肩胛下皮褶厚度(mm)")
    private BigDecimal subscapularSkinfoldThick;

    @ApiModelProperty("髂脊上部皮褶厚度(mm)")
    private BigDecimal iliacCrestSkinfoldThick;

    @ApiModelProperty("腹部皮褶厚度(mm)")
    private BigDecimal abdominalSkinfoldThick;

    @ApiModelProperty("左手握力(kg)")
    private BigDecimal leftHandGripStrength;

    @ApiModelProperty("右手握力(kg)")
    private BigDecimal rightHandGripStrength;

    @ApiModelProperty("肱三头肌皮褶厚度(mm)")
    private BigDecimal tricepsSkinfoldThick;

    @ApiModelProperty("上臂围(cm)")
    private BigDecimal armCircumference;

    @ApiModelProperty("上臂肌围(cm)")
    private BigDecimal armMuscleCircumference;

    @ApiModelProperty("上臂肌区(cm2)")
    private BigDecimal armMuscleArea;

    @ApiModelProperty("腰围(cm)")
    private BigDecimal waistline;

    @ApiModelProperty("腰围(cm)")
    private BigDecimal hipline;

    @ApiModelProperty("小腿围")
    private BigDecimal calfline;

    @ApiModelProperty("腰臀比,保留2位小数")
    private BigDecimal whr;

    @ApiModelProperty("头围(cm)")
    private BigDecimal headCircumference;

    @ApiModelProperty("中上臂围(cm)")
    private BigDecimal middleArmCircumference;

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
	 * PK	是		
     */
    public Long getPhyId() {
        return phyId;
    }

    /**		
	 * PK	是		
     */
    public void setPhyId(Long phyId) {
        this.phyId = phyId;
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
    public LocalDateTime getExamDate() {
        return examDate;
    }

    /**		
	 * 检查日期		
     */
    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
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
	 * 体脂百分比(计算)		
     */
    public BigDecimal getBodyFatPercentCalc() {
        return bodyFatPercentCalc;
    }

    /**		
	 * 体脂百分比(计算)		
     */
    public void setBodyFatPercentCalc(BigDecimal bodyFatPercentCalc) {
        this.bodyFatPercentCalc = bodyFatPercentCalc;
    }
    /**		
	 * 体脂百分比(实测)		
     */
    public BigDecimal getBodyFatPercent() {
        return bodyFatPercent;
    }

    /**		
	 * 体脂百分比(实测)		
     */
    public void setBodyFatPercent(BigDecimal bodyFatPercent) {
        this.bodyFatPercent = bodyFatPercent;
    }
    /**		
	 * 平时体重(kg)		
     */
    public BigDecimal getUsualWeight() {
        return usualWeight;
    }

    /**		
	 * 平时体重(kg)		
     */
    public void setUsualWeight(BigDecimal usualWeight) {
        this.usualWeight = usualWeight;
    }
    /**		
	 * 近期体重状态名称,字典中weightstatus，这里保存字典名字		
     */
    public String getWeightStatus() {
        return weightStatus;
    }

    /**		
	 * 近期体重状态名称,字典中weightstatus，这里保存字典名字		
     */
    public void setWeightStatus(String weightStatus) {
        this.weightStatus = weightStatus;
    }
    /**		
	 * 体重变动(kg)		
     */
    public BigDecimal getWeightChange() {
        return weightChange;
    }

    /**		
	 * 体重变动(kg)		
     */
    public void setWeightChange(BigDecimal weightChange) {
        this.weightChange = weightChange;
    }
    /**		
	 * 体重变动百分比(%)		
     */
    public BigDecimal getWeightChangePercent() {
        return weightChangePercent;
    }

    /**		
	 * 体重变动百分比(%)		
     */
    public void setWeightChangePercent(BigDecimal weightChangePercent) {
        this.weightChangePercent = weightChangePercent;
    }
    /**		
	 * 体重变化周期(月周)		
     */
    public String getWeightChangeCycleType() {
        return weightChangeCycleType;
    }

    /**		
	 * 体重变化周期(月周)		
     */
    public void setWeightChangeCycleType(String weightChangeCycleType) {
        this.weightChangeCycleType = weightChangeCycleType;
    }
    /**		
	 * 体重变化周期(月周)		
     */
    public String getWeightChangeCycleVal() {
        return weightChangeCycleVal;
    }

    /**		
	 * 体重变化周期(月周)		
     */
    public void setWeightChangeCycleVal(String weightChangeCycleVal) {
        this.weightChangeCycleVal = weightChangeCycleVal;
    }
    /**		
	 * 肩胛下皮褶厚度(mm)		
     */
    public BigDecimal getSubscapularSkinfoldThick() {
        return subscapularSkinfoldThick;
    }

    /**		
	 * 肩胛下皮褶厚度(mm)		
     */
    public void setSubscapularSkinfoldThick(BigDecimal subscapularSkinfoldThick) {
        this.subscapularSkinfoldThick = subscapularSkinfoldThick;
    }
    /**		
	 * 髂脊上部皮褶厚度(mm)		
     */
    public BigDecimal getIliacCrestSkinfoldThick() {
        return iliacCrestSkinfoldThick;
    }

    /**		
	 * 髂脊上部皮褶厚度(mm)		
     */
    public void setIliacCrestSkinfoldThick(BigDecimal iliacCrestSkinfoldThick) {
        this.iliacCrestSkinfoldThick = iliacCrestSkinfoldThick;
    }
    /**		
	 * 腹部皮褶厚度(mm)		
     */
    public BigDecimal getAbdominalSkinfoldThick() {
        return abdominalSkinfoldThick;
    }

    /**		
	 * 腹部皮褶厚度(mm)		
     */
    public void setAbdominalSkinfoldThick(BigDecimal abdominalSkinfoldThick) {
        this.abdominalSkinfoldThick = abdominalSkinfoldThick;
    }
    /**		
	 * 左手握力(kg)		
     */
    public BigDecimal getLeftHandGripStrength() {
        return leftHandGripStrength;
    }

    /**		
	 * 左手握力(kg)		
     */
    public void setLeftHandGripStrength(BigDecimal leftHandGripStrength) {
        this.leftHandGripStrength = leftHandGripStrength;
    }
    /**		
	 * 右手握力(kg)		
     */
    public BigDecimal getRightHandGripStrength() {
        return rightHandGripStrength;
    }

    /**		
	 * 右手握力(kg)		
     */
    public void setRightHandGripStrength(BigDecimal rightHandGripStrength) {
        this.rightHandGripStrength = rightHandGripStrength;
    }
    /**		
	 * 肱三头肌皮褶厚度(mm)		
     */
    public BigDecimal getTricepsSkinfoldThick() {
        return tricepsSkinfoldThick;
    }

    /**		
	 * 肱三头肌皮褶厚度(mm)		
     */
    public void setTricepsSkinfoldThick(BigDecimal tricepsSkinfoldThick) {
        this.tricepsSkinfoldThick = tricepsSkinfoldThick;
    }
    /**		
	 * 上臂围(cm)		
     */
    public BigDecimal getArmCircumference() {
        return armCircumference;
    }

    /**		
	 * 上臂围(cm)		
     */
    public void setArmCircumference(BigDecimal armCircumference) {
        this.armCircumference = armCircumference;
    }
    /**		
	 * 上臂肌围(cm)		
     */
    public BigDecimal getArmMuscleCircumference() {
        return armMuscleCircumference;
    }

    /**		
	 * 上臂肌围(cm)		
     */
    public void setArmMuscleCircumference(BigDecimal armMuscleCircumference) {
        this.armMuscleCircumference = armMuscleCircumference;
    }
    /**		
	 * 上臂肌区(cm2)		
     */
    public BigDecimal getArmMuscleArea() {
        return armMuscleArea;
    }

    /**		
	 * 上臂肌区(cm2)		
     */
    public void setArmMuscleArea(BigDecimal armMuscleArea) {
        this.armMuscleArea = armMuscleArea;
    }
    /**		
	 * 腰围(cm)		
     */
    public BigDecimal getWaistline() {
        return waistline;
    }

    /**		
	 * 腰围(cm)		
     */
    public void setWaistline(BigDecimal waistline) {
        this.waistline = waistline;
    }
    /**		
	 * 腰围(cm)		
     */
    public BigDecimal getHipline() {
        return hipline;
    }

    /**		
	 * 腰围(cm)		
     */
    public void setHipline(BigDecimal hipline) {
        this.hipline = hipline;
    }
    /**		
	 * 小腿围		
     */
    public BigDecimal getCalfline() {
        return calfline;
    }

    /**		
	 * 小腿围		
     */
    public void setCalfline(BigDecimal calfline) {
        this.calfline = calfline;
    }
    /**		
	 * 腰臀比,保留2位小数		
     */
    public BigDecimal getWhr() {
        return whr;
    }

    /**		
	 * 腰臀比,保留2位小数		
     */
    public void setWhr(BigDecimal whr) {
        this.whr = whr;
    }
    /**		
	 * 头围(cm)		
     */
    public BigDecimal getHeadCircumference() {
        return headCircumference;
    }

    /**		
	 * 头围(cm)		
     */
    public void setHeadCircumference(BigDecimal headCircumference) {
        this.headCircumference = headCircumference;
    }
    /**		
	 * 中上臂围(cm)		
     */
    public BigDecimal getMiddleArmCircumference() {
        return middleArmCircumference;
    }

    /**		
	 * 中上臂围(cm)		
     */
    public void setMiddleArmCircumference(BigDecimal middleArmCircumference) {
        this.middleArmCircumference = middleArmCircumference;
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
        return "AssessPhysicalExam{" +
            "phyId=" + phyId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", examDate=" + examDate +
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
            ", bmiAssess=" + bmiAssess +
            ", standardWeight=" + standardWeight +
            ", standardWeightPer=" + standardWeightPer +
            ", bee=" + bee +
            ", bmr=" + bmr +
            ", bodyFatPercentCalc=" + bodyFatPercentCalc +
            ", bodyFatPercent=" + bodyFatPercent +
            ", usualWeight=" + usualWeight +
            ", weightStatus=" + weightStatus +
            ", weightChange=" + weightChange +
            ", weightChangePercent=" + weightChangePercent +
            ", weightChangeCycleType=" + weightChangeCycleType +
            ", weightChangeCycleVal=" + weightChangeCycleVal +
            ", subscapularSkinfoldThick=" + subscapularSkinfoldThick +
            ", iliacCrestSkinfoldThick=" + iliacCrestSkinfoldThick +
            ", abdominalSkinfoldThick=" + abdominalSkinfoldThick +
            ", leftHandGripStrength=" + leftHandGripStrength +
            ", rightHandGripStrength=" + rightHandGripStrength +
            ", tricepsSkinfoldThick=" + tricepsSkinfoldThick +
            ", armCircumference=" + armCircumference +
            ", armMuscleCircumference=" + armMuscleCircumference +
            ", armMuscleArea=" + armMuscleArea +
            ", waistline=" + waistline +
            ", hipline=" + hipline +
            ", calfline=" + calfline +
            ", whr=" + whr +
            ", headCircumference=" + headCircumference +
            ", middleArmCircumference=" + middleArmCircumference +
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
