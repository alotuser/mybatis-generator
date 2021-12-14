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
 * 
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_record")
@ApiModel(value = "SysRecord对象", description = "")
public class SysRecord extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rec_id", type = IdType.AUTO)
    private Long recId;

    private String patientId;

    @ApiModelProperty("记录ID")
    private String recordId;

    @ApiModelProperty("记录日期")
    private String recordDate;

    @ApiModelProperty("记录类型")
    private String recordType;

    @ApiModelProperty("记录内容")
    private String recordContent;

    private LocalDateTime createTime;

    private String createUserCode;

    private String createUserName;

    private LocalDateTime updateTime;

    private String updateUserCode;

    private String updateUserName;

    /**		
	 * 		
     */
    public Long getRecId() {
        return recId;
    }

    /**		
	 * 		
     */
    public void setRecId(Long recId) {
        this.recId = recId;
    }
    /**		
	 * 		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 		
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 记录ID		
     */
    public String getRecordId() {
        return recordId;
    }

    /**		
	 * 记录ID		
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }
    /**		
	 * 记录日期		
     */
    public String getRecordDate() {
        return recordDate;
    }

    /**		
	 * 记录日期		
     */
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
    /**		
	 * 记录类型		
     */
    public String getRecordType() {
        return recordType;
    }

    /**		
	 * 记录类型		
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
    /**		
	 * 记录内容		
     */
    public String getRecordContent() {
        return recordContent;
    }

    /**		
	 * 记录内容		
     */
    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent;
    }
    /**		
	 * 		
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**		
	 * 		
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    /**		
	 * 		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 		
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    /**		
	 * 		
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**		
	 * 		
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    /**		
	 * 		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 		
     */
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
    /**		
	 * 		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "SysRecord{" +
            "recId=" + recId +
            ", patientId=" + patientId +
            ", recordId=" + recordId +
            ", recordDate=" + recordDate +
            ", recordType=" + recordType +
            ", recordContent=" + recordContent +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
