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
 * 医嘱退库明细表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_order_exe_withdrawal")
@ApiModel(value = "SupportOrderExeWithdrawal对象", description = "医嘱退库明细表")
public class SupportOrderExeWithdrawal extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "oew_id", type = IdType.AUTO)
    private Long oewId;

    @ApiModelProperty("关联support_nutri_order表字段")
    private Long noId;

    @ApiModelProperty("关联support_nutri_order表字段")
    private Long nodId;

    @ApiModelProperty("关联support_nutri_order表字段")
    private Long oeId;

    @ApiModelProperty("关联support_order_exe_detail表字段")
    private Long oedId;

    @ApiModelProperty("病人唯一识别号")
    private String patientId;

    @ApiModelProperty("入院次数")
    private String visitId;

    @ApiModelProperty("执行日期")
    private LocalDateTime exeDate;

    @ApiModelProperty("执行日期时间")
    private LocalDateTime exeDateTime;

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

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("合计,所有制剂合计")
    private BigDecimal totalPrice;

    @ApiModelProperty("指导价格")
    private BigDecimal guidingPrice;

    @ApiModelProperty("剂型编码")
    private String dosageFormCode;

    @ApiModelProperty("剂型名称")
    private String dosageFormName;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("医嘱量")
    private BigDecimal orderQty;

    @ApiModelProperty("数量")
    private Integer amount;

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
    private String printDoctorCode;

    @ApiModelProperty("打印标签医生编码")
    private String printDoctorName;

    @ApiModelProperty("打印标签操作的时间")
    private LocalDateTime printOpeTime;

    @ApiModelProperty("退库科室名")
    private String backDeptName;

    @ApiModelProperty("退库科室编码")
    private String backDeptCode;

    @ApiModelProperty("退库医生姓名")
    private String backDoctorName;

    @ApiModelProperty("退库医生编码")
    private String backDoctorCode;

    @ApiModelProperty("退库操作的时间")
    private LocalDateTime backOpeTime;

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
    public Long getOewId() {
        return oewId;
    }

    /**		
	 * 		
     */
    public void setOewId(Long oewId) {
        this.oewId = oewId;
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
	 * 关联support_nutri_order表字段		
     */
    public Long getNodId() {
        return nodId;
    }

    /**		
	 * 关联support_nutri_order表字段		
     */
    public void setNodId(Long nodId) {
        this.nodId = nodId;
    }
    /**		
	 * 关联support_nutri_order表字段		
     */
    public Long getOeId() {
        return oeId;
    }

    /**		
	 * 关联support_nutri_order表字段		
     */
    public void setOeId(Long oeId) {
        this.oeId = oeId;
    }
    /**		
	 * 关联support_order_exe_detail表字段		
     */
    public Long getOedId() {
        return oedId;
    }

    /**		
	 * 关联support_order_exe_detail表字段		
     */
    public void setOedId(Long oedId) {
        this.oedId = oedId;
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
	 * 剂型编码		
     */
    public String getDosageFormCode() {
        return dosageFormCode;
    }

    /**		
	 * 剂型编码		
     */
    public void setDosageFormCode(String dosageFormCode) {
        this.dosageFormCode = dosageFormCode;
    }
    /**		
	 * 剂型名称		
     */
    public String getDosageFormName() {
        return dosageFormName;
    }

    /**		
	 * 剂型名称		
     */
    public void setDosageFormName(String dosageFormName) {
        this.dosageFormName = dosageFormName;
    }
    /**		
	 * 单位		
     */
    public String getUnit() {
        return unit;
    }

    /**		
	 * 单位		
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**		
	 * 医嘱量		
     */
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    /**		
	 * 医嘱量		
     */
    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }
    /**		
	 * 数量		
     */
    public Integer getAmount() {
        return amount;
    }

    /**		
	 * 数量		
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
    public String getPrintDoctorCode() {
        return printDoctorCode;
    }

    /**		
	 * 打印标签医生姓名		
     */
    public void setPrintDoctorCode(String printDoctorCode) {
        this.printDoctorCode = printDoctorCode;
    }
    /**		
	 * 打印标签医生编码		
     */
    public String getPrintDoctorName() {
        return printDoctorName;
    }

    /**		
	 * 打印标签医生编码		
     */
    public void setPrintDoctorName(String printDoctorName) {
        this.printDoctorName = printDoctorName;
    }
    /**		
	 * 打印标签操作的时间		
     */
    public LocalDateTime getPrintOpeTime() {
        return printOpeTime;
    }

    /**		
	 * 打印标签操作的时间		
     */
    public void setPrintOpeTime(LocalDateTime printOpeTime) {
        this.printOpeTime = printOpeTime;
    }
    /**		
	 * 退库科室名		
     */
    public String getBackDeptName() {
        return backDeptName;
    }

    /**		
	 * 退库科室名		
     */
    public void setBackDeptName(String backDeptName) {
        this.backDeptName = backDeptName;
    }
    /**		
	 * 退库科室编码		
     */
    public String getBackDeptCode() {
        return backDeptCode;
    }

    /**		
	 * 退库科室编码		
     */
    public void setBackDeptCode(String backDeptCode) {
        this.backDeptCode = backDeptCode;
    }
    /**		
	 * 退库医生姓名		
     */
    public String getBackDoctorName() {
        return backDoctorName;
    }

    /**		
	 * 退库医生姓名		
     */
    public void setBackDoctorName(String backDoctorName) {
        this.backDoctorName = backDoctorName;
    }
    /**		
	 * 退库医生编码		
     */
    public String getBackDoctorCode() {
        return backDoctorCode;
    }

    /**		
	 * 退库医生编码		
     */
    public void setBackDoctorCode(String backDoctorCode) {
        this.backDoctorCode = backDoctorCode;
    }
    /**		
	 * 退库操作的时间		
     */
    public LocalDateTime getBackOpeTime() {
        return backOpeTime;
    }

    /**		
	 * 退库操作的时间		
     */
    public void setBackOpeTime(LocalDateTime backOpeTime) {
        this.backOpeTime = backOpeTime;
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
        return "SupportOrderExeWithdrawal{" +
            "oewId=" + oewId +
            ", noId=" + noId +
            ", nodId=" + nodId +
            ", oeId=" + oeId +
            ", oedId=" + oedId +
            ", patientId=" + patientId +
            ", visitId=" + visitId +
            ", exeDate=" + exeDate +
            ", exeDateTime=" + exeDateTime +
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
            ", remark=" + remark +
            ", totalPrice=" + totalPrice +
            ", guidingPrice=" + guidingPrice +
            ", dosageFormCode=" + dosageFormCode +
            ", dosageFormName=" + dosageFormName +
            ", unit=" + unit +
            ", orderQty=" + orderQty +
            ", amount=" + amount +
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
            ", printDoctorCode=" + printDoctorCode +
            ", printDoctorName=" + printDoctorName +
            ", printOpeTime=" + printOpeTime +
            ", backDeptName=" + backDeptName +
            ", backDeptCode=" + backDeptCode +
            ", backDoctorName=" + backDoctorName +
            ", backDoctorCode=" + backDoctorCode +
            ", backOpeTime=" + backOpeTime +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
