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
 * 采购计划
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("stk_planning_order")
@ApiModel(value = "StkPlanningOrder对象", description = "采购计划")
public class StkPlanningOrder extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "so_id", type = IdType.AUTO)
    private Long soId;

    @ApiModelProperty("采购计划单号")
    private String planNo;

    @ApiModelProperty("采购计划日期")
    private LocalDateTime planDate;

    @ApiModelProperty("采购类型")
    private String purchaseTypeCode;

    @ApiModelProperty("采购类型")
    private String purchaseTypeName;

    private String buyerCode;

    @ApiModelProperty("采购方")
    private String buyerName;

    private String buyerPersonnelCode;

    @ApiModelProperty("采购方人员")
    private String buyerPersonnelName;

    @ApiModelProperty("采购方电话")
    private String buyerPhone;

    @ApiModelProperty("采购计划备注")
    private String remark;

    @ApiModelProperty("图片附件")
    private String picAttachment;

    @ApiModelProperty("文档附件")
    private String docAttachment;

    @ApiModelProperty("采购计划单号")
    private String copyPlanNo;

    @ApiModelProperty("审核人code")
    private String reviewerCode;

    @ApiModelProperty("审核人名字")
    private String reviewerName;

    @ApiModelProperty("审核时间")
    private LocalDateTime reviewTime;

    @ApiModelProperty("审批状态  0-未审批 1-已审批 2-已审批未通过 3-采购中止")
    private String reviewStatus;

    @ApiModelProperty("审批意见")
    private String reviewOpinion;

    @ApiModelProperty("是否删除  0否  1是")
    private String isDelete;

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
    public Long getSoId() {
        return soId;
    }

    /**		
	 * 		
     */
    public void setSoId(Long soId) {
        this.soId = soId;
    }
    /**		
	 * 采购计划单号		
     */
    public String getPlanNo() {
        return planNo;
    }

    /**		
	 * 采购计划单号		
     */
    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }
    /**		
	 * 采购计划日期		
     */
    public LocalDateTime getPlanDate() {
        return planDate;
    }

    /**		
	 * 采购计划日期		
     */
    public void setPlanDate(LocalDateTime planDate) {
        this.planDate = planDate;
    }
    /**		
	 * 采购类型		
     */
    public String getPurchaseTypeCode() {
        return purchaseTypeCode;
    }

    /**		
	 * 采购类型		
     */
    public void setPurchaseTypeCode(String purchaseTypeCode) {
        this.purchaseTypeCode = purchaseTypeCode;
    }
    /**		
	 * 采购类型		
     */
    public String getPurchaseTypeName() {
        return purchaseTypeName;
    }

    /**		
	 * 采购类型		
     */
    public void setPurchaseTypeName(String purchaseTypeName) {
        this.purchaseTypeName = purchaseTypeName;
    }
    /**		
	 * 		
     */
    public String getBuyerCode() {
        return buyerCode;
    }

    /**		
	 * 		
     */
    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }
    /**		
	 * 采购方		
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**		
	 * 采购方		
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
    /**		
	 * 		
     */
    public String getBuyerPersonnelCode() {
        return buyerPersonnelCode;
    }

    /**		
	 * 		
     */
    public void setBuyerPersonnelCode(String buyerPersonnelCode) {
        this.buyerPersonnelCode = buyerPersonnelCode;
    }
    /**		
	 * 采购方人员		
     */
    public String getBuyerPersonnelName() {
        return buyerPersonnelName;
    }

    /**		
	 * 采购方人员		
     */
    public void setBuyerPersonnelName(String buyerPersonnelName) {
        this.buyerPersonnelName = buyerPersonnelName;
    }
    /**		
	 * 采购方电话		
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**		
	 * 采购方电话		
     */
    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }
    /**		
	 * 采购计划备注		
     */
    public String getRemark() {
        return remark;
    }

    /**		
	 * 采购计划备注		
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**		
	 * 图片附件		
     */
    public String getPicAttachment() {
        return picAttachment;
    }

    /**		
	 * 图片附件		
     */
    public void setPicAttachment(String picAttachment) {
        this.picAttachment = picAttachment;
    }
    /**		
	 * 文档附件		
     */
    public String getDocAttachment() {
        return docAttachment;
    }

    /**		
	 * 文档附件		
     */
    public void setDocAttachment(String docAttachment) {
        this.docAttachment = docAttachment;
    }
    /**		
	 * 采购计划单号		
     */
    public String getCopyPlanNo() {
        return copyPlanNo;
    }

    /**		
	 * 采购计划单号		
     */
    public void setCopyPlanNo(String copyPlanNo) {
        this.copyPlanNo = copyPlanNo;
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
	 * 审批状态  0-未审批 1-已审批 2-已审批未通过 3-采购中止		
     */
    public String getReviewStatus() {
        return reviewStatus;
    }

    /**		
	 * 审批状态  0-未审批 1-已审批 2-已审批未通过 3-采购中止		
     */
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
    /**		
	 * 审批意见		
     */
    public String getReviewOpinion() {
        return reviewOpinion;
    }

    /**		
	 * 审批意见		
     */
    public void setReviewOpinion(String reviewOpinion) {
        this.reviewOpinion = reviewOpinion;
    }
    /**		
	 * 是否删除  0否  1是		
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除  0否  1是		
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
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
        return "StkPlanningOrder{" +
            "soId=" + soId +
            ", planNo=" + planNo +
            ", planDate=" + planDate +
            ", purchaseTypeCode=" + purchaseTypeCode +
            ", purchaseTypeName=" + purchaseTypeName +
            ", buyerCode=" + buyerCode +
            ", buyerName=" + buyerName +
            ", buyerPersonnelCode=" + buyerPersonnelCode +
            ", buyerPersonnelName=" + buyerPersonnelName +
            ", buyerPhone=" + buyerPhone +
            ", remark=" + remark +
            ", picAttachment=" + picAttachment +
            ", docAttachment=" + docAttachment +
            ", copyPlanNo=" + copyPlanNo +
            ", reviewerCode=" + reviewerCode +
            ", reviewerName=" + reviewerName +
            ", reviewTime=" + reviewTime +
            ", reviewStatus=" + reviewStatus +
            ", reviewOpinion=" + reviewOpinion +
            ", isDelete=" + isDelete +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
