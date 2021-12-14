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
 * 模板
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_model")
@ApiModel(value = "SysModel对象", description = "模板")
public class SysModel extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "m_id", type = IdType.AUTO)
    private Integer mId;

    @ApiModelProperty("类别编码 process 病程")
    private String cateCode;

    @ApiModelProperty("类别名称")
    private String cateName;

    @ApiModelProperty("标题")
    private String modelTitle;

    @ApiModelProperty("内容")
    private String modelContent;

    @ApiModelProperty("名称，备用")
    private String modelName;

    @ApiModelProperty("关联的疾病")
    private String illCode;

    @ApiModelProperty("关联的疾病")
    private String illName;

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
    public Integer getmId() {
        return mId;
    }

    /**		
	 * 		
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }
    /**		
	 * 类别编码 process 病程		
     */
    public String getCateCode() {
        return cateCode;
    }

    /**		
	 * 类别编码 process 病程		
     */
    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }
    /**		
	 * 类别名称		
     */
    public String getCateName() {
        return cateName;
    }

    /**		
	 * 类别名称		
     */
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    /**		
	 * 标题		
     */
    public String getModelTitle() {
        return modelTitle;
    }

    /**		
	 * 标题		
     */
    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }
    /**		
	 * 内容		
     */
    public String getModelContent() {
        return modelContent;
    }

    /**		
	 * 内容		
     */
    public void setModelContent(String modelContent) {
        this.modelContent = modelContent;
    }
    /**		
	 * 名称，备用		
     */
    public String getModelName() {
        return modelName;
    }

    /**		
	 * 名称，备用		
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    /**		
	 * 关联的疾病		
     */
    public String getIllCode() {
        return illCode;
    }

    /**		
	 * 关联的疾病		
     */
    public void setIllCode(String illCode) {
        this.illCode = illCode;
    }
    /**		
	 * 关联的疾病		
     */
    public String getIllName() {
        return illName;
    }

    /**		
	 * 关联的疾病		
     */
    public void setIllName(String illName) {
        this.illName = illName;
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
        return "SysModel{" +
            "mId=" + mId +
            ", cateCode=" + cateCode +
            ", cateName=" + cateName +
            ", modelTitle=" + modelTitle +
            ", modelContent=" + modelContent +
            ", modelName=" + modelName +
            ", illCode=" + illCode +
            ", illName=" + illName +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
