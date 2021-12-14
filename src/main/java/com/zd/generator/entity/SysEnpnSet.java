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
 * ENPN套餐主表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_enpn_set")
@ApiModel(value = "SysEnpnSet对象", description = "ENPN套餐主表")
public class SysEnpnSet extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ms_id", type = IdType.AUTO)
    private Long msId;

    @ApiModelProperty("套餐名字")
    private String setName;

    @ApiModelProperty("类别 en/pn")
    private String category;

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
    public Long getMsId() {
        return msId;
    }

    /**		
	 * 		
     */
    public void setMsId(Long msId) {
        this.msId = msId;
    }
    /**		
	 * 套餐名字		
     */
    public String getSetName() {
        return setName;
    }

    /**		
	 * 套餐名字		
     */
    public void setSetName(String setName) {
        this.setName = setName;
    }
    /**		
	 * 类别 en/pn		
     */
    public String getCategory() {
        return category;
    }

    /**		
	 * 类别 en/pn		
     */
    public void setCategory(String category) {
        this.category = category;
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
        return "SysEnpnSet{" +
            "msId=" + msId +
            ", setName=" + setName +
            ", category=" + category +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
