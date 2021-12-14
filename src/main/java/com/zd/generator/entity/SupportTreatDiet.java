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
 * 治疗膳食
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_treat_diet")
@ApiModel(value = "SupportTreatDiet对象", description = "治疗膳食")
public class SupportTreatDiet extends BaseModel {

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

    @ApiModelProperty("床号，可能有+等字符")
    private String bedNo;

    @ApiModelProperty("姓名 ，男，女")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("谷薯类")
    private BigDecimal grain;

    @ApiModelProperty("蛋类")
    private BigDecimal egg;

    @ApiModelProperty("奶类")
    private BigDecimal milk;

    @ApiModelProperty("肉类")
    private BigDecimal meat;

    @ApiModelProperty("蔬菜")
    private BigDecimal vegetable;

    @ApiModelProperty("水果")
    private BigDecimal fruit;

    @ApiModelProperty("豆制品")
    private BigDecimal bean;

    @ApiModelProperty("植物油")
    private BigDecimal oil;

    @ApiModelProperty("食盐")
    private BigDecimal salt;

    @ApiModelProperty("膳食原则")
    private String dietaryPrinciple;

    @ApiModelProperty("注意事项")
    private String note;

    @ApiModelProperty("预警信息")
    private String warningInfo;

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
	 * 床号，可能有+等字符		
     */
    public String getBedNo() {
        return bedNo;
    }

    /**		
	 * 床号，可能有+等字符		
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }
    /**		
	 * 姓名 ，男，女		
     */
    public String getName() {
        return name;
    }

    /**		
	 * 姓名 ，男，女		
     */
    public void setName(String name) {
        this.name = name;
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
	 * 谷薯类		
     */
    public BigDecimal getGrain() {
        return grain;
    }

    /**		
	 * 谷薯类		
     */
    public void setGrain(BigDecimal grain) {
        this.grain = grain;
    }
    /**		
	 * 蛋类		
     */
    public BigDecimal getEgg() {
        return egg;
    }

    /**		
	 * 蛋类		
     */
    public void setEgg(BigDecimal egg) {
        this.egg = egg;
    }
    /**		
	 * 奶类		
     */
    public BigDecimal getMilk() {
        return milk;
    }

    /**		
	 * 奶类		
     */
    public void setMilk(BigDecimal milk) {
        this.milk = milk;
    }
    /**		
	 * 肉类		
     */
    public BigDecimal getMeat() {
        return meat;
    }

    /**		
	 * 肉类		
     */
    public void setMeat(BigDecimal meat) {
        this.meat = meat;
    }
    /**		
	 * 蔬菜		
     */
    public BigDecimal getVegetable() {
        return vegetable;
    }

    /**		
	 * 蔬菜		
     */
    public void setVegetable(BigDecimal vegetable) {
        this.vegetable = vegetable;
    }
    /**		
	 * 水果		
     */
    public BigDecimal getFruit() {
        return fruit;
    }

    /**		
	 * 水果		
     */
    public void setFruit(BigDecimal fruit) {
        this.fruit = fruit;
    }
    /**		
	 * 豆制品		
     */
    public BigDecimal getBean() {
        return bean;
    }

    /**		
	 * 豆制品		
     */
    public void setBean(BigDecimal bean) {
        this.bean = bean;
    }
    /**		
	 * 植物油		
     */
    public BigDecimal getOil() {
        return oil;
    }

    /**		
	 * 植物油		
     */
    public void setOil(BigDecimal oil) {
        this.oil = oil;
    }
    /**		
	 * 食盐		
     */
    public BigDecimal getSalt() {
        return salt;
    }

    /**		
	 * 食盐		
     */
    public void setSalt(BigDecimal salt) {
        this.salt = salt;
    }
    /**		
	 * 膳食原则		
     */
    public String getDietaryPrinciple() {
        return dietaryPrinciple;
    }

    /**		
	 * 膳食原则		
     */
    public void setDietaryPrinciple(String dietaryPrinciple) {
        this.dietaryPrinciple = dietaryPrinciple;
    }
    /**		
	 * 注意事项		
     */
    public String getNote() {
        return note;
    }

    /**		
	 * 注意事项		
     */
    public void setNote(String note) {
        this.note = note;
    }
    /**		
	 * 预警信息		
     */
    public String getWarningInfo() {
        return warningInfo;
    }

    /**		
	 * 预警信息		
     */
    public void setWarningInfo(String warningInfo) {
        this.warningInfo = warningInfo;
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
        return "SupportTreatDiet{" +
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
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", grain=" + grain +
            ", egg=" + egg +
            ", milk=" + milk +
            ", meat=" + meat +
            ", vegetable=" + vegetable +
            ", fruit=" + fruit +
            ", bean=" + bean +
            ", oil=" + oil +
            ", salt=" + salt +
            ", dietaryPrinciple=" + dietaryPrinciple +
            ", note=" + note +
            ", warningInfo=" + warningInfo +
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
