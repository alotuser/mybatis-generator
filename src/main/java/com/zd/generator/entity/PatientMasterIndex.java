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
 * 病人基本信息
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("patient_master_index")
@ApiModel(value = "PatientMasterIndex对象", description = "病人基本信息")
public class PatientMasterIndex extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pmiid", type = IdType.AUTO)
    private Long pmiid;

    @ApiModelProperty("唯一主键病人唯一识别号")
    private String patientId;

    @ApiModelProperty("编号预留")
    private BigDecimal personSn;

    @ApiModelProperty("编号预留")
    private String personNo;

    @ApiModelProperty("姓名 ")
    private String name;

    @ApiModelProperty("性别	男，女 ")
    private String sex;

    @ApiModelProperty("出生日期	")
    private LocalDateTime birthday;

    @ApiModelProperty("邮编 ")
    private String zipCode;

    @ApiModelProperty("家庭地址")
    private String address;

    @ApiModelProperty("身份证号			  ")
    private String idNo;

    @ApiModelProperty("手机			   ")
    private String mobilePhone;

    @ApiModelProperty("地区编码国家统一编码  ")
    private String politicalCode;

    @ApiModelProperty("地区名称			  ")
    private String politicalName;

    @ApiModelProperty("出生体重			  ")
    private BigDecimal birthWeight;

    @ApiModelProperty("出生身长			  ")
    private BigDecimal birthHeight;

    @ApiModelProperty("胎龄周			   ")
    private String gestationalAgeWeek;

    @ApiModelProperty("胎龄天			   ")
    private String gestationalAgeDay;

    @ApiModelProperty("预产期			   ")
    private LocalDateTime edc;

    @ApiModelProperty("分娩方式code			  ")
    private String deliveryModeCode;

    @ApiModelProperty("分娩方式name			  ")
    private String deliveryModeName;

    @ApiModelProperty("第1次apgar score1-10分")
    private Integer apgarScore1;

    @ApiModelProperty("第2次apgar score1-10分")
    private Integer apgarScore2;

    @ApiModelProperty("第3次apgar score1-10分")
    private Integer apgarScore3;

    @ApiModelProperty("孕次			   ")
    private Integer gravida;

    @ApiModelProperty("产次			   ")
    private Integer parity;

    @ApiModelProperty("备注			   ")
    private String remark;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码  ")
    private String createUserCode;

    @ApiModelProperty("创建人名称  ")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码  ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称  ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getPmiid() {
        return pmiid;
    }

    /**		
	 * 		
     */
    public void setPmiid(Long pmiid) {
        this.pmiid = pmiid;
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
	 * 编号预留		
     */
    public BigDecimal getPersonSn() {
        return personSn;
    }

    /**		
	 * 编号预留		
     */
    public void setPersonSn(BigDecimal personSn) {
        this.personSn = personSn;
    }
    /**		
	 * 编号预留		
     */
    public String getPersonNo() {
        return personNo;
    }

    /**		
	 * 编号预留		
     */
    public void setPersonNo(String personNo) {
        this.personNo = personNo;
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
	 * 性别	男，女 		
     */
    public String getSex() {
        return sex;
    }

    /**		
	 * 性别	男，女 		
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**		
	 * 出生日期			
     */
    public LocalDateTime getBirthday() {
        return birthday;
    }

    /**		
	 * 出生日期			
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    /**		
	 * 邮编 		
     */
    public String getZipCode() {
        return zipCode;
    }

    /**		
	 * 邮编 		
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    /**		
	 * 家庭地址		
     */
    public String getAddress() {
        return address;
    }

    /**		
	 * 家庭地址		
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**		
	 * 身份证号			  		
     */
    public String getIdNo() {
        return idNo;
    }

    /**		
	 * 身份证号			  		
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    /**		
	 * 手机			   		
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**		
	 * 手机			   		
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    /**		
	 * 地区编码国家统一编码  		
     */
    public String getPoliticalCode() {
        return politicalCode;
    }

    /**		
	 * 地区编码国家统一编码  		
     */
    public void setPoliticalCode(String politicalCode) {
        this.politicalCode = politicalCode;
    }
    /**		
	 * 地区名称			  		
     */
    public String getPoliticalName() {
        return politicalName;
    }

    /**		
	 * 地区名称			  		
     */
    public void setPoliticalName(String politicalName) {
        this.politicalName = politicalName;
    }
    /**		
	 * 出生体重			  		
     */
    public BigDecimal getBirthWeight() {
        return birthWeight;
    }

    /**		
	 * 出生体重			  		
     */
    public void setBirthWeight(BigDecimal birthWeight) {
        this.birthWeight = birthWeight;
    }
    /**		
	 * 出生身长			  		
     */
    public BigDecimal getBirthHeight() {
        return birthHeight;
    }

    /**		
	 * 出生身长			  		
     */
    public void setBirthHeight(BigDecimal birthHeight) {
        this.birthHeight = birthHeight;
    }
    /**		
	 * 胎龄周			   		
     */
    public String getGestationalAgeWeek() {
        return gestationalAgeWeek;
    }

    /**		
	 * 胎龄周			   		
     */
    public void setGestationalAgeWeek(String gestationalAgeWeek) {
        this.gestationalAgeWeek = gestationalAgeWeek;
    }
    /**		
	 * 胎龄天			   		
     */
    public String getGestationalAgeDay() {
        return gestationalAgeDay;
    }

    /**		
	 * 胎龄天			   		
     */
    public void setGestationalAgeDay(String gestationalAgeDay) {
        this.gestationalAgeDay = gestationalAgeDay;
    }
    /**		
	 * 预产期			   		
     */
    public LocalDateTime getEdc() {
        return edc;
    }

    /**		
	 * 预产期			   		
     */
    public void setEdc(LocalDateTime edc) {
        this.edc = edc;
    }
    /**		
	 * 分娩方式code			  		
     */
    public String getDeliveryModeCode() {
        return deliveryModeCode;
    }

    /**		
	 * 分娩方式code			  		
     */
    public void setDeliveryModeCode(String deliveryModeCode) {
        this.deliveryModeCode = deliveryModeCode;
    }
    /**		
	 * 分娩方式name			  		
     */
    public String getDeliveryModeName() {
        return deliveryModeName;
    }

    /**		
	 * 分娩方式name			  		
     */
    public void setDeliveryModeName(String deliveryModeName) {
        this.deliveryModeName = deliveryModeName;
    }
    /**		
	 * 第1次apgar score1-10分		
     */
    public Integer getApgarScore1() {
        return apgarScore1;
    }

    /**		
	 * 第1次apgar score1-10分		
     */
    public void setApgarScore1(Integer apgarScore1) {
        this.apgarScore1 = apgarScore1;
    }
    /**		
	 * 第2次apgar score1-10分		
     */
    public Integer getApgarScore2() {
        return apgarScore2;
    }

    /**		
	 * 第2次apgar score1-10分		
     */
    public void setApgarScore2(Integer apgarScore2) {
        this.apgarScore2 = apgarScore2;
    }
    /**		
	 * 第3次apgar score1-10分		
     */
    public Integer getApgarScore3() {
        return apgarScore3;
    }

    /**		
	 * 第3次apgar score1-10分		
     */
    public void setApgarScore3(Integer apgarScore3) {
        this.apgarScore3 = apgarScore3;
    }
    /**		
	 * 孕次			   		
     */
    public Integer getGravida() {
        return gravida;
    }

    /**		
	 * 孕次			   		
     */
    public void setGravida(Integer gravida) {
        this.gravida = gravida;
    }
    /**		
	 * 产次			   		
     */
    public Integer getParity() {
        return parity;
    }

    /**		
	 * 产次			   		
     */
    public void setParity(Integer parity) {
        this.parity = parity;
    }
    /**		
	 * 备注			   		
     */
    public String getRemark() {
        return remark;
    }

    /**		
	 * 备注			   		
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
        return "PatientMasterIndex{" +
            "pmiid=" + pmiid +
            ", patientId=" + patientId +
            ", personSn=" + personSn +
            ", personNo=" + personNo +
            ", name=" + name +
            ", sex=" + sex +
            ", birthday=" + birthday +
            ", zipCode=" + zipCode +
            ", address=" + address +
            ", idNo=" + idNo +
            ", mobilePhone=" + mobilePhone +
            ", politicalCode=" + politicalCode +
            ", politicalName=" + politicalName +
            ", birthWeight=" + birthWeight +
            ", birthHeight=" + birthHeight +
            ", gestationalAgeWeek=" + gestationalAgeWeek +
            ", gestationalAgeDay=" + gestationalAgeDay +
            ", edc=" + edc +
            ", deliveryModeCode=" + deliveryModeCode +
            ", deliveryModeName=" + deliveryModeName +
            ", apgarScore1=" + apgarScore1 +
            ", apgarScore2=" + apgarScore2 +
            ", apgarScore3=" + apgarScore3 +
            ", gravida=" + gravida +
            ", parity=" + parity +
            ", remark=" + remark +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
