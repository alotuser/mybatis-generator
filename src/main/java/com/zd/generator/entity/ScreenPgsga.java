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
 * PG_SGA筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_pgsga")
@ApiModel(value = "ScreenPgsga对象", description = "PG_SGA筛查")
public class ScreenPgsga extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pgsga_id", type = IdType.AUTO)
    private Long pgsgaId;

    @ApiModelProperty("唯一主键病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数       ")
    private String visitId;

    @ApiModelProperty("筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1")
    private Integer stampNo;

    @ApiModelProperty("住院号")
    private String inpNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime pgsgaDate;

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

    @ApiModelProperty("姓名		 ")
    private String name;

    @ApiModelProperty("性别 男，女    ")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高		   ")
    private BigDecimal height;

    @ApiModelProperty("体重		   ")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("1个月前体重")
    private BigDecimal weight1monthAgo;

    @ApiModelProperty("6个月前体重")
    private BigDecimal weight6monthAgo;

    @ApiModelProperty("过去2周体重变化选项			0,1,2")
    private Integer weight2weekCheck;

    @ApiModelProperty("过去2周体重变化得分			0-1分")
    private Integer weight2week;

    @ApiModelProperty("饮食对比平时选项")
    private Integer eatCompareCheck;

    @ApiModelProperty("饮食对比平时得分")
    private Integer eatCompare;

    @ApiModelProperty("饮食状况选项")
    private String eatStatusCheck;

    @ApiModelProperty("饮食状况得分")
    private Integer eatStatus;

    @ApiModelProperty("症状-吃饭没有问题1-选中 0-未选中")
    private Integer symptomEatOk;

    @ApiModelProperty("症状-没有食欲1-选中 0-未选中")
    private Integer symptomNotWantEat;

    @ApiModelProperty("症状-恶心	1-选中 0-未选中")
    private Integer symptomFeelNauseated;

    @ApiModelProperty("症状-呕吐	1-选中 0-未选中")
    private Integer symptomVomit;

    @ApiModelProperty("症状-便秘	1-选中 0-未选中")
    private Integer symptomAstriction;

    @ApiModelProperty("症状-腹泻	1-选中 0-未选中")
    private Integer symptomDiarrhoea;

    @ApiModelProperty("症状-口腔溃疡1-选中 0-未选中")
    private Integer symptomMouthUlcers;

    @ApiModelProperty("症状-口干	1-选中 0-未选中")
    private Integer symptomThirst;

    @ApiModelProperty("症状-吞咽困难1-选中 0-未选中")
    private Integer symptomDysphagia;

    @ApiModelProperty("症状-饱胀	1-选中 0-未选中")
    private Integer symptomVentosity;

    @ApiModelProperty("症状-食品气味不好	1-选中 0-未选中")
    private Integer symptomFoodSmellBad;

    @ApiModelProperty("症状-感觉食品没味，变味	1-选中 0-未选中")
    private Integer symptomFoodTasteless;

    @ApiModelProperty("症状-疼痛 1-选中 0-未选中")
    private Integer symptomPain;

    @ApiModelProperty("症状-疼痛部位 ")
    private String symptomPainLocation;

    @ApiModelProperty("症状-其它1-选中 0-未选中")
    private Integer symptomOther;

    @ApiModelProperty("症状-其它内容 ")
    private String symptomOtherText;

    @ApiModelProperty("活动功能选项1-选中 0-未选中")
    private Integer moveCheck;

    @ApiModelProperty("活动功能得分")
    private Integer move;

    @ApiModelProperty("疾病-癌症1-选中 0-未选中")
    private Integer illCancer;

    @ApiModelProperty("疾病-AIDS1-选中 0-未选中")
    private Integer illAids;

    @ApiModelProperty("疾病-呼吸或心脏病恶液质	1-选中 0-未选中")
    private Integer illCachexia;

    @ApiModelProperty("疾病-开放性伤口或肠瘘或压疮1-选中 0-未选中")
    private Integer illOpenWounds;

    @ApiModelProperty("疾病-创伤1-选中 0-未选中")
    private Integer illWound;

    @ApiModelProperty("疾病-年龄超过65岁	1-选中 0-未选中")
    private Integer illAge65;

    @ApiModelProperty("代谢应激-体温")
    private BigDecimal metabolicTemperature;

    @ApiModelProperty("代谢应激-发烧时间")
    private BigDecimal metabolicFeverDuration;

    @ApiModelProperty("代谢应激-用糖皮质激素1-选中 0-未选中")
    private Integer metabolicUseDrug;

    @ApiModelProperty("代谢应激-药名")
    private String metabolicDrugName;

    @ApiModelProperty("代谢应激-用药剂量")
    private BigDecimal metabolicDosage;

    @ApiModelProperty("体格检查-眼眶脂肪垫")
    private Integer physical1;

    @ApiModelProperty("体格检查-三头肌皮褶厚度")
    private Integer physical2;

    @ApiModelProperty("体格检查-下肋脂肪厚度")
    private Integer physical3;

    @ApiModelProperty("体格检查-总体脂肪缺乏程度")
    private Integer physical4;

    @ApiModelProperty("体格检查-颞部（颞肌）")
    private Integer physical5;

    @ApiModelProperty("体格检查-锁骨部位（胸部三角肌）")
    private Integer physical6;

    @ApiModelProperty("体格检查-肩部（三角肌）")
    private Integer physical7;

    @ApiModelProperty("体格检查-肩胛部（背阔肌、斜方肌、三角肌）")
    private Integer physical8;

    @ApiModelProperty("体格检查-手背骨间肌")
    private Integer physical9;

    @ApiModelProperty("体格检查-大腿（四头肌）")
    private Integer physical10;

    @ApiModelProperty("体格检查-小腿（腓肠肌）")
    private Integer physical11;

    @ApiModelProperty("体格检查-总体肌肉消耗评分")
    private Integer physical12;

    @ApiModelProperty("体格检查-踝水肿")
    private Integer physical13;

    @ApiModelProperty("体格检查-骶部水肿")
    private Integer physical14;

    @ApiModelProperty("体格检查-腹水")
    private Integer physical15;

    @ApiModelProperty("体格检查-总体水肿程度评分")
    private Integer physical16;

    @ApiModelProperty("A项评分")
    private Integer aScore;

    @ApiModelProperty("B项评分")
    private Integer bScore;

    @ApiModelProperty("C项评分")
    private Integer cScore;

    @ApiModelProperty("D项评分")
    private Integer dScore;

    @ApiModelProperty("总分")
    private Integer pgsgaScore;

    @ApiModelProperty("评价")
    private String pgsgaResult;

    @ApiModelProperty("是否复查 0 否 1是")
    private Integer pgsgaValue;

    @ApiModelProperty("复查几天后")
    private Integer pgsgaDay;

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

    @ApiModelProperty("复核者姓名	   ")
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

    @ApiModelProperty("更新人名称			                                     ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getPgsgaId() {
        return pgsgaId;
    }

    /**		
	 * 		
     */
    public void setPgsgaId(Long pgsgaId) {
        this.pgsgaId = pgsgaId;
    }
    /**		
	 * 唯一主键病人唯一识别号		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 唯一主键病人唯一识别号		
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
    public LocalDateTime getPgsgaDate() {
        return pgsgaDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setPgsgaDate(LocalDateTime pgsgaDate) {
        this.pgsgaDate = pgsgaDate;
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
	 * 1个月前体重		
     */
    public BigDecimal getWeight1monthAgo() {
        return weight1monthAgo;
    }

    /**		
	 * 1个月前体重		
     */
    public void setWeight1monthAgo(BigDecimal weight1monthAgo) {
        this.weight1monthAgo = weight1monthAgo;
    }
    /**		
	 * 6个月前体重		
     */
    public BigDecimal getWeight6monthAgo() {
        return weight6monthAgo;
    }

    /**		
	 * 6个月前体重		
     */
    public void setWeight6monthAgo(BigDecimal weight6monthAgo) {
        this.weight6monthAgo = weight6monthAgo;
    }
    /**		
	 * 过去2周体重变化选项			0,1,2		
     */
    public Integer getWeight2weekCheck() {
        return weight2weekCheck;
    }

    /**		
	 * 过去2周体重变化选项			0,1,2		
     */
    public void setWeight2weekCheck(Integer weight2weekCheck) {
        this.weight2weekCheck = weight2weekCheck;
    }
    /**		
	 * 过去2周体重变化得分			0-1分		
     */
    public Integer getWeight2week() {
        return weight2week;
    }

    /**		
	 * 过去2周体重变化得分			0-1分		
     */
    public void setWeight2week(Integer weight2week) {
        this.weight2week = weight2week;
    }
    /**		
	 * 饮食对比平时选项		
     */
    public Integer getEatCompareCheck() {
        return eatCompareCheck;
    }

    /**		
	 * 饮食对比平时选项		
     */
    public void setEatCompareCheck(Integer eatCompareCheck) {
        this.eatCompareCheck = eatCompareCheck;
    }
    /**		
	 * 饮食对比平时得分		
     */
    public Integer getEatCompare() {
        return eatCompare;
    }

    /**		
	 * 饮食对比平时得分		
     */
    public void setEatCompare(Integer eatCompare) {
        this.eatCompare = eatCompare;
    }
    /**		
	 * 饮食状况选项		
     */
    public String getEatStatusCheck() {
        return eatStatusCheck;
    }

    /**		
	 * 饮食状况选项		
     */
    public void setEatStatusCheck(String eatStatusCheck) {
        this.eatStatusCheck = eatStatusCheck;
    }
    /**		
	 * 饮食状况得分		
     */
    public Integer getEatStatus() {
        return eatStatus;
    }

    /**		
	 * 饮食状况得分		
     */
    public void setEatStatus(Integer eatStatus) {
        this.eatStatus = eatStatus;
    }
    /**		
	 * 症状-吃饭没有问题1-选中 0-未选中		
     */
    public Integer getSymptomEatOk() {
        return symptomEatOk;
    }

    /**		
	 * 症状-吃饭没有问题1-选中 0-未选中		
     */
    public void setSymptomEatOk(Integer symptomEatOk) {
        this.symptomEatOk = symptomEatOk;
    }
    /**		
	 * 症状-没有食欲1-选中 0-未选中		
     */
    public Integer getSymptomNotWantEat() {
        return symptomNotWantEat;
    }

    /**		
	 * 症状-没有食欲1-选中 0-未选中		
     */
    public void setSymptomNotWantEat(Integer symptomNotWantEat) {
        this.symptomNotWantEat = symptomNotWantEat;
    }
    /**		
	 * 症状-恶心	1-选中 0-未选中		
     */
    public Integer getSymptomFeelNauseated() {
        return symptomFeelNauseated;
    }

    /**		
	 * 症状-恶心	1-选中 0-未选中		
     */
    public void setSymptomFeelNauseated(Integer symptomFeelNauseated) {
        this.symptomFeelNauseated = symptomFeelNauseated;
    }
    /**		
	 * 症状-呕吐	1-选中 0-未选中		
     */
    public Integer getSymptomVomit() {
        return symptomVomit;
    }

    /**		
	 * 症状-呕吐	1-选中 0-未选中		
     */
    public void setSymptomVomit(Integer symptomVomit) {
        this.symptomVomit = symptomVomit;
    }
    /**		
	 * 症状-便秘	1-选中 0-未选中		
     */
    public Integer getSymptomAstriction() {
        return symptomAstriction;
    }

    /**		
	 * 症状-便秘	1-选中 0-未选中		
     */
    public void setSymptomAstriction(Integer symptomAstriction) {
        this.symptomAstriction = symptomAstriction;
    }
    /**		
	 * 症状-腹泻	1-选中 0-未选中		
     */
    public Integer getSymptomDiarrhoea() {
        return symptomDiarrhoea;
    }

    /**		
	 * 症状-腹泻	1-选中 0-未选中		
     */
    public void setSymptomDiarrhoea(Integer symptomDiarrhoea) {
        this.symptomDiarrhoea = symptomDiarrhoea;
    }
    /**		
	 * 症状-口腔溃疡1-选中 0-未选中		
     */
    public Integer getSymptomMouthUlcers() {
        return symptomMouthUlcers;
    }

    /**		
	 * 症状-口腔溃疡1-选中 0-未选中		
     */
    public void setSymptomMouthUlcers(Integer symptomMouthUlcers) {
        this.symptomMouthUlcers = symptomMouthUlcers;
    }
    /**		
	 * 症状-口干	1-选中 0-未选中		
     */
    public Integer getSymptomThirst() {
        return symptomThirst;
    }

    /**		
	 * 症状-口干	1-选中 0-未选中		
     */
    public void setSymptomThirst(Integer symptomThirst) {
        this.symptomThirst = symptomThirst;
    }
    /**		
	 * 症状-吞咽困难1-选中 0-未选中		
     */
    public Integer getSymptomDysphagia() {
        return symptomDysphagia;
    }

    /**		
	 * 症状-吞咽困难1-选中 0-未选中		
     */
    public void setSymptomDysphagia(Integer symptomDysphagia) {
        this.symptomDysphagia = symptomDysphagia;
    }
    /**		
	 * 症状-饱胀	1-选中 0-未选中		
     */
    public Integer getSymptomVentosity() {
        return symptomVentosity;
    }

    /**		
	 * 症状-饱胀	1-选中 0-未选中		
     */
    public void setSymptomVentosity(Integer symptomVentosity) {
        this.symptomVentosity = symptomVentosity;
    }
    /**		
	 * 症状-食品气味不好	1-选中 0-未选中		
     */
    public Integer getSymptomFoodSmellBad() {
        return symptomFoodSmellBad;
    }

    /**		
	 * 症状-食品气味不好	1-选中 0-未选中		
     */
    public void setSymptomFoodSmellBad(Integer symptomFoodSmellBad) {
        this.symptomFoodSmellBad = symptomFoodSmellBad;
    }
    /**		
	 * 症状-感觉食品没味，变味	1-选中 0-未选中		
     */
    public Integer getSymptomFoodTasteless() {
        return symptomFoodTasteless;
    }

    /**		
	 * 症状-感觉食品没味，变味	1-选中 0-未选中		
     */
    public void setSymptomFoodTasteless(Integer symptomFoodTasteless) {
        this.symptomFoodTasteless = symptomFoodTasteless;
    }
    /**		
	 * 症状-疼痛 1-选中 0-未选中		
     */
    public Integer getSymptomPain() {
        return symptomPain;
    }

    /**		
	 * 症状-疼痛 1-选中 0-未选中		
     */
    public void setSymptomPain(Integer symptomPain) {
        this.symptomPain = symptomPain;
    }
    /**		
	 * 症状-疼痛部位 		
     */
    public String getSymptomPainLocation() {
        return symptomPainLocation;
    }

    /**		
	 * 症状-疼痛部位 		
     */
    public void setSymptomPainLocation(String symptomPainLocation) {
        this.symptomPainLocation = symptomPainLocation;
    }
    /**		
	 * 症状-其它1-选中 0-未选中		
     */
    public Integer getSymptomOther() {
        return symptomOther;
    }

    /**		
	 * 症状-其它1-选中 0-未选中		
     */
    public void setSymptomOther(Integer symptomOther) {
        this.symptomOther = symptomOther;
    }
    /**		
	 * 症状-其它内容 		
     */
    public String getSymptomOtherText() {
        return symptomOtherText;
    }

    /**		
	 * 症状-其它内容 		
     */
    public void setSymptomOtherText(String symptomOtherText) {
        this.symptomOtherText = symptomOtherText;
    }
    /**		
	 * 活动功能选项1-选中 0-未选中		
     */
    public Integer getMoveCheck() {
        return moveCheck;
    }

    /**		
	 * 活动功能选项1-选中 0-未选中		
     */
    public void setMoveCheck(Integer moveCheck) {
        this.moveCheck = moveCheck;
    }
    /**		
	 * 活动功能得分		
     */
    public Integer getMove() {
        return move;
    }

    /**		
	 * 活动功能得分		
     */
    public void setMove(Integer move) {
        this.move = move;
    }
    /**		
	 * 疾病-癌症1-选中 0-未选中		
     */
    public Integer getIllCancer() {
        return illCancer;
    }

    /**		
	 * 疾病-癌症1-选中 0-未选中		
     */
    public void setIllCancer(Integer illCancer) {
        this.illCancer = illCancer;
    }
    /**		
	 * 疾病-AIDS1-选中 0-未选中		
     */
    public Integer getIllAids() {
        return illAids;
    }

    /**		
	 * 疾病-AIDS1-选中 0-未选中		
     */
    public void setIllAids(Integer illAids) {
        this.illAids = illAids;
    }
    /**		
	 * 疾病-呼吸或心脏病恶液质	1-选中 0-未选中		
     */
    public Integer getIllCachexia() {
        return illCachexia;
    }

    /**		
	 * 疾病-呼吸或心脏病恶液质	1-选中 0-未选中		
     */
    public void setIllCachexia(Integer illCachexia) {
        this.illCachexia = illCachexia;
    }
    /**		
	 * 疾病-开放性伤口或肠瘘或压疮1-选中 0-未选中		
     */
    public Integer getIllOpenWounds() {
        return illOpenWounds;
    }

    /**		
	 * 疾病-开放性伤口或肠瘘或压疮1-选中 0-未选中		
     */
    public void setIllOpenWounds(Integer illOpenWounds) {
        this.illOpenWounds = illOpenWounds;
    }
    /**		
	 * 疾病-创伤1-选中 0-未选中		
     */
    public Integer getIllWound() {
        return illWound;
    }

    /**		
	 * 疾病-创伤1-选中 0-未选中		
     */
    public void setIllWound(Integer illWound) {
        this.illWound = illWound;
    }
    /**		
	 * 疾病-年龄超过65岁	1-选中 0-未选中		
     */
    public Integer getIllAge65() {
        return illAge65;
    }

    /**		
	 * 疾病-年龄超过65岁	1-选中 0-未选中		
     */
    public void setIllAge65(Integer illAge65) {
        this.illAge65 = illAge65;
    }
    /**		
	 * 代谢应激-体温		
     */
    public BigDecimal getMetabolicTemperature() {
        return metabolicTemperature;
    }

    /**		
	 * 代谢应激-体温		
     */
    public void setMetabolicTemperature(BigDecimal metabolicTemperature) {
        this.metabolicTemperature = metabolicTemperature;
    }
    /**		
	 * 代谢应激-发烧时间		
     */
    public BigDecimal getMetabolicFeverDuration() {
        return metabolicFeverDuration;
    }

    /**		
	 * 代谢应激-发烧时间		
     */
    public void setMetabolicFeverDuration(BigDecimal metabolicFeverDuration) {
        this.metabolicFeverDuration = metabolicFeverDuration;
    }
    /**		
	 * 代谢应激-用糖皮质激素1-选中 0-未选中		
     */
    public Integer getMetabolicUseDrug() {
        return metabolicUseDrug;
    }

    /**		
	 * 代谢应激-用糖皮质激素1-选中 0-未选中		
     */
    public void setMetabolicUseDrug(Integer metabolicUseDrug) {
        this.metabolicUseDrug = metabolicUseDrug;
    }
    /**		
	 * 代谢应激-药名		
     */
    public String getMetabolicDrugName() {
        return metabolicDrugName;
    }

    /**		
	 * 代谢应激-药名		
     */
    public void setMetabolicDrugName(String metabolicDrugName) {
        this.metabolicDrugName = metabolicDrugName;
    }
    /**		
	 * 代谢应激-用药剂量		
     */
    public BigDecimal getMetabolicDosage() {
        return metabolicDosage;
    }

    /**		
	 * 代谢应激-用药剂量		
     */
    public void setMetabolicDosage(BigDecimal metabolicDosage) {
        this.metabolicDosage = metabolicDosage;
    }
    /**		
	 * 体格检查-眼眶脂肪垫		
     */
    public Integer getPhysical1() {
        return physical1;
    }

    /**		
	 * 体格检查-眼眶脂肪垫		
     */
    public void setPhysical1(Integer physical1) {
        this.physical1 = physical1;
    }
    /**		
	 * 体格检查-三头肌皮褶厚度		
     */
    public Integer getPhysical2() {
        return physical2;
    }

    /**		
	 * 体格检查-三头肌皮褶厚度		
     */
    public void setPhysical2(Integer physical2) {
        this.physical2 = physical2;
    }
    /**		
	 * 体格检查-下肋脂肪厚度		
     */
    public Integer getPhysical3() {
        return physical3;
    }

    /**		
	 * 体格检查-下肋脂肪厚度		
     */
    public void setPhysical3(Integer physical3) {
        this.physical3 = physical3;
    }
    /**		
	 * 体格检查-总体脂肪缺乏程度		
     */
    public Integer getPhysical4() {
        return physical4;
    }

    /**		
	 * 体格检查-总体脂肪缺乏程度		
     */
    public void setPhysical4(Integer physical4) {
        this.physical4 = physical4;
    }
    /**		
	 * 体格检查-颞部（颞肌）		
     */
    public Integer getPhysical5() {
        return physical5;
    }

    /**		
	 * 体格检查-颞部（颞肌）		
     */
    public void setPhysical5(Integer physical5) {
        this.physical5 = physical5;
    }
    /**		
	 * 体格检查-锁骨部位（胸部三角肌）		
     */
    public Integer getPhysical6() {
        return physical6;
    }

    /**		
	 * 体格检查-锁骨部位（胸部三角肌）		
     */
    public void setPhysical6(Integer physical6) {
        this.physical6 = physical6;
    }
    /**		
	 * 体格检查-肩部（三角肌）		
     */
    public Integer getPhysical7() {
        return physical7;
    }

    /**		
	 * 体格检查-肩部（三角肌）		
     */
    public void setPhysical7(Integer physical7) {
        this.physical7 = physical7;
    }
    /**		
	 * 体格检查-肩胛部（背阔肌、斜方肌、三角肌）		
     */
    public Integer getPhysical8() {
        return physical8;
    }

    /**		
	 * 体格检查-肩胛部（背阔肌、斜方肌、三角肌）		
     */
    public void setPhysical8(Integer physical8) {
        this.physical8 = physical8;
    }
    /**		
	 * 体格检查-手背骨间肌		
     */
    public Integer getPhysical9() {
        return physical9;
    }

    /**		
	 * 体格检查-手背骨间肌		
     */
    public void setPhysical9(Integer physical9) {
        this.physical9 = physical9;
    }
    /**		
	 * 体格检查-大腿（四头肌）		
     */
    public Integer getPhysical10() {
        return physical10;
    }

    /**		
	 * 体格检查-大腿（四头肌）		
     */
    public void setPhysical10(Integer physical10) {
        this.physical10 = physical10;
    }
    /**		
	 * 体格检查-小腿（腓肠肌）		
     */
    public Integer getPhysical11() {
        return physical11;
    }

    /**		
	 * 体格检查-小腿（腓肠肌）		
     */
    public void setPhysical11(Integer physical11) {
        this.physical11 = physical11;
    }
    /**		
	 * 体格检查-总体肌肉消耗评分		
     */
    public Integer getPhysical12() {
        return physical12;
    }

    /**		
	 * 体格检查-总体肌肉消耗评分		
     */
    public void setPhysical12(Integer physical12) {
        this.physical12 = physical12;
    }
    /**		
	 * 体格检查-踝水肿		
     */
    public Integer getPhysical13() {
        return physical13;
    }

    /**		
	 * 体格检查-踝水肿		
     */
    public void setPhysical13(Integer physical13) {
        this.physical13 = physical13;
    }
    /**		
	 * 体格检查-骶部水肿		
     */
    public Integer getPhysical14() {
        return physical14;
    }

    /**		
	 * 体格检查-骶部水肿		
     */
    public void setPhysical14(Integer physical14) {
        this.physical14 = physical14;
    }
    /**		
	 * 体格检查-腹水		
     */
    public Integer getPhysical15() {
        return physical15;
    }

    /**		
	 * 体格检查-腹水		
     */
    public void setPhysical15(Integer physical15) {
        this.physical15 = physical15;
    }
    /**		
	 * 体格检查-总体水肿程度评分		
     */
    public Integer getPhysical16() {
        return physical16;
    }

    /**		
	 * 体格检查-总体水肿程度评分		
     */
    public void setPhysical16(Integer physical16) {
        this.physical16 = physical16;
    }
    /**		
	 * A项评分		
     */
    public Integer getaScore() {
        return aScore;
    }

    /**		
	 * A项评分		
     */
    public void setaScore(Integer aScore) {
        this.aScore = aScore;
    }
    /**		
	 * B项评分		
     */
    public Integer getbScore() {
        return bScore;
    }

    /**		
	 * B项评分		
     */
    public void setbScore(Integer bScore) {
        this.bScore = bScore;
    }
    /**		
	 * C项评分		
     */
    public Integer getcScore() {
        return cScore;
    }

    /**		
	 * C项评分		
     */
    public void setcScore(Integer cScore) {
        this.cScore = cScore;
    }
    /**		
	 * D项评分		
     */
    public Integer getdScore() {
        return dScore;
    }

    /**		
	 * D项评分		
     */
    public void setdScore(Integer dScore) {
        this.dScore = dScore;
    }
    /**		
	 * 总分		
     */
    public Integer getPgsgaScore() {
        return pgsgaScore;
    }

    /**		
	 * 总分		
     */
    public void setPgsgaScore(Integer pgsgaScore) {
        this.pgsgaScore = pgsgaScore;
    }
    /**		
	 * 评价		
     */
    public String getPgsgaResult() {
        return pgsgaResult;
    }

    /**		
	 * 评价		
     */
    public void setPgsgaResult(String pgsgaResult) {
        this.pgsgaResult = pgsgaResult;
    }
    /**		
	 * 是否复查 0 否 1是		
     */
    public Integer getPgsgaValue() {
        return pgsgaValue;
    }

    /**		
	 * 是否复查 0 否 1是		
     */
    public void setPgsgaValue(Integer pgsgaValue) {
        this.pgsgaValue = pgsgaValue;
    }
    /**		
	 * 复查几天后		
     */
    public Integer getPgsgaDay() {
        return pgsgaDay;
    }

    /**		
	 * 复查几天后		
     */
    public void setPgsgaDay(Integer pgsgaDay) {
        this.pgsgaDay = pgsgaDay;
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
        return "ScreenPgsga{" +
            "pgsgaId=" + pgsgaId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", stampNo=" + stampNo +
            ", inpNo=" + inpNo +
            ", pgsgaDate=" + pgsgaDate +
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
            ", weight1monthAgo=" + weight1monthAgo +
            ", weight6monthAgo=" + weight6monthAgo +
            ", weight2weekCheck=" + weight2weekCheck +
            ", weight2week=" + weight2week +
            ", eatCompareCheck=" + eatCompareCheck +
            ", eatCompare=" + eatCompare +
            ", eatStatusCheck=" + eatStatusCheck +
            ", eatStatus=" + eatStatus +
            ", symptomEatOk=" + symptomEatOk +
            ", symptomNotWantEat=" + symptomNotWantEat +
            ", symptomFeelNauseated=" + symptomFeelNauseated +
            ", symptomVomit=" + symptomVomit +
            ", symptomAstriction=" + symptomAstriction +
            ", symptomDiarrhoea=" + symptomDiarrhoea +
            ", symptomMouthUlcers=" + symptomMouthUlcers +
            ", symptomThirst=" + symptomThirst +
            ", symptomDysphagia=" + symptomDysphagia +
            ", symptomVentosity=" + symptomVentosity +
            ", symptomFoodSmellBad=" + symptomFoodSmellBad +
            ", symptomFoodTasteless=" + symptomFoodTasteless +
            ", symptomPain=" + symptomPain +
            ", symptomPainLocation=" + symptomPainLocation +
            ", symptomOther=" + symptomOther +
            ", symptomOtherText=" + symptomOtherText +
            ", moveCheck=" + moveCheck +
            ", move=" + move +
            ", illCancer=" + illCancer +
            ", illAids=" + illAids +
            ", illCachexia=" + illCachexia +
            ", illOpenWounds=" + illOpenWounds +
            ", illWound=" + illWound +
            ", illAge65=" + illAge65 +
            ", metabolicTemperature=" + metabolicTemperature +
            ", metabolicFeverDuration=" + metabolicFeverDuration +
            ", metabolicUseDrug=" + metabolicUseDrug +
            ", metabolicDrugName=" + metabolicDrugName +
            ", metabolicDosage=" + metabolicDosage +
            ", physical1=" + physical1 +
            ", physical2=" + physical2 +
            ", physical3=" + physical3 +
            ", physical4=" + physical4 +
            ", physical5=" + physical5 +
            ", physical6=" + physical6 +
            ", physical7=" + physical7 +
            ", physical8=" + physical8 +
            ", physical9=" + physical9 +
            ", physical10=" + physical10 +
            ", physical11=" + physical11 +
            ", physical12=" + physical12 +
            ", physical13=" + physical13 +
            ", physical14=" + physical14 +
            ", physical15=" + physical15 +
            ", physical16=" + physical16 +
            ", aScore=" + aScore +
            ", bScore=" + bScore +
            ", cScore=" + cScore +
            ", dScore=" + dScore +
            ", pgsgaScore=" + pgsgaScore +
            ", pgsgaResult=" + pgsgaResult +
            ", pgsgaValue=" + pgsgaValue +
            ", pgsgaDay=" + pgsgaDay +
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
