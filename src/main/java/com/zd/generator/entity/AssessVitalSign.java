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
 * 体征评估
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("assess_vital_sign")
@ApiModel(value = "AssessVitalSign对象", description = "体征评估")
public class AssessVitalSign extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vs_id", type = IdType.AUTO)
    private Long vsId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("评估日期")
    private LocalDateTime assessDate;

    @ApiModelProperty("评估时间")
    private String assessTime;

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

    @ApiModelProperty("体温(℃)")
    private BigDecimal temperature;

    @ApiModelProperty("脉搏（次/分钟）")
    private Integer pulse;

    @ApiModelProperty("呼吸（次/分钟）")
    private Integer respiratoryRate;

    @ApiModelProperty("收缩压（mmHg）")
    private Integer sbp;

    @ApiModelProperty("舒张压（mmHg）")
    private Integer dbp;

    @ApiModelProperty("意识,清/不清")
    private String realizeStatus;

    @ApiModelProperty("发育,良/中/差")
    private String growth;

    @ApiModelProperty("食欲,佳、中、差")
    private String appetite;

    @ApiModelProperty("精神,愉快、一般、忧郁")
    private String spirit;

    @ApiModelProperty("皮肤弹性,正常、差")
    private String skinElasticity;

    @ApiModelProperty("皮肤出血点,有、无")
    private String skinBleedingPoint;

    @ApiModelProperty("皮肤黄疸,有、无")
    private String skinJaundice;

    @ApiModelProperty("皮肤毛囊角化,有、无")
    private String skinFollicularCornification;

    @ApiModelProperty("皮肤光泽,一般、较好、好")
    private String skinLuster;

    @ApiModelProperty("皮肤鳞皮,有、无")
    private String skinScales;

    @ApiModelProperty("皮肤脂溢性皮炎,有、无")
    private String skinSeborrheicDermatitis;

    @ApiModelProperty("头部毛发,一般、较好、好")
    private String headHair;

    @ApiModelProperty("头部秃发,有、无")
    private String headBaldness;

    @ApiModelProperty("头发光泽,有、无")
    private String headHairLuster;

    @ApiModelProperty("眼结膜,正常、苍白、充血、干燥")
    private String conjunctiva;

    @ApiModelProperty("眼角膜,正常、软化、溃疡、眼睑炎")
    private String cornea;

    @ApiModelProperty("唇,正常、苍白、干裂出血、溃疡")
    private String lip;

    @ApiModelProperty("舌,正常、糜烂、溃疡、乳头萎缩、乳头肥大")
    private String tongue;

    @ApiModelProperty("口角,正常、裂隙、溃疡")
    private String mouthCorner;

    @ApiModelProperty("齿龈,正常、出血、苍白、溃疡")
    private String gingiva;

    @ApiModelProperty("甲状腺,正常、肿大、结节、硬、软")
    private String thyroid;

    @ApiModelProperty("胸部,正常、鸡胸、漏斗胸、串珠、哈氏沟")
    private String chest;

    @ApiModelProperty("腹部,平坦、膨隆、凹陷")
    private String belly;

    @ApiModelProperty("四肢,正常、粗大、细小、水肿、手镯、下肢“O”型腿、下肢“X”型腿、反射")
    private String limb;

    @ApiModelProperty("肝脏,正常、增大")
    private String liver;

    @ApiModelProperty("脾脏,正常、增大")
    private String spleen;

    @ApiModelProperty("指甲、趾甲,正常、有光泽、无光泽、匙甲、脊状甲")
    private String nail;

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
    public Long getVsId() {
        return vsId;
    }

    /**		
	 * 		
     */
    public void setVsId(Long vsId) {
        this.vsId = vsId;
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
	 * 评估时间		
     */
    public String getAssessTime() {
        return assessTime;
    }

    /**		
	 * 评估时间		
     */
    public void setAssessTime(String assessTime) {
        this.assessTime = assessTime;
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
	 * 体温(℃)		
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    /**		
	 * 体温(℃)		
     */
    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }
    /**		
	 * 脉搏（次/分钟）		
     */
    public Integer getPulse() {
        return pulse;
    }

    /**		
	 * 脉搏（次/分钟）		
     */
    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }
    /**		
	 * 呼吸（次/分钟）		
     */
    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    /**		
	 * 呼吸（次/分钟）		
     */
    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    /**		
	 * 收缩压（mmHg）		
     */
    public Integer getSbp() {
        return sbp;
    }

    /**		
	 * 收缩压（mmHg）		
     */
    public void setSbp(Integer sbp) {
        this.sbp = sbp;
    }
    /**		
	 * 舒张压（mmHg）		
     */
    public Integer getDbp() {
        return dbp;
    }

    /**		
	 * 舒张压（mmHg）		
     */
    public void setDbp(Integer dbp) {
        this.dbp = dbp;
    }
    /**		
	 * 意识,清/不清		
     */
    public String getRealizeStatus() {
        return realizeStatus;
    }

    /**		
	 * 意识,清/不清		
     */
    public void setRealizeStatus(String realizeStatus) {
        this.realizeStatus = realizeStatus;
    }
    /**		
	 * 发育,良/中/差		
     */
    public String getGrowth() {
        return growth;
    }

    /**		
	 * 发育,良/中/差		
     */
    public void setGrowth(String growth) {
        this.growth = growth;
    }
    /**		
	 * 食欲,佳、中、差		
     */
    public String getAppetite() {
        return appetite;
    }

    /**		
	 * 食欲,佳、中、差		
     */
    public void setAppetite(String appetite) {
        this.appetite = appetite;
    }
    /**		
	 * 精神,愉快、一般、忧郁		
     */
    public String getSpirit() {
        return spirit;
    }

    /**		
	 * 精神,愉快、一般、忧郁		
     */
    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }
    /**		
	 * 皮肤弹性,正常、差		
     */
    public String getSkinElasticity() {
        return skinElasticity;
    }

    /**		
	 * 皮肤弹性,正常、差		
     */
    public void setSkinElasticity(String skinElasticity) {
        this.skinElasticity = skinElasticity;
    }
    /**		
	 * 皮肤出血点,有、无		
     */
    public String getSkinBleedingPoint() {
        return skinBleedingPoint;
    }

    /**		
	 * 皮肤出血点,有、无		
     */
    public void setSkinBleedingPoint(String skinBleedingPoint) {
        this.skinBleedingPoint = skinBleedingPoint;
    }
    /**		
	 * 皮肤黄疸,有、无		
     */
    public String getSkinJaundice() {
        return skinJaundice;
    }

    /**		
	 * 皮肤黄疸,有、无		
     */
    public void setSkinJaundice(String skinJaundice) {
        this.skinJaundice = skinJaundice;
    }
    /**		
	 * 皮肤毛囊角化,有、无		
     */
    public String getSkinFollicularCornification() {
        return skinFollicularCornification;
    }

    /**		
	 * 皮肤毛囊角化,有、无		
     */
    public void setSkinFollicularCornification(String skinFollicularCornification) {
        this.skinFollicularCornification = skinFollicularCornification;
    }
    /**		
	 * 皮肤光泽,一般、较好、好		
     */
    public String getSkinLuster() {
        return skinLuster;
    }

    /**		
	 * 皮肤光泽,一般、较好、好		
     */
    public void setSkinLuster(String skinLuster) {
        this.skinLuster = skinLuster;
    }
    /**		
	 * 皮肤鳞皮,有、无		
     */
    public String getSkinScales() {
        return skinScales;
    }

    /**		
	 * 皮肤鳞皮,有、无		
     */
    public void setSkinScales(String skinScales) {
        this.skinScales = skinScales;
    }
    /**		
	 * 皮肤脂溢性皮炎,有、无		
     */
    public String getSkinSeborrheicDermatitis() {
        return skinSeborrheicDermatitis;
    }

    /**		
	 * 皮肤脂溢性皮炎,有、无		
     */
    public void setSkinSeborrheicDermatitis(String skinSeborrheicDermatitis) {
        this.skinSeborrheicDermatitis = skinSeborrheicDermatitis;
    }
    /**		
	 * 头部毛发,一般、较好、好		
     */
    public String getHeadHair() {
        return headHair;
    }

    /**		
	 * 头部毛发,一般、较好、好		
     */
    public void setHeadHair(String headHair) {
        this.headHair = headHair;
    }
    /**		
	 * 头部秃发,有、无		
     */
    public String getHeadBaldness() {
        return headBaldness;
    }

    /**		
	 * 头部秃发,有、无		
     */
    public void setHeadBaldness(String headBaldness) {
        this.headBaldness = headBaldness;
    }
    /**		
	 * 头发光泽,有、无		
     */
    public String getHeadHairLuster() {
        return headHairLuster;
    }

    /**		
	 * 头发光泽,有、无		
     */
    public void setHeadHairLuster(String headHairLuster) {
        this.headHairLuster = headHairLuster;
    }
    /**		
	 * 眼结膜,正常、苍白、充血、干燥		
     */
    public String getConjunctiva() {
        return conjunctiva;
    }

    /**		
	 * 眼结膜,正常、苍白、充血、干燥		
     */
    public void setConjunctiva(String conjunctiva) {
        this.conjunctiva = conjunctiva;
    }
    /**		
	 * 眼角膜,正常、软化、溃疡、眼睑炎		
     */
    public String getCornea() {
        return cornea;
    }

    /**		
	 * 眼角膜,正常、软化、溃疡、眼睑炎		
     */
    public void setCornea(String cornea) {
        this.cornea = cornea;
    }
    /**		
	 * 唇,正常、苍白、干裂出血、溃疡		
     */
    public String getLip() {
        return lip;
    }

    /**		
	 * 唇,正常、苍白、干裂出血、溃疡		
     */
    public void setLip(String lip) {
        this.lip = lip;
    }
    /**		
	 * 舌,正常、糜烂、溃疡、乳头萎缩、乳头肥大		
     */
    public String getTongue() {
        return tongue;
    }

    /**		
	 * 舌,正常、糜烂、溃疡、乳头萎缩、乳头肥大		
     */
    public void setTongue(String tongue) {
        this.tongue = tongue;
    }
    /**		
	 * 口角,正常、裂隙、溃疡		
     */
    public String getMouthCorner() {
        return mouthCorner;
    }

    /**		
	 * 口角,正常、裂隙、溃疡		
     */
    public void setMouthCorner(String mouthCorner) {
        this.mouthCorner = mouthCorner;
    }
    /**		
	 * 齿龈,正常、出血、苍白、溃疡		
     */
    public String getGingiva() {
        return gingiva;
    }

    /**		
	 * 齿龈,正常、出血、苍白、溃疡		
     */
    public void setGingiva(String gingiva) {
        this.gingiva = gingiva;
    }
    /**		
	 * 甲状腺,正常、肿大、结节、硬、软		
     */
    public String getThyroid() {
        return thyroid;
    }

    /**		
	 * 甲状腺,正常、肿大、结节、硬、软		
     */
    public void setThyroid(String thyroid) {
        this.thyroid = thyroid;
    }
    /**		
	 * 胸部,正常、鸡胸、漏斗胸、串珠、哈氏沟		
     */
    public String getChest() {
        return chest;
    }

    /**		
	 * 胸部,正常、鸡胸、漏斗胸、串珠、哈氏沟		
     */
    public void setChest(String chest) {
        this.chest = chest;
    }
    /**		
	 * 腹部,平坦、膨隆、凹陷		
     */
    public String getBelly() {
        return belly;
    }

    /**		
	 * 腹部,平坦、膨隆、凹陷		
     */
    public void setBelly(String belly) {
        this.belly = belly;
    }
    /**		
	 * 四肢,正常、粗大、细小、水肿、手镯、下肢“O”型腿、下肢“X”型腿、反射		
     */
    public String getLimb() {
        return limb;
    }

    /**		
	 * 四肢,正常、粗大、细小、水肿、手镯、下肢“O”型腿、下肢“X”型腿、反射		
     */
    public void setLimb(String limb) {
        this.limb = limb;
    }
    /**		
	 * 肝脏,正常、增大		
     */
    public String getLiver() {
        return liver;
    }

    /**		
	 * 肝脏,正常、增大		
     */
    public void setLiver(String liver) {
        this.liver = liver;
    }
    /**		
	 * 脾脏,正常、增大		
     */
    public String getSpleen() {
        return spleen;
    }

    /**		
	 * 脾脏,正常、增大		
     */
    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }
    /**		
	 * 指甲、趾甲,正常、有光泽、无光泽、匙甲、脊状甲		
     */
    public String getNail() {
        return nail;
    }

    /**		
	 * 指甲、趾甲,正常、有光泽、无光泽、匙甲、脊状甲		
     */
    public void setNail(String nail) {
        this.nail = nail;
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
        return "AssessVitalSign{" +
            "vsId=" + vsId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", assessDate=" + assessDate +
            ", assessTime=" + assessTime +
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
            ", temperature=" + temperature +
            ", pulse=" + pulse +
            ", respiratoryRate=" + respiratoryRate +
            ", sbp=" + sbp +
            ", dbp=" + dbp +
            ", realizeStatus=" + realizeStatus +
            ", growth=" + growth +
            ", appetite=" + appetite +
            ", spirit=" + spirit +
            ", skinElasticity=" + skinElasticity +
            ", skinBleedingPoint=" + skinBleedingPoint +
            ", skinJaundice=" + skinJaundice +
            ", skinFollicularCornification=" + skinFollicularCornification +
            ", skinLuster=" + skinLuster +
            ", skinScales=" + skinScales +
            ", skinSeborrheicDermatitis=" + skinSeborrheicDermatitis +
            ", headHair=" + headHair +
            ", headBaldness=" + headBaldness +
            ", headHairLuster=" + headHairLuster +
            ", conjunctiva=" + conjunctiva +
            ", cornea=" + cornea +
            ", lip=" + lip +
            ", tongue=" + tongue +
            ", mouthCorner=" + mouthCorner +
            ", gingiva=" + gingiva +
            ", thyroid=" + thyroid +
            ", chest=" + chest +
            ", belly=" + belly +
            ", limb=" + limb +
            ", liver=" + liver +
            ", spleen=" + spleen +
            ", nail=" + nail +
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
