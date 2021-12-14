package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 机构表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_organization")
@ApiModel(value = "SysOrganization对象", description = "机构表")
public class SysOrganization extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "org_id", type = IdType.AUTO)
    private Long orgId;

    @ApiModelProperty("机构编码，根据规则自动生成。（99为虚拟管理机构）")
    private String orgCode;

    @ApiModelProperty("组织机构代码证号码  ")
    private String orgSn;

    @ApiModelProperty("机构名称 ")
    private String orgName;

    @ApiModelProperty("所在地区代码 ")
    private String districtCode;

    @ApiModelProperty("所在地区名字 ")
    private String districtName;

    @ApiModelProperty("挂靠单位编码 ")
    private String unitCode;

    @ApiModelProperty("挂靠单位名称 ")
    private String unitName;

    @ApiModelProperty("详细地址 ")
    private String address;

    @ApiModelProperty("执业许可证编号  ")
    private String businessLicenceNo;

    @ApiModelProperty("执业许可证相对路径  ")
    private String businessLicencePath;

    @ApiModelProperty("成立日期 ")
    private String establishDate;

    @ApiModelProperty("所有制编码   ")
    private String ownershipCode;

    @ApiModelProperty("所有制名称   ")
    private String ownershipName;

    @ApiModelProperty("医疗机构类别编码")
    private String orgTypeCode;

    @ApiModelProperty("医疗机构类别名称")
    private String orgTypeName;

    @ApiModelProperty("医疗机构级别代码")
    private String orgGradeCode;

    @ApiModelProperty("医疗机构级别名称")
    private String orgGradeName;

    @ApiModelProperty("医疗机构等次编码")
    private String orgLevelCode;

    @ApiModelProperty("医疗机构等次名称")
    private String orgLevelName;

    @ApiModelProperty("负责人姓名   ")
    private String leadUserName;

    @ApiModelProperty("负责人手机号 ")
    private String leadUserPhone;

    @ApiModelProperty("备注  ")
    private String remark;

    @ApiModelProperty("状态,0申请待审核,1审核通过,2审核未通过，9锁定   ")
    private String status;

    @ApiModelProperty("审核人编码   ")
    private String approvalUserCode;

    @ApiModelProperty("审核人姓名   ")
    private String approvalUserName;

    @ApiModelProperty("审核时间 ")
    private LocalDateTime approvalTime;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码   ")
    private String createUserCode;

    @ApiModelProperty("创建人姓名   ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码   ")
    private String updateUserCode;

    @ApiModelProperty("更新人姓名   ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getOrgId() {
        return orgId;
    }

    /**		
	 * 		
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
    /**		
	 * 机构编码，根据规则自动生成。（99为虚拟管理机构）		
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**		
	 * 机构编码，根据规则自动生成。（99为虚拟管理机构）		
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    /**		
	 * 组织机构代码证号码  		
     */
    public String getOrgSn() {
        return orgSn;
    }

    /**		
	 * 组织机构代码证号码  		
     */
    public void setOrgSn(String orgSn) {
        this.orgSn = orgSn;
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
	 * 所在地区代码 		
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**		
	 * 所在地区代码 		
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
    /**		
	 * 所在地区名字 		
     */
    public String getDistrictName() {
        return districtName;
    }

    /**		
	 * 所在地区名字 		
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    /**		
	 * 挂靠单位编码 		
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**		
	 * 挂靠单位编码 		
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    /**		
	 * 挂靠单位名称 		
     */
    public String getUnitName() {
        return unitName;
    }

    /**		
	 * 挂靠单位名称 		
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    /**		
	 * 详细地址 		
     */
    public String getAddress() {
        return address;
    }

    /**		
	 * 详细地址 		
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**		
	 * 执业许可证编号  		
     */
    public String getBusinessLicenceNo() {
        return businessLicenceNo;
    }

    /**		
	 * 执业许可证编号  		
     */
    public void setBusinessLicenceNo(String businessLicenceNo) {
        this.businessLicenceNo = businessLicenceNo;
    }
    /**		
	 * 执业许可证相对路径  		
     */
    public String getBusinessLicencePath() {
        return businessLicencePath;
    }

    /**		
	 * 执业许可证相对路径  		
     */
    public void setBusinessLicencePath(String businessLicencePath) {
        this.businessLicencePath = businessLicencePath;
    }
    /**		
	 * 成立日期 		
     */
    public String getEstablishDate() {
        return establishDate;
    }

    /**		
	 * 成立日期 		
     */
    public void setEstablishDate(String establishDate) {
        this.establishDate = establishDate;
    }
    /**		
	 * 所有制编码   		
     */
    public String getOwnershipCode() {
        return ownershipCode;
    }

    /**		
	 * 所有制编码   		
     */
    public void setOwnershipCode(String ownershipCode) {
        this.ownershipCode = ownershipCode;
    }
    /**		
	 * 所有制名称   		
     */
    public String getOwnershipName() {
        return ownershipName;
    }

    /**		
	 * 所有制名称   		
     */
    public void setOwnershipName(String ownershipName) {
        this.ownershipName = ownershipName;
    }
    /**		
	 * 医疗机构类别编码		
     */
    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    /**		
	 * 医疗机构类别编码		
     */
    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }
    /**		
	 * 医疗机构类别名称		
     */
    public String getOrgTypeName() {
        return orgTypeName;
    }

    /**		
	 * 医疗机构类别名称		
     */
    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }
    /**		
	 * 医疗机构级别代码		
     */
    public String getOrgGradeCode() {
        return orgGradeCode;
    }

    /**		
	 * 医疗机构级别代码		
     */
    public void setOrgGradeCode(String orgGradeCode) {
        this.orgGradeCode = orgGradeCode;
    }
    /**		
	 * 医疗机构级别名称		
     */
    public String getOrgGradeName() {
        return orgGradeName;
    }

    /**		
	 * 医疗机构级别名称		
     */
    public void setOrgGradeName(String orgGradeName) {
        this.orgGradeName = orgGradeName;
    }
    /**		
	 * 医疗机构等次编码		
     */
    public String getOrgLevelCode() {
        return orgLevelCode;
    }

    /**		
	 * 医疗机构等次编码		
     */
    public void setOrgLevelCode(String orgLevelCode) {
        this.orgLevelCode = orgLevelCode;
    }
    /**		
	 * 医疗机构等次名称		
     */
    public String getOrgLevelName() {
        return orgLevelName;
    }

    /**		
	 * 医疗机构等次名称		
     */
    public void setOrgLevelName(String orgLevelName) {
        this.orgLevelName = orgLevelName;
    }
    /**		
	 * 负责人姓名   		
     */
    public String getLeadUserName() {
        return leadUserName;
    }

    /**		
	 * 负责人姓名   		
     */
    public void setLeadUserName(String leadUserName) {
        this.leadUserName = leadUserName;
    }
    /**		
	 * 负责人手机号 		
     */
    public String getLeadUserPhone() {
        return leadUserPhone;
    }

    /**		
	 * 负责人手机号 		
     */
    public void setLeadUserPhone(String leadUserPhone) {
        this.leadUserPhone = leadUserPhone;
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
	 * 状态,0申请待审核,1审核通过,2审核未通过，9锁定   		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态,0申请待审核,1审核通过,2审核未通过，9锁定   		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 审核人编码   		
     */
    public String getApprovalUserCode() {
        return approvalUserCode;
    }

    /**		
	 * 审核人编码   		
     */
    public void setApprovalUserCode(String approvalUserCode) {
        this.approvalUserCode = approvalUserCode;
    }
    /**		
	 * 审核人姓名   		
     */
    public String getApprovalUserName() {
        return approvalUserName;
    }

    /**		
	 * 审核人姓名   		
     */
    public void setApprovalUserName(String approvalUserName) {
        this.approvalUserName = approvalUserName;
    }
    /**		
	 * 审核时间 		
     */
    public LocalDateTime getApprovalTime() {
        return approvalTime;
    }

    /**		
	 * 审核时间 		
     */
    public void setApprovalTime(LocalDateTime approvalTime) {
        this.approvalTime = approvalTime;
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
	 * 创建人姓名   		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 创建人姓名   		
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
	 * 更新人姓名   		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 更新人姓名   		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "SysOrganization{" +
            "orgId=" + orgId +
            ", orgCode=" + orgCode +
            ", orgSn=" + orgSn +
            ", orgName=" + orgName +
            ", districtCode=" + districtCode +
            ", districtName=" + districtName +
            ", unitCode=" + unitCode +
            ", unitName=" + unitName +
            ", address=" + address +
            ", businessLicenceNo=" + businessLicenceNo +
            ", businessLicencePath=" + businessLicencePath +
            ", establishDate=" + establishDate +
            ", ownershipCode=" + ownershipCode +
            ", ownershipName=" + ownershipName +
            ", orgTypeCode=" + orgTypeCode +
            ", orgTypeName=" + orgTypeName +
            ", orgGradeCode=" + orgGradeCode +
            ", orgGradeName=" + orgGradeName +
            ", orgLevelCode=" + orgLevelCode +
            ", orgLevelName=" + orgLevelName +
            ", leadUserName=" + leadUserName +
            ", leadUserPhone=" + leadUserPhone +
            ", remark=" + remark +
            ", status=" + status +
            ", approvalUserCode=" + approvalUserCode +
            ", approvalUserName=" + approvalUserName +
            ", approvalTime=" + approvalTime +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
