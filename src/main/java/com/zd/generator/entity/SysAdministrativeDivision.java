package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 行政区划表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_administrative_division")
@ApiModel(value = "SysAdministrativeDivision对象", description = "行政区划表")
public class SysAdministrativeDivision extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("上级编码  ")
    private String parentCode;

    @ApiModelProperty("区划编码  ")
    private String divisionCode;

    @ApiModelProperty("区划名字  ")
    private String divisionName;

    @ApiModelProperty("1省,2市,3区,4镇,5村  ")
    private String level;

    @ApiModelProperty("经度   ")
    private String longitude;

    @ApiModelProperty("纬度   ")
    private String latitude;

    /**		
	 * 上级编码  		
     */
    public String getParentCode() {
        return parentCode;
    }

    /**		
	 * 上级编码  		
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    /**		
	 * 区划编码  		
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /**		
	 * 区划编码  		
     */
    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }
    /**		
	 * 区划名字  		
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**		
	 * 区划名字  		
     */
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
    /**		
	 * 1省,2市,3区,4镇,5村  		
     */
    public String getLevel() {
        return level;
    }

    /**		
	 * 1省,2市,3区,4镇,5村  		
     */
    public void setLevel(String level) {
        this.level = level;
    }
    /**		
	 * 经度   		
     */
    public String getLongitude() {
        return longitude;
    }

    /**		
	 * 经度   		
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    /**		
	 * 纬度   		
     */
    public String getLatitude() {
        return latitude;
    }

    /**		
	 * 纬度   		
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "SysAdministrativeDivision{" +
            "parentCode=" + parentCode +
            ", divisionCode=" + divisionCode +
            ", divisionName=" + divisionName +
            ", level=" + level +
            ", longitude=" + longitude +
            ", latitude=" + latitude +
        "}";
    }
}
