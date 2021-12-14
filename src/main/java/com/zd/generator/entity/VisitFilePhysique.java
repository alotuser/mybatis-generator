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
 * 体格健康档案
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_physique")
@ApiModel(value = "VisitFilePhysique对象", description = "体格健康档案")
public class VisitFilePhysique extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "physique_id", type = IdType.AUTO)
    private Long physiqueId;

    private Long upcomingDetailId;

    @ApiModelProperty("id")
    private Long patientId;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("记录日期")
    private String fileDate;

    @ApiModelProperty("身高")
    private String height;

    @ApiModelProperty("体重")
    private String weight;

    @ApiModelProperty("头围")
    private String headht;

    @ApiModelProperty("臀围")
    private String hips;

    @ApiModelProperty("腰围")
    private String waistline;

    @ApiModelProperty("孕前体重")
    private String pregnancyWeight;

    @ApiModelProperty("是否患有疾病")
    private String disease;

    @ApiModelProperty("状态")
    private String status;

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
    public Long getPhysiqueId() {
        return physiqueId;
    }

    /**		
	 * 		
     */
    public void setPhysiqueId(Long physiqueId) {
        this.physiqueId = physiqueId;
    }
    /**		
	 * 		
     */
    public Long getUpcomingDetailId() {
        return upcomingDetailId;
    }

    /**		
	 * 		
     */
    public void setUpcomingDetailId(Long upcomingDetailId) {
        this.upcomingDetailId = upcomingDetailId;
    }
    /**		
	 * id		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * id		
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 姓名		
     */
    public String getPatientName() {
        return patientName;
    }

    /**		
	 * 姓名		
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    /**		
	 * 记录日期		
     */
    public String getFileDate() {
        return fileDate;
    }

    /**		
	 * 记录日期		
     */
    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
    /**		
	 * 身高		
     */
    public String getHeight() {
        return height;
    }

    /**		
	 * 身高		
     */
    public void setHeight(String height) {
        this.height = height;
    }
    /**		
	 * 体重		
     */
    public String getWeight() {
        return weight;
    }

    /**		
	 * 体重		
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /**		
	 * 头围		
     */
    public String getHeadht() {
        return headht;
    }

    /**		
	 * 头围		
     */
    public void setHeadht(String headht) {
        this.headht = headht;
    }
    /**		
	 * 臀围		
     */
    public String getHips() {
        return hips;
    }

    /**		
	 * 臀围		
     */
    public void setHips(String hips) {
        this.hips = hips;
    }
    /**		
	 * 腰围		
     */
    public String getWaistline() {
        return waistline;
    }

    /**		
	 * 腰围		
     */
    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }
    /**		
	 * 孕前体重		
     */
    public String getPregnancyWeight() {
        return pregnancyWeight;
    }

    /**		
	 * 孕前体重		
     */
    public void setPregnancyWeight(String pregnancyWeight) {
        this.pregnancyWeight = pregnancyWeight;
    }
    /**		
	 * 是否患有疾病		
     */
    public String getDisease() {
        return disease;
    }

    /**		
	 * 是否患有疾病		
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
    /**		
	 * 状态		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态		
     */
    public void setStatus(String status) {
        this.status = status;
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
        return "VisitFilePhysique{" +
            "physiqueId=" + physiqueId +
            ", upcomingDetailId=" + upcomingDetailId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", fileDate=" + fileDate +
            ", height=" + height +
            ", weight=" + weight +
            ", headht=" + headht +
            ", hips=" + hips +
            ", waistline=" + waistline +
            ", pregnancyWeight=" + pregnancyWeight +
            ", disease=" + disease +
            ", status=" + status +
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
