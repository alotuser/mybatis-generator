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
 * 配置记录表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_item_set_detail")
@ApiModel(value = "SysItemSetDetail对象", description = "配置记录表")
public class SysItemSetDetail extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sisd_id", type = IdType.AUTO)
    private Long sisdId;

    private Long pmiid;

    private String patientId;

    private Long itemId;

    private LocalDateTime createTime;

    private String createUserCode;

    private String createUserName;

    /**		
	 * 		
     */
    public Long getSisdId() {
        return sisdId;
    }

    /**		
	 * 		
     */
    public void setSisdId(Long sisdId) {
        this.sisdId = sisdId;
    }
    /**		
	 * 		
     */
    public Long getPmiid() {
        return pmiid;
    }

    /**		
	 * 		
     */
    public void setPmiid(Long pmiid) {
        this.pmiid = pmiid;
    }
    /**		
	 * 		
     */
    public String getPatientId() {
        return patientId;
    }

    /**		
	 * 		
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**		
	 * 		
     */
    public Long getItemId() {
        return itemId;
    }

    /**		
	 * 		
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    /**		
	 * 		
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**		
	 * 		
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    /**		
	 * 		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 		
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Override
    public String toString() {
        return "SysItemSetDetail{" +
            "sisdId=" + sisdId +
            ", pmiid=" + pmiid +
            ", patientId=" + patientId +
            ", itemId=" + itemId +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
        "}";
    }
}
