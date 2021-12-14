package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_equal")
@ApiModel(value = "SysEqual对象", description = "")
public class SysEqual extends BaseModel {

    private static final long serialVersionUID = 1L;

    private String equalId;

    private String equalCode;

    private String equalName;

    private String equalVal;

    private String equalType;

    private String equalType2;

    private String equalType3;

    private String inputCode;

    private String isVisible;

    private String createDateTime;

    private String updateDateTime;

    /**		
	 * 		
     */
    public String getEqualId() {
        return equalId;
    }

    /**		
	 * 		
     */
    public void setEqualId(String equalId) {
        this.equalId = equalId;
    }
    /**		
	 * 		
     */
    public String getEqualCode() {
        return equalCode;
    }

    /**		
	 * 		
     */
    public void setEqualCode(String equalCode) {
        this.equalCode = equalCode;
    }
    /**		
	 * 		
     */
    public String getEqualName() {
        return equalName;
    }

    /**		
	 * 		
     */
    public void setEqualName(String equalName) {
        this.equalName = equalName;
    }
    /**		
	 * 		
     */
    public String getEqualVal() {
        return equalVal;
    }

    /**		
	 * 		
     */
    public void setEqualVal(String equalVal) {
        this.equalVal = equalVal;
    }
    /**		
	 * 		
     */
    public String getEqualType() {
        return equalType;
    }

    /**		
	 * 		
     */
    public void setEqualType(String equalType) {
        this.equalType = equalType;
    }
    /**		
	 * 		
     */
    public String getEqualType2() {
        return equalType2;
    }

    /**		
	 * 		
     */
    public void setEqualType2(String equalType2) {
        this.equalType2 = equalType2;
    }
    /**		
	 * 		
     */
    public String getEqualType3() {
        return equalType3;
    }

    /**		
	 * 		
     */
    public void setEqualType3(String equalType3) {
        this.equalType3 = equalType3;
    }
    /**		
	 * 		
     */
    public String getInputCode() {
        return inputCode;
    }

    /**		
	 * 		
     */
    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }
    /**		
	 * 		
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**		
	 * 		
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }
    /**		
	 * 		
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**		
	 * 		
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }
    /**		
	 * 		
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**		
	 * 		
     */
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @Override
    public String toString() {
        return "SysEqual{" +
            "equalId=" + equalId +
            ", equalCode=" + equalCode +
            ", equalName=" + equalName +
            ", equalVal=" + equalVal +
            ", equalType=" + equalType +
            ", equalType2=" + equalType2 +
            ", equalType3=" + equalType3 +
            ", inputCode=" + inputCode +
            ", isVisible=" + isVisible +
            ", createDateTime=" + createDateTime +
            ", updateDateTime=" + updateDateTime +
        "}";
    }
}
