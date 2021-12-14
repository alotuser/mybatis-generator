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
 * 待办提示
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_upcoming_notify")
@ApiModel(value = "VisitUpcomingNotify对象", description = "待办提示")
public class VisitUpcomingNotify extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "upcoming_notify_id", type = IdType.AUTO)
    private Long upcomingNotifyId;

    private Long userId;

    @ApiModelProperty("类型 1复诊 2随访")
    private Integer type;

    @ApiModelProperty("提示日期")
    private String notifyDate;

    @ApiModelProperty("类型 0拒绝 1同意")
    private Integer notifyCount;

    @ApiModelProperty("复诊提示次数")
    private Integer notifyCount1;

    @ApiModelProperty("随访提示次数")
    private Integer notifyCount2;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人code")
    private String createUserCode;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    /**		
	 * 		
     */
    public Long getUpcomingNotifyId() {
        return upcomingNotifyId;
    }

    /**		
	 * 		
     */
    public void setUpcomingNotifyId(Long upcomingNotifyId) {
        this.upcomingNotifyId = upcomingNotifyId;
    }
    /**		
	 * 		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * 		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**		
	 * 类型 1复诊 2随访		
     */
    public Integer getType() {
        return type;
    }

    /**		
	 * 类型 1复诊 2随访		
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**		
	 * 提示日期		
     */
    public String getNotifyDate() {
        return notifyDate;
    }

    /**		
	 * 提示日期		
     */
    public void setNotifyDate(String notifyDate) {
        this.notifyDate = notifyDate;
    }
    /**		
	 * 类型 0拒绝 1同意		
     */
    public Integer getNotifyCount() {
        return notifyCount;
    }

    /**		
	 * 类型 0拒绝 1同意		
     */
    public void setNotifyCount(Integer notifyCount) {
        this.notifyCount = notifyCount;
    }
    /**		
	 * 复诊提示次数		
     */
    public Integer getNotifyCount1() {
        return notifyCount1;
    }

    /**		
	 * 复诊提示次数		
     */
    public void setNotifyCount1(Integer notifyCount1) {
        this.notifyCount1 = notifyCount1;
    }
    /**		
	 * 随访提示次数		
     */
    public Integer getNotifyCount2() {
        return notifyCount2;
    }

    /**		
	 * 随访提示次数		
     */
    public void setNotifyCount2(Integer notifyCount2) {
        this.notifyCount2 = notifyCount2;
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

    @Override
    public String toString() {
        return "VisitUpcomingNotify{" +
            "upcomingNotifyId=" + upcomingNotifyId +
            ", userId=" + userId +
            ", type=" + type +
            ", notifyDate=" + notifyDate +
            ", notifyCount=" + notifyCount +
            ", notifyCount1=" + notifyCount1 +
            ", notifyCount2=" + notifyCount2 +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
        "}";
    }
}
