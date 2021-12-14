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
 * ENPN信息表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_enpn_info")
@ApiModel(value = "SysEnpnInfo对象", description = "ENPN信息表")
public class SysEnpnInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ec_id", type = IdType.AUTO)
    private Integer ecId;

    @ApiModelProperty("食物编码")
    private String foodCode;

    @ApiModelProperty("食物id")
    private String foodId;

    @ApiModelProperty("类别编码")
    private String foodTypeCode;

    @ApiModelProperty("类别名称")
    private String foodTypeName;

    @ApiModelProperty("ENPN类型，内容为en,pn")
    private String enpnType;

    @ApiModelProperty("库类型")
    private String drugType;

    @ApiModelProperty("剂型编码")
    private String drugFormCode;

    @ApiModelProperty("剂型名称")
    private String drugFormName;

    @ApiModelProperty("说明")
    private String drugInfo;

    @ApiModelProperty("用法")
    private String drugUsage;

    @ApiModelProperty("成份")
    private String composition;

    @ApiModelProperty("注意事项")
    private String note;

    @ApiModelProperty("药品类别编码")
    private String medicalCategoryCode;

    @ApiModelProperty("药品类别名称")
    private String medicalCategoryName;

    @ApiModelProperty("药品子类别编码")
    private String itemCategoryCode;

    @ApiModelProperty("药品子类别名称")
    private String itemCategoryName;

    @ApiModelProperty("药品编码")
    private String drugCode;

    @ApiModelProperty("药品名称")
    private String drugName;

    @ApiModelProperty("药品id，备用")
    private String drugId;

    @ApiModelProperty("规格")
    private String drugSpecification;

    @ApiModelProperty("单位")
    private String drugUnit;

    @ApiModelProperty("系数范围")
    private String coefficientRange;

    @ApiModelProperty("浓度")
    private BigDecimal concentration;

    @ApiModelProperty("原液渗透浓度")
    private BigDecimal osm;

    @ApiModelProperty("含氮系数，氨基酸才有")
    private BigDecimal nStandard;

    @ApiModelProperty("是否常用，1-是 0-否")
    private String isCommon;

    @ApiModelProperty("排序")
    private Integer orderIndex;

    @ApiModelProperty("生产厂商编码")
    private String manufacturerCode;

    @ApiModelProperty("生产厂商名称")
    private String manufacturerName;

    @ApiModelProperty("药品状态 1 正常 8 停用  9 删除")
    private String drugStatus;

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
    public Integer getEcId() {
        return ecId;
    }

    /**		
	 * 		
     */
    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }
    /**		
	 * 食物编码		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * 食物编码		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 食物id		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * 食物id		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**		
	 * 类别编码		
     */
    public String getFoodTypeCode() {
        return foodTypeCode;
    }

    /**		
	 * 类别编码		
     */
    public void setFoodTypeCode(String foodTypeCode) {
        this.foodTypeCode = foodTypeCode;
    }
    /**		
	 * 类别名称		
     */
    public String getFoodTypeName() {
        return foodTypeName;
    }

    /**		
	 * 类别名称		
     */
    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }
    /**		
	 * ENPN类型，内容为en,pn		
     */
    public String getEnpnType() {
        return enpnType;
    }

    /**		
	 * ENPN类型，内容为en,pn		
     */
    public void setEnpnType(String enpnType) {
        this.enpnType = enpnType;
    }
    /**		
	 * 库类型		
     */
    public String getDrugType() {
        return drugType;
    }

    /**		
	 * 库类型		
     */
    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }
    /**		
	 * 剂型编码		
     */
    public String getDrugFormCode() {
        return drugFormCode;
    }

    /**		
	 * 剂型编码		
     */
    public void setDrugFormCode(String drugFormCode) {
        this.drugFormCode = drugFormCode;
    }
    /**		
	 * 剂型名称		
     */
    public String getDrugFormName() {
        return drugFormName;
    }

    /**		
	 * 剂型名称		
     */
    public void setDrugFormName(String drugFormName) {
        this.drugFormName = drugFormName;
    }
    /**		
	 * 说明		
     */
    public String getDrugInfo() {
        return drugInfo;
    }

    /**		
	 * 说明		
     */
    public void setDrugInfo(String drugInfo) {
        this.drugInfo = drugInfo;
    }
    /**		
	 * 用法		
     */
    public String getDrugUsage() {
        return drugUsage;
    }

    /**		
	 * 用法		
     */
    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }
    /**		
	 * 成份		
     */
    public String getComposition() {
        return composition;
    }

    /**		
	 * 成份		
     */
    public void setComposition(String composition) {
        this.composition = composition;
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
	 * 药品类别编码		
     */
    public String getMedicalCategoryCode() {
        return medicalCategoryCode;
    }

    /**		
	 * 药品类别编码		
     */
    public void setMedicalCategoryCode(String medicalCategoryCode) {
        this.medicalCategoryCode = medicalCategoryCode;
    }
    /**		
	 * 药品类别名称		
     */
    public String getMedicalCategoryName() {
        return medicalCategoryName;
    }

    /**		
	 * 药品类别名称		
     */
    public void setMedicalCategoryName(String medicalCategoryName) {
        this.medicalCategoryName = medicalCategoryName;
    }
    /**		
	 * 药品子类别编码		
     */
    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    /**		
	 * 药品子类别编码		
     */
    public void setItemCategoryCode(String itemCategoryCode) {
        this.itemCategoryCode = itemCategoryCode;
    }
    /**		
	 * 药品子类别名称		
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    /**		
	 * 药品子类别名称		
     */
    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }
    /**		
	 * 药品编码		
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**		
	 * 药品编码		
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }
    /**		
	 * 药品名称		
     */
    public String getDrugName() {
        return drugName;
    }

    /**		
	 * 药品名称		
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    /**		
	 * 药品id，备用		
     */
    public String getDrugId() {
        return drugId;
    }

    /**		
	 * 药品id，备用		
     */
    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }
    /**		
	 * 规格		
     */
    public String getDrugSpecification() {
        return drugSpecification;
    }

    /**		
	 * 规格		
     */
    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification;
    }
    /**		
	 * 单位		
     */
    public String getDrugUnit() {
        return drugUnit;
    }

    /**		
	 * 单位		
     */
    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }
    /**		
	 * 系数范围		
     */
    public String getCoefficientRange() {
        return coefficientRange;
    }

    /**		
	 * 系数范围		
     */
    public void setCoefficientRange(String coefficientRange) {
        this.coefficientRange = coefficientRange;
    }
    /**		
	 * 浓度		
     */
    public BigDecimal getConcentration() {
        return concentration;
    }

    /**		
	 * 浓度		
     */
    public void setConcentration(BigDecimal concentration) {
        this.concentration = concentration;
    }
    /**		
	 * 原液渗透浓度		
     */
    public BigDecimal getOsm() {
        return osm;
    }

    /**		
	 * 原液渗透浓度		
     */
    public void setOsm(BigDecimal osm) {
        this.osm = osm;
    }
    /**		
	 * 含氮系数，氨基酸才有		
     */
    public BigDecimal getnStandard() {
        return nStandard;
    }

    /**		
	 * 含氮系数，氨基酸才有		
     */
    public void setnStandard(BigDecimal nStandard) {
        this.nStandard = nStandard;
    }
    /**		
	 * 是否常用，1-是 0-否		
     */
    public String getIsCommon() {
        return isCommon;
    }

    /**		
	 * 是否常用，1-是 0-否		
     */
    public void setIsCommon(String isCommon) {
        this.isCommon = isCommon;
    }
    /**		
	 * 排序		
     */
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**		
	 * 排序		
     */
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
    /**		
	 * 生产厂商编码		
     */
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    /**		
	 * 生产厂商编码		
     */
    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }
    /**		
	 * 生产厂商名称		
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**		
	 * 生产厂商名称		
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    /**		
	 * 药品状态 1 正常 8 停用  9 删除		
     */
    public String getDrugStatus() {
        return drugStatus;
    }

    /**		
	 * 药品状态 1 正常 8 停用  9 删除		
     */
    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
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
        return "SysEnpnInfo{" +
            "ecId=" + ecId +
            ", foodCode=" + foodCode +
            ", foodId=" + foodId +
            ", foodTypeCode=" + foodTypeCode +
            ", foodTypeName=" + foodTypeName +
            ", enpnType=" + enpnType +
            ", drugType=" + drugType +
            ", drugFormCode=" + drugFormCode +
            ", drugFormName=" + drugFormName +
            ", drugInfo=" + drugInfo +
            ", drugUsage=" + drugUsage +
            ", composition=" + composition +
            ", note=" + note +
            ", medicalCategoryCode=" + medicalCategoryCode +
            ", medicalCategoryName=" + medicalCategoryName +
            ", itemCategoryCode=" + itemCategoryCode +
            ", itemCategoryName=" + itemCategoryName +
            ", drugCode=" + drugCode +
            ", drugName=" + drugName +
            ", drugId=" + drugId +
            ", drugSpecification=" + drugSpecification +
            ", drugUnit=" + drugUnit +
            ", coefficientRange=" + coefficientRange +
            ", concentration=" + concentration +
            ", osm=" + osm +
            ", nStandard=" + nStandard +
            ", isCommon=" + isCommon +
            ", orderIndex=" + orderIndex +
            ", manufacturerCode=" + manufacturerCode +
            ", manufacturerName=" + manufacturerName +
            ", drugStatus=" + drugStatus +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
