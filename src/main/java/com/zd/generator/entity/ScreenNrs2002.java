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
 * NRS筛查
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("screen_nrs2002")
@ApiModel(value = "ScreenNrs2002对象", description = "NRS筛查")
public class ScreenNrs2002 extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nrs_id", type = IdType.AUTO)
    private Long nrsId;

    @ApiModelProperty("唯一主键	  ")
    private String patientId;

    @ApiModelProperty("入院次数	  ")
    private String visitId;

    @ApiModelProperty("筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1")
    private Integer nrsNo;

    @ApiModelProperty("住院号			  ")
    private String inpNo;

    @ApiModelProperty("筛查日期			 ")
    private LocalDateTime nrsDate;

    @ApiModelProperty("机构编码			 ")
    private String orgCode;

    @ApiModelProperty("机构名称			 ")
    private String orgName;

    @ApiModelProperty("科别编码   ")
    private String deptCode;

    @ApiModelProperty("科别名字			 ")
    private String deptName;

    @ApiModelProperty("病区/房号  ")
    private String wardCode;

    @ApiModelProperty("病区名字			 ")
    private String wardName;

    @ApiModelProperty("床号可能有+等字符 ")
    private String bedNo;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别 男，女")
    private String sex;

    @ApiModelProperty("年龄			  ")
    private Integer age;

    @ApiModelProperty("孕前")
    private String pregPre;

    @ApiModelProperty("孕周")
    private String pregWeek;

    @ApiModelProperty("疾病诊断   ")
    private String diagnosis;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重	   ")
    private BigDecimal weight;

    @ApiModelProperty("体质指数	  ")
    private BigDecimal bmi;

    @ApiModelProperty("白蛋白值		  ")
    private BigDecimal alb;

    @ApiModelProperty("BMI<20.5（中国人用18.5）0-否 1-是  ")
    private String isBmiLess205;

    @ApiModelProperty("疾病严重 0-否 1-是")
    private String isIllSerious;

    @ApiModelProperty("营养状况评分			0-4分   ")
    private Integer nutriStatusScore;

    @ApiModelProperty("身高")
    private BigDecimal realHeight;

    @ApiModelProperty("体重")
    private BigDecimal realWeight;

    @ApiModelProperty("体质指数")
    private BigDecimal realBmi;

    @ApiModelProperty("是否体重下降 是	0-无 1-有")
    private String isWeightDesc;

    @ApiModelProperty("近期是否体重下降()")
    private String weightValue;

    @ApiModelProperty("体重分")
    private String weightScore;

    @ApiModelProperty("一周内进食量减少 	0-否 1-是   ")
    private String isWeekFoodDesc;

    @ApiModelProperty("进食量(25~50%（1分）50~75%（2分）75~100%（3分)\"")
    private String foodValue;

    @ApiModelProperty("疾病评分	0-4分 ")
    private Integer illScore;

    @ApiModelProperty("营养需要量(10髋骨折；11慢性疾病急性发作有或有并发症；12肝硬化；13慢阻肺；14血液透析；15一般恶性肿瘤20腹部大手术；21脑卒中；22重症肺炎；23血液恶性肿瘤30头部损伤；31颅脑损伤；32骨髓移植；33重症监护患者（APACHE-Ⅱ评分＞10分）)")
    private String illValue;

    @ApiModelProperty("年龄评分	0-1分 ")
    private Integer ageScore;

    @ApiModelProperty("营养风险总评分	  ")
    private Integer nrsScore;

    @ApiModelProperty("结果			  ")
    private String nrsResult;

    private Integer nrsValue;

    private Integer nrsDay;

    @ApiModelProperty("数据来源：0-系统内；1-页面嵌套  ")
    private String dataSource;

    @ApiModelProperty("操作者科室编码			 ")
    private String opeDeptCode;

    @ApiModelProperty("操作者科室名称			 ")
    private String opeDeptName;

    @ApiModelProperty("操作者编码			 ")
    private String userNo;

    @ApiModelProperty("操作者姓名			 ")
    private String userName;

    @ApiModelProperty("复核者编码		  ")
    private String recheckerCode;

    @ApiModelProperty("复核者姓名		  ")
    private String recheckerName;

    @ApiModelProperty("是否会诊		  ")
    private String isConsultation;

    @ApiModelProperty("是否发送通知		 ")
    private String isSendNotice;

    @ApiModelProperty("创建时间			 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码			 ")
    private String createUserCode;

    @ApiModelProperty("创建人名称			 ")
    private String createUserName;

    @ApiModelProperty("更新时间			 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码			 ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称			 ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getNrsId() {
        return nrsId;
    }

    /**		
	 * 		
     */
    public void setNrsId(Long nrsId) {
        this.nrsId = nrsId;
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
	 * 筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public Integer getNrsNo() {
        return nrsNo;
    }

    /**		
	 * 筛查序号针对patient_id+ visit_id，每次从1开始，逐次+1		
     */
    public void setNrsNo(Integer nrsNo) {
        this.nrsNo = nrsNo;
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
    public LocalDateTime getNrsDate() {
        return nrsDate;
    }

    /**		
	 * 筛查日期			 		
     */
    public void setNrsDate(LocalDateTime nrsDate) {
        this.nrsDate = nrsDate;
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
	 * 孕前		
     */
    public String getPregPre() {
        return pregPre;
    }

    /**		
	 * 孕前		
     */
    public void setPregPre(String pregPre) {
        this.pregPre = pregPre;
    }
    /**		
	 * 孕周		
     */
    public String getPregWeek() {
        return pregWeek;
    }

    /**		
	 * 孕周		
     */
    public void setPregWeek(String pregWeek) {
        this.pregWeek = pregWeek;
    }
    /**		
	 * 疾病诊断   		
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**		
	 * 疾病诊断   		
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
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
	 * 白蛋白值		  		
     */
    public BigDecimal getAlb() {
        return alb;
    }

    /**		
	 * 白蛋白值		  		
     */
    public void setAlb(BigDecimal alb) {
        this.alb = alb;
    }
    /**		
	 * BMI<20.5（中国人用18.5）0-否 1-是  		
     */
    public String getIsBmiLess205() {
        return isBmiLess205;
    }

    /**		
	 * BMI<20.5（中国人用18.5）0-否 1-是  		
     */
    public void setIsBmiLess205(String isBmiLess205) {
        this.isBmiLess205 = isBmiLess205;
    }
    /**		
	 * 疾病严重 0-否 1-是		
     */
    public String getIsIllSerious() {
        return isIllSerious;
    }

    /**		
	 * 疾病严重 0-否 1-是		
     */
    public void setIsIllSerious(String isIllSerious) {
        this.isIllSerious = isIllSerious;
    }
    /**		
	 * 营养状况评分			0-4分   		
     */
    public Integer getNutriStatusScore() {
        return nutriStatusScore;
    }

    /**		
	 * 营养状况评分			0-4分   		
     */
    public void setNutriStatusScore(Integer nutriStatusScore) {
        this.nutriStatusScore = nutriStatusScore;
    }
    /**		
	 * 身高		
     */
    public BigDecimal getRealHeight() {
        return realHeight;
    }

    /**		
	 * 身高		
     */
    public void setRealHeight(BigDecimal realHeight) {
        this.realHeight = realHeight;
    }
    /**		
	 * 体重		
     */
    public BigDecimal getRealWeight() {
        return realWeight;
    }

    /**		
	 * 体重		
     */
    public void setRealWeight(BigDecimal realWeight) {
        this.realWeight = realWeight;
    }
    /**		
	 * 体质指数		
     */
    public BigDecimal getRealBmi() {
        return realBmi;
    }

    /**		
	 * 体质指数		
     */
    public void setRealBmi(BigDecimal realBmi) {
        this.realBmi = realBmi;
    }
    /**		
	 * 是否体重下降 是	0-无 1-有		
     */
    public String getIsWeightDesc() {
        return isWeightDesc;
    }

    /**		
	 * 是否体重下降 是	0-无 1-有		
     */
    public void setIsWeightDesc(String isWeightDesc) {
        this.isWeightDesc = isWeightDesc;
    }
    /**		
	 * 近期是否体重下降()		
     */
    public String getWeightValue() {
        return weightValue;
    }

    /**		
	 * 近期是否体重下降()		
     */
    public void setWeightValue(String weightValue) {
        this.weightValue = weightValue;
    }
    /**		
	 * 体重分		
     */
    public String getWeightScore() {
        return weightScore;
    }

    /**		
	 * 体重分		
     */
    public void setWeightScore(String weightScore) {
        this.weightScore = weightScore;
    }
    /**		
	 * 一周内进食量减少 	0-否 1-是   		
     */
    public String getIsWeekFoodDesc() {
        return isWeekFoodDesc;
    }

    /**		
	 * 一周内进食量减少 	0-否 1-是   		
     */
    public void setIsWeekFoodDesc(String isWeekFoodDesc) {
        this.isWeekFoodDesc = isWeekFoodDesc;
    }
    /**		
	 * 进食量(25~50%（1分）50~75%（2分）75~100%（3分)\"		
     */
    public String getFoodValue() {
        return foodValue;
    }

    /**		
	 * 进食量(25~50%（1分）50~75%（2分）75~100%（3分)\"		
     */
    public void setFoodValue(String foodValue) {
        this.foodValue = foodValue;
    }
    /**		
	 * 疾病评分	0-4分 		
     */
    public Integer getIllScore() {
        return illScore;
    }

    /**		
	 * 疾病评分	0-4分 		
     */
    public void setIllScore(Integer illScore) {
        this.illScore = illScore;
    }
    /**		
	 * 营养需要量(10髋骨折；11慢性疾病急性发作有或有并发症；12肝硬化；13慢阻肺；14血液透析；15一般恶性肿瘤20腹部大手术；21脑卒中；22重症肺炎；23血液恶性肿瘤30头部损伤；31颅脑损伤；32骨髓移植；33重症监护患者（APACHE-Ⅱ评分＞10分）)		
     */
    public String getIllValue() {
        return illValue;
    }

    /**		
	 * 营养需要量(10髋骨折；11慢性疾病急性发作有或有并发症；12肝硬化；13慢阻肺；14血液透析；15一般恶性肿瘤20腹部大手术；21脑卒中；22重症肺炎；23血液恶性肿瘤30头部损伤；31颅脑损伤；32骨髓移植；33重症监护患者（APACHE-Ⅱ评分＞10分）)		
     */
    public void setIllValue(String illValue) {
        this.illValue = illValue;
    }
    /**		
	 * 年龄评分	0-1分 		
     */
    public Integer getAgeScore() {
        return ageScore;
    }

    /**		
	 * 年龄评分	0-1分 		
     */
    public void setAgeScore(Integer ageScore) {
        this.ageScore = ageScore;
    }
    /**		
	 * 营养风险总评分	  		
     */
    public Integer getNrsScore() {
        return nrsScore;
    }

    /**		
	 * 营养风险总评分	  		
     */
    public void setNrsScore(Integer nrsScore) {
        this.nrsScore = nrsScore;
    }
    /**		
	 * 结果			  		
     */
    public String getNrsResult() {
        return nrsResult;
    }

    /**		
	 * 结果			  		
     */
    public void setNrsResult(String nrsResult) {
        this.nrsResult = nrsResult;
    }
    /**		
	 * 		
     */
    public Integer getNrsValue() {
        return nrsValue;
    }

    /**		
	 * 		
     */
    public void setNrsValue(Integer nrsValue) {
        this.nrsValue = nrsValue;
    }
    /**		
	 * 		
     */
    public Integer getNrsDay() {
        return nrsDay;
    }

    /**		
	 * 		
     */
    public void setNrsDay(Integer nrsDay) {
        this.nrsDay = nrsDay;
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
        return "ScreenNrs2002{" +
            "nrsId=" + nrsId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", nrsNo=" + nrsNo +
            ", inpNo=" + inpNo +
            ", nrsDate=" + nrsDate +
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
            ", pregPre=" + pregPre +
            ", pregWeek=" + pregWeek +
            ", diagnosis=" + diagnosis +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", alb=" + alb +
            ", isBmiLess205=" + isBmiLess205 +
            ", isIllSerious=" + isIllSerious +
            ", nutriStatusScore=" + nutriStatusScore +
            ", realHeight=" + realHeight +
            ", realWeight=" + realWeight +
            ", realBmi=" + realBmi +
            ", isWeightDesc=" + isWeightDesc +
            ", weightValue=" + weightValue +
            ", weightScore=" + weightScore +
            ", isWeekFoodDesc=" + isWeekFoodDesc +
            ", foodValue=" + foodValue +
            ", illScore=" + illScore +
            ", illValue=" + illValue +
            ", ageScore=" + ageScore +
            ", nrsScore=" + nrsScore +
            ", nrsResult=" + nrsResult +
            ", nrsValue=" + nrsValue +
            ", nrsDay=" + nrsDay +
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
