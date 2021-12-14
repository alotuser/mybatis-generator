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
 * 日志管理
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_log")
@ApiModel(value = "SysLog对象", description = "日志管理")
public class SysLog extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    @ApiModelProperty("用户code ")
    private String userCode;

    @ApiModelProperty("类型，具体使用时自定义，方便检索")
    private String type;

    @ApiModelProperty("数据来源，1-PC页面2-调用接口  ")
    private String source;

    @ApiModelProperty("IP地址")
    private String ip;

    @ApiModelProperty("浏览器")
    private String browser;

    @ApiModelProperty("浏览器版本   ")
    private String browserVersion;

    @ApiModelProperty("备注  ")
    private String remark;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码   ")
    private String createUserCode;

    @ApiModelProperty("创建人名称   ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码   ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称   ")
    private String updateUserName;

    /**		
	 * 		
     */
    public Integer getLogId() {
        return logId;
    }

    /**		
	 * 		
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }
    /**		
	 * 用户code 		
     */
    public String getUserCode() {
        return userCode;
    }

    /**		
	 * 用户code 		
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    /**		
	 * 类型，具体使用时自定义，方便检索		
     */
    public String getType() {
        return type;
    }

    /**		
	 * 类型，具体使用时自定义，方便检索		
     */
    public void setType(String type) {
        this.type = type;
    }
    /**		
	 * 数据来源，1-PC页面2-调用接口  		
     */
    public String getSource() {
        return source;
    }

    /**		
	 * 数据来源，1-PC页面2-调用接口  		
     */
    public void setSource(String source) {
        this.source = source;
    }
    /**		
	 * IP地址		
     */
    public String getIp() {
        return ip;
    }

    /**		
	 * IP地址		
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**		
	 * 浏览器		
     */
    public String getBrowser() {
        return browser;
    }

    /**		
	 * 浏览器		
     */
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    /**		
	 * 浏览器版本   		
     */
    public String getBrowserVersion() {
        return browserVersion;
    }

    /**		
	 * 浏览器版本   		
     */
    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
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
        return "SysLog{" +
            "logId=" + logId +
            ", userCode=" + userCode +
            ", type=" + type +
            ", source=" + source +
            ", ip=" + ip +
            ", browser=" + browser +
            ", browserVersion=" + browserVersion +
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
