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
 * 随访用户
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("visit_user")
@ApiModel(value = "VisitUser对象", description = "随访用户")
public class VisitUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private String openId;

    private String sessionKey;

    private String skey;

    @ApiModelProperty("网名")
    private String nickName;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("性别 0未知 1男 2女")
    private String gender;

    @ApiModelProperty("头像")
    private String avatarUrl;

    @ApiModelProperty("国")
    private String country;

    @ApiModelProperty("省")
    private String province;

    @ApiModelProperty("市")
    private String city;

    @ApiModelProperty("最后登录时间")
    private LocalDateTime lastVisitTime;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("是否删除 0否 1是")
    private Integer isDelete;

    @ApiModelProperty("医院code")
    private String hospCode;

    @ApiModelProperty("医院name")
    private String hospName;

    @ApiModelProperty("科室code")
    private String deptCode;

    @ApiModelProperty("科室name")
    private String deptName;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

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
	 * 		
     */
    public String getOpenId() {
        return openId;
    }

    /**		
	 * 		
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**		
	 * 		
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**		
	 * 		
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
    /**		
	 * 		
     */
    public String getSkey() {
        return skey;
    }

    /**		
	 * 		
     */
    public void setSkey(String skey) {
        this.skey = skey;
    }
    /**		
	 * 网名		
     */
    public String getNickName() {
        return nickName;
    }

    /**		
	 * 网名		
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    /**		
	 * 手机号		
     */
    public String getPhone() {
        return phone;
    }

    /**		
	 * 手机号		
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**		
	 * 性别 0未知 1男 2女		
     */
    public String getGender() {
        return gender;
    }

    /**		
	 * 性别 0未知 1男 2女		
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**		
	 * 头像		
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**		
	 * 头像		
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    /**		
	 * 国		
     */
    public String getCountry() {
        return country;
    }

    /**		
	 * 国		
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**		
	 * 省		
     */
    public String getProvince() {
        return province;
    }

    /**		
	 * 省		
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**		
	 * 市		
     */
    public String getCity() {
        return city;
    }

    /**		
	 * 市		
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**		
	 * 最后登录时间		
     */
    public LocalDateTime getLastVisitTime() {
        return lastVisitTime;
    }

    /**		
	 * 最后登录时间		
     */
    public void setLastVisitTime(LocalDateTime lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
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
	 * 是否删除 0否 1是		
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**		
	 * 是否删除 0否 1是		
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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

    @Override
    public String toString() {
        return "VisitUser{" +
            "userId=" + userId +
            ", openId=" + openId +
            ", sessionKey=" + sessionKey +
            ", skey=" + skey +
            ", nickName=" + nickName +
            ", phone=" + phone +
            ", gender=" + gender +
            ", avatarUrl=" + avatarUrl +
            ", country=" + country +
            ", province=" + province +
            ", city=" + city +
            ", lastVisitTime=" + lastVisitTime +
            ", status=" + status +
            ", isDelete=" + isDelete +
            ", hospCode=" + hospCode +
            ", hospName=" + hospName +
            ", deptCode=" + deptCode +
            ", deptName=" + deptName +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
