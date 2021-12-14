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
 * MNA筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_mna_sf")
@ApiModel(value = "ScreenMnaSf对象", description = "MNA筛查")
public class ScreenMnaSf extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mnasf_id", type = IdType.AUTO)
    private Long mnasfId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("筛查序号 针对patient_id+ visit_id，每次从1开始，逐次+1")
    private Integer mnasfNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime mnasfDate;

    @ApiModelProperty("机构编码")
    private String orgCode;

    @ApiModelProperty("机构名称")
    private String orgName;

    @ApiModelProperty("科别编码 ")
    private String deptCode;

    @ApiModelProperty("科别名字")
    private String deptName;

    @ApiModelProperty("病区/房号 ")
    private String wardCode;

    @ApiModelProperty("病区名字")
    private String wardName;

    @ApiModelProperty("床号 	可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名 ")
    private String name;

    @ApiModelProperty("性别 男，女 ")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高	")
    private BigDecimal height;

    @ApiModelProperty("体重		")
    private BigDecimal weight;

    @ApiModelProperty("体质指数	")
    private BigDecimal bmi;

    @ApiModelProperty("近3个月减少食量	")
    private Integer mnasfEatLess;

    @ApiModelProperty("近3个月体重丢失")
    private Integer mnasfLossWeight;

    @ApiModelProperty("活动能力")
    private Integer mnasfPhysicalActivity;

    @ApiModelProperty("近3个月心理创伤或急病")
    private Integer mnasfTrauma;

    @ApiModelProperty("精神心理问题")
    private Integer mnasfMentalPsychologyDisease;

    @ApiModelProperty("bmi得分")
    private Integer mnasfBmi;

    @ApiModelProperty("病人是否独居")
    private Integer mnasfLiveAlone;

    @ApiModelProperty("每日服用3种以上药物")
    private Integer mnasfTakeMultipleDrug;

    @ApiModelProperty("是否有褥疮或皮肤溃疡")
    private Integer mnasfBedsore;

    @ApiModelProperty("每天吃多少次主餐")
    private Integer mnasfStapleFoodTimes;

    @ApiModelProperty("蛋白质摄取量指标")
    private BigDecimal mnasfProtein;

    @ApiModelProperty("蛋白质摄取量-乳制品 选择为1，否则为0")
    private Integer mnasfProteinMilk;

    @ApiModelProperty("蛋白质摄取量-蛋类 选择为1，否则为0 ")
    private Integer mnasfProteinEgg;

    @ApiModelProperty("蛋白质摄取量-肉类  选择为1，否则为0")
    private Integer mnasfProteinMeat;

    @ApiModelProperty("进食两份或以上水果或蔬菜")
    private Integer mnasfFruit;

    @ApiModelProperty("每天摄入流质	")
    private BigDecimal mnasfLiquid;

    @ApiModelProperty("自主进食模式	")
    private Integer mnasfSelfEating;

    @ApiModelProperty("自我评估营养状况	")
    private Integer mnasfSelfAssessment;

    @ApiModelProperty("评价自己的健康状况	")
    private BigDecimal mnasfSelfHealth;

    @ApiModelProperty("上手臂中点臂围（MAC）cm")
    private BigDecimal mnasfMac;

    @ApiModelProperty("小腿围（CC）cm	")
    private BigDecimal mnasfCc;

    @ApiModelProperty("第一阶段总分")
    private BigDecimal mnasfStep1Score;

    @ApiModelProperty("第一阶段评价")
    private String mnasfStep1Result;

    @ApiModelProperty("总分可能是小数")
    private BigDecimal mnasfScore;

    @ApiModelProperty("评价")
    private String mnasfResult;

    private Integer mnasfValue;

    private Integer mnasfDay;

    @ApiModelProperty("数据来源：0-系统内；1-页面嵌套 ")
    private String dataSource;

    @ApiModelProperty("操作者科室编码	")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称	")
    private String opeDeptName;

    @ApiModelProperty("操作者编码")
    private String userNo;

    @ApiModelProperty("操作者姓名")
    private String userName;

    @ApiModelProperty("复核者编码	")
    private String recheckerCode;

    @ApiModelProperty("复核者姓名	")
    private String recheckerName;

    @ApiModelProperty("是否会诊	")
    private String isConsultation;

    @ApiModelProperty("是否发送通知	")
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
    public Long getMnasfId() {
        return mnasfId;
    }

    /**		
	 * 		
     */
    public void setMnasfId(Long mnasfId) {
        this.mnasfId = mnasfId;
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
	 * 筛查序号 针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public Integer getMnasfNo() {
        return mnasfNo;
    }

    /**		
	 * 筛查序号 针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public void setMnasfNo(Integer mnasfNo) {
        this.mnasfNo = mnasfNo;
    }
    /**		
	 * 筛查日期		
     */
    public LocalDateTime getMnasfDate() {
        return mnasfDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setMnasfDate(LocalDateTime mnasfDate) {
        this.mnasfDate = mnasfDate;
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
	 * 床号 	可能有+等字符		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号 	可能有+等字符		
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
	 * 近3个月减少食量			
     */
    public Integer getMnasfEatLess() {
        return mnasfEatLess;
    }

    /**		
	 * 近3个月减少食量			
     */
    public void setMnasfEatLess(Integer mnasfEatLess) {
        this.mnasfEatLess = mnasfEatLess;
    }
    /**		
	 * 近3个月体重丢失		
     */
    public Integer getMnasfLossWeight() {
        return mnasfLossWeight;
    }

    /**		
	 * 近3个月体重丢失		
     */
    public void setMnasfLossWeight(Integer mnasfLossWeight) {
        this.mnasfLossWeight = mnasfLossWeight;
    }
    /**		
	 * 活动能力		
     */
    public Integer getMnasfPhysicalActivity() {
        return mnasfPhysicalActivity;
    }

    /**		
	 * 活动能力		
     */
    public void setMnasfPhysicalActivity(Integer mnasfPhysicalActivity) {
        this.mnasfPhysicalActivity = mnasfPhysicalActivity;
    }
    /**		
	 * 近3个月心理创伤或急病		
     */
    public Integer getMnasfTrauma() {
        return mnasfTrauma;
    }

    /**		
	 * 近3个月心理创伤或急病		
     */
    public void setMnasfTrauma(Integer mnasfTrauma) {
        this.mnasfTrauma = mnasfTrauma;
    }
    /**		
	 * 精神心理问题		
     */
    public Integer getMnasfMentalPsychologyDisease() {
        return mnasfMentalPsychologyDisease;
    }

    /**		
	 * 精神心理问题		
     */
    public void setMnasfMentalPsychologyDisease(Integer mnasfMentalPsychologyDisease) {
        this.mnasfMentalPsychologyDisease = mnasfMentalPsychologyDisease;
    }
    /**		
	 * bmi得分		
     */
    public Integer getMnasfBmi() {
        return mnasfBmi;
    }

    /**		
	 * bmi得分		
     */
    public void setMnasfBmi(Integer mnasfBmi) {
        this.mnasfBmi = mnasfBmi;
    }
    /**		
	 * 病人是否独居		
     */
    public Integer getMnasfLiveAlone() {
        return mnasfLiveAlone;
    }

    /**		
	 * 病人是否独居		
     */
    public void setMnasfLiveAlone(Integer mnasfLiveAlone) {
        this.mnasfLiveAlone = mnasfLiveAlone;
    }
    /**		
	 * 每日服用3种以上药物		
     */
    public Integer getMnasfTakeMultipleDrug() {
        return mnasfTakeMultipleDrug;
    }

    /**		
	 * 每日服用3种以上药物		
     */
    public void setMnasfTakeMultipleDrug(Integer mnasfTakeMultipleDrug) {
        this.mnasfTakeMultipleDrug = mnasfTakeMultipleDrug;
    }
    /**		
	 * 是否有褥疮或皮肤溃疡		
     */
    public Integer getMnasfBedsore() {
        return mnasfBedsore;
    }

    /**		
	 * 是否有褥疮或皮肤溃疡		
     */
    public void setMnasfBedsore(Integer mnasfBedsore) {
        this.mnasfBedsore = mnasfBedsore;
    }
    /**		
	 * 每天吃多少次主餐		
     */
    public Integer getMnasfStapleFoodTimes() {
        return mnasfStapleFoodTimes;
    }

    /**		
	 * 每天吃多少次主餐		
     */
    public void setMnasfStapleFoodTimes(Integer mnasfStapleFoodTimes) {
        this.mnasfStapleFoodTimes = mnasfStapleFoodTimes;
    }
    /**		
	 * 蛋白质摄取量指标		
     */
    public BigDecimal getMnasfProtein() {
        return mnasfProtein;
    }

    /**		
	 * 蛋白质摄取量指标		
     */
    public void setMnasfProtein(BigDecimal mnasfProtein) {
        this.mnasfProtein = mnasfProtein;
    }
    /**		
	 * 蛋白质摄取量-乳制品 选择为1，否则为0		
     */
    public Integer getMnasfProteinMilk() {
        return mnasfProteinMilk;
    }

    /**		
	 * 蛋白质摄取量-乳制品 选择为1，否则为0		
     */
    public void setMnasfProteinMilk(Integer mnasfProteinMilk) {
        this.mnasfProteinMilk = mnasfProteinMilk;
    }
    /**		
	 * 蛋白质摄取量-蛋类 选择为1，否则为0 		
     */
    public Integer getMnasfProteinEgg() {
        return mnasfProteinEgg;
    }

    /**		
	 * 蛋白质摄取量-蛋类 选择为1，否则为0 		
     */
    public void setMnasfProteinEgg(Integer mnasfProteinEgg) {
        this.mnasfProteinEgg = mnasfProteinEgg;
    }
    /**		
	 * 蛋白质摄取量-肉类  选择为1，否则为0		
     */
    public Integer getMnasfProteinMeat() {
        return mnasfProteinMeat;
    }

    /**		
	 * 蛋白质摄取量-肉类  选择为1，否则为0		
     */
    public void setMnasfProteinMeat(Integer mnasfProteinMeat) {
        this.mnasfProteinMeat = mnasfProteinMeat;
    }
    /**		
	 * 进食两份或以上水果或蔬菜		
     */
    public Integer getMnasfFruit() {
        return mnasfFruit;
    }

    /**		
	 * 进食两份或以上水果或蔬菜		
     */
    public void setMnasfFruit(Integer mnasfFruit) {
        this.mnasfFruit = mnasfFruit;
    }
    /**		
	 * 每天摄入流质			
     */
    public BigDecimal getMnasfLiquid() {
        return mnasfLiquid;
    }

    /**		
	 * 每天摄入流质			
     */
    public void setMnasfLiquid(BigDecimal mnasfLiquid) {
        this.mnasfLiquid = mnasfLiquid;
    }
    /**		
	 * 自主进食模式			
     */
    public Integer getMnasfSelfEating() {
        return mnasfSelfEating;
    }

    /**		
	 * 自主进食模式			
     */
    public void setMnasfSelfEating(Integer mnasfSelfEating) {
        this.mnasfSelfEating = mnasfSelfEating;
    }
    /**		
	 * 自我评估营养状况			
     */
    public Integer getMnasfSelfAssessment() {
        return mnasfSelfAssessment;
    }

    /**		
	 * 自我评估营养状况			
     */
    public void setMnasfSelfAssessment(Integer mnasfSelfAssessment) {
        this.mnasfSelfAssessment = mnasfSelfAssessment;
    }
    /**		
	 * 评价自己的健康状况			
     */
    public BigDecimal getMnasfSelfHealth() {
        return mnasfSelfHealth;
    }

    /**		
	 * 评价自己的健康状况			
     */
    public void setMnasfSelfHealth(BigDecimal mnasfSelfHealth) {
        this.mnasfSelfHealth = mnasfSelfHealth;
    }
    /**		
	 * 上手臂中点臂围（MAC）cm		
     */
    public BigDecimal getMnasfMac() {
        return mnasfMac;
    }

    /**		
	 * 上手臂中点臂围（MAC）cm		
     */
    public void setMnasfMac(BigDecimal mnasfMac) {
        this.mnasfMac = mnasfMac;
    }
    /**		
	 * 小腿围（CC）cm			
     */
    public BigDecimal getMnasfCc() {
        return mnasfCc;
    }

    /**		
	 * 小腿围（CC）cm			
     */
    public void setMnasfCc(BigDecimal mnasfCc) {
        this.mnasfCc = mnasfCc;
    }
    /**		
	 * 第一阶段总分		
     */
    public BigDecimal getMnasfStep1Score() {
        return mnasfStep1Score;
    }

    /**		
	 * 第一阶段总分		
     */
    public void setMnasfStep1Score(BigDecimal mnasfStep1Score) {
        this.mnasfStep1Score = mnasfStep1Score;
    }
    /**		
	 * 第一阶段评价		
     */
    public String getMnasfStep1Result() {
        return mnasfStep1Result;
    }

    /**		
	 * 第一阶段评价		
     */
    public void setMnasfStep1Result(String mnasfStep1Result) {
        this.mnasfStep1Result = mnasfStep1Result;
    }
    /**		
	 * 总分可能是小数		
     */
    public BigDecimal getMnasfScore() {
        return mnasfScore;
    }

    /**		
	 * 总分可能是小数		
     */
    public void setMnasfScore(BigDecimal mnasfScore) {
        this.mnasfScore = mnasfScore;
    }
    /**		
	 * 评价		
     */
    public String getMnasfResult() {
        return mnasfResult;
    }

    /**		
	 * 评价		
     */
    public void setMnasfResult(String mnasfResult) {
        this.mnasfResult = mnasfResult;
    }
    /**		
	 * 		
     */
    public Integer getMnasfValue() {
        return mnasfValue;
    }

    /**		
	 * 		
     */
    public void setMnasfValue(Integer mnasfValue) {
        this.mnasfValue = mnasfValue;
    }
    /**		
	 * 		
     */
    public Integer getMnasfDay() {
        return mnasfDay;
    }

    /**		
	 * 		
     */
    public void setMnasfDay(Integer mnasfDay) {
        this.mnasfDay = mnasfDay;
    }
    /**		
	 * 数据来源：0-系统内；1-页面嵌套 		
     */
    public String getDataSource() {
        return dataSource;
    }

    /**		
	 * 数据来源：0-系统内；1-页面嵌套 		
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
        return "ScreenMnaSf{" +
            "mnasfId=" + mnasfId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", mnasfNo=" + mnasfNo +
            ", mnasfDate=" + mnasfDate +
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
            ", mnasfEatLess=" + mnasfEatLess +
            ", mnasfLossWeight=" + mnasfLossWeight +
            ", mnasfPhysicalActivity=" + mnasfPhysicalActivity +
            ", mnasfTrauma=" + mnasfTrauma +
            ", mnasfMentalPsychologyDisease=" + mnasfMentalPsychologyDisease +
            ", mnasfBmi=" + mnasfBmi +
            ", mnasfLiveAlone=" + mnasfLiveAlone +
            ", mnasfTakeMultipleDrug=" + mnasfTakeMultipleDrug +
            ", mnasfBedsore=" + mnasfBedsore +
            ", mnasfStapleFoodTimes=" + mnasfStapleFoodTimes +
            ", mnasfProtein=" + mnasfProtein +
            ", mnasfProteinMilk=" + mnasfProteinMilk +
            ", mnasfProteinEgg=" + mnasfProteinEgg +
            ", mnasfProteinMeat=" + mnasfProteinMeat +
            ", mnasfFruit=" + mnasfFruit +
            ", mnasfLiquid=" + mnasfLiquid +
            ", mnasfSelfEating=" + mnasfSelfEating +
            ", mnasfSelfAssessment=" + mnasfSelfAssessment +
            ", mnasfSelfHealth=" + mnasfSelfHealth +
            ", mnasfMac=" + mnasfMac +
            ", mnasfCc=" + mnasfCc +
            ", mnasfStep1Score=" + mnasfStep1Score +
            ", mnasfStep1Result=" + mnasfStep1Result +
            ", mnasfScore=" + mnasfScore +
            ", mnasfResult=" + mnasfResult +
            ", mnasfValue=" + mnasfValue +
            ", mnasfDay=" + mnasfDay +
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
