package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 营养资讯
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_news")
@ApiModel(value = "VisitNews对象", description = "营养资讯")
public class VisitNews extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "news_id", type = IdType.AUTO)
    private Long newsId;

    @ApiModelProperty("类型代码")
    private String typeCode;

    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("内容")
    private Blob content;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("状态 0 下架 1发布")
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
    public Long getNewsId() {
        return newsId;
    }

    /**		
	 * 		
     */
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }
    /**		
	 * 类型代码		
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**		
	 * 类型代码		
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    /**		
	 * 类型名称		
     */
    public String getTypeName() {
        return typeName;
    }

    /**		
	 * 类型名称		
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
    public Blob getContent() {
        return content;
    }

    /**		
	 * 内容		
     */
    public void setContent(Blob content) {
        this.content = content;
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
	 * 状态 0 下架 1发布		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态 0 下架 1发布		
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
        return "VisitNews{" +
            "newsId=" + newsId +
            ", typeCode=" + typeCode +
            ", typeName=" + typeName +
            ", title=" + title +
            ", content=" + content +
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
