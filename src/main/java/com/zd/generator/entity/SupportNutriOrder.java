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
 * 营养医嘱表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_nutri_order")
@ApiModel(value = "SupportNutriOrder对象", description = "营养医嘱表")
public class SupportNutriOrder extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "no_id", type = IdType.AUTO)
    private Long noId;

    @ApiModelProperty("唯一主键")
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

    @ApiModelProperty("标准体重")
    private BigDecimal standardWeight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("医嘱组号,每个人从1开始")
    private String groupNo;

    @ApiModelProperty("his系统医嘱组号,对接HIS系统时使用")
    private String hisGroupNo;

    @ApiModelProperty("液体量,en,pn都用")
    private BigDecimal liquidCapacity;

    @ApiModelProperty("浓度")
    private BigDecimal concentration;

    @ApiModelProperty("能量密度")
    private BigDecimal energyDensity;

    @ApiModelProperty("制剂类型")
    private String enDrugType;

    @ApiModelProperty("制剂类型自定义")
    private String enDrugTypeOther;

    @ApiModelProperty("执行频次")
    private String executeFrenquency;

    @ApiModelProperty("执行时间")
    private String executeTime;

    @ApiModelProperty("数据来源 0.全部 1.HIS 2.本系统")
    private String datasource;

    @ApiModelProperty("供给方式 允许多选，直接保存字典名字，多个之间用|分隔")
    private String supplyMode;

    @ApiModelProperty("肠内途径 允许多选，直接保存字典名字，多个之间用|分隔")
    private String enPathway;

    @ApiModelProperty("温度")
    private String temperature;

    @ApiModelProperty("液体速度 en、pn都用")
    private String liquidVelocity;

    @ApiModelProperty("液体速度其他")
    private String liquidVelocityOther;

    @ApiModelProperty("合计 所有制剂合计")
    private BigDecimal totalPrice;

    @ApiModelProperty("指导价格")
    private BigDecimal guidingPrice;

    @ApiModelProperty("合计金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("修正合计金额")
    private BigDecimal revisedAmount;

    @ApiModelProperty("耗材 多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1")
    private String consumableMaterial;

    @ApiModelProperty("业务路径")
    private String businessPathCode;

    @ApiModelProperty("业务路径")
    private String businessPathName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("医嘱类别 en或者pn")
    private String orderClass;

    @ApiModelProperty("医嘱期效 长期医嘱/临时医嘱")
    private String orderPeriod;

    @ApiModelProperty("配药方法  配置或者整取")
    private String dispensingMode;

    @ApiModelProperty("开始日期")
    private LocalDateTime orderStartTime;

    @ApiModelProperty("停止日期")
    private LocalDateTime orderStopTime;

    @ApiModelProperty("医嘱状态,0-新开 1-执行 2-停止 3-取消")
    private String orderStatus;

    @ApiModelProperty("预计液体量")
    private BigDecimal expectLiquidCapacity;

    @ApiModelProperty("pn预计液体量")
    private BigDecimal expectPnLiquidCapacity;

    @ApiModelProperty("预计每kg液体量")
    private BigDecimal expectLiquidCapacityKg;

    @ApiModelProperty("每kg液体量")
    private BigDecimal liquidCapacityKg;

    @ApiModelProperty("目标热卡")
    private BigDecimal expectKcalKg;

    @ApiModelProperty("总热卡")
    private BigDecimal totalKcal;

    @ApiModelProperty("每kg热卡")
    private BigDecimal kcalPerKg;

    @ApiModelProperty("输注时间")
    private BigDecimal infusionTime;

    @ApiModelProperty("脂肪乳供能")
    private BigDecimal intralipidKcal;

    @ApiModelProperty("葡萄糖供能")
    private BigDecimal glucoseKcal;

    @ApiModelProperty("氨基酸供能")
    private BigDecimal aminoAcidKcal;

    @ApiModelProperty("总糖量")
    private BigDecimal totalGlucose;

    @ApiModelProperty("糖浓度")
    private BigDecimal glucoseConcentration;

    @ApiModelProperty("糖速")
    private BigDecimal glucoseVelocity;

    @ApiModelProperty("糖速单位")
    private String glucoseVelocityUnit;

    @ApiModelProperty("脂肪输注速度")
    private BigDecimal fatVelocity;

    @ApiModelProperty("预计葡萄糖液体量")
    private BigDecimal expectGlucoseCapacity;

    @ApiModelProperty("葡萄糖液体量")
    private BigDecimal glucoseCapacity;

    @ApiModelProperty("葡萄糖重量(g)")
    private BigDecimal glucoseWeight;

    @ApiModelProperty("葡萄糖重量g/葡萄糖液体量")
    private BigDecimal glucoseWeightCapacity;

    @ApiModelProperty("葡萄糖重量g/总液体量")
    private BigDecimal glucoseWeightTotalCapacity;

    @ApiModelProperty("5%葡萄糖液体量")
    private BigDecimal glucoseCapacity5;

    @ApiModelProperty("10%葡萄糖液体量")
    private BigDecimal glucoseCapacity10;

    @ApiModelProperty("25%葡萄糖液体量")
    private BigDecimal glucoseCapacity25;

    @ApiModelProperty("50%葡萄糖液体量")
    private BigDecimal glucoseCapacity50;

    @ApiModelProperty("氨基酸g/总液体量")
    private BigDecimal aminoAcidTotalCapacity;

    @ApiModelProperty("含氮量")
    private BigDecimal totalNitrogen;

    @ApiModelProperty("糖脂比")
    private BigDecimal sugarLipidRatio;

    @ApiModelProperty("热氮比")
    private BigDecimal energyNitrogenRatio;

    @ApiModelProperty("渗透压")
    private BigDecimal osmoticPressure;

    @ApiModelProperty("肠外途径,不允许多选，直接保存字典名字")
    private String pnPathway;

    @ApiModelProperty("PN适应症")
    private String pnIndication;

    @ApiModelProperty("用法")
    private String usages;

    @ApiModelProperty("是否合计 0 1")
    private String isTotal;

    @ApiModelProperty("修正合计金额")
    private String revisedTotalAmount;

    @ApiModelProperty("执行频次数")
    private String executionFrequency;

    @ApiModelProperty("审核状态(0-未审核;1-审核通过;2-审核不通过)")
    private String reviewStatus;

    @ApiModelProperty("审核人code")
    private String reviewerCode;

    @ApiModelProperty("审核人名字")
    private String reviewerName;

    @ApiModelProperty("审核时间")
    private LocalDateTime reviewTime;

    @ApiModelProperty("审核意见")
    private String reviewOpinion;

    @ApiModelProperty("开医嘱科室名")
    private String orderDeptName;

    @ApiModelProperty("开医嘱科室编码")
    private String orderDeptCode;

    @ApiModelProperty("开医嘱医生姓名")
    private String orderDoctorName;

    @ApiModelProperty("开医嘱医生编码")
    private String orderDoctorCode;

    @ApiModelProperty("开医嘱这个操作的时间")
    private LocalDateTime orderOpeTime;

    @ApiModelProperty("停止医嘱科室名")
    private String stopDeptName;

    @ApiModelProperty("停止医嘱科室编码")
    private String stopDeptCode;

    @ApiModelProperty("停止医嘱医生姓名")
    private String stopDoctorName;

    @ApiModelProperty("停止医嘱医生编码")
    private String stopDoctorCode;

    @ApiModelProperty("停止医嘱这个操作的时间")
    private LocalDateTime stopOpeTime;

    @ApiModelProperty("执行医嘱科室名")
    private String executeDeptName;

    @ApiModelProperty("执行医嘱科室编码")
    private String executeDeptCode;

    @ApiModelProperty("执行医生编码")
    private String executeDoctorCode;

    @ApiModelProperty("执行医生名字")
    private String executeDoctorName;

    @ApiModelProperty("执行医嘱操作时间")
    private LocalDateTime executeOpeDateTime;

    @ApiModelProperty("取消医嘱科室名")
    private String cancelDeptName;

    @ApiModelProperty("取消医嘱科室编码")
    private String cancelDeptCode;

    @ApiModelProperty("取消医生编码")
    private String cancelDoctorCode;

    @ApiModelProperty("取消医生名字")
    private String cancelDoctorName;

    @ApiModelProperty("取消医嘱操作时间")
    private LocalDateTime cancelOpeDateTime;

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
    public Long getNoId() {
        return noId;
    }

    /**		
	 * 		
     */
    public void setNoId(Long noId) {
        this.noId = noId;
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
	 * 标准体重		
     */
    public BigDecimal getStandardWeight() {
        return standardWeight;
    }

    /**		
	 * 标准体重		
     */
    public void setStandardWeight(BigDecimal standardWeight) {
        this.standardWeight = standardWeight;
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
	 * 医嘱组号,每个人从1开始		
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**		
	 * 医嘱组号,每个人从1开始		
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }
    /**		
	 * his系统医嘱组号,对接HIS系统时使用		
     */
    public String getHisGroupNo() {
        return hisGroupNo;
    }

    /**		
	 * his系统医嘱组号,对接HIS系统时使用		
     */
    public void setHisGroupNo(String hisGroupNo) {
        this.hisGroupNo = hisGroupNo;
    }
    /**		
	 * 液体量,en,pn都用		
     */
    public BigDecimal getLiquidCapacity() {
        return liquidCapacity;
    }

    /**		
	 * 液体量,en,pn都用		
     */
    public void setLiquidCapacity(BigDecimal liquidCapacity) {
        this.liquidCapacity = liquidCapacity;
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
	 * 能量密度		
     */
    public BigDecimal getEnergyDensity() {
        return energyDensity;
    }

    /**		
	 * 能量密度		
     */
    public void setEnergyDensity(BigDecimal energyDensity) {
        this.energyDensity = energyDensity;
    }
    /**		
	 * 制剂类型		
     */
    public String getEnDrugType() {
        return enDrugType;
    }

    /**		
	 * 制剂类型		
     */
    public void setEnDrugType(String enDrugType) {
        this.enDrugType = enDrugType;
    }
    /**		
	 * 制剂类型自定义		
     */
    public String getEnDrugTypeOther() {
        return enDrugTypeOther;
    }

    /**		
	 * 制剂类型自定义		
     */
    public void setEnDrugTypeOther(String enDrugTypeOther) {
        this.enDrugTypeOther = enDrugTypeOther;
    }
    /**		
	 * 执行频次		
     */
    public String getExecuteFrenquency() {
        return executeFrenquency;
    }

    /**		
	 * 执行频次		
     */
    public void setExecuteFrenquency(String executeFrenquency) {
        this.executeFrenquency = executeFrenquency;
    }
    /**		
	 * 执行时间		
     */
    public String getExecuteTime() {
        return executeTime;
    }

    /**		
	 * 执行时间		
     */
    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }
    /**		
	 * 数据来源 0.全部 1.HIS 2.本系统		
     */
    public String getDatasource() {
        return datasource;
    }

    /**		
	 * 数据来源 0.全部 1.HIS 2.本系统		
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }
    /**		
	 * 供给方式 允许多选，直接保存字典名字，多个之间用|分隔		
     */
    public String getSupplyMode() {
        return supplyMode;
    }

    /**		
	 * 供给方式 允许多选，直接保存字典名字，多个之间用|分隔		
     */
    public void setSupplyMode(String supplyMode) {
        this.supplyMode = supplyMode;
    }
    /**		
	 * 肠内途径 允许多选，直接保存字典名字，多个之间用|分隔		
     */
    public String getEnPathway() {
        return enPathway;
    }

    /**		
	 * 肠内途径 允许多选，直接保存字典名字，多个之间用|分隔		
     */
    public void setEnPathway(String enPathway) {
        this.enPathway = enPathway;
    }
    /**		
	 * 温度		
     */
    public String getTemperature() {
        return temperature;
    }

    /**		
	 * 温度		
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    /**		
	 * 液体速度 en、pn都用		
     */
    public String getLiquidVelocity() {
        return liquidVelocity;
    }

    /**		
	 * 液体速度 en、pn都用		
     */
    public void setLiquidVelocity(String liquidVelocity) {
        this.liquidVelocity = liquidVelocity;
    }
    /**		
	 * 液体速度其他		
     */
    public String getLiquidVelocityOther() {
        return liquidVelocityOther;
    }

    /**		
	 * 液体速度其他		
     */
    public void setLiquidVelocityOther(String liquidVelocityOther) {
        this.liquidVelocityOther = liquidVelocityOther;
    }
    /**		
	 * 合计 所有制剂合计		
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**		
	 * 合计 所有制剂合计		
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    /**		
	 * 指导价格		
     */
    public BigDecimal getGuidingPrice() {
        return guidingPrice;
    }

    /**		
	 * 指导价格		
     */
    public void setGuidingPrice(BigDecimal guidingPrice) {
        this.guidingPrice = guidingPrice;
    }
    /**		
	 * 合计金额		
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**		
	 * 合计金额		
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    /**		
	 * 修正合计金额		
     */
    public BigDecimal getRevisedAmount() {
        return revisedAmount;
    }

    /**		
	 * 修正合计金额		
     */
    public void setRevisedAmount(BigDecimal revisedAmount) {
        this.revisedAmount = revisedAmount;
    }
    /**		
	 * 耗材 多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1		
     */
    public String getConsumableMaterial() {
        return consumableMaterial;
    }

    /**		
	 * 耗材 多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1		
     */
    public void setConsumableMaterial(String consumableMaterial) {
        this.consumableMaterial = consumableMaterial;
    }
    /**		
	 * 业务路径		
     */
    public String getBusinessPathCode() {
        return businessPathCode;
    }

    /**		
	 * 业务路径		
     */
    public void setBusinessPathCode(String businessPathCode) {
        this.businessPathCode = businessPathCode;
    }
    /**		
	 * 业务路径		
     */
    public String getBusinessPathName() {
        return businessPathName;
    }

    /**		
	 * 业务路径		
     */
    public void setBusinessPathName(String businessPathName) {
        this.businessPathName = businessPathName;
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
	 * 医嘱类别 en或者pn		
     */
    public String getOrderClass() {
        return orderClass;
    }

    /**		
	 * 医嘱类别 en或者pn		
     */
    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }
    /**		
	 * 医嘱期效 长期医嘱/临时医嘱		
     */
    public String getOrderPeriod() {
        return orderPeriod;
    }

    /**		
	 * 医嘱期效 长期医嘱/临时医嘱		
     */
    public void setOrderPeriod(String orderPeriod) {
        this.orderPeriod = orderPeriod;
    }
    /**		
	 * 配药方法  配置或者整取		
     */
    public String getDispensingMode() {
        return dispensingMode;
    }

    /**		
	 * 配药方法  配置或者整取		
     */
    public void setDispensingMode(String dispensingMode) {
        this.dispensingMode = dispensingMode;
    }
    /**		
	 * 开始日期		
     */
    public LocalDateTime getOrderStartTime() {
        return orderStartTime;
    }

    /**		
	 * 开始日期		
     */
    public void setOrderStartTime(LocalDateTime orderStartTime) {
        this.orderStartTime = orderStartTime;
    }
    /**		
	 * 停止日期		
     */
    public LocalDateTime getOrderStopTime() {
        return orderStopTime;
    }

    /**		
	 * 停止日期		
     */
    public void setOrderStopTime(LocalDateTime orderStopTime) {
        this.orderStopTime = orderStopTime;
    }
    /**		
	 * 医嘱状态,0-新开 1-执行 2-停止 3-取消		
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**		
	 * 医嘱状态,0-新开 1-执行 2-停止 3-取消		
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    /**		
	 * 预计液体量		
     */
    public BigDecimal getExpectLiquidCapacity() {
        return expectLiquidCapacity;
    }

    /**		
	 * 预计液体量		
     */
    public void setExpectLiquidCapacity(BigDecimal expectLiquidCapacity) {
        this.expectLiquidCapacity = expectLiquidCapacity;
    }
    /**		
	 * pn预计液体量		
     */
    public BigDecimal getExpectPnLiquidCapacity() {
        return expectPnLiquidCapacity;
    }

    /**		
	 * pn预计液体量		
     */
    public void setExpectPnLiquidCapacity(BigDecimal expectPnLiquidCapacity) {
        this.expectPnLiquidCapacity = expectPnLiquidCapacity;
    }
    /**		
	 * 预计每kg液体量		
     */
    public BigDecimal getExpectLiquidCapacityKg() {
        return expectLiquidCapacityKg;
    }

    /**		
	 * 预计每kg液体量		
     */
    public void setExpectLiquidCapacityKg(BigDecimal expectLiquidCapacityKg) {
        this.expectLiquidCapacityKg = expectLiquidCapacityKg;
    }
    /**		
	 * 每kg液体量		
     */
    public BigDecimal getLiquidCapacityKg() {
        return liquidCapacityKg;
    }

    /**		
	 * 每kg液体量		
     */
    public void setLiquidCapacityKg(BigDecimal liquidCapacityKg) {
        this.liquidCapacityKg = liquidCapacityKg;
    }
    /**		
	 * 目标热卡		
     */
    public BigDecimal getExpectKcalKg() {
        return expectKcalKg;
    }

    /**		
	 * 目标热卡		
     */
    public void setExpectKcalKg(BigDecimal expectKcalKg) {
        this.expectKcalKg = expectKcalKg;
    }
    /**		
	 * 总热卡		
     */
    public BigDecimal getTotalKcal() {
        return totalKcal;
    }

    /**		
	 * 总热卡		
     */
    public void setTotalKcal(BigDecimal totalKcal) {
        this.totalKcal = totalKcal;
    }
    /**		
	 * 每kg热卡		
     */
    public BigDecimal getKcalPerKg() {
        return kcalPerKg;
    }

    /**		
	 * 每kg热卡		
     */
    public void setKcalPerKg(BigDecimal kcalPerKg) {
        this.kcalPerKg = kcalPerKg;
    }
    /**		
	 * 输注时间		
     */
    public BigDecimal getInfusionTime() {
        return infusionTime;
    }

    /**		
	 * 输注时间		
     */
    public void setInfusionTime(BigDecimal infusionTime) {
        this.infusionTime = infusionTime;
    }
    /**		
	 * 脂肪乳供能		
     */
    public BigDecimal getIntralipidKcal() {
        return intralipidKcal;
    }

    /**		
	 * 脂肪乳供能		
     */
    public void setIntralipidKcal(BigDecimal intralipidKcal) {
        this.intralipidKcal = intralipidKcal;
    }
    /**		
	 * 葡萄糖供能		
     */
    public BigDecimal getGlucoseKcal() {
        return glucoseKcal;
    }

    /**		
	 * 葡萄糖供能		
     */
    public void setGlucoseKcal(BigDecimal glucoseKcal) {
        this.glucoseKcal = glucoseKcal;
    }
    /**		
	 * 氨基酸供能		
     */
    public BigDecimal getAminoAcidKcal() {
        return aminoAcidKcal;
    }

    /**		
	 * 氨基酸供能		
     */
    public void setAminoAcidKcal(BigDecimal aminoAcidKcal) {
        this.aminoAcidKcal = aminoAcidKcal;
    }
    /**		
	 * 总糖量		
     */
    public BigDecimal getTotalGlucose() {
        return totalGlucose;
    }

    /**		
	 * 总糖量		
     */
    public void setTotalGlucose(BigDecimal totalGlucose) {
        this.totalGlucose = totalGlucose;
    }
    /**		
	 * 糖浓度		
     */
    public BigDecimal getGlucoseConcentration() {
        return glucoseConcentration;
    }

    /**		
	 * 糖浓度		
     */
    public void setGlucoseConcentration(BigDecimal glucoseConcentration) {
        this.glucoseConcentration = glucoseConcentration;
    }
    /**		
	 * 糖速		
     */
    public BigDecimal getGlucoseVelocity() {
        return glucoseVelocity;
    }

    /**		
	 * 糖速		
     */
    public void setGlucoseVelocity(BigDecimal glucoseVelocity) {
        this.glucoseVelocity = glucoseVelocity;
    }
    /**		
	 * 糖速单位		
     */
    public String getGlucoseVelocityUnit() {
        return glucoseVelocityUnit;
    }

    /**		
	 * 糖速单位		
     */
    public void setGlucoseVelocityUnit(String glucoseVelocityUnit) {
        this.glucoseVelocityUnit = glucoseVelocityUnit;
    }
    /**		
	 * 脂肪输注速度		
     */
    public BigDecimal getFatVelocity() {
        return fatVelocity;
    }

    /**		
	 * 脂肪输注速度		
     */
    public void setFatVelocity(BigDecimal fatVelocity) {
        this.fatVelocity = fatVelocity;
    }
    /**		
	 * 预计葡萄糖液体量		
     */
    public BigDecimal getExpectGlucoseCapacity() {
        return expectGlucoseCapacity;
    }

    /**		
	 * 预计葡萄糖液体量		
     */
    public void setExpectGlucoseCapacity(BigDecimal expectGlucoseCapacity) {
        this.expectGlucoseCapacity = expectGlucoseCapacity;
    }
    /**		
	 * 葡萄糖液体量		
     */
    public BigDecimal getGlucoseCapacity() {
        return glucoseCapacity;
    }

    /**		
	 * 葡萄糖液体量		
     */
    public void setGlucoseCapacity(BigDecimal glucoseCapacity) {
        this.glucoseCapacity = glucoseCapacity;
    }
    /**		
	 * 葡萄糖重量(g)		
     */
    public BigDecimal getGlucoseWeight() {
        return glucoseWeight;
    }

    /**		
	 * 葡萄糖重量(g)		
     */
    public void setGlucoseWeight(BigDecimal glucoseWeight) {
        this.glucoseWeight = glucoseWeight;
    }
    /**		
	 * 葡萄糖重量g/葡萄糖液体量		
     */
    public BigDecimal getGlucoseWeightCapacity() {
        return glucoseWeightCapacity;
    }

    /**		
	 * 葡萄糖重量g/葡萄糖液体量		
     */
    public void setGlucoseWeightCapacity(BigDecimal glucoseWeightCapacity) {
        this.glucoseWeightCapacity = glucoseWeightCapacity;
    }
    /**		
	 * 葡萄糖重量g/总液体量		
     */
    public BigDecimal getGlucoseWeightTotalCapacity() {
        return glucoseWeightTotalCapacity;
    }

    /**		
	 * 葡萄糖重量g/总液体量		
     */
    public void setGlucoseWeightTotalCapacity(BigDecimal glucoseWeightTotalCapacity) {
        this.glucoseWeightTotalCapacity = glucoseWeightTotalCapacity;
    }
    /**		
	 * 5%葡萄糖液体量		
     */
    public BigDecimal getGlucoseCapacity5() {
        return glucoseCapacity5;
    }

    /**		
	 * 5%葡萄糖液体量		
     */
    public void setGlucoseCapacity5(BigDecimal glucoseCapacity5) {
        this.glucoseCapacity5 = glucoseCapacity5;
    }
    /**		
	 * 10%葡萄糖液体量		
     */
    public BigDecimal getGlucoseCapacity10() {
        return glucoseCapacity10;
    }

    /**		
	 * 10%葡萄糖液体量		
     */
    public void setGlucoseCapacity10(BigDecimal glucoseCapacity10) {
        this.glucoseCapacity10 = glucoseCapacity10;
    }
    /**		
	 * 25%葡萄糖液体量		
     */
    public BigDecimal getGlucoseCapacity25() {
        return glucoseCapacity25;
    }

    /**		
	 * 25%葡萄糖液体量		
     */
    public void setGlucoseCapacity25(BigDecimal glucoseCapacity25) {
        this.glucoseCapacity25 = glucoseCapacity25;
    }
    /**		
	 * 50%葡萄糖液体量		
     */
    public BigDecimal getGlucoseCapacity50() {
        return glucoseCapacity50;
    }

    /**		
	 * 50%葡萄糖液体量		
     */
    public void setGlucoseCapacity50(BigDecimal glucoseCapacity50) {
        this.glucoseCapacity50 = glucoseCapacity50;
    }
    /**		
	 * 氨基酸g/总液体量		
     */
    public BigDecimal getAminoAcidTotalCapacity() {
        return aminoAcidTotalCapacity;
    }

    /**		
	 * 氨基酸g/总液体量		
     */
    public void setAminoAcidTotalCapacity(BigDecimal aminoAcidTotalCapacity) {
        this.aminoAcidTotalCapacity = aminoAcidTotalCapacity;
    }
    /**		
	 * 含氮量		
     */
    public BigDecimal getTotalNitrogen() {
        return totalNitrogen;
    }

    /**		
	 * 含氮量		
     */
    public void setTotalNitrogen(BigDecimal totalNitrogen) {
        this.totalNitrogen = totalNitrogen;
    }
    /**		
	 * 糖脂比		
     */
    public BigDecimal getSugarLipidRatio() {
        return sugarLipidRatio;
    }

    /**		
	 * 糖脂比		
     */
    public void setSugarLipidRatio(BigDecimal sugarLipidRatio) {
        this.sugarLipidRatio = sugarLipidRatio;
    }
    /**		
	 * 热氮比		
     */
    public BigDecimal getEnergyNitrogenRatio() {
        return energyNitrogenRatio;
    }

    /**		
	 * 热氮比		
     */
    public void setEnergyNitrogenRatio(BigDecimal energyNitrogenRatio) {
        this.energyNitrogenRatio = energyNitrogenRatio;
    }
    /**		
	 * 渗透压		
     */
    public BigDecimal getOsmoticPressure() {
        return osmoticPressure;
    }

    /**		
	 * 渗透压		
     */
    public void setOsmoticPressure(BigDecimal osmoticPressure) {
        this.osmoticPressure = osmoticPressure;
    }
    /**		
	 * 肠外途径,不允许多选，直接保存字典名字		
     */
    public String getPnPathway() {
        return pnPathway;
    }

    /**		
	 * 肠外途径,不允许多选，直接保存字典名字		
     */
    public void setPnPathway(String pnPathway) {
        this.pnPathway = pnPathway;
    }
    /**		
	 * PN适应症		
     */
    public String getPnIndication() {
        return pnIndication;
    }

    /**		
	 * PN适应症		
     */
    public void setPnIndication(String pnIndication) {
        this.pnIndication = pnIndication;
    }
    /**		
	 * 用法		
     */
    public String getUsages() {
        return usages;
    }

    /**		
	 * 用法		
     */
    public void setUsages(String usages) {
        this.usages = usages;
    }
    /**		
	 * 是否合计 0 1		
     */
    public String getIsTotal() {
        return isTotal;
    }

    /**		
	 * 是否合计 0 1		
     */
    public void setIsTotal(String isTotal) {
        this.isTotal = isTotal;
    }
    /**		
	 * 修正合计金额		
     */
    public String getRevisedTotalAmount() {
        return revisedTotalAmount;
    }

    /**		
	 * 修正合计金额		
     */
    public void setRevisedTotalAmount(String revisedTotalAmount) {
        this.revisedTotalAmount = revisedTotalAmount;
    }
    /**		
	 * 执行频次数		
     */
    public String getExecutionFrequency() {
        return executionFrequency;
    }

    /**		
	 * 执行频次数		
     */
    public void setExecutionFrequency(String executionFrequency) {
        this.executionFrequency = executionFrequency;
    }
    /**		
	 * 审核状态(0-未审核;1-审核通过;2-审核不通过)		
     */
    public String getReviewStatus() {
        return reviewStatus;
    }

    /**		
	 * 审核状态(0-未审核;1-审核通过;2-审核不通过)		
     */
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
    /**		
	 * 审核人code		
     */
    public String getReviewerCode() {
        return reviewerCode;
    }

    /**		
	 * 审核人code		
     */
    public void setReviewerCode(String reviewerCode) {
        this.reviewerCode = reviewerCode;
    }
    /**		
	 * 审核人名字		
     */
    public String getReviewerName() {
        return reviewerName;
    }

    /**		
	 * 审核人名字		
     */
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    /**		
	 * 审核时间		
     */
    public LocalDateTime getReviewTime() {
        return reviewTime;
    }

    /**		
	 * 审核时间		
     */
    public void setReviewTime(LocalDateTime reviewTime) {
        this.reviewTime = reviewTime;
    }
    /**		
	 * 审核意见		
     */
    public String getReviewOpinion() {
        return reviewOpinion;
    }

    /**		
	 * 审核意见		
     */
    public void setReviewOpinion(String reviewOpinion) {
        this.reviewOpinion = reviewOpinion;
    }
    /**		
	 * 开医嘱科室名		
     */
    public String getOrderDeptName() {
        return orderDeptName;
    }

    /**		
	 * 开医嘱科室名		
     */
    public void setOrderDeptName(String orderDeptName) {
        this.orderDeptName = orderDeptName;
    }
    /**		
	 * 开医嘱科室编码		
     */
    public String getOrderDeptCode() {
        return orderDeptCode;
    }

    /**		
	 * 开医嘱科室编码		
     */
    public void setOrderDeptCode(String orderDeptCode) {
        this.orderDeptCode = orderDeptCode;
    }
    /**		
	 * 开医嘱医生姓名		
     */
    public String getOrderDoctorName() {
        return orderDoctorName;
    }

    /**		
	 * 开医嘱医生姓名		
     */
    public void setOrderDoctorName(String orderDoctorName) {
        this.orderDoctorName = orderDoctorName;
    }
    /**		
	 * 开医嘱医生编码		
     */
    public String getOrderDoctorCode() {
        return orderDoctorCode;
    }

    /**		
	 * 开医嘱医生编码		
     */
    public void setOrderDoctorCode(String orderDoctorCode) {
        this.orderDoctorCode = orderDoctorCode;
    }
    /**		
	 * 开医嘱这个操作的时间		
     */
    public LocalDateTime getOrderOpeTime() {
        return orderOpeTime;
    }

    /**		
	 * 开医嘱这个操作的时间		
     */
    public void setOrderOpeTime(LocalDateTime orderOpeTime) {
        this.orderOpeTime = orderOpeTime;
    }
    /**		
	 * 停止医嘱科室名		
     */
    public String getStopDeptName() {
        return stopDeptName;
    }

    /**		
	 * 停止医嘱科室名		
     */
    public void setStopDeptName(String stopDeptName) {
        this.stopDeptName = stopDeptName;
    }
    /**		
	 * 停止医嘱科室编码		
     */
    public String getStopDeptCode() {
        return stopDeptCode;
    }

    /**		
	 * 停止医嘱科室编码		
     */
    public void setStopDeptCode(String stopDeptCode) {
        this.stopDeptCode = stopDeptCode;
    }
    /**		
	 * 停止医嘱医生姓名		
     */
    public String getStopDoctorName() {
        return stopDoctorName;
    }

    /**		
	 * 停止医嘱医生姓名		
     */
    public void setStopDoctorName(String stopDoctorName) {
        this.stopDoctorName = stopDoctorName;
    }
    /**		
	 * 停止医嘱医生编码		
     */
    public String getStopDoctorCode() {
        return stopDoctorCode;
    }

    /**		
	 * 停止医嘱医生编码		
     */
    public void setStopDoctorCode(String stopDoctorCode) {
        this.stopDoctorCode = stopDoctorCode;
    }
    /**		
	 * 停止医嘱这个操作的时间		
     */
    public LocalDateTime getStopOpeTime() {
        return stopOpeTime;
    }

    /**		
	 * 停止医嘱这个操作的时间		
     */
    public void setStopOpeTime(LocalDateTime stopOpeTime) {
        this.stopOpeTime = stopOpeTime;
    }
    /**		
	 * 执行医嘱科室名		
     */
    public String getExecuteDeptName() {
        return executeDeptName;
    }

    /**		
	 * 执行医嘱科室名		
     */
    public void setExecuteDeptName(String executeDeptName) {
        this.executeDeptName = executeDeptName;
    }
    /**		
	 * 执行医嘱科室编码		
     */
    public String getExecuteDeptCode() {
        return executeDeptCode;
    }

    /**		
	 * 执行医嘱科室编码		
     */
    public void setExecuteDeptCode(String executeDeptCode) {
        this.executeDeptCode = executeDeptCode;
    }
    /**		
	 * 执行医生编码		
     */
    public String getExecuteDoctorCode() {
        return executeDoctorCode;
    }

    /**		
	 * 执行医生编码		
     */
    public void setExecuteDoctorCode(String executeDoctorCode) {
        this.executeDoctorCode = executeDoctorCode;
    }
    /**		
	 * 执行医生名字		
     */
    public String getExecuteDoctorName() {
        return executeDoctorName;
    }

    /**		
	 * 执行医生名字		
     */
    public void setExecuteDoctorName(String executeDoctorName) {
        this.executeDoctorName = executeDoctorName;
    }
    /**		
	 * 执行医嘱操作时间		
     */
    public LocalDateTime getExecuteOpeDateTime() {
        return executeOpeDateTime;
    }

    /**		
	 * 执行医嘱操作时间		
     */
    public void setExecuteOpeDateTime(LocalDateTime executeOpeDateTime) {
        this.executeOpeDateTime = executeOpeDateTime;
    }
    /**		
	 * 取消医嘱科室名		
     */
    public String getCancelDeptName() {
        return cancelDeptName;
    }

    /**		
	 * 取消医嘱科室名		
     */
    public void setCancelDeptName(String cancelDeptName) {
        this.cancelDeptName = cancelDeptName;
    }
    /**		
	 * 取消医嘱科室编码		
     */
    public String getCancelDeptCode() {
        return cancelDeptCode;
    }

    /**		
	 * 取消医嘱科室编码		
     */
    public void setCancelDeptCode(String cancelDeptCode) {
        this.cancelDeptCode = cancelDeptCode;
    }
    /**		
	 * 取消医生编码		
     */
    public String getCancelDoctorCode() {
        return cancelDoctorCode;
    }

    /**		
	 * 取消医生编码		
     */
    public void setCancelDoctorCode(String cancelDoctorCode) {
        this.cancelDoctorCode = cancelDoctorCode;
    }
    /**		
	 * 取消医生名字		
     */
    public String getCancelDoctorName() {
        return cancelDoctorName;
    }

    /**		
	 * 取消医生名字		
     */
    public void setCancelDoctorName(String cancelDoctorName) {
        this.cancelDoctorName = cancelDoctorName;
    }
    /**		
	 * 取消医嘱操作时间		
     */
    public LocalDateTime getCancelOpeDateTime() {
        return cancelOpeDateTime;
    }

    /**		
	 * 取消医嘱操作时间		
     */
    public void setCancelOpeDateTime(LocalDateTime cancelOpeDateTime) {
        this.cancelOpeDateTime = cancelOpeDateTime;
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
        return "SupportNutriOrder{" +
            "noId=" + noId +
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
            ", standardWeight=" + standardWeight +
            ", bmi=" + bmi +
            ", groupNo=" + groupNo +
            ", hisGroupNo=" + hisGroupNo +
            ", liquidCapacity=" + liquidCapacity +
            ", concentration=" + concentration +
            ", energyDensity=" + energyDensity +
            ", enDrugType=" + enDrugType +
            ", enDrugTypeOther=" + enDrugTypeOther +
            ", executeFrenquency=" + executeFrenquency +
            ", executeTime=" + executeTime +
            ", datasource=" + datasource +
            ", supplyMode=" + supplyMode +
            ", enPathway=" + enPathway +
            ", temperature=" + temperature +
            ", liquidVelocity=" + liquidVelocity +
            ", liquidVelocityOther=" + liquidVelocityOther +
            ", totalPrice=" + totalPrice +
            ", guidingPrice=" + guidingPrice +
            ", totalAmount=" + totalAmount +
            ", revisedAmount=" + revisedAmount +
            ", consumableMaterial=" + consumableMaterial +
            ", businessPathCode=" + businessPathCode +
            ", businessPathName=" + businessPathName +
            ", remark=" + remark +
            ", orderClass=" + orderClass +
            ", orderPeriod=" + orderPeriod +
            ", dispensingMode=" + dispensingMode +
            ", orderStartTime=" + orderStartTime +
            ", orderStopTime=" + orderStopTime +
            ", orderStatus=" + orderStatus +
            ", expectLiquidCapacity=" + expectLiquidCapacity +
            ", expectPnLiquidCapacity=" + expectPnLiquidCapacity +
            ", expectLiquidCapacityKg=" + expectLiquidCapacityKg +
            ", liquidCapacityKg=" + liquidCapacityKg +
            ", expectKcalKg=" + expectKcalKg +
            ", totalKcal=" + totalKcal +
            ", kcalPerKg=" + kcalPerKg +
            ", infusionTime=" + infusionTime +
            ", intralipidKcal=" + intralipidKcal +
            ", glucoseKcal=" + glucoseKcal +
            ", aminoAcidKcal=" + aminoAcidKcal +
            ", totalGlucose=" + totalGlucose +
            ", glucoseConcentration=" + glucoseConcentration +
            ", glucoseVelocity=" + glucoseVelocity +
            ", glucoseVelocityUnit=" + glucoseVelocityUnit +
            ", fatVelocity=" + fatVelocity +
            ", expectGlucoseCapacity=" + expectGlucoseCapacity +
            ", glucoseCapacity=" + glucoseCapacity +
            ", glucoseWeight=" + glucoseWeight +
            ", glucoseWeightCapacity=" + glucoseWeightCapacity +
            ", glucoseWeightTotalCapacity=" + glucoseWeightTotalCapacity +
            ", glucoseCapacity5=" + glucoseCapacity5 +
            ", glucoseCapacity10=" + glucoseCapacity10 +
            ", glucoseCapacity25=" + glucoseCapacity25 +
            ", glucoseCapacity50=" + glucoseCapacity50 +
            ", aminoAcidTotalCapacity=" + aminoAcidTotalCapacity +
            ", totalNitrogen=" + totalNitrogen +
            ", sugarLipidRatio=" + sugarLipidRatio +
            ", energyNitrogenRatio=" + energyNitrogenRatio +
            ", osmoticPressure=" + osmoticPressure +
            ", pnPathway=" + pnPathway +
            ", pnIndication=" + pnIndication +
            ", usages=" + usages +
            ", isTotal=" + isTotal +
            ", revisedTotalAmount=" + revisedTotalAmount +
            ", executionFrequency=" + executionFrequency +
            ", reviewStatus=" + reviewStatus +
            ", reviewerCode=" + reviewerCode +
            ", reviewerName=" + reviewerName +
            ", reviewTime=" + reviewTime +
            ", reviewOpinion=" + reviewOpinion +
            ", orderDeptName=" + orderDeptName +
            ", orderDeptCode=" + orderDeptCode +
            ", orderDoctorName=" + orderDoctorName +
            ", orderDoctorCode=" + orderDoctorCode +
            ", orderOpeTime=" + orderOpeTime +
            ", stopDeptName=" + stopDeptName +
            ", stopDeptCode=" + stopDeptCode +
            ", stopDoctorName=" + stopDoctorName +
            ", stopDoctorCode=" + stopDoctorCode +
            ", stopOpeTime=" + stopOpeTime +
            ", executeDeptName=" + executeDeptName +
            ", executeDeptCode=" + executeDeptCode +
            ", executeDoctorCode=" + executeDoctorCode +
            ", executeDoctorName=" + executeDoctorName +
            ", executeOpeDateTime=" + executeOpeDateTime +
            ", cancelDeptName=" + cancelDeptName +
            ", cancelDeptCode=" + cancelDeptCode +
            ", cancelDoctorCode=" + cancelDoctorCode +
            ", cancelDoctorName=" + cancelDoctorName +
            ", cancelOpeDateTime=" + cancelOpeDateTime +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
