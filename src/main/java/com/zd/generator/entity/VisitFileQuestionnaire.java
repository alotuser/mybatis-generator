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
 * 档案-问卷
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_file_questionnaire")
@ApiModel(value = "VisitFileQuestionnaire对象", description = "档案-问卷")
public class VisitFileQuestionnaire extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "quest_id", type = IdType.AUTO)
    private Long questId;

    private Long upcomingDetailId;

    private Long patientId;

    @ApiModelProperty("姓名")
    private String patientName;

    @ApiModelProperty("记录日期")
    private String fileDate;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("答案")
    private String answer;

    @ApiModelProperty("备注")
    private String remark;

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
    public Long getQuestId() {
        return questId;
    }

    /**		
	 * 		
     */
    public void setQuestId(Long questId) {
        this.questId = questId;
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
	 * 		
     */
    public Long getPatientId() {
        return patientId;
    }

    /**		
	 * 		
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
	 * 标题		
     */
    public String getTitle() {
        return title;
    }

    /**		
	 * 标题		
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**		
	 * 内容		
     */
    public String getContent() {
        return content;
    }

    /**		
	 * 内容		
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**		
	 * 答案		
     */
    public String getAnswer() {
        return answer;
    }

    /**		
	 * 答案		
     */
    public void setAnswer(String answer) {
        this.answer = answer;
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
        return "VisitFileQuestionnaire{" +
            "questId=" + questId +
            ", upcomingDetailId=" + upcomingDetailId +
            ", patientId=" + patientId +
            ", patientName=" + patientName +
            ", fileDate=" + fileDate +
            ", title=" + title +
            ", content=" + content +
            ", answer=" + answer +
            ", remark=" + remark +
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
