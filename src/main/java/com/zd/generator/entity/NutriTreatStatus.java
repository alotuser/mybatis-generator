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
 * 病历和营养状况表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("nutri_treat_status")
@ApiModel(value = "NutriTreatStatus对象", description = "病历和营养状况表")
public class NutriTreatStatus extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nts_id", type = IdType.AUTO)
    private Long ntsId;

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

    @ApiModelProperty("入院主述：")
    private String mainSuit;

    @ApiModelProperty("现病史：")
    private String presentHistory;

    @ApiModelProperty("既往史：")
    private String previousHistory;

    @ApiModelProperty("入院诊断：")
    private String diagnosisRecord;

    @ApiModelProperty("主要治疗措施：")
    private String treatmentProcess;

    @ApiModelProperty("营养风险筛查营养风险： 0.无 1.存在结果（后附筛查表）；")
    private String nutritionRiskScreening;

    private String nutritionRisk;

    private String nutritionBad;

    @ApiModelProperty("综合营养评估饮食和营养相关史（饮食习惯、食物过敏、宗教信仰；近3-6个月饮食摄入状况及变化等）")
    private String comprehensiveNutriHistory;

    @ApiModelProperty("身高：cm")
    private String height;

    @ApiModelProperty("体重：kg")
    private String weight;

    @ApiModelProperty("体质指数：kg/m²")
    private String bmi;

    @ApiModelProperty("通常体重：kg")
    private String usualWeight;

    @ApiModelProperty("近期体重变化：下降/增加kg/周/月")
    private String weightChange;

    @ApiModelProperty("比通常体重下降/增加%/周/月")
    private String weightChangePercent;

    @ApiModelProperty("体重变化周期(月周)")
    private String weightChangeCycleType;

    @ApiModelProperty("体重变化周期")
    private String weightChangeCycleVal;

    @ApiModelProperty("理想体重：kg")
    private String standardWeight;

    @ApiModelProperty("实际体重/理想体重：%")
    private String standardWeightPer;

    @ApiModelProperty("小腿围：cm")
    private String calfline;

    @ApiModelProperty("腰围：cm")
    private String waistline;

    @ApiModelProperty("意识：0清醒1嗜睡2昏迷")
    private String conscious;

    @ApiModelProperty("体温：0正常1发热")
    private String bodyTemperature;

    @ApiModelProperty("口唇：0红润1苍白")
    private String lips;

    @ApiModelProperty("呼吸：0.自主 1.机械通气")
    private String breathe;

    @ApiModelProperty("血压：mmHg")
    private String bloodPressure;

    @ApiModelProperty("水肿：有（部位) 无")
    private String edema;

    @ApiModelProperty("水肿部位：")
    private String edemaSite;

    @ApiModelProperty("心理社会应激：有无")
    private String psychosocialStress;

    @ApiModelProperty("痴呆：有无")
    private String dementia;

    @ApiModelProperty("抑郁症：有无")
    private String depression;

    @ApiModelProperty("其他情况：")
    private String otherSituations;

    @ApiModelProperty("吞咽功能：0.正常1.饮水/进食呛咳 2.吞咽困难 3.进食困难；")
    private String swallowingFunction;

    @ApiModelProperty("身体活动状况： 0.卧床 1.仅居家活动 2.能室外活动 3.能工作；")
    private String physicalActivity;

    @ApiModelProperty("胃肠道症状和功能： 正常 恶心 呕吐  腹泻 便秘 腹胀 肠梗阻 腹部不适 胃排空障碍 腹痛")
    private String gastSymptomsFunction;

    @ApiModelProperty("其他胃肠道症状：")
    private String otherGastSymptoms;

    @ApiModelProperty("腹部： 正常 腹部损伤 腹膜炎 便腹内高压/腹腔间隔室综合症")
    private String abdomen;

    @ApiModelProperty("腹部其他：")
    private String abdomenOther;

    @ApiModelProperty("体腔积液：  0.无 1.有")
    private String bodyCavityFluid;

    @ApiModelProperty("有体腔积液： （0.胸腔 1.心包  2.腹腔3.盆腔   ）")
    private String bodyCavityEffusion;

    @ApiModelProperty("营养状况和营养不良诊断（按国际疾病分类编码系统，ICD-10)：0.正常；1.营养风险：2.营养不良：")
    private String nutriMalnutritionDiagnosis;

    @ApiModelProperty("营养风险：")
    private String nutriMalnutritionRisk;

    @ApiModelProperty("营养不良：")
    private String nutriMalnutritionBad;

    @ApiModelProperty("营养治疗原则/计划/观察重点：")
    private String nutriMalnutritionMain;

    @ApiModelProperty("膳食、肠内（ONS）、肠外治疗：")
    private String nutriMalnutritionTreat;

    @ApiModelProperty("肠内营养处方：")
    private String enNutritionPrescription;

    @ApiModelProperty("肠外营养处方：")
    private String pnNutritionPrescription;

    @ApiModelProperty("首次病程记录：")
    private String courseRecord;

    @ApiModelProperty("营养治疗随访记录：")
    private String nutriRecord;

    @ApiModelProperty("营养治疗阶段小结：")
    private String nutriStageSummary;

    @ApiModelProperty("营养治疗出院小结：")
    private String nutriTherapySummary;

    @ApiModelProperty("出院饮食和营养治疗管理/指导和宣教：")
    private String nutriDischargeManagement;

    private String recordDoctorCode;

    private String recordDoctorName;

    private String recordDoctorTime;

    private String superDoctorCode;

    private String superDoctorName;

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
    public Long getNtsId() {
        return ntsId;
    }

    /**		
	 * 		
     */
    public void setNtsId(Long ntsId) {
        this.ntsId = ntsId;
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
	 * 入院主述：		
     */
    public String getMainSuit() {
        return mainSuit;
    }

    /**		
	 * 入院主述：		
     */
    public void setMainSuit(String mainSuit) {
        this.mainSuit = mainSuit;
    }
    /**		
	 * 现病史：		
     */
    public String getPresentHistory() {
        return presentHistory;
    }

    /**		
	 * 现病史：		
     */
    public void setPresentHistory(String presentHistory) {
        this.presentHistory = presentHistory;
    }
    /**		
	 * 既往史：		
     */
    public String getPreviousHistory() {
        return previousHistory;
    }

    /**		
	 * 既往史：		
     */
    public void setPreviousHistory(String previousHistory) {
        this.previousHistory = previousHistory;
    }
    /**		
	 * 入院诊断：		
     */
    public String getDiagnosisRecord() {
        return diagnosisRecord;
    }

    /**		
	 * 入院诊断：		
     */
    public void setDiagnosisRecord(String diagnosisRecord) {
        this.diagnosisRecord = diagnosisRecord;
    }
    /**		
	 * 主要治疗措施：		
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**		
	 * 主要治疗措施：		
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }
    /**		
	 * 营养风险筛查营养风险： 0.无 1.存在结果（后附筛查表）；		
     */
    public String getNutritionRiskScreening() {
        return nutritionRiskScreening;
    }

    /**		
	 * 营养风险筛查营养风险： 0.无 1.存在结果（后附筛查表）；		
     */
    public void setNutritionRiskScreening(String nutritionRiskScreening) {
        this.nutritionRiskScreening = nutritionRiskScreening;
    }
    /**		
	 * 		
     */
    public String getNutritionRisk() {
        return nutritionRisk;
    }

    /**		
	 * 		
     */
    public void setNutritionRisk(String nutritionRisk) {
        this.nutritionRisk = nutritionRisk;
    }
    /**		
	 * 		
     */
    public String getNutritionBad() {
        return nutritionBad;
    }

    /**		
	 * 		
     */
    public void setNutritionBad(String nutritionBad) {
        this.nutritionBad = nutritionBad;
    }
    /**		
	 * 综合营养评估饮食和营养相关史（饮食习惯、食物过敏、宗教信仰；近3-6个月饮食摄入状况及变化等）		
     */
    public String getComprehensiveNutriHistory() {
        return comprehensiveNutriHistory;
    }

    /**		
	 * 综合营养评估饮食和营养相关史（饮食习惯、食物过敏、宗教信仰；近3-6个月饮食摄入状况及变化等）		
     */
    public void setComprehensiveNutriHistory(String comprehensiveNutriHistory) {
        this.comprehensiveNutriHistory = comprehensiveNutriHistory;
    }
    /**		
	 * 身高：cm		
     */
    public String getHeight() {
        return height;
    }

    /**		
	 * 身高：cm		
     */
    public void setHeight(String height) {
        this.height = height;
    }
    /**		
	 * 体重：kg		
     */
    public String getWeight() {
        return weight;
    }

    /**		
	 * 体重：kg		
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /**		
	 * 体质指数：kg/m²		
     */
    public String getBmi() {
        return bmi;
    }

    /**		
	 * 体质指数：kg/m²		
     */
    public void setBmi(String bmi) {
        this.bmi = bmi;
    }
    /**		
	 * 通常体重：kg		
     */
    public String getUsualWeight() {
        return usualWeight;
    }

    /**		
	 * 通常体重：kg		
     */
    public void setUsualWeight(String usualWeight) {
        this.usualWeight = usualWeight;
    }
    /**		
	 * 近期体重变化：下降/增加kg/周/月		
     */
    public String getWeightChange() {
        return weightChange;
    }

    /**		
	 * 近期体重变化：下降/增加kg/周/月		
     */
    public void setWeightChange(String weightChange) {
        this.weightChange = weightChange;
    }
    /**		
	 * 比通常体重下降/增加%/周/月		
     */
    public String getWeightChangePercent() {
        return weightChangePercent;
    }

    /**		
	 * 比通常体重下降/增加%/周/月		
     */
    public void setWeightChangePercent(String weightChangePercent) {
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
	 * 体重变化周期		
     */
    public String getWeightChangeCycleVal() {
        return weightChangeCycleVal;
    }

    /**		
	 * 体重变化周期		
     */
    public void setWeightChangeCycleVal(String weightChangeCycleVal) {
        this.weightChangeCycleVal = weightChangeCycleVal;
    }
    /**		
	 * 理想体重：kg		
     */
    public String getStandardWeight() {
        return standardWeight;
    }

    /**		
	 * 理想体重：kg		
     */
    public void setStandardWeight(String standardWeight) {
        this.standardWeight = standardWeight;
    }
    /**		
	 * 实际体重/理想体重：%		
     */
    public String getStandardWeightPer() {
        return standardWeightPer;
    }

    /**		
	 * 实际体重/理想体重：%		
     */
    public void setStandardWeightPer(String standardWeightPer) {
        this.standardWeightPer = standardWeightPer;
    }
    /**		
	 * 小腿围：cm		
     */
    public String getCalfline() {
        return calfline;
    }

    /**		
	 * 小腿围：cm		
     */
    public void setCalfline(String calfline) {
        this.calfline = calfline;
    }
    /**		
	 * 腰围：cm		
     */
    public String getWaistline() {
        return waistline;
    }

    /**		
	 * 腰围：cm		
     */
    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }
    /**		
	 * 意识：0清醒1嗜睡2昏迷		
     */
    public String getConscious() {
        return conscious;
    }

    /**		
	 * 意识：0清醒1嗜睡2昏迷		
     */
    public void setConscious(String conscious) {
        this.conscious = conscious;
    }
    /**		
	 * 体温：0正常1发热		
     */
    public String getBodyTemperature() {
        return bodyTemperature;
    }

    /**		
	 * 体温：0正常1发热		
     */
    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
    /**		
	 * 口唇：0红润1苍白		
     */
    public String getLips() {
        return lips;
    }

    /**		
	 * 口唇：0红润1苍白		
     */
    public void setLips(String lips) {
        this.lips = lips;
    }
    /**		
	 * 呼吸：0.自主 1.机械通气		
     */
    public String getBreathe() {
        return breathe;
    }

    /**		
	 * 呼吸：0.自主 1.机械通气		
     */
    public void setBreathe(String breathe) {
        this.breathe = breathe;
    }
    /**		
	 * 血压：mmHg		
     */
    public String getBloodPressure() {
        return bloodPressure;
    }

    /**		
	 * 血压：mmHg		
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    /**		
	 * 水肿：有（部位) 无		
     */
    public String getEdema() {
        return edema;
    }

    /**		
	 * 水肿：有（部位) 无		
     */
    public void setEdema(String edema) {
        this.edema = edema;
    }
    /**		
	 * 水肿部位：		
     */
    public String getEdemaSite() {
        return edemaSite;
    }

    /**		
	 * 水肿部位：		
     */
    public void setEdemaSite(String edemaSite) {
        this.edemaSite = edemaSite;
    }
    /**		
	 * 心理社会应激：有无		
     */
    public String getPsychosocialStress() {
        return psychosocialStress;
    }

    /**		
	 * 心理社会应激：有无		
     */
    public void setPsychosocialStress(String psychosocialStress) {
        this.psychosocialStress = psychosocialStress;
    }
    /**		
	 * 痴呆：有无		
     */
    public String getDementia() {
        return dementia;
    }

    /**		
	 * 痴呆：有无		
     */
    public void setDementia(String dementia) {
        this.dementia = dementia;
    }
    /**		
	 * 抑郁症：有无		
     */
    public String getDepression() {
        return depression;
    }

    /**		
	 * 抑郁症：有无		
     */
    public void setDepression(String depression) {
        this.depression = depression;
    }
    /**		
	 * 其他情况：		
     */
    public String getOtherSituations() {
        return otherSituations;
    }

    /**		
	 * 其他情况：		
     */
    public void setOtherSituations(String otherSituations) {
        this.otherSituations = otherSituations;
    }
    /**		
	 * 吞咽功能：0.正常1.饮水/进食呛咳 2.吞咽困难 3.进食困难；		
     */
    public String getSwallowingFunction() {
        return swallowingFunction;
    }

    /**		
	 * 吞咽功能：0.正常1.饮水/进食呛咳 2.吞咽困难 3.进食困难；		
     */
    public void setSwallowingFunction(String swallowingFunction) {
        this.swallowingFunction = swallowingFunction;
    }
    /**		
	 * 身体活动状况： 0.卧床 1.仅居家活动 2.能室外活动 3.能工作；		
     */
    public String getPhysicalActivity() {
        return physicalActivity;
    }

    /**		
	 * 身体活动状况： 0.卧床 1.仅居家活动 2.能室外活动 3.能工作；		
     */
    public void setPhysicalActivity(String physicalActivity) {
        this.physicalActivity = physicalActivity;
    }
    /**		
	 * 胃肠道症状和功能： 正常 恶心 呕吐  腹泻 便秘 腹胀 肠梗阻 腹部不适 胃排空障碍 腹痛		
     */
    public String getGastSymptomsFunction() {
        return gastSymptomsFunction;
    }

    /**		
	 * 胃肠道症状和功能： 正常 恶心 呕吐  腹泻 便秘 腹胀 肠梗阻 腹部不适 胃排空障碍 腹痛		
     */
    public void setGastSymptomsFunction(String gastSymptomsFunction) {
        this.gastSymptomsFunction = gastSymptomsFunction;
    }
    /**		
	 * 其他胃肠道症状：		
     */
    public String getOtherGastSymptoms() {
        return otherGastSymptoms;
    }

    /**		
	 * 其他胃肠道症状：		
     */
    public void setOtherGastSymptoms(String otherGastSymptoms) {
        this.otherGastSymptoms = otherGastSymptoms;
    }
    /**		
	 * 腹部： 正常 腹部损伤 腹膜炎 便腹内高压/腹腔间隔室综合症		
     */
    public String getAbdomen() {
        return abdomen;
    }

    /**		
	 * 腹部： 正常 腹部损伤 腹膜炎 便腹内高压/腹腔间隔室综合症		
     */
    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }
    /**		
	 * 腹部其他：		
     */
    public String getAbdomenOther() {
        return abdomenOther;
    }

    /**		
	 * 腹部其他：		
     */
    public void setAbdomenOther(String abdomenOther) {
        this.abdomenOther = abdomenOther;
    }
    /**		
	 * 体腔积液：  0.无 1.有		
     */
    public String getBodyCavityFluid() {
        return bodyCavityFluid;
    }

    /**		
	 * 体腔积液：  0.无 1.有		
     */
    public void setBodyCavityFluid(String bodyCavityFluid) {
        this.bodyCavityFluid = bodyCavityFluid;
    }
    /**		
	 * 有体腔积液： （0.胸腔 1.心包  2.腹腔3.盆腔   ）		
     */
    public String getBodyCavityEffusion() {
        return bodyCavityEffusion;
    }

    /**		
	 * 有体腔积液： （0.胸腔 1.心包  2.腹腔3.盆腔   ）		
     */
    public void setBodyCavityEffusion(String bodyCavityEffusion) {
        this.bodyCavityEffusion = bodyCavityEffusion;
    }
    /**		
	 * 营养状况和营养不良诊断（按国际疾病分类编码系统，ICD-10)：0.正常；1.营养风险：2.营养不良：		
     */
    public String getNutriMalnutritionDiagnosis() {
        return nutriMalnutritionDiagnosis;
    }

    /**		
	 * 营养状况和营养不良诊断（按国际疾病分类编码系统，ICD-10)：0.正常；1.营养风险：2.营养不良：		
     */
    public void setNutriMalnutritionDiagnosis(String nutriMalnutritionDiagnosis) {
        this.nutriMalnutritionDiagnosis = nutriMalnutritionDiagnosis;
    }
    /**		
	 * 营养风险：		
     */
    public String getNutriMalnutritionRisk() {
        return nutriMalnutritionRisk;
    }

    /**		
	 * 营养风险：		
     */
    public void setNutriMalnutritionRisk(String nutriMalnutritionRisk) {
        this.nutriMalnutritionRisk = nutriMalnutritionRisk;
    }
    /**		
	 * 营养不良：		
     */
    public String getNutriMalnutritionBad() {
        return nutriMalnutritionBad;
    }

    /**		
	 * 营养不良：		
     */
    public void setNutriMalnutritionBad(String nutriMalnutritionBad) {
        this.nutriMalnutritionBad = nutriMalnutritionBad;
    }
    /**		
	 * 营养治疗原则/计划/观察重点：		
     */
    public String getNutriMalnutritionMain() {
        return nutriMalnutritionMain;
    }

    /**		
	 * 营养治疗原则/计划/观察重点：		
     */
    public void setNutriMalnutritionMain(String nutriMalnutritionMain) {
        this.nutriMalnutritionMain = nutriMalnutritionMain;
    }
    /**		
	 * 膳食、肠内（ONS）、肠外治疗：		
     */
    public String getNutriMalnutritionTreat() {
        return nutriMalnutritionTreat;
    }

    /**		
	 * 膳食、肠内（ONS）、肠外治疗：		
     */
    public void setNutriMalnutritionTreat(String nutriMalnutritionTreat) {
        this.nutriMalnutritionTreat = nutriMalnutritionTreat;
    }
    /**		
	 * 肠内营养处方：		
     */
    public String getEnNutritionPrescription() {
        return enNutritionPrescription;
    }

    /**		
	 * 肠内营养处方：		
     */
    public void setEnNutritionPrescription(String enNutritionPrescription) {
        this.enNutritionPrescription = enNutritionPrescription;
    }
    /**		
	 * 肠外营养处方：		
     */
    public String getPnNutritionPrescription() {
        return pnNutritionPrescription;
    }

    /**		
	 * 肠外营养处方：		
     */
    public void setPnNutritionPrescription(String pnNutritionPrescription) {
        this.pnNutritionPrescription = pnNutritionPrescription;
    }
    /**		
	 * 首次病程记录：		
     */
    public String getCourseRecord() {
        return courseRecord;
    }

    /**		
	 * 首次病程记录：		
     */
    public void setCourseRecord(String courseRecord) {
        this.courseRecord = courseRecord;
    }
    /**		
	 * 营养治疗随访记录：		
     */
    public String getNutriRecord() {
        return nutriRecord;
    }

    /**		
	 * 营养治疗随访记录：		
     */
    public void setNutriRecord(String nutriRecord) {
        this.nutriRecord = nutriRecord;
    }
    /**		
	 * 营养治疗阶段小结：		
     */
    public String getNutriStageSummary() {
        return nutriStageSummary;
    }

    /**		
	 * 营养治疗阶段小结：		
     */
    public void setNutriStageSummary(String nutriStageSummary) {
        this.nutriStageSummary = nutriStageSummary;
    }
    /**		
	 * 营养治疗出院小结：		
     */
    public String getNutriTherapySummary() {
        return nutriTherapySummary;
    }

    /**		
	 * 营养治疗出院小结：		
     */
    public void setNutriTherapySummary(String nutriTherapySummary) {
        this.nutriTherapySummary = nutriTherapySummary;
    }
    /**		
	 * 出院饮食和营养治疗管理/指导和宣教：		
     */
    public String getNutriDischargeManagement() {
        return nutriDischargeManagement;
    }

    /**		
	 * 出院饮食和营养治疗管理/指导和宣教：		
     */
    public void setNutriDischargeManagement(String nutriDischargeManagement) {
        this.nutriDischargeManagement = nutriDischargeManagement;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorCode() {
        return recordDoctorCode;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorCode(String recordDoctorCode) {
        this.recordDoctorCode = recordDoctorCode;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorName() {
        return recordDoctorName;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorName(String recordDoctorName) {
        this.recordDoctorName = recordDoctorName;
    }
    /**		
	 * 		
     */
    public String getRecordDoctorTime() {
        return recordDoctorTime;
    }

    /**		
	 * 		
     */
    public void setRecordDoctorTime(String recordDoctorTime) {
        this.recordDoctorTime = recordDoctorTime;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorCode() {
        return superDoctorCode;
    }

    /**		
	 * 		
     */
    public void setSuperDoctorCode(String superDoctorCode) {
        this.superDoctorCode = superDoctorCode;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorName() {
        return superDoctorName;
    }

    /**		
	 * 		
     */
    public void setSuperDoctorName(String superDoctorName) {
        this.superDoctorName = superDoctorName;
    }
    /**		
	 * 		
     */
    public String getSuperDoctorTime() {
        return superDoctorTime;
    }

    /**		
	 * 		
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
        return "NutriTreatStatus{" +
            "ntsId=" + ntsId +
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
            ", mainSuit=" + mainSuit +
            ", presentHistory=" + presentHistory +
            ", previousHistory=" + previousHistory +
            ", diagnosisRecord=" + diagnosisRecord +
            ", treatmentProcess=" + treatmentProcess +
            ", nutritionRiskScreening=" + nutritionRiskScreening +
            ", nutritionRisk=" + nutritionRisk +
            ", nutritionBad=" + nutritionBad +
            ", comprehensiveNutriHistory=" + comprehensiveNutriHistory +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", usualWeight=" + usualWeight +
            ", weightChange=" + weightChange +
            ", weightChangePercent=" + weightChangePercent +
            ", weightChangeCycleType=" + weightChangeCycleType +
            ", weightChangeCycleVal=" + weightChangeCycleVal +
            ", standardWeight=" + standardWeight +
            ", standardWeightPer=" + standardWeightPer +
            ", calfline=" + calfline +
            ", waistline=" + waistline +
            ", conscious=" + conscious +
            ", bodyTemperature=" + bodyTemperature +
            ", lips=" + lips +
            ", breathe=" + breathe +
            ", bloodPressure=" + bloodPressure +
            ", edema=" + edema +
            ", edemaSite=" + edemaSite +
            ", psychosocialStress=" + psychosocialStress +
            ", dementia=" + dementia +
            ", depression=" + depression +
            ", otherSituations=" + otherSituations +
            ", swallowingFunction=" + swallowingFunction +
            ", physicalActivity=" + physicalActivity +
            ", gastSymptomsFunction=" + gastSymptomsFunction +
            ", otherGastSymptoms=" + otherGastSymptoms +
            ", abdomen=" + abdomen +
            ", abdomenOther=" + abdomenOther +
            ", bodyCavityFluid=" + bodyCavityFluid +
            ", bodyCavityEffusion=" + bodyCavityEffusion +
            ", nutriMalnutritionDiagnosis=" + nutriMalnutritionDiagnosis +
            ", nutriMalnutritionRisk=" + nutriMalnutritionRisk +
            ", nutriMalnutritionBad=" + nutriMalnutritionBad +
            ", nutriMalnutritionMain=" + nutriMalnutritionMain +
            ", nutriMalnutritionTreat=" + nutriMalnutritionTreat +
            ", enNutritionPrescription=" + enNutritionPrescription +
            ", pnNutritionPrescription=" + pnNutritionPrescription +
            ", courseRecord=" + courseRecord +
            ", nutriRecord=" + nutriRecord +
            ", nutriStageSummary=" + nutriStageSummary +
            ", nutriTherapySummary=" + nutriTherapySummary +
            ", nutriDischargeManagement=" + nutriDischargeManagement +
            ", recordDoctorCode=" + recordDoctorCode +
            ", recordDoctorName=" + recordDoctorName +
            ", recordDoctorTime=" + recordDoctorTime +
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
