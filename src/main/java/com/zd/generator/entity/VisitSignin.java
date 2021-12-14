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
 * 签到表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_signin")
@ApiModel(value = "VisitSignin对象", description = "签到表")
public class VisitSignin extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sign_id", type = IdType.AUTO)
    private Long signId;

    @ApiModelProperty("user id")
    private Long userId;

    @ApiModelProperty("patient_id")
    private Long patientId;

    @ApiModelProperty("就诊人")
    private String patientName;

    @ApiModelProperty("签到日期")
    private String signDate;

    @ApiModelProperty("医院code")
    private String hospCode;

    @ApiModelProperty("医院name")
    private String hospName;

    @ApiModelProperty("科室code")
    private String deptCode;

    @ApiModelProperty("科室name")
    private String deptName;

    @ApiModelProperty("是否删除")
    private Integer isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人code")
    private String createUserCode;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人code")
    private String updateUserCode;

    @ApiModelProperty("更新人姓名")
    private String updateUserName;

    /**		
	 * 		
     */
    public Long getSignId() {
        return signId;
    }

    /**		
	 * 		
     */
    public void setSignId(Long signId) {
        this.signId = signId;
    }
    /**		
	 * user id		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * user id		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**		
	 * patient_id		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * patient_id		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 就诊人		
     */
    public String getPatientName() {
        return patientName;
    }

    /**		
	 * 就诊人		
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**		
	 * 签到日期		
     */
    public String getSignDate() {
        return signDate;
    }

    /**		
	 * 签到日期		
     */
    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }
    /**		
	 * 医院code		
     */
    public String getHospCode() {
        return hospCode;
    }

    /**		
	 * 医院code		
     */
    public void setHospCode(String hospCode) {
        this.hospCode = hospCode;
    }
    /**		
	 * 医院name		
     */
    public String getHospName() {
        return hospName;
    }

    /**		
	 * 医院name		
     */
    public void setHospName(String hospName) {
        this.hospName = hospName;
    }
    /**		
	 * 科室code		
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**		
	 * 科室code		
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    /**		
	 * 科室name		
     */
    public String getDeptName() {
        return deptName;
    }

    /**		
	 * 科室name		
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    /**		
	 * 是否删除		
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除		
     */
    public void setIsDelete(Integer isDelete) {
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
	 * 创建人code		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 创建人code		
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
	 * 更新人code		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 更新人code		
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
        return "VisitSignin{" +
            "signId=" + signId +
            ", userId=" + userId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", signDate=" + signDate +
            ", hospCode=" + hospCode +
            ", hospName=" + hospName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
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
