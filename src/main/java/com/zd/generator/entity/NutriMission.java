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
 * 营养宣教表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("nutri_mission")
@ApiModel(value = "NutriMission对象", description = "营养宣教表")
public class NutriMission extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nm_id", type = IdType.AUTO)
    private Long nmId;

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

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("BMI状态")
    private String bmiStatus;

    @ApiModelProperty("宣教日期")
    private LocalDateTime missionDate;

    @ApiModelProperty("NRS2002筛查结果")
    private String nrsScreenResults;

    @ApiModelProperty("基本能量")
    private String basicEnergy;

    @ApiModelProperty("蛋白质")
    private String protein;

    @ApiModelProperty("劳动强度")
    private String laborIntensity;

    @ApiModelProperty("总能量")
    private String totalEnergy;

    @ApiModelProperty("蛋白质(g)")
    private String threeProteinVal;

    @ApiModelProperty("脂肪(g)")
    private String threeFatVal;

    @ApiModelProperty("碳水化合物(g)")
    private String threeCarbohydratesVal;

    @ApiModelProperty("蛋白质(%)")
    private String threeProtein;

    @ApiModelProperty("脂肪(%)")
    private String threeFat;

    @ApiModelProperty("碳水化合物(%)")
    private String threeCarbohydrates;

    @ApiModelProperty("主食分餐(1,三餐一点 2,三餐)")
    private String foodType;

    @ApiModelProperty("早餐主食")
    private String earlyFood;

    @ApiModelProperty("早餐蛋")
    private String earlyEgg;

    @ApiModelProperty("早餐牛奶")
    private String earlyMilk;

    @ApiModelProperty("午餐主食")
    private String noonFood;

    @ApiModelProperty("午餐肉类/豆制品")
    private String noonProtein;

    @ApiModelProperty("午餐蔬菜")
    private String noonGreens;

    @ApiModelProperty("午餐油")
    private String noonOil;

    @ApiModelProperty("午餐水果（午点）")
    private String noonFruit;

    @ApiModelProperty("晚餐主食")
    private String lateFood;

    @ApiModelProperty("晚餐肉类/豆制品")
    private String lateProtein;

    @ApiModelProperty("晚餐蔬菜")
    private String lateGreens;

    @ApiModelProperty("晚餐油")
    private String lateOil;

    @ApiModelProperty("晚餐水果")
    private String lateFruit;

    @ApiModelProperty("宣教模板code")
    private String missionCode;

    @ApiModelProperty("宣教内容")
    private String missionContent;

    @ApiModelProperty("操作人Code")
    private String userCode;

    @ApiModelProperty("操作人姓名")
    private String userName;

    @ApiModelProperty("备用字段")
    private String superDoctorCode;

    @ApiModelProperty("备用字段")
    private String superDoctorName;

    @ApiModelProperty("操作人时间")
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
    public Long getNmId() {
        return nmId;
    }

    /**		
	 * 		
     */
    public void setNmId(Long nmId) {
        this.nmId = nmId;
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
	 * BMI状态		
     */
    public String getBmiStatus() {
        return bmiStatus;
    }

    /**		
	 * BMI状态		
     */
    public void setBmiStatus(String bmiStatus) {
        this.bmiStatus = bmiStatus;
    }
    /**		
	 * 宣教日期		
     */
    public LocalDateTime getMissionDate() {
        return missionDate;
    }

    /**		
	 * 宣教日期		
     */
    public void setMissionDate(LocalDateTime missionDate) {
        this.missionDate = missionDate;
    }
    /**		
	 * NRS2002筛查结果		
     */
    public String getNrsScreenResults() {
        return nrsScreenResults;
    }

    /**		
	 * NRS2002筛查结果		
     */
    public void setNrsScreenResults(String nrsScreenResults) {
        this.nrsScreenResults = nrsScreenResults;
    }
    /**		
	 * 基本能量		
     */
    public String getBasicEnergy() {
        return basicEnergy;
    }

    /**		
	 * 基本能量		
     */
    public void setBasicEnergy(String basicEnergy) {
        this.basicEnergy = basicEnergy;
    }
    /**		
	 * 蛋白质		
     */
    public String getProtein() {
        return protein;
    }

    /**		
	 * 蛋白质		
     */
    public void setProtein(String protein) {
        this.protein = protein;
    }
    /**		
	 * 劳动强度		
     */
    public String getLaborIntensity() {
        return laborIntensity;
    }

    /**		
	 * 劳动强度		
     */
    public void setLaborIntensity(String laborIntensity) {
        this.laborIntensity = laborIntensity;
    }
    /**		
	 * 总能量		
     */
    public String getTotalEnergy() {
        return totalEnergy;
    }

    /**		
	 * 总能量		
     */
    public void setTotalEnergy(String totalEnergy) {
        this.totalEnergy = totalEnergy;
    }
    /**		
	 * 蛋白质(g)		
     */
    public String getThreeProteinVal() {
        return threeProteinVal;
    }

    /**		
	 * 蛋白质(g)		
     */
    public void setThreeProteinVal(String threeProteinVal) {
        this.threeProteinVal = threeProteinVal;
    }
    /**		
	 * 脂肪(g)		
     */
    public String getThreeFatVal() {
        return threeFatVal;
    }

    /**		
	 * 脂肪(g)		
     */
    public void setThreeFatVal(String threeFatVal) {
        this.threeFatVal = threeFatVal;
    }
    /**		
	 * 碳水化合物(g)		
     */
    public String getThreeCarbohydratesVal() {
        return threeCarbohydratesVal;
    }

    /**		
	 * 碳水化合物(g)		
     */
    public void setThreeCarbohydratesVal(String threeCarbohydratesVal) {
        this.threeCarbohydratesVal = threeCarbohydratesVal;
    }
    /**		
	 * 蛋白质(%)		
     */
    public String getThreeProtein() {
        return threeProtein;
    }

    /**		
	 * 蛋白质(%)		
     */
    public void setThreeProtein(String threeProtein) {
        this.threeProtein = threeProtein;
    }
    /**		
	 * 脂肪(%)		
     */
    public String getThreeFat() {
        return threeFat;
    }

    /**		
	 * 脂肪(%)		
     */
    public void setThreeFat(String threeFat) {
        this.threeFat = threeFat;
    }
    /**		
	 * 碳水化合物(%)		
     */
    public String getThreeCarbohydrates() {
        return threeCarbohydrates;
    }

    /**		
	 * 碳水化合物(%)		
     */
    public void setThreeCarbohydrates(String threeCarbohydrates) {
        this.threeCarbohydrates = threeCarbohydrates;
    }
    /**		
	 * 主食分餐(1,三餐一点 2,三餐)		
     */
    public String getFoodType() {
        return foodType;
    }

    /**		
	 * 主食分餐(1,三餐一点 2,三餐)		
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    /**		
	 * 早餐主食		
     */
    public String getEarlyFood() {
        return earlyFood;
    }

    /**		
	 * 早餐主食		
     */
    public void setEarlyFood(String earlyFood) {
        this.earlyFood = earlyFood;
    }
    /**		
	 * 早餐蛋		
     */
    public String getEarlyEgg() {
        return earlyEgg;
    }

    /**		
	 * 早餐蛋		
     */
    public void setEarlyEgg(String earlyEgg) {
        this.earlyEgg = earlyEgg;
    }
    /**		
	 * 早餐牛奶		
     */
    public String getEarlyMilk() {
        return earlyMilk;
    }

    /**		
	 * 早餐牛奶		
     */
    public void setEarlyMilk(String earlyMilk) {
        this.earlyMilk = earlyMilk;
    }
    /**		
	 * 午餐主食		
     */
    public String getNoonFood() {
        return noonFood;
    }

    /**		
	 * 午餐主食		
     */
    public void setNoonFood(String noonFood) {
        this.noonFood = noonFood;
    }
    /**		
	 * 午餐肉类/豆制品		
     */
    public String getNoonProtein() {
        return noonProtein;
    }

    /**		
	 * 午餐肉类/豆制品		
     */
    public void setNoonProtein(String noonProtein) {
        this.noonProtein = noonProtein;
    }
    /**		
	 * 午餐蔬菜		
     */
    public String getNoonGreens() {
        return noonGreens;
    }

    /**		
	 * 午餐蔬菜		
     */
    public void setNoonGreens(String noonGreens) {
        this.noonGreens = noonGreens;
    }
    /**		
	 * 午餐油		
     */
    public String getNoonOil() {
        return noonOil;
    }

    /**		
	 * 午餐油		
     */
    public void setNoonOil(String noonOil) {
        this.noonOil = noonOil;
    }
    /**		
	 * 午餐水果（午点）		
     */
    public String getNoonFruit() {
        return noonFruit;
    }

    /**		
	 * 午餐水果（午点）		
     */
    public void setNoonFruit(String noonFruit) {
        this.noonFruit = noonFruit;
    }
    /**		
	 * 晚餐主食		
     */
    public String getLateFood() {
        return lateFood;
    }

    /**		
	 * 晚餐主食		
     */
    public void setLateFood(String lateFood) {
        this.lateFood = lateFood;
    }
    /**		
	 * 晚餐肉类/豆制品		
     */
    public String getLateProtein() {
        return lateProtein;
    }

    /**		
	 * 晚餐肉类/豆制品		
     */
    public void setLateProtein(String lateProtein) {
        this.lateProtein = lateProtein;
    }
    /**		
	 * 晚餐蔬菜		
     */
    public String getLateGreens() {
        return lateGreens;
    }

    /**		
	 * 晚餐蔬菜		
     */
    public void setLateGreens(String lateGreens) {
        this.lateGreens = lateGreens;
    }
    /**		
	 * 晚餐油		
     */
    public String getLateOil() {
        return lateOil;
    }

    /**		
	 * 晚餐油		
     */
    public void setLateOil(String lateOil) {
        this.lateOil = lateOil;
    }
    /**		
	 * 晚餐水果		
     */
    public String getLateFruit() {
        return lateFruit;
    }

    /**		
	 * 晚餐水果		
     */
    public void setLateFruit(String lateFruit) {
        this.lateFruit = lateFruit;
    }
    /**		
	 * 宣教模板code		
     */
    public String getMissionCode() {
        return missionCode;
    }

    /**		
	 * 宣教模板code		
     */
    public void setMissionCode(String missionCode) {
        this.missionCode = missionCode;
    }
    /**		
	 * 宣教内容		
     */
    public String getMissionContent() {
        return missionContent;
    }

    /**		
	 * 宣教内容		
     */
    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent;
    }
    /**		
	 * 操作人Code		
     */
    public String getUserCode() {
        return userCode;
    }

    /**		
	 * 操作人Code		
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    /**		
	 * 操作人姓名		
     */
    public String getUserName() {
        return userName;
    }

    /**		
	 * 操作人姓名		
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**		
	 * 备用字段		
     */
    public String getSuperDoctorCode() {
        return superDoctorCode;
    }

    /**		
	 * 备用字段		
     */
    public void setSuperDoctorCode(String superDoctorCode) {
        this.superDoctorCode = superDoctorCode;
    }
    /**		
	 * 备用字段		
     */
    public String getSuperDoctorName() {
        return superDoctorName;
    }

    /**		
	 * 备用字段		
     */
    public void setSuperDoctorName(String superDoctorName) {
        this.superDoctorName = superDoctorName;
    }
    /**		
	 * 操作人时间		
     */
    public String getSuperDoctorTime() {
        return superDoctorTime;
    }

    /**		
	 * 操作人时间		
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
        return "NutriMission{" +
            "nmId=" + nmId +
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
            ", bmi=" + bmi +
            ", bmiStatus=" + bmiStatus +
            ", missionDate=" + missionDate +
            ", nrsScreenResults=" + nrsScreenResults +
            ", basicEnergy=" + basicEnergy +
            ", protein=" + protein +
            ", laborIntensity=" + laborIntensity +
            ", totalEnergy=" + totalEnergy +
            ", threeProteinVal=" + threeProteinVal +
            ", threeFatVal=" + threeFatVal +
            ", threeCarbohydratesVal=" + threeCarbohydratesVal +
            ", threeProtein=" + threeProtein +
            ", threeFat=" + threeFat +
            ", threeCarbohydrates=" + threeCarbohydrates +
            ", foodType=" + foodType +
            ", earlyFood=" + earlyFood +
            ", earlyEgg=" + earlyEgg +
            ", earlyMilk=" + earlyMilk +
            ", noonFood=" + noonFood +
            ", noonProtein=" + noonProtein +
            ", noonGreens=" + noonGreens +
            ", noonOil=" + noonOil +
            ", noonFruit=" + noonFruit +
            ", lateFood=" + lateFood +
            ", lateProtein=" + lateProtein +
            ", lateGreens=" + lateGreens +
            ", lateOil=" + lateOil +
            ", lateFruit=" + lateFruit +
            ", missionCode=" + missionCode +
            ", missionContent=" + missionContent +
            ", userCode=" + userCode +
            ", userName=" + userName +
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
