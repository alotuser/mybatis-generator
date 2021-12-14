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
 * 用户表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_user_info")
@ApiModel(value = "SysUserInfo对象", description = "用户表")
public class SysUserInfo extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键  ")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty("用户编码(一般可用工号)  ")
    private String userCode;

    @ApiModelProperty("所属机构(sys_organization表；如果只有机构表只有一行记录默认)  ")
    private String orgCode;

    @ApiModelProperty("姓名  ")
    private String userName;

    @ApiModelProperty("英文名")
    private String englishName;

    @ApiModelProperty("密码  ")
    private String userPassword;

    @ApiModelProperty("安全符，每个人随机。")
    private String salt;

    @ApiModelProperty("性别(男,女，其他)")
    private String gender;

    @ApiModelProperty("身份证号  ")
    private String identity;

    @ApiModelProperty("科室列表，科室code以“|”分割")
    private String deptList;

    @ApiModelProperty("病区列表，病区code以“|”分割")
    private String wardList;

    @ApiModelProperty("群组列表，群组code以“|”分割")
    private String groupList;

    @ApiModelProperty("角色(医生，护士，营养师，为空则默认医生) ")
    private String role;

    @ApiModelProperty("生日  ")
    private LocalDateTime birthday;

    @ApiModelProperty("职务  ")
    private String position;

    @ApiModelProperty("办公室电话")
    private String officeNo;

    @ApiModelProperty("手机号")
    private String mobilephone;

    @ApiModelProperty("家庭电话  ")
    private String familyPhone;

    @ApiModelProperty("传真  ")
    private String fax;

    @ApiModelProperty("email地址 ")
    private String email;

    @ApiModelProperty("QQ号  ")
    private String qq;

    @ApiModelProperty("微信号")
    private String wechat;

    @ApiModelProperty("头像路径  ")
    private String photo;

    @ApiModelProperty("签名图片路径 ")
    private String signPath;

    @ApiModelProperty("地址  ")
    private String address;

    @ApiModelProperty("备注  ")
    private String remark;

    @ApiModelProperty("状态,0删除,1正常, 9锁定 ")
    private String status;

    @ApiModelProperty("开启日期 0关 1开")
    private Integer openDate;

    @ApiModelProperty("生效日期")
    private LocalDateTime effectiveDate;

    @ApiModelProperty("失效日期")
    private LocalDateTime expiringDate;

    @ApiModelProperty("开启移动端 0关 1开")
    private Integer openApp;

    @ApiModelProperty("是否删除")
    private Integer isDelete;

    @ApiModelProperty("最后登录时间 ")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty("最后登录IP 注意兼容IPV6 ")
    private String lastLoginIp;

    @ApiModelProperty("创建时间  ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码")
    private String createUserCode;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("更新时间  ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码")
    private String updateUserCode;

    @ApiModelProperty("更新人姓名")
    private String updateUserName;

    /**		
	 * 主键  		
     */
    public Long getUserId() {
        return userId;
    }

    /**		
	 * 主键  		
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**		
	 * 用户编码(一般可用工号)  		
     */
    public String getUserCode() {
        return userCode;
    }

    /**		
	 * 用户编码(一般可用工号)  		
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    /**		
	 * 所属机构(sys_organization表；如果只有机构表只有一行记录默认)  		
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**		
	 * 所属机构(sys_organization表；如果只有机构表只有一行记录默认)  		
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    /**		
	 * 姓名  		
     */
    public String getUserName() {
        return userName;
    }

    /**		
	 * 姓名  		
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**		
	 * 英文名		
     */
    public String getEnglishName() {
        return englishName;
    }

    /**		
	 * 英文名		
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
    /**		
	 * 密码  		
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**		
	 * 密码  		
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    /**		
	 * 安全符，每个人随机。		
     */
    public String getSalt() {
        return salt;
    }

    /**		
	 * 安全符，每个人随机。		
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
    /**		
	 * 性别(男,女，其他)		
     */
    public String getGender() {
        return gender;
    }

    /**		
	 * 性别(男,女，其他)		
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**		
	 * 身份证号  		
     */
    public String getIdentity() {
        return identity;
    }

    /**		
	 * 身份证号  		
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    /**		
	 * 科室列表，科室code以“|”分割		
     */
    public String getDeptList() {
        return deptList;
    }

    /**		
	 * 科室列表，科室code以“|”分割		
     */
    public void setDeptList(String deptList) {
        this.deptList = deptList;
    }
    /**		
	 * 病区列表，病区code以“|”分割		
     */
    public String getWardList() {
        return wardList;
    }

    /**		
	 * 病区列表，病区code以“|”分割		
     */
    public void setWardList(String wardList) {
        this.wardList = wardList;
    }
    /**		
	 * 群组列表，群组code以“|”分割		
     */
    public String getGroupList() {
        return groupList;
    }

    /**		
	 * 群组列表，群组code以“|”分割		
     */
    public void setGroupList(String groupList) {
        this.groupList = groupList;
    }
    /**		
	 * 角色(医生，护士，营养师，为空则默认医生) 		
     */
    public String getRole() {
        return role;
    }

    /**		
	 * 角色(医生，护士，营养师，为空则默认医生) 		
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**		
	 * 生日  		
     */
    public LocalDateTime getBirthday() {
        return birthday;
    }

    /**		
	 * 生日  		
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    /**		
	 * 职务  		
     */
    public String getPosition() {
        return position;
    }

    /**		
	 * 职务  		
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**		
	 * 办公室电话		
     */
    public String getOfficeNo() {
        return officeNo;
    }

    /**		
	 * 办公室电话		
     */
    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }
    /**		
	 * 手机号		
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**		
	 * 手机号		
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }
    /**		
	 * 家庭电话  		
     */
    public String getFamilyPhone() {
        return familyPhone;
    }

    /**		
	 * 家庭电话  		
     */
    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }
    /**		
	 * 传真  		
     */
    public String getFax() {
        return fax;
    }

    /**		
	 * 传真  		
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    /**		
	 * email地址 		
     */
    public String getEmail() {
        return email;
    }

    /**		
	 * email地址 		
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**		
	 * QQ号  		
     */
    public String getQq() {
        return qq;
    }

    /**		
	 * QQ号  		
     */
    public void setQq(String qq) {
        this.qq = qq;
    }
    /**		
	 * 微信号		
     */
    public String getWechat() {
        return wechat;
    }

    /**		
	 * 微信号		
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
    /**		
	 * 头像路径  		
     */
    public String getPhoto() {
        return photo;
    }

    /**		
	 * 头像路径  		
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**		
	 * 签名图片路径 		
     */
    public String getSignPath() {
        return signPath;
    }

    /**		
	 * 签名图片路径 		
     */
    public void setSignPath(String signPath) {
        this.signPath = signPath;
    }
    /**		
	 * 地址  		
     */
    public String getAddress() {
        return address;
    }

    /**		
	 * 地址  		
     */
    public void setAddress(String address) {
        this.address = address;
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
	 * 状态,0删除,1正常, 9锁定 		
     */
    public String getStatus() {
        return status;
    }

    /**		
	 * 状态,0删除,1正常, 9锁定 		
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**		
	 * 开启日期 0关 1开		
     */
    public Integer getOpenDate() {
        return openDate;
    }

    /**		
	 * 开启日期 0关 1开		
     */
    public void setOpenDate(Integer openDate) {
        this.openDate = openDate;
    }
    /**		
	 * 生效日期		
     */
    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    /**		
	 * 生效日期		
     */
    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    /**		
	 * 失效日期		
     */
    public LocalDateTime getExpiringDate() {
        return expiringDate;
    }

    /**		
	 * 失效日期		
     */
    public void setExpiringDate(LocalDateTime expiringDate) {
        this.expiringDate = expiringDate;
    }
    /**		
	 * 开启移动端 0关 1开		
     */
    public Integer getOpenApp() {
        return openApp;
    }

    /**		
	 * 开启移动端 0关 1开		
     */
    public void setOpenApp(Integer openApp) {
        this.openApp = openApp;
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
	 * 最后登录时间 		
     */
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    /**		
	 * 最后登录时间 		
     */
    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    /**		
	 * 最后登录IP 注意兼容IPV6 		
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**		
	 * 最后登录IP 注意兼容IPV6 		
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
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
        return "SysUserInfo{" +
            "userId=" + userId +
            ", userCode=" + userCode +
            ", orgCode=" + orgCode +
            ", userName=" + userName +
            ", englishName=" + englishName +
            ", userPassword=" + userPassword +
            ", salt=" + salt +
            ", gender=" + gender +
            ", identity=" + identity +
            ", deptList=" + deptList +
            ", wardList=" + wardList +
            ", groupList=" + groupList +
            ", role=" + role +
            ", birthday=" + birthday +
            ", position=" + position +
            ", officeNo=" + officeNo +
            ", mobilephone=" + mobilephone +
            ", familyPhone=" + familyPhone +
            ", fax=" + fax +
            ", email=" + email +
            ", qq=" + qq +
            ", wechat=" + wechat +
            ", photo=" + photo +
            ", signPath=" + signPath +
            ", address=" + address +
            ", remark=" + remark +
            ", status=" + status +
            ", openDate=" + openDate +
            ", effectiveDate=" + effectiveDate +
            ", expiringDate=" + expiringDate +
            ", openApp=" + openApp +
            ", isDelete=" + isDelete +
            ", lastLoginTime=" + lastLoginTime +
            ", lastLoginIp=" + lastLoginIp +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
