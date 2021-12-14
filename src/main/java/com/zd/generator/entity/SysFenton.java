package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("sys_fenton")
@ApiModel(value = "SysFenton对象", description = "")
public class SysFenton extends BaseModel {

    private static final long serialVersionUID = 1L;

    private Float week;

    private Integer sex;

    private String flag;

    @ApiModelProperty("百分位3")
    private Float bf3;

    @ApiModelProperty("百分位10")
    private Float bf10;

    @ApiModelProperty("百分位50")
    private Float bf50;

    @ApiModelProperty("百分位90")
    private Float bf90;

    @ApiModelProperty("百分位97")
    private Float bf97;

    private BigDecimal l;

    private BigDecimal m;

    private BigDecimal s;

    private BigDecimal sd;

    /**		
	 * 		
     */
    public Float getWeek() {
        return week;
    }

    /**		
	 * 		
     */
    public void setWeek(Float week) {
        this.week = week;
    }
    /**		
	 * 		
     */
    public Integer getSex() {
        return sex;
    }

    /**		
	 * 		
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    /**		
	 * 		
     */
    public String getFlag() {
        return flag;
    }

    /**		
	 * 		
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
    /**		
	 * 百分位3		
     */
    public Float getBf3() {
        return bf3;
    }

    /**		
	 * 百分位3		
     */
    public void setBf3(Float bf3) {
        this.bf3 = bf3;
    }
    /**		
	 * 百分位10		
     */
    public Float getBf10() {
        return bf10;
    }

    /**		
	 * 百分位10		
     */
    public void setBf10(Float bf10) {
        this.bf10 = bf10;
    }
    /**		
	 * 百分位50		
     */
    public Float getBf50() {
        return bf50;
    }

    /**		
	 * 百分位50		
     */
    public void setBf50(Float bf50) {
        this.bf50 = bf50;
    }
    /**		
	 * 百分位90		
     */
    public Float getBf90() {
        return bf90;
    }

    /**		
	 * 百分位90		
     */
    public void setBf90(Float bf90) {
        this.bf90 = bf90;
    }
    /**		
	 * 百分位97		
     */
    public Float getBf97() {
        return bf97;
    }

    /**		
	 * 百分位97		
     */
    public void setBf97(Float bf97) {
        this.bf97 = bf97;
    }
    /**		
	 * 		
     */
    public BigDecimal getL() {
        return l;
    }

    /**		
	 * 		
     */
    public void setL(BigDecimal l) {
        this.l = l;
    }
    /**		
	 * 		
     */
    public BigDecimal getM() {
        return m;
    }

    /**		
	 * 		
     */
    public void setM(BigDecimal m) {
        this.m = m;
    }
    /**		
	 * 		
     */
    public BigDecimal getS() {
        return s;
    }

    /**		
	 * 		
     */
    public void setS(BigDecimal s) {
        this.s = s;
    }
    /**		
	 * 		
     */
    public BigDecimal getSd() {
        return sd;
    }

    /**		
	 * 		
     */
    public void setSd(BigDecimal sd) {
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "SysFenton{" +
            "week=" + week +
            ", sex=" + sex +
            ", flag=" + flag +
            ", bf3=" + bf3 +
            ", bf10=" + bf10 +
            ", bf50=" + bf50 +
            ", bf90=" + bf90 +
            ", bf97=" + bf97 +
            ", l=" + l +
            ", m=" + m +
            ", s=" + s +
            ", sd=" + sd +
        "}";
    }
}
