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
@TableName("screen_mna")
@ApiModel(value = "ScreenMna对象", description = "MNA筛查")
public class ScreenMna extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mna_id", type = IdType.AUTO)
    private Long mnaId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("筛查序号 针对patient_id+ visit_id，每次从1开始，逐次+1")
    private Integer mnaNo;

    @ApiModelProperty("筛查日期")
    private LocalDateTime mnaDate;

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
    private Integer mnaEatLess;

    @ApiModelProperty("近3个月体重丢失")
    private Integer mnaLossWeight;

    @ApiModelProperty("活动能力")
    private Integer mnaPhysicalActivity;

    @ApiModelProperty("近3个月心理创伤或急病")
    private Integer mnaTrauma;

    @ApiModelProperty("精神心理问题")
    private Integer mnaMentalPsychologyDisease;

    @ApiModelProperty("bmi得分")
    private Integer mnaBmi;

    @ApiModelProperty("病人是否独居")
    private Integer mnaLiveAlone;

    @ApiModelProperty("每日服用3种以上药物")
    private Integer mnaTakeMultipleDrug;

    @ApiModelProperty("是否有褥疮或皮肤溃疡")
    private Integer mnaBedsore;

    @ApiModelProperty("每天吃多少次主餐")
    private Integer mnaStapleFoodTimes;

    @ApiModelProperty("蛋白质摄取量指标")
    private BigDecimal mnaProtein;

    @ApiModelProperty("蛋白质摄取量-乳制品 选择为1，否则为0")
    private Integer mnaProteinMilk;

    @ApiModelProperty("蛋白质摄取量-蛋类 选择为1，否则为0 ")
    private Integer mnaProteinEgg;

    @ApiModelProperty("蛋白质摄取量-肉类  选择为1，否则为0")
    private Integer mnaProteinMeat;

    @ApiModelProperty("进食两份或以上水果或蔬菜")
    private Integer mnaFruit;

    @ApiModelProperty("每天摄入流质	")
    private BigDecimal mnaLiquid;

    @ApiModelProperty("自主进食模式	")
    private Integer mnaSelfEating;

    @ApiModelProperty("自我评估营养状况	")
    private Integer mnaSelfAssessment;

    @ApiModelProperty("评价自己的健康状况	")
    private BigDecimal mnaSelfHealth;

    @ApiModelProperty("上手臂中点臂围（MAC）cm")
    private BigDecimal mnaMac;

    @ApiModelProperty("小腿围（CC）cm	")
    private BigDecimal mnaCc;

    @ApiModelProperty("第一阶段总分")
    private BigDecimal mnaStep1Score;

    @ApiModelProperty("第一阶段评价")
    private String mnaStep1Result;

    @ApiModelProperty("总分可能是小数")
    private BigDecimal mnaScore;

    @ApiModelProperty("评价")
    private String mnaResult;

    private Integer mnaValue;

    private Integer mnaDay;

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
    public Long getMnaId() {
        return mnaId;
    }

    /**		
	 * 		
     */
    public void setMnaId(Long mnaId) {
        this.mnaId = mnaId;
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
    public Integer getMnaNo() {
        return mnaNo;
    }

    /**		
	 * 筛查序号 针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public void setMnaNo(Integer mnaNo) {
        this.mnaNo = mnaNo;
    }
    /**		
	 * 筛查日期		
     */
    public LocalDateTime getMnaDate() {
        return mnaDate;
    }

    /**		
	 * 筛查日期		
     */
    public void setMnaDate(LocalDateTime mnaDate) {
        this.mnaDate = mnaDate;
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
    public Integer getMnaEatLess() {
        return mnaEatLess;
    }

    /**		
	 * 近3个月减少食量			
     */
    public void setMnaEatLess(Integer mnaEatLess) {
        this.mnaEatLess = mnaEatLess;
    }
    /**		
	 * 近3个月体重丢失		
     */
    public Integer getMnaLossWeight() {
        return mnaLossWeight;
    }

    /**		
	 * 近3个月体重丢失		
     */
    public void setMnaLossWeight(Integer mnaLossWeight) {
        this.mnaLossWeight = mnaLossWeight;
    }
    /**		
	 * 活动能力		
     */
    public Integer getMnaPhysicalActivity() {
        return mnaPhysicalActivity;
    }

    /**		
	 * 活动能力		
     */
    public void setMnaPhysicalActivity(Integer mnaPhysicalActivity) {
        this.mnaPhysicalActivity = mnaPhysicalActivity;
    }
    /**		
	 * 近3个月心理创伤或急病		
     */
    public Integer getMnaTrauma() {
        return mnaTrauma;
    }

    /**		
	 * 近3个月心理创伤或急病		
     */
    public void setMnaTrauma(Integer mnaTrauma) {
        this.mnaTrauma = mnaTrauma;
    }
    /**		
	 * 精神心理问题		
     */
    public Integer getMnaMentalPsychologyDisease() {
        return mnaMentalPsychologyDisease;
    }

    /**		
	 * 精神心理问题		
     */
    public void setMnaMentalPsychologyDisease(Integer mnaMentalPsychologyDisease) {
        this.mnaMentalPsychologyDisease = mnaMentalPsychologyDisease;
    }
    /**		
	 * bmi得分		
     */
    public Integer getMnaBmi() {
        return mnaBmi;
    }

    /**		
	 * bmi得分		
     */
    public void setMnaBmi(Integer mnaBmi) {
        this.mnaBmi = mnaBmi;
    }
    /**		
	 * 病人是否独居		
     */
    public Integer getMnaLiveAlone() {
        return mnaLiveAlone;
    }

    /**		
	 * 病人是否独居		
     */
    public void setMnaLiveAlone(Integer mnaLiveAlone) {
        this.mnaLiveAlone = mnaLiveAlone;
    }
    /**		
	 * 每日服用3种以上药物		
     */
    public Integer getMnaTakeMultipleDrug() {
        return mnaTakeMultipleDrug;
    }

    /**		
	 * 每日服用3种以上药物		
     */
    public void setMnaTakeMultipleDrug(Integer mnaTakeMultipleDrug) {
        this.mnaTakeMultipleDrug = mnaTakeMultipleDrug;
    }
    /**		
	 * 是否有褥疮或皮肤溃疡		
     */
    public Integer getMnaBedsore() {
        return mnaBedsore;
    }

    /**		
	 * 是否有褥疮或皮肤溃疡		
     */
    public void setMnaBedsore(Integer mnaBedsore) {
        this.mnaBedsore = mnaBedsore;
    }
    /**		
	 * 每天吃多少次主餐		
     */
    public Integer getMnaStapleFoodTimes() {
        return mnaStapleFoodTimes;
    }

    /**		
	 * 每天吃多少次主餐		
     */
    public void setMnaStapleFoodTimes(Integer mnaStapleFoodTimes) {
        this.mnaStapleFoodTimes = mnaStapleFoodTimes;
    }
    /**		
	 * 蛋白质摄取量指标		
     */
    public BigDecimal getMnaProtein() {
        return mnaProtein;
    }

    /**		
	 * 蛋白质摄取量指标		
     */
    public void setMnaProtein(BigDecimal mnaProtein) {
        this.mnaProtein = mnaProtein;
    }
    /**		
	 * 蛋白质摄取量-乳制品 选择为1，否则为0		
     */
    public Integer getMnaProteinMilk() {
        return mnaProteinMilk;
    }

    /**		
	 * 蛋白质摄取量-乳制品 选择为1，否则为0		
     */
    public void setMnaProteinMilk(Integer mnaProteinMilk) {
        this.mnaProteinMilk = mnaProteinMilk;
    }
    /**		
	 * 蛋白质摄取量-蛋类 选择为1，否则为0 		
     */
    public Integer getMnaProteinEgg() {
        return mnaProteinEgg;
    }

    /**		
	 * 蛋白质摄取量-蛋类 选择为1，否则为0 		
     */
    public void setMnaProteinEgg(Integer mnaProteinEgg) {
        this.mnaProteinEgg = mnaProteinEgg;
    }
    /**		
	 * 蛋白质摄取量-肉类  选择为1，否则为0		
     */
    public Integer getMnaProteinMeat() {
        return mnaProteinMeat;
    }

    /**		
	 * 蛋白质摄取量-肉类  选择为1，否则为0		
     */
    public void setMnaProteinMeat(Integer mnaProteinMeat) {
        this.mnaProteinMeat = mnaProteinMeat;
    }
    /**		
	 * 进食两份或以上水果或蔬菜		
     */
    public Integer getMnaFruit() {
        return mnaFruit;
    }

    /**		
	 * 进食两份或以上水果或蔬菜		
     */
    public void setMnaFruit(Integer mnaFruit) {
        this.mnaFruit = mnaFruit;
    }
    /**		
	 * 每天摄入流质			
     */
    public BigDecimal getMnaLiquid() {
        return mnaLiquid;
    }

    /**		
	 * 每天摄入流质			
     */
    public void setMnaLiquid(BigDecimal mnaLiquid) {
        this.mnaLiquid = mnaLiquid;
    }
    /**		
	 * 自主进食模式			
     */
    public Integer getMnaSelfEating() {
        return mnaSelfEating;
    }

    /**		
	 * 自主进食模式			
     */
    public void setMnaSelfEating(Integer mnaSelfEating) {
        this.mnaSelfEating = mnaSelfEating;
    }
    /**		
	 * 自我评估营养状况			
     */
    public Integer getMnaSelfAssessment() {
        return mnaSelfAssessment;
    }

    /**		
	 * 自我评估营养状况			
     */
    public void setMnaSelfAssessment(Integer mnaSelfAssessment) {
        this.mnaSelfAssessment = mnaSelfAssessment;
    }
    /**		
	 * 评价自己的健康状况			
     */
    public BigDecimal getMnaSelfHealth() {
        return mnaSelfHealth;
    }

    /**		
	 * 评价自己的健康状况			
     */
    public void setMnaSelfHealth(BigDecimal mnaSelfHealth) {
        this.mnaSelfHealth = mnaSelfHealth;
    }
    /**		
	 * 上手臂中点臂围（MAC）cm		
     */
    public BigDecimal getMnaMac() {
        return mnaMac;
    }

    /**		
	 * 上手臂中点臂围（MAC）cm		
     */
    public void setMnaMac(BigDecimal mnaMac) {
        this.mnaMac = mnaMac;
    }
    /**		
	 * 小腿围（CC）cm			
     */
    public BigDecimal getMnaCc() {
        return mnaCc;
    }

    /**		
	 * 小腿围（CC）cm			
     */
    public void setMnaCc(BigDecimal mnaCc) {
        this.mnaCc = mnaCc;
    }
    /**		
	 * 第一阶段总分		
     */
    public BigDecimal getMnaStep1Score() {
        return mnaStep1Score;
    }

    /**		
	 * 第一阶段总分		
     */
    public void setMnaStep1Score(BigDecimal mnaStep1Score) {
        this.mnaStep1Score = mnaStep1Score;
    }
    /**		
	 * 第一阶段评价		
     */
    public String getMnaStep1Result() {
        return mnaStep1Result;
    }

    /**		
	 * 第一阶段评价		
     */
    public void setMnaStep1Result(String mnaStep1Result) {
        this.mnaStep1Result = mnaStep1Result;
    }
    /**		
	 * 总分可能是小数		
     */
    public BigDecimal getMnaScore() {
        return mnaScore;
    }

    /**		
	 * 总分可能是小数		
     */
    public void setMnaScore(BigDecimal mnaScore) {
        this.mnaScore = mnaScore;
    }
    /**		
	 * 评价		
     */
    public String getMnaResult() {
        return mnaResult;
    }

    /**		
	 * 评价		
     */
    public void setMnaResult(String mnaResult) {
        this.mnaResult = mnaResult;
    }
    /**		
	 * 		
     */
    public Integer getMnaValue() {
        return mnaValue;
    }

    /**		
	 * 		
     */
    public void setMnaValue(Integer mnaValue) {
        this.mnaValue = mnaValue;
    }
    /**		
	 * 		
     */
    public Integer getMnaDay() {
        return mnaDay;
    }

    /**		
	 * 		
     */
    public void setMnaDay(Integer mnaDay) {
        this.mnaDay = mnaDay;
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
        return "ScreenMna{" +
            "mnaId=" + mnaId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", mnaNo=" + mnaNo +
            ", mnaDate=" + mnaDate +
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
            ", mnaEatLess=" + mnaEatLess +
            ", mnaLossWeight=" + mnaLossWeight +
            ", mnaPhysicalActivity=" + mnaPhysicalActivity +
            ", mnaTrauma=" + mnaTrauma +
            ", mnaMentalPsychologyDisease=" + mnaMentalPsychologyDisease +
            ", mnaBmi=" + mnaBmi +
            ", mnaLiveAlone=" + mnaLiveAlone +
            ", mnaTakeMultipleDrug=" + mnaTakeMultipleDrug +
            ", mnaBedsore=" + mnaBedsore +
            ", mnaStapleFoodTimes=" + mnaStapleFoodTimes +
            ", mnaProtein=" + mnaProtein +
            ", mnaProteinMilk=" + mnaProteinMilk +
            ", mnaProteinEgg=" + mnaProteinEgg +
            ", mnaProteinMeat=" + mnaProteinMeat +
            ", mnaFruit=" + mnaFruit +
            ", mnaLiquid=" + mnaLiquid +
            ", mnaSelfEating=" + mnaSelfEating +
            ", mnaSelfAssessment=" + mnaSelfAssessment +
            ", mnaSelfHealth=" + mnaSelfHealth +
            ", mnaMac=" + mnaMac +
            ", mnaCc=" + mnaCc +
            ", mnaStep1Score=" + mnaStep1Score +
            ", mnaStep1Result=" + mnaStep1Result +
            ", mnaScore=" + mnaScore +
            ", mnaResult=" + mnaResult +
            ", mnaValue=" + mnaValue +
            ", mnaDay=" + mnaDay +
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
