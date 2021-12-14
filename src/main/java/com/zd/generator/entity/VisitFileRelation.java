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
 * 共享病人关联表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_relation")
@ApiModel(value = "VisitFileRelation对象", description = "共享病人关联表")
public class VisitFileRelation extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ran_id", type = IdType.AUTO)
    private Long ranId;

    @ApiModelProperty("关联visit_user")
    private Long userId;

    @ApiModelProperty("关联visit_patient")
    private Long patientId;

    @ApiModelProperty("是否删除关系，0否1是")
    private Integer isDelete;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("备注")
    private String remark;

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
    public Long getRanId() {
        return ranId;
    }

    /**		
	 * 		
     */
    public void setRanId(Long ranId) {
        this.ranId = ranId;
    }
    /**		
	 * 关联visit_user		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * 关联visit_user		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**		
	 * 关联visit_patient		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * 关联visit_patient		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 是否删除关系，0否1是		
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除关系，0否1是		
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    /**		
	 * 状态		
     */
    public Integer getStatus() {
        return status;
    }

    /**		
	 * 状态		
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        return "VisitFileRelation{" +
            "ranId=" + ranId +
            ", userId=" + userId +
            ", patientId=" + patientId +
            ", isDelete=" + isDelete +
            ", status=" + status +
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
