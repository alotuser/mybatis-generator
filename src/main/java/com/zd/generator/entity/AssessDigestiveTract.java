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
 * 消化道评估A
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_digestive_tract")
@ApiModel(value = "AssessDigestiveTract对象", description = "消化道评估A")
public class AssessDigestiveTract extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("PK")
    @TableId(value = "dt_id", type = IdType.AUTO)
    private Long dtId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("评估日期")
    private LocalDateTime assessDate;

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

    @ApiModelProperty("性别,男，女 ")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("不良记录")
    private String badRecord;

    @ApiModelProperty("有过口腔咽喉疾病手术、神经肌肉疾病、机械通气等1-选中 0-未选中 ")
    private String oralSurgery;

    @ApiModelProperty("有恶心,1-选中 0-未选中")
    private String nausea;

    @ApiModelProperty("有腹胀1-选中 0-未选中 ")
    private String abdominalDistension;

    @ApiModelProperty("有腹泻1-选中 0-未选中 ")
    private String diarrhoea;

    @ApiModelProperty("腹泻天数")
    private BigDecimal diarrhoeaDays;

    @ApiModelProperty("有呕吐1-选中 0-未选中 ")
    private String vomit;

    @ApiModelProperty("食欲不振1-选中 0-未选中 ")
    private String anorexia;

    @ApiModelProperty("有便秘1-选中 0-未选中 ")
    private String astriction;

    @ApiModelProperty("肠鸣音减弱1-选中 0-未选中 ")
    private String hypoactiveBowelSounds;

    @ApiModelProperty("肠鸣音亢进1-选中 0-未选中 ")
    private String hyperactiveBowelSounds;

    @ApiModelProperty("腹痛1-选中 0-未选中 ")
    private String bellyache;

    @ApiModelProperty("出血1-选中 0-未选中 ")
    private String haemorrhage;

    @ApiModelProperty("溃疡1-选中 0-未选中 ")
    private String ulcer;

    @ApiModelProperty("1-选中 0-未选中")
    private String isEatLess;

    @ApiModelProperty("进食量较平时(1月前)减少	，，未查 ")
    private String eatLess;

    @ApiModelProperty("1-选中 0-未选中")
    private String isFoodAllergy;

    @ApiModelProperty("食物过敏及不耐受，，未查")
    private String foodAllergy;

    @ApiModelProperty("食物过敏及不耐受详细")
    private String foodAllergyDetail;

    @ApiModelProperty("1-选中 0-未选中")
    private String isDrugDietInteract;

    @ApiModelProperty("药物与饮食相互影响，，未查")
    private String drugDietInteract;

    @ApiModelProperty("药物与饮食相互影响详细")
    private String drugDietInteractDetail;

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
	 * PK		
     */
    public Long getDtId() {
        return dtId;
    }

    /**		
	 * PK		
     */
    public void setDtId(Long dtId) {
        this.dtId = dtId;
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
	 * 评估日期		
     */
    public LocalDateTime getAssessDate() {
        return assessDate;
    }

    /**		
	 * 评估日期		
     */
    public void setAssessDate(LocalDateTime assessDate) {
        this.assessDate = assessDate;
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
	 * 不良记录		
     */
    public String getBadRecord() {
        return badRecord;
    }

    /**		
	 * 不良记录		
     */
    public void setBadRecord(String badRecord) {
        this.badRecord = badRecord;
    }
    /**		
	 * 有过口腔咽喉疾病手术、神经肌肉疾病、机械通气等1-选中 0-未选中 		
     */
    public String getOralSurgery() {
        return oralSurgery;
    }

    /**		
	 * 有过口腔咽喉疾病手术、神经肌肉疾病、机械通气等1-选中 0-未选中 		
     */
    public void setOralSurgery(String oralSurgery) {
        this.oralSurgery = oralSurgery;
    }
    /**		
	 * 有恶心,1-选中 0-未选中		
     */
    public String getNausea() {
        return nausea;
    }

    /**		
	 * 有恶心,1-选中 0-未选中		
     */
    public void setNausea(String nausea) {
        this.nausea = nausea;
    }
    /**		
	 * 有腹胀1-选中 0-未选中 		
     */
    public String getAbdominalDistension() {
        return abdominalDistension;
    }

    /**		
	 * 有腹胀1-选中 0-未选中 		
     */
    public void setAbdominalDistension(String abdominalDistension) {
        this.abdominalDistension = abdominalDistension;
    }
    /**		
	 * 有腹泻1-选中 0-未选中 		
     */
    public String getDiarrhoea() {
        return diarrhoea;
    }

    /**		
	 * 有腹泻1-选中 0-未选中 		
     */
    public void setDiarrhoea(String diarrhoea) {
        this.diarrhoea = diarrhoea;
    }
    /**		
	 * 腹泻天数		
     */
    public BigDecimal getDiarrhoeaDays() {
        return diarrhoeaDays;
    }

    /**		
	 * 腹泻天数		
     */
    public void setDiarrhoeaDays(BigDecimal diarrhoeaDays) {
        this.diarrhoeaDays = diarrhoeaDays;
    }
    /**		
	 * 有呕吐1-选中 0-未选中 		
     */
    public String getVomit() {
        return vomit;
    }

    /**		
	 * 有呕吐1-选中 0-未选中 		
     */
    public void setVomit(String vomit) {
        this.vomit = vomit;
    }
    /**		
	 * 食欲不振1-选中 0-未选中 		
     */
    public String getAnorexia() {
        return anorexia;
    }

    /**		
	 * 食欲不振1-选中 0-未选中 		
     */
    public void setAnorexia(String anorexia) {
        this.anorexia = anorexia;
    }
    /**		
	 * 有便秘1-选中 0-未选中 		
     */
    public String getAstriction() {
        return astriction;
    }

    /**		
	 * 有便秘1-选中 0-未选中 		
     */
    public void setAstriction(String astriction) {
        this.astriction = astriction;
    }
    /**		
	 * 肠鸣音减弱1-选中 0-未选中 		
     */
    public String getHypoactiveBowelSounds() {
        return hypoactiveBowelSounds;
    }

    /**		
	 * 肠鸣音减弱1-选中 0-未选中 		
     */
    public void setHypoactiveBowelSounds(String hypoactiveBowelSounds) {
        this.hypoactiveBowelSounds = hypoactiveBowelSounds;
    }
    /**		
	 * 肠鸣音亢进1-选中 0-未选中 		
     */
    public String getHyperactiveBowelSounds() {
        return hyperactiveBowelSounds;
    }

    /**		
	 * 肠鸣音亢进1-选中 0-未选中 		
     */
    public void setHyperactiveBowelSounds(String hyperactiveBowelSounds) {
        this.hyperactiveBowelSounds = hyperactiveBowelSounds;
    }
    /**		
	 * 腹痛1-选中 0-未选中 		
     */
    public String getBellyache() {
        return bellyache;
    }

    /**		
	 * 腹痛1-选中 0-未选中 		
     */
    public void setBellyache(String bellyache) {
        this.bellyache = bellyache;
    }
    /**		
	 * 出血1-选中 0-未选中 		
     */
    public String getHaemorrhage() {
        return haemorrhage;
    }

    /**		
	 * 出血1-选中 0-未选中 		
     */
    public void setHaemorrhage(String haemorrhage) {
        this.haemorrhage = haemorrhage;
    }
    /**		
	 * 溃疡1-选中 0-未选中 		
     */
    public String getUlcer() {
        return ulcer;
    }

    /**		
	 * 溃疡1-选中 0-未选中 		
     */
    public void setUlcer(String ulcer) {
        this.ulcer = ulcer;
    }
    /**		
	 * 1-选中 0-未选中		
     */
    public String getIsEatLess() {
        return isEatLess;
    }

    /**		
	 * 1-选中 0-未选中		
     */
    public void setIsEatLess(String isEatLess) {
        this.isEatLess = isEatLess;
    }
    /**		
	 * 进食量较平时(1月前)减少	，，未查 		
     */
    public String getEatLess() {
        return eatLess;
    }

    /**		
	 * 进食量较平时(1月前)减少	，，未查 		
     */
    public void setEatLess(String eatLess) {
        this.eatLess = eatLess;
    }
    /**		
	 * 1-选中 0-未选中		
     */
    public String getIsFoodAllergy() {
        return isFoodAllergy;
    }

    /**		
	 * 1-选中 0-未选中		
     */
    public void setIsFoodAllergy(String isFoodAllergy) {
        this.isFoodAllergy = isFoodAllergy;
    }
    /**		
	 * 食物过敏及不耐受，，未查		
     */
    public String getFoodAllergy() {
        return foodAllergy;
    }

    /**		
	 * 食物过敏及不耐受，，未查		
     */
    public void setFoodAllergy(String foodAllergy) {
        this.foodAllergy = foodAllergy;
    }
    /**		
	 * 食物过敏及不耐受详细		
     */
    public String getFoodAllergyDetail() {
        return foodAllergyDetail;
    }

    /**		
	 * 食物过敏及不耐受详细		
     */
    public void setFoodAllergyDetail(String foodAllergyDetail) {
        this.foodAllergyDetail = foodAllergyDetail;
    }
    /**		
	 * 1-选中 0-未选中		
     */
    public String getIsDrugDietInteract() {
        return isDrugDietInteract;
    }

    /**		
	 * 1-选中 0-未选中		
     */
    public void setIsDrugDietInteract(String isDrugDietInteract) {
        this.isDrugDietInteract = isDrugDietInteract;
    }
    /**		
	 * 药物与饮食相互影响，，未查		
     */
    public String getDrugDietInteract() {
        return drugDietInteract;
    }

    /**		
	 * 药物与饮食相互影响，，未查		
     */
    public void setDrugDietInteract(String drugDietInteract) {
        this.drugDietInteract = drugDietInteract;
    }
    /**		
	 * 药物与饮食相互影响详细		
     */
    public String getDrugDietInteractDetail() {
        return drugDietInteractDetail;
    }

    /**		
	 * 药物与饮食相互影响详细		
     */
    public void setDrugDietInteractDetail(String drugDietInteractDetail) {
        this.drugDietInteractDetail = drugDietInteractDetail;
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
        return "AssessDigestiveTract{" +
            "dtId=" + dtId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", assessDate=" + assessDate +
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
            ", badRecord=" + badRecord +
            ", oralSurgery=" + oralSurgery +
            ", nausea=" + nausea +
            ", abdominalDistension=" + abdominalDistension +
            ", diarrhoea=" + diarrhoea +
            ", diarrhoeaDays=" + diarrhoeaDays +
            ", vomit=" + vomit +
            ", anorexia=" + anorexia +
            ", astriction=" + astriction +
            ", hypoactiveBowelSounds=" + hypoactiveBowelSounds +
            ", hyperactiveBowelSounds=" + hyperactiveBowelSounds +
            ", bellyache=" + bellyache +
            ", haemorrhage=" + haemorrhage +
            ", ulcer=" + ulcer +
            ", isEatLess=" + isEatLess +
            ", eatLess=" + eatLess +
            ", isFoodAllergy=" + isFoodAllergy +
            ", foodAllergy=" + foodAllergy +
            ", foodAllergyDetail=" + foodAllergyDetail +
            ", isDrugDietInteract=" + isDrugDietInteract +
            ", drugDietInteract=" + drugDietInteract +
            ", drugDietInteractDetail=" + drugDietInteractDetail +
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
