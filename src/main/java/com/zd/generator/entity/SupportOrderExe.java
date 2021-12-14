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
 * 医嘱执行表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_order_exe")
@ApiModel(value = "SupportOrderExe对象", description = "医嘱执行表")
public class SupportOrderExe extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "oe_id", type = IdType.AUTO)
    private Long oeId;

    @ApiModelProperty("关联support_nutri_order表字段")
    private Long noId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("执行日期")
    private LocalDateTime exeDate;

    @ApiModelProperty("执行日期时间")
    private LocalDateTime exeDateTime;

    @ApiModelProperty("执行开始日期时间")
    private LocalDateTime exeFromDatetime;

    @ApiModelProperty("执行结束日期时间")
    private LocalDateTime exeToDatetime;

    @ApiModelProperty("执行日期")
    private String executeDate;

    @ApiModelProperty("执行时间")
    private String executeTime;

    @ApiModelProperty("执行频次")
    private String executeFrenquency;

    @ApiModelProperty("数据来源 0.全部 1.HIS 2.本系统")
    private String datasource;

    @ApiModelProperty("医嘱期效 0长期医嘱/1临时医嘱")
    private String orderPeriod;

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

    @ApiModelProperty("姓名拼音")
    private String pyName;

    @ApiModelProperty("性别,男，女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private BigDecimal height;

    @ApiModelProperty("体重")
    private BigDecimal weight;

    @ApiModelProperty("体质指数")
    private BigDecimal bmi;

    @ApiModelProperty("医嘱类别,en或者pn")
    private String orderClass;

    @ApiModelProperty("医嘱组号,同support_nutri_order表字段")
    private String groupNo;

    @ApiModelProperty("液体量,en,pn都用，开医嘱时输入内容")
    private BigDecimal liquidCapacity;

    @ApiModelProperty("速度，en配制")
    private String liquidVelocity;

    @ApiModelProperty("浓度")
    private BigDecimal concentration;

    @ApiModelProperty("温度")
    private String temperature;

    private String pathway;

    @ApiModelProperty("肠内途径 允许多选，直接保存字典名字，多个之间用|分隔")
    private String enPathway;

    @ApiModelProperty("肠外途径,不允许多选，直接保存字典名字")
    private String pnPathway;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("配药方法,配置或者整取")
    private String dispensingMode;

    @ApiModelProperty("供给方式")
    private String supplyMode;

    @ApiModelProperty("总数量,医嘱明细中qty总和")
    private BigDecimal tatolQty;

    @ApiModelProperty("是否扣费成功,1 成功  0 失败")
    private String isCharged;

    @ApiModelProperty("是否扣减库存成功,1 成功  0 失败")
    private String isReduceInventory;

    @ApiModelProperty("是否打印标签,1  打印  0 未打印")
    private String isPrintLabel;

    @ApiModelProperty("标签内容,默认制剂名(单位)(剂量及单位)+ 制剂名(单位)(剂量及单位)")
    private String labelContent;

    @ApiModelProperty("合计,所有制剂合计")
    private BigDecimal totalPrice;

    @ApiModelProperty("修正合计金额")
    private BigDecimal revisedAmount;

    @ApiModelProperty("指导价格")
    private BigDecimal guidingPrice;

    @ApiModelProperty("合计金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("用法")
    private String usages;

    @ApiModelProperty("是否合计 0 1")
    private String isTotal;

    @ApiModelProperty("执行频次数")
    private String executionFrequency;

    @ApiModelProperty("耗材,多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1")
    private String consumableMaterial;

    @ApiModelProperty("业务路径")
    private String businessPathCode;

    @ApiModelProperty("业务路径")
    private String businessPathName;

    @ApiModelProperty("医嘱开始时间")
    private LocalDateTime orderStartTime;

    @ApiModelProperty("医嘱结束时间")
    private LocalDateTime orderStopTime;

    @ApiModelProperty("开医嘱医生姓名")
    private String orderDoctorCode;

    @ApiModelProperty("开医嘱医生编码")
    private String orderDoctorName;

    @ApiModelProperty("开医嘱这个操作的时间")
    private LocalDateTime orderOpeTime;

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

    @ApiModelProperty("打印标签科室名")
    private String printDeptName;

    @ApiModelProperty("打印标签科室编码")
    private String printDeptCode;

    @ApiModelProperty("打印标签医生姓名")
    private String printDoctorName;

    @ApiModelProperty("打印标签医生编码")
    private String printDoctorCode;

    @ApiModelProperty("打印这个操作的时间")
    private LocalDateTime printOpeTime;

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
    public Long getOeId() {
        return oeId;
    }

    /**		
	 * 		
     */
    public void setOeId(Long oeId) {
        this.oeId = oeId;
    }
    /**		
	 * 关联support_nutri_order表字段		
     */
    public Long getNoId() {
        return noId;
    }

    /**		
	 * 关联support_nutri_order表字段		
     */
    public void setNoId(Long noId) {
        this.noId = noId;
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
	 * 执行日期		
     */
    public LocalDateTime getExeDate() {
        return exeDate;
    }

    /**		
	 * 执行日期		
     */
    public void setExeDate(LocalDateTime exeDate) {
        this.exeDate = exeDate;
    }
    /**		
	 * 执行日期时间		
     */
    public LocalDateTime getExeDateTime() {
        return exeDateTime;
    }

    /**		
	 * 执行日期时间		
     */
    public void setExeDateTime(LocalDateTime exeDateTime) {
        this.exeDateTime = exeDateTime;
    }
    /**		
	 * 执行开始日期时间		
     */
    public LocalDateTime getExeFromDatetime() {
        return exeFromDatetime;
    }

    /**		
	 * 执行开始日期时间		
     */
    public void setExeFromDatetime(LocalDateTime exeFromDatetime) {
        this.exeFromDatetime = exeFromDatetime;
    }
    /**		
	 * 执行结束日期时间		
     */
    public LocalDateTime getExeToDatetime() {
        return exeToDatetime;
    }

    /**		
	 * 执行结束日期时间		
     */
    public void setExeToDatetime(LocalDateTime exeToDatetime) {
        this.exeToDatetime = exeToDatetime;
    }
    /**		
	 * 执行日期		
     */
    public String getExecuteDate() {
        return executeDate;
    }

    /**		
	 * 执行日期		
     */
    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate;
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
	 * 医嘱期效 0长期医嘱/1临时医嘱		
     */
    public String getOrderPeriod() {
        return orderPeriod;
    }

    /**		
	 * 医嘱期效 0长期医嘱/1临时医嘱		
     */
    public void setOrderPeriod(String orderPeriod) {
        this.orderPeriod = orderPeriod;
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
	 * 姓名拼音		
     */
    public String getPyName() {
        return pyName;
    }

    /**		
	 * 姓名拼音		
     */
    public void setPyName(String pyName) {
        this.pyName = pyName;
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
	 * 医嘱类别,en或者pn		
     */
    public String getOrderClass() {
        return orderClass;
    }

    /**		
	 * 医嘱类别,en或者pn		
     */
    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }
    /**		
	 * 医嘱组号,同support_nutri_order表字段		
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**		
	 * 医嘱组号,同support_nutri_order表字段		
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }
    /**		
	 * 液体量,en,pn都用，开医嘱时输入内容		
     */
    public BigDecimal getLiquidCapacity() {
        return liquidCapacity;
    }

    /**		
	 * 液体量,en,pn都用，开医嘱时输入内容		
     */
    public void setLiquidCapacity(BigDecimal liquidCapacity) {
        this.liquidCapacity = liquidCapacity;
    }
    /**		
	 * 速度，en配制		
     */
    public String getLiquidVelocity() {
        return liquidVelocity;
    }

    /**		
	 * 速度，en配制		
     */
    public void setLiquidVelocity(String liquidVelocity) {
        this.liquidVelocity = liquidVelocity;
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
	 * 		
     */
    public String getPathway() {
        return pathway;
    }

    /**		
	 * 		
     */
    public void setPathway(String pathway) {
        this.pathway = pathway;
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
	 * 配药方法,配置或者整取		
     */
    public String getDispensingMode() {
        return dispensingMode;
    }

    /**		
	 * 配药方法,配置或者整取		
     */
    public void setDispensingMode(String dispensingMode) {
        this.dispensingMode = dispensingMode;
    }
    /**		
	 * 供给方式		
     */
    public String getSupplyMode() {
        return supplyMode;
    }

    /**		
	 * 供给方式		
     */
    public void setSupplyMode(String supplyMode) {
        this.supplyMode = supplyMode;
    }
    /**		
	 * 总数量,医嘱明细中qty总和		
     */
    public BigDecimal getTatolQty() {
        return tatolQty;
    }

    /**		
	 * 总数量,医嘱明细中qty总和		
     */
    public void setTatolQty(BigDecimal tatolQty) {
        this.tatolQty = tatolQty;
    }
    /**		
	 * 是否扣费成功,1 成功  0 失败		
     */
    public String getIsCharged() {
        return isCharged;
    }

    /**		
	 * 是否扣费成功,1 成功  0 失败		
     */
    public void setIsCharged(String isCharged) {
        this.isCharged = isCharged;
    }
    /**		
	 * 是否扣减库存成功,1 成功  0 失败		
     */
    public String getIsReduceInventory() {
        return isReduceInventory;
    }

    /**		
	 * 是否扣减库存成功,1 成功  0 失败		
     */
    public void setIsReduceInventory(String isReduceInventory) {
        this.isReduceInventory = isReduceInventory;
    }
    /**		
	 * 是否打印标签,1  打印  0 未打印		
     */
    public String getIsPrintLabel() {
        return isPrintLabel;
    }

    /**		
	 * 是否打印标签,1  打印  0 未打印		
     */
    public void setIsPrintLabel(String isPrintLabel) {
        this.isPrintLabel = isPrintLabel;
    }
    /**		
	 * 标签内容,默认制剂名(单位)(剂量及单位)+ 制剂名(单位)(剂量及单位)		
     */
    public String getLabelContent() {
        return labelContent;
    }

    /**		
	 * 标签内容,默认制剂名(单位)(剂量及单位)+ 制剂名(单位)(剂量及单位)		
     */
    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent;
    }
    /**		
	 * 合计,所有制剂合计		
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**		
	 * 合计,所有制剂合计		
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
	 * 耗材,多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1		
     */
    public String getConsumableMaterial() {
        return consumableMaterial;
    }

    /**		
	 * 耗材,多个耗材|分隔，数量用,分隔；例如a耗材,1|b耗材,2，数量默认1		
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
	 * 医嘱开始时间		
     */
    public LocalDateTime getOrderStartTime() {
        return orderStartTime;
    }

    /**		
	 * 医嘱开始时间		
     */
    public void setOrderStartTime(LocalDateTime orderStartTime) {
        this.orderStartTime = orderStartTime;
    }
    /**		
	 * 医嘱结束时间		
     */
    public LocalDateTime getOrderStopTime() {
        return orderStopTime;
    }

    /**		
	 * 医嘱结束时间		
     */
    public void setOrderStopTime(LocalDateTime orderStopTime) {
        this.orderStopTime = orderStopTime;
    }
    /**		
	 * 开医嘱医生姓名		
     */
    public String getOrderDoctorCode() {
        return orderDoctorCode;
    }

    /**		
	 * 开医嘱医生姓名		
     */
    public void setOrderDoctorCode(String orderDoctorCode) {
        this.orderDoctorCode = orderDoctorCode;
    }
    /**		
	 * 开医嘱医生编码		
     */
    public String getOrderDoctorName() {
        return orderDoctorName;
    }

    /**		
	 * 开医嘱医生编码		
     */
    public void setOrderDoctorName(String orderDoctorName) {
        this.orderDoctorName = orderDoctorName;
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
	 * 打印标签科室名		
     */
    public String getPrintDeptName() {
        return printDeptName;
    }

    /**		
	 * 打印标签科室名		
     */
    public void setPrintDeptName(String printDeptName) {
        this.printDeptName = printDeptName;
    }
    /**		
	 * 打印标签科室编码		
     */
    public String getPrintDeptCode() {
        return printDeptCode;
    }

    /**		
	 * 打印标签科室编码		
     */
    public void setPrintDeptCode(String printDeptCode) {
        this.printDeptCode = printDeptCode;
    }
    /**		
	 * 打印标签医生姓名		
     */
    public String getPrintDoctorName() {
        return printDoctorName;
    }

    /**		
	 * 打印标签医生姓名		
     */
    public void setPrintDoctorName(String printDoctorName) {
        this.printDoctorName = printDoctorName;
    }
    /**		
	 * 打印标签医生编码		
     */
    public String getPrintDoctorCode() {
        return printDoctorCode;
    }

    /**		
	 * 打印标签医生编码		
     */
    public void setPrintDoctorCode(String printDoctorCode) {
        this.printDoctorCode = printDoctorCode;
    }
    /**		
	 * 打印这个操作的时间		
     */
    public LocalDateTime getPrintOpeTime() {
        return printOpeTime;
    }

    /**		
	 * 打印这个操作的时间		
     */
    public void setPrintOpeTime(LocalDateTime printOpeTime) {
        this.printOpeTime = printOpeTime;
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
        return "SupportOrderExe{" +
            "oeId=" + oeId +
            ", noId=" + noId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", exeDate=" + exeDate +
            ", exeDateTime=" + exeDateTime +
            ", exeFromDatetime=" + exeFromDatetime +
            ", exeToDatetime=" + exeToDatetime +
            ", executeDate=" + executeDate +
            ", executeTime=" + executeTime +
            ", executeFrenquency=" + executeFrenquency +
            ", datasource=" + datasource +
            ", orderPeriod=" + orderPeriod +
            ", inpNo=" + inpNo +
            ", orgCode=" + orgCode +
            ", orgName=" + orgName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", wardCode=" + wardCode +
            ", wardName=" + wardName +
            ", bedNo=" + bedNo +
            ", name=" + name +
            ", pyName=" + pyName +
            ", sex=" + sex +
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            ", bmi=" + bmi +
            ", orderClass=" + orderClass +
            ", groupNo=" + groupNo +
            ", liquidCapacity=" + liquidCapacity +
            ", liquidVelocity=" + liquidVelocity +
            ", concentration=" + concentration +
            ", temperature=" + temperature +
            ", pathway=" + pathway +
            ", enPathway=" + enPathway +
            ", pnPathway=" + pnPathway +
            ", remark=" + remark +
            ", dispensingMode=" + dispensingMode +
            ", supplyMode=" + supplyMode +
            ", tatolQty=" + tatolQty +
            ", isCharged=" + isCharged +
            ", isReduceInventory=" + isReduceInventory +
            ", isPrintLabel=" + isPrintLabel +
            ", labelContent=" + labelContent +
            ", totalPrice=" + totalPrice +
            ", revisedAmount=" + revisedAmount +
            ", guidingPrice=" + guidingPrice +
            ", totalAmount=" + totalAmount +
            ", usages=" + usages +
            ", isTotal=" + isTotal +
            ", executionFrequency=" + executionFrequency +
            ", consumableMaterial=" + consumableMaterial +
            ", businessPathCode=" + businessPathCode +
            ", businessPathName=" + businessPathName +
            ", orderStartTime=" + orderStartTime +
            ", orderStopTime=" + orderStopTime +
            ", orderDoctorCode=" + orderDoctorCode +
            ", orderDoctorName=" + orderDoctorName +
            ", orderOpeTime=" + orderOpeTime +
            ", executeDeptName=" + executeDeptName +
            ", executeDeptCode=" + executeDeptCode +
            ", executeDoctorCode=" + executeDoctorCode +
            ", executeDoctorName=" + executeDoctorName +
            ", executeOpeDateTime=" + executeOpeDateTime +
            ", printDeptName=" + printDeptName +
            ", printDeptCode=" + printDeptCode +
            ", printDoctorName=" + printDoctorName +
            ", printDoctorCode=" + printDoctorCode +
            ", printOpeTime=" + printOpeTime +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
