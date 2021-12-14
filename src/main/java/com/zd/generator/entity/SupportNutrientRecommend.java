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
 * 营养素推荐
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_nutrient_recommend")
@ApiModel(value = "SupportNutrientRecommend对象", description = "营养素推荐")
public class SupportNutrientRecommend extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nr_id", type = IdType.AUTO)
    private Long nrId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("支持日期")
    private LocalDateTime supportDate;

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

    @ApiModelProperty("BEE公式	,参考字典beetype")
    private String beeType;

    @ApiModelProperty("BEE")
    private BigDecimal bee;

    @ApiModelProperty("总能量选项,0-根据每天消耗量 1-根据bee")
    private String totalEnergyIndex;

    @ApiModelProperty("总液体量")
    private BigDecimal liquidCapacity;

    @ApiModelProperty("每天消耗能量")
    private BigDecimal energyPerKg;

    @ApiModelProperty("每天消耗蛋白质")
    private BigDecimal proteinPerKg;

    @ApiModelProperty("活动系数,方便直接计算")
    private BigDecimal activityCoefficient;

    @ApiModelProperty("活动系数索引")
    private Integer activityCoefficientIndex;

    @ApiModelProperty("应激系数,方便直接计算")
    private BigDecimal stressCoefficient;

    @ApiModelProperty("应激系数索引")
    private Integer stressCoefficientIndex;

    @ApiModelProperty("体温系数,方便直接计算")
    private BigDecimal temperatureCoefficient;

    @ApiModelProperty("体温系数索引")
    private Integer temperatureCoefficientIndex;

    @ApiModelProperty("校正系数,方便直接计算")
    private BigDecimal correctionCoefficient;

    @ApiModelProperty("校正系数索引")
    private Integer correctionCoefficientIndex;

    @ApiModelProperty("总能量(kcal)")
    private BigDecimal energy;

    @ApiModelProperty("蛋白质(g)")
    private BigDecimal protein;

    @ApiModelProperty("蛋白质占比(%)")
    private BigDecimal proteinPercent;

    @ApiModelProperty("脂肪(g)")
    private BigDecimal fat;

    @ApiModelProperty("脂肪占比(%)")
    private BigDecimal fatPercent;

    @ApiModelProperty("碳水化合物(g)")
    private BigDecimal carbohydrate;

    @ApiModelProperty("碳水化合物占比(%)")
    private BigDecimal carbohydratePercent;

    @ApiModelProperty("镁(mg)")
    private BigDecimal mg;

    @ApiModelProperty("磷(mg)")
    private BigDecimal p;

    @ApiModelProperty("钾(mg)")
    private BigDecimal k;

    @ApiModelProperty("钠(mg)")
    private BigDecimal na;

    @ApiModelProperty("嘌呤(mg)")
    private BigDecimal purine;

    @ApiModelProperty("钙(mg)")
    private BigDecimal ca;

    @ApiModelProperty("膳食能量(kcal)")
    private BigDecimal dietEnergy;

    @ApiModelProperty("膳食能量占比(%)")
    private BigDecimal dietEnergyPercent;

    @ApiModelProperty("膳食蛋白质(g)")
    private BigDecimal dietProtein;

    @ApiModelProperty("膳食蛋白质占比(%)")
    private BigDecimal dietProteinPercent;

    @ApiModelProperty("膳食脂肪(g)")
    private BigDecimal dietFat;

    @ApiModelProperty("膳食脂肪占比(%)")
    private BigDecimal dietFatPercent;

    @ApiModelProperty("膳食碳水化合物(g)")
    private BigDecimal dietCarbohydrate;

    @ApiModelProperty("膳食碳水化合物占比(%)")
    private BigDecimal dietCarbohydratePercent;

    @ApiModelProperty("膳食镁(mg)")
    private BigDecimal dietMg;

    @ApiModelProperty("膳食磷(mg)")
    private BigDecimal dietP;

    @ApiModelProperty("膳食钾(mg)")
    private BigDecimal dietK;

    @ApiModelProperty("膳食钠(mg)")
    private BigDecimal dietNa;

    @ApiModelProperty("膳食嘌呤(mg)")
    private BigDecimal dietPurine;

    @ApiModelProperty("膳食钙(mg)")
    private BigDecimal dietCa;

    @ApiModelProperty("肠内能量(kcal)")
    private BigDecimal enEnergy;

    @ApiModelProperty("肠内能量占比(%)")
    private BigDecimal enEnergyPercent;

    @ApiModelProperty("肠内蛋白质(g)")
    private BigDecimal enProtein;

    @ApiModelProperty("肠内蛋白质占比(%)")
    private BigDecimal enProteinPercent;

    @ApiModelProperty("肠内脂肪(g)")
    private BigDecimal enFat;

    @ApiModelProperty("肠内脂肪占比(%)")
    private BigDecimal enFatPercent;

    @ApiModelProperty("肠内碳水化合物(g)")
    private BigDecimal enCarbohydrate;

    @ApiModelProperty("肠内碳水化合物占比(%)")
    private BigDecimal enCarbohydratePercent;

    @ApiModelProperty("肠内镁(mg)")
    private BigDecimal enMg;

    @ApiModelProperty("肠内磷(mg)")
    private BigDecimal enP;

    @ApiModelProperty("肠内钾(mg)")
    private BigDecimal enK;

    @ApiModelProperty("肠内钠(mg)")
    private BigDecimal enNa;

    @ApiModelProperty("肠内嘌呤(mg)")
    private BigDecimal enPurine;

    @ApiModelProperty("肠内钙(mg)")
    private BigDecimal enCa;

    @ApiModelProperty("肠外能量(kcal)")
    private BigDecimal pnEnergy;

    @ApiModelProperty("肠外能量占比(%)")
    private BigDecimal pnEnergyPercent;

    @ApiModelProperty("肠外蛋白质(g)")
    private BigDecimal pnProtein;

    @ApiModelProperty("肠外蛋白质占比(%)")
    private BigDecimal pnProteinPercent;

    @ApiModelProperty("肠外脂肪(g)")
    private BigDecimal pnFat;

    @ApiModelProperty("肠外脂肪占比(%)")
    private BigDecimal pnFatPercent;

    @ApiModelProperty("肠外碳水化合物(g)")
    private BigDecimal pnCarbohydrate;

    @ApiModelProperty("肠外碳水化合物占比(%)")
    private BigDecimal pnCarbohydratePercent;

    @ApiModelProperty("肠外镁(mg)")
    private BigDecimal pnMg;

    @ApiModelProperty("肠外磷(mg)")
    private BigDecimal pnP;

    @ApiModelProperty("肠外钾(mg)")
    private BigDecimal pnK;

    @ApiModelProperty("肠外钠(mg)")
    private BigDecimal pnNa;

    @ApiModelProperty("肠外嘌呤(mg)")
    private BigDecimal pnPurine;

    @ApiModelProperty("肠外钙(mg)")
    private BigDecimal pnCa;

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
    public Long getNrId() {
        return nrId;
    }

    /**		
	 * 		
     */
    public void setNrId(Long nrId) {
        this.nrId = nrId;
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
	 * 支持日期		
     */
    public LocalDateTime getSupportDate() {
        return supportDate;
    }

    /**		
	 * 支持日期		
     */
    public void setSupportDate(LocalDateTime supportDate) {
        this.supportDate = supportDate;
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
	 * BEE公式	,参考字典beetype		
     */
    public String getBeeType() {
        return beeType;
    }

    /**		
	 * BEE公式	,参考字典beetype		
     */
    public void setBeeType(String beeType) {
        this.beeType = beeType;
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
	 * 总能量选项,0-根据每天消耗量 1-根据bee		
     */
    public String getTotalEnergyIndex() {
        return totalEnergyIndex;
    }

    /**		
	 * 总能量选项,0-根据每天消耗量 1-根据bee		
     */
    public void setTotalEnergyIndex(String totalEnergyIndex) {
        this.totalEnergyIndex = totalEnergyIndex;
    }
    /**		
	 * 总液体量		
     */
    public BigDecimal getLiquidCapacity() {
        return liquidCapacity;
    }

    /**		
	 * 总液体量		
     */
    public void setLiquidCapacity(BigDecimal liquidCapacity) {
        this.liquidCapacity = liquidCapacity;
    }
    /**		
	 * 每天消耗能量		
     */
    public BigDecimal getEnergyPerKg() {
        return energyPerKg;
    }

    /**		
	 * 每天消耗能量		
     */
    public void setEnergyPerKg(BigDecimal energyPerKg) {
        this.energyPerKg = energyPerKg;
    }
    /**		
	 * 每天消耗蛋白质		
     */
    public BigDecimal getProteinPerKg() {
        return proteinPerKg;
    }

    /**		
	 * 每天消耗蛋白质		
     */
    public void setProteinPerKg(BigDecimal proteinPerKg) {
        this.proteinPerKg = proteinPerKg;
    }
    /**		
	 * 活动系数,方便直接计算		
     */
    public BigDecimal getActivityCoefficient() {
        return activityCoefficient;
    }

    /**		
	 * 活动系数,方便直接计算		
     */
    public void setActivityCoefficient(BigDecimal activityCoefficient) {
        this.activityCoefficient = activityCoefficient;
    }
    /**		
	 * 活动系数索引		
     */
    public Integer getActivityCoefficientIndex() {
        return activityCoefficientIndex;
    }

    /**		
	 * 活动系数索引		
     */
    public void setActivityCoefficientIndex(Integer activityCoefficientIndex) {
        this.activityCoefficientIndex = activityCoefficientIndex;
    }
    /**		
	 * 应激系数,方便直接计算		
     */
    public BigDecimal getStressCoefficient() {
        return stressCoefficient;
    }

    /**		
	 * 应激系数,方便直接计算		
     */
    public void setStressCoefficient(BigDecimal stressCoefficient) {
        this.stressCoefficient = stressCoefficient;
    }
    /**		
	 * 应激系数索引		
     */
    public Integer getStressCoefficientIndex() {
        return stressCoefficientIndex;
    }

    /**		
	 * 应激系数索引		
     */
    public void setStressCoefficientIndex(Integer stressCoefficientIndex) {
        this.stressCoefficientIndex = stressCoefficientIndex;
    }
    /**		
	 * 体温系数,方便直接计算		
     */
    public BigDecimal getTemperatureCoefficient() {
        return temperatureCoefficient;
    }

    /**		
	 * 体温系数,方便直接计算		
     */
    public void setTemperatureCoefficient(BigDecimal temperatureCoefficient) {
        this.temperatureCoefficient = temperatureCoefficient;
    }
    /**		
	 * 体温系数索引		
     */
    public Integer getTemperatureCoefficientIndex() {
        return temperatureCoefficientIndex;
    }

    /**		
	 * 体温系数索引		
     */
    public void setTemperatureCoefficientIndex(Integer temperatureCoefficientIndex) {
        this.temperatureCoefficientIndex = temperatureCoefficientIndex;
    }
    /**		
	 * 校正系数,方便直接计算		
     */
    public BigDecimal getCorrectionCoefficient() {
        return correctionCoefficient;
    }

    /**		
	 * 校正系数,方便直接计算		
     */
    public void setCorrectionCoefficient(BigDecimal correctionCoefficient) {
        this.correctionCoefficient = correctionCoefficient;
    }
    /**		
	 * 校正系数索引		
     */
    public Integer getCorrectionCoefficientIndex() {
        return correctionCoefficientIndex;
    }

    /**		
	 * 校正系数索引		
     */
    public void setCorrectionCoefficientIndex(Integer correctionCoefficientIndex) {
        this.correctionCoefficientIndex = correctionCoefficientIndex;
    }
    /**		
	 * 总能量(kcal)		
     */
    public BigDecimal getEnergy() {
        return energy;
    }

    /**		
	 * 总能量(kcal)		
     */
    public void setEnergy(BigDecimal energy) {
        this.energy = energy;
    }
    /**		
	 * 蛋白质(g)		
     */
    public BigDecimal getProtein() {
        return protein;
    }

    /**		
	 * 蛋白质(g)		
     */
    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }
    /**		
	 * 蛋白质占比(%)		
     */
    public BigDecimal getProteinPercent() {
        return proteinPercent;
    }

    /**		
	 * 蛋白质占比(%)		
     */
    public void setProteinPercent(BigDecimal proteinPercent) {
        this.proteinPercent = proteinPercent;
    }
    /**		
	 * 脂肪(g)		
     */
    public BigDecimal getFat() {
        return fat;
    }

    /**		
	 * 脂肪(g)		
     */
    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }
    /**		
	 * 脂肪占比(%)		
     */
    public BigDecimal getFatPercent() {
        return fatPercent;
    }

    /**		
	 * 脂肪占比(%)		
     */
    public void setFatPercent(BigDecimal fatPercent) {
        this.fatPercent = fatPercent;
    }
    /**		
	 * 碳水化合物(g)		
     */
    public BigDecimal getCarbohydrate() {
        return carbohydrate;
    }

    /**		
	 * 碳水化合物(g)		
     */
    public void setCarbohydrate(BigDecimal carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    /**		
	 * 碳水化合物占比(%)		
     */
    public BigDecimal getCarbohydratePercent() {
        return carbohydratePercent;
    }

    /**		
	 * 碳水化合物占比(%)		
     */
    public void setCarbohydratePercent(BigDecimal carbohydratePercent) {
        this.carbohydratePercent = carbohydratePercent;
    }
    /**		
	 * 镁(mg)		
     */
    public BigDecimal getMg() {
        return mg;
    }

    /**		
	 * 镁(mg)		
     */
    public void setMg(BigDecimal mg) {
        this.mg = mg;
    }
    /**		
	 * 磷(mg)		
     */
    public BigDecimal getP() {
        return p;
    }

    /**		
	 * 磷(mg)		
     */
    public void setP(BigDecimal p) {
        this.p = p;
    }
    /**		
	 * 钾(mg)		
     */
    public BigDecimal getK() {
        return k;
    }

    /**		
	 * 钾(mg)		
     */
    public void setK(BigDecimal k) {
        this.k = k;
    }
    /**		
	 * 钠(mg)		
     */
    public BigDecimal getNa() {
        return na;
    }

    /**		
	 * 钠(mg)		
     */
    public void setNa(BigDecimal na) {
        this.na = na;
    }
    /**		
	 * 嘌呤(mg)		
     */
    public BigDecimal getPurine() {
        return purine;
    }

    /**		
	 * 嘌呤(mg)		
     */
    public void setPurine(BigDecimal purine) {
        this.purine = purine;
    }
    /**		
	 * 钙(mg)		
     */
    public BigDecimal getCa() {
        return ca;
    }

    /**		
	 * 钙(mg)		
     */
    public void setCa(BigDecimal ca) {
        this.ca = ca;
    }
    /**		
	 * 膳食能量(kcal)		
     */
    public BigDecimal getDietEnergy() {
        return dietEnergy;
    }

    /**		
	 * 膳食能量(kcal)		
     */
    public void setDietEnergy(BigDecimal dietEnergy) {
        this.dietEnergy = dietEnergy;
    }
    /**		
	 * 膳食能量占比(%)		
     */
    public BigDecimal getDietEnergyPercent() {
        return dietEnergyPercent;
    }

    /**		
	 * 膳食能量占比(%)		
     */
    public void setDietEnergyPercent(BigDecimal dietEnergyPercent) {
        this.dietEnergyPercent = dietEnergyPercent;
    }
    /**		
	 * 膳食蛋白质(g)		
     */
    public BigDecimal getDietProtein() {
        return dietProtein;
    }

    /**		
	 * 膳食蛋白质(g)		
     */
    public void setDietProtein(BigDecimal dietProtein) {
        this.dietProtein = dietProtein;
    }
    /**		
	 * 膳食蛋白质占比(%)		
     */
    public BigDecimal getDietProteinPercent() {
        return dietProteinPercent;
    }

    /**		
	 * 膳食蛋白质占比(%)		
     */
    public void setDietProteinPercent(BigDecimal dietProteinPercent) {
        this.dietProteinPercent = dietProteinPercent;
    }
    /**		
	 * 膳食脂肪(g)		
     */
    public BigDecimal getDietFat() {
        return dietFat;
    }

    /**		
	 * 膳食脂肪(g)		
     */
    public void setDietFat(BigDecimal dietFat) {
        this.dietFat = dietFat;
    }
    /**		
	 * 膳食脂肪占比(%)		
     */
    public BigDecimal getDietFatPercent() {
        return dietFatPercent;
    }

    /**		
	 * 膳食脂肪占比(%)		
     */
    public void setDietFatPercent(BigDecimal dietFatPercent) {
        this.dietFatPercent = dietFatPercent;
    }
    /**		
	 * 膳食碳水化合物(g)		
     */
    public BigDecimal getDietCarbohydrate() {
        return dietCarbohydrate;
    }

    /**		
	 * 膳食碳水化合物(g)		
     */
    public void setDietCarbohydrate(BigDecimal dietCarbohydrate) {
        this.dietCarbohydrate = dietCarbohydrate;
    }
    /**		
	 * 膳食碳水化合物占比(%)		
     */
    public BigDecimal getDietCarbohydratePercent() {
        return dietCarbohydratePercent;
    }

    /**		
	 * 膳食碳水化合物占比(%)		
     */
    public void setDietCarbohydratePercent(BigDecimal dietCarbohydratePercent) {
        this.dietCarbohydratePercent = dietCarbohydratePercent;
    }
    /**		
	 * 膳食镁(mg)		
     */
    public BigDecimal getDietMg() {
        return dietMg;
    }

    /**		
	 * 膳食镁(mg)		
     */
    public void setDietMg(BigDecimal dietMg) {
        this.dietMg = dietMg;
    }
    /**		
	 * 膳食磷(mg)		
     */
    public BigDecimal getDietP() {
        return dietP;
    }

    /**		
	 * 膳食磷(mg)		
     */
    public void setDietP(BigDecimal dietP) {
        this.dietP = dietP;
    }
    /**		
	 * 膳食钾(mg)		
     */
    public BigDecimal getDietK() {
        return dietK;
    }

    /**		
	 * 膳食钾(mg)		
     */
    public void setDietK(BigDecimal dietK) {
        this.dietK = dietK;
    }
    /**		
	 * 膳食钠(mg)		
     */
    public BigDecimal getDietNa() {
        return dietNa;
    }

    /**		
	 * 膳食钠(mg)		
     */
    public void setDietNa(BigDecimal dietNa) {
        this.dietNa = dietNa;
    }
    /**		
	 * 膳食嘌呤(mg)		
     */
    public BigDecimal getDietPurine() {
        return dietPurine;
    }

    /**		
	 * 膳食嘌呤(mg)		
     */
    public void setDietPurine(BigDecimal dietPurine) {
        this.dietPurine = dietPurine;
    }
    /**		
	 * 膳食钙(mg)		
     */
    public BigDecimal getDietCa() {
        return dietCa;
    }

    /**		
	 * 膳食钙(mg)		
     */
    public void setDietCa(BigDecimal dietCa) {
        this.dietCa = dietCa;
    }
    /**		
	 * 肠内能量(kcal)		
     */
    public BigDecimal getEnEnergy() {
        return enEnergy;
    }

    /**		
	 * 肠内能量(kcal)		
     */
    public void setEnEnergy(BigDecimal enEnergy) {
        this.enEnergy = enEnergy;
    }
    /**		
	 * 肠内能量占比(%)		
     */
    public BigDecimal getEnEnergyPercent() {
        return enEnergyPercent;
    }

    /**		
	 * 肠内能量占比(%)		
     */
    public void setEnEnergyPercent(BigDecimal enEnergyPercent) {
        this.enEnergyPercent = enEnergyPercent;
    }
    /**		
	 * 肠内蛋白质(g)		
     */
    public BigDecimal getEnProtein() {
        return enProtein;
    }

    /**		
	 * 肠内蛋白质(g)		
     */
    public void setEnProtein(BigDecimal enProtein) {
        this.enProtein = enProtein;
    }
    /**		
	 * 肠内蛋白质占比(%)		
     */
    public BigDecimal getEnProteinPercent() {
        return enProteinPercent;
    }

    /**		
	 * 肠内蛋白质占比(%)		
     */
    public void setEnProteinPercent(BigDecimal enProteinPercent) {
        this.enProteinPercent = enProteinPercent;
    }
    /**		
	 * 肠内脂肪(g)		
     */
    public BigDecimal getEnFat() {
        return enFat;
    }

    /**		
	 * 肠内脂肪(g)		
     */
    public void setEnFat(BigDecimal enFat) {
        this.enFat = enFat;
    }
    /**		
	 * 肠内脂肪占比(%)		
     */
    public BigDecimal getEnFatPercent() {
        return enFatPercent;
    }

    /**		
	 * 肠内脂肪占比(%)		
     */
    public void setEnFatPercent(BigDecimal enFatPercent) {
        this.enFatPercent = enFatPercent;
    }
    /**		
	 * 肠内碳水化合物(g)		
     */
    public BigDecimal getEnCarbohydrate() {
        return enCarbohydrate;
    }

    /**		
	 * 肠内碳水化合物(g)		
     */
    public void setEnCarbohydrate(BigDecimal enCarbohydrate) {
        this.enCarbohydrate = enCarbohydrate;
    }
    /**		
	 * 肠内碳水化合物占比(%)		
     */
    public BigDecimal getEnCarbohydratePercent() {
        return enCarbohydratePercent;
    }

    /**		
	 * 肠内碳水化合物占比(%)		
     */
    public void setEnCarbohydratePercent(BigDecimal enCarbohydratePercent) {
        this.enCarbohydratePercent = enCarbohydratePercent;
    }
    /**		
	 * 肠内镁(mg)		
     */
    public BigDecimal getEnMg() {
        return enMg;
    }

    /**		
	 * 肠内镁(mg)		
     */
    public void setEnMg(BigDecimal enMg) {
        this.enMg = enMg;
    }
    /**		
	 * 肠内磷(mg)		
     */
    public BigDecimal getEnP() {
        return enP;
    }

    /**		
	 * 肠内磷(mg)		
     */
    public void setEnP(BigDecimal enP) {
        this.enP = enP;
    }
    /**		
	 * 肠内钾(mg)		
     */
    public BigDecimal getEnK() {
        return enK;
    }

    /**		
	 * 肠内钾(mg)		
     */
    public void setEnK(BigDecimal enK) {
        this.enK = enK;
    }
    /**		
	 * 肠内钠(mg)		
     */
    public BigDecimal getEnNa() {
        return enNa;
    }

    /**		
	 * 肠内钠(mg)		
     */
    public void setEnNa(BigDecimal enNa) {
        this.enNa = enNa;
    }
    /**		
	 * 肠内嘌呤(mg)		
     */
    public BigDecimal getEnPurine() {
        return enPurine;
    }

    /**		
	 * 肠内嘌呤(mg)		
     */
    public void setEnPurine(BigDecimal enPurine) {
        this.enPurine = enPurine;
    }
    /**		
	 * 肠内钙(mg)		
     */
    public BigDecimal getEnCa() {
        return enCa;
    }

    /**		
	 * 肠内钙(mg)		
     */
    public void setEnCa(BigDecimal enCa) {
        this.enCa = enCa;
    }
    /**		
	 * 肠外能量(kcal)		
     */
    public BigDecimal getPnEnergy() {
        return pnEnergy;
    }

    /**		
	 * 肠外能量(kcal)		
     */
    public void setPnEnergy(BigDecimal pnEnergy) {
        this.pnEnergy = pnEnergy;
    }
    /**		
	 * 肠外能量占比(%)		
     */
    public BigDecimal getPnEnergyPercent() {
        return pnEnergyPercent;
    }

    /**		
	 * 肠外能量占比(%)		
     */
    public void setPnEnergyPercent(BigDecimal pnEnergyPercent) {
        this.pnEnergyPercent = pnEnergyPercent;
    }
    /**		
	 * 肠外蛋白质(g)		
     */
    public BigDecimal getPnProtein() {
        return pnProtein;
    }

    /**		
	 * 肠外蛋白质(g)		
     */
    public void setPnProtein(BigDecimal pnProtein) {
        this.pnProtein = pnProtein;
    }
    /**		
	 * 肠外蛋白质占比(%)		
     */
    public BigDecimal getPnProteinPercent() {
        return pnProteinPercent;
    }

    /**		
	 * 肠外蛋白质占比(%)		
     */
    public void setPnProteinPercent(BigDecimal pnProteinPercent) {
        this.pnProteinPercent = pnProteinPercent;
    }
    /**		
	 * 肠外脂肪(g)		
     */
    public BigDecimal getPnFat() {
        return pnFat;
    }

    /**		
	 * 肠外脂肪(g)		
     */
    public void setPnFat(BigDecimal pnFat) {
        this.pnFat = pnFat;
    }
    /**		
	 * 肠外脂肪占比(%)		
     */
    public BigDecimal getPnFatPercent() {
        return pnFatPercent;
    }

    /**		
	 * 肠外脂肪占比(%)		
     */
    public void setPnFatPercent(BigDecimal pnFatPercent) {
        this.pnFatPercent = pnFatPercent;
    }
    /**		
	 * 肠外碳水化合物(g)		
     */
    public BigDecimal getPnCarbohydrate() {
        return pnCarbohydrate;
    }

    /**		
	 * 肠外碳水化合物(g)		
     */
    public void setPnCarbohydrate(BigDecimal pnCarbohydrate) {
        this.pnCarbohydrate = pnCarbohydrate;
    }
    /**		
	 * 肠外碳水化合物占比(%)		
     */
    public BigDecimal getPnCarbohydratePercent() {
        return pnCarbohydratePercent;
    }

    /**		
	 * 肠外碳水化合物占比(%)		
     */
    public void setPnCarbohydratePercent(BigDecimal pnCarbohydratePercent) {
        this.pnCarbohydratePercent = pnCarbohydratePercent;
    }
    /**		
	 * 肠外镁(mg)		
     */
    public BigDecimal getPnMg() {
        return pnMg;
    }

    /**		
	 * 肠外镁(mg)		
     */
    public void setPnMg(BigDecimal pnMg) {
        this.pnMg = pnMg;
    }
    /**		
	 * 肠外磷(mg)		
     */
    public BigDecimal getPnP() {
        return pnP;
    }

    /**		
	 * 肠外磷(mg)		
     */
    public void setPnP(BigDecimal pnP) {
        this.pnP = pnP;
    }
    /**		
	 * 肠外钾(mg)		
     */
    public BigDecimal getPnK() {
        return pnK;
    }

    /**		
	 * 肠外钾(mg)		
     */
    public void setPnK(BigDecimal pnK) {
        this.pnK = pnK;
    }
    /**		
	 * 肠外钠(mg)		
     */
    public BigDecimal getPnNa() {
        return pnNa;
    }

    /**		
	 * 肠外钠(mg)		
     */
    public void setPnNa(BigDecimal pnNa) {
        this.pnNa = pnNa;
    }
    /**		
	 * 肠外嘌呤(mg)		
     */
    public BigDecimal getPnPurine() {
        return pnPurine;
    }

    /**		
	 * 肠外嘌呤(mg)		
     */
    public void setPnPurine(BigDecimal pnPurine) {
        this.pnPurine = pnPurine;
    }
    /**		
	 * 肠外钙(mg)		
     */
    public BigDecimal getPnCa() {
        return pnCa;
    }

    /**		
	 * 肠外钙(mg)		
     */
    public void setPnCa(BigDecimal pnCa) {
        this.pnCa = pnCa;
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
        return "SupportNutrientRecommend{" +
            "nrId=" + nrId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", supportDate=" + supportDate +
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
            ", beeType=" + beeType +
            ", bee=" + bee +
            ", totalEnergyIndex=" + totalEnergyIndex +
            ", liquidCapacity=" + liquidCapacity +
            ", energyPerKg=" + energyPerKg +
            ", proteinPerKg=" + proteinPerKg +
            ", activityCoefficient=" + activityCoefficient +
            ", activityCoefficientIndex=" + activityCoefficientIndex +
            ", stressCoefficient=" + stressCoefficient +
            ", stressCoefficientIndex=" + stressCoefficientIndex +
            ", temperatureCoefficient=" + temperatureCoefficient +
            ", temperatureCoefficientIndex=" + temperatureCoefficientIndex +
            ", correctionCoefficient=" + correctionCoefficient +
            ", correctionCoefficientIndex=" + correctionCoefficientIndex +
            ", energy=" + energy +
            ", protein=" + protein +
            ", proteinPercent=" + proteinPercent +
            ", fat=" + fat +
            ", fatPercent=" + fatPercent +
            ", carbohydrate=" + carbohydrate +
            ", carbohydratePercent=" + carbohydratePercent +
            ", mg=" + mg +
            ", p=" + p +
            ", k=" + k +
            ", na=" + na +
            ", purine=" + purine +
            ", ca=" + ca +
            ", dietEnergy=" + dietEnergy +
            ", dietEnergyPercent=" + dietEnergyPercent +
            ", dietProtein=" + dietProtein +
            ", dietProteinPercent=" + dietProteinPercent +
            ", dietFat=" + dietFat +
            ", dietFatPercent=" + dietFatPercent +
            ", dietCarbohydrate=" + dietCarbohydrate +
            ", dietCarbohydratePercent=" + dietCarbohydratePercent +
            ", dietMg=" + dietMg +
            ", dietP=" + dietP +
            ", dietK=" + dietK +
            ", dietNa=" + dietNa +
            ", dietPurine=" + dietPurine +
            ", dietCa=" + dietCa +
            ", enEnergy=" + enEnergy +
            ", enEnergyPercent=" + enEnergyPercent +
            ", enProtein=" + enProtein +
            ", enProteinPercent=" + enProteinPercent +
            ", enFat=" + enFat +
            ", enFatPercent=" + enFatPercent +
            ", enCarbohydrate=" + enCarbohydrate +
            ", enCarbohydratePercent=" + enCarbohydratePercent +
            ", enMg=" + enMg +
            ", enP=" + enP +
            ", enK=" + enK +
            ", enNa=" + enNa +
            ", enPurine=" + enPurine +
            ", enCa=" + enCa +
            ", pnEnergy=" + pnEnergy +
            ", pnEnergyPercent=" + pnEnergyPercent +
            ", pnProtein=" + pnProtein +
            ", pnProteinPercent=" + pnProteinPercent +
            ", pnFat=" + pnFat +
            ", pnFatPercent=" + pnFatPercent +
            ", pnCarbohydrate=" + pnCarbohydrate +
            ", pnCarbohydratePercent=" + pnCarbohydratePercent +
            ", pnMg=" + pnMg +
            ", pnP=" + pnP +
            ", pnK=" + pnK +
            ", pnNa=" + pnNa +
            ", pnPurine=" + pnPurine +
            ", pnCa=" + pnCa +
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
