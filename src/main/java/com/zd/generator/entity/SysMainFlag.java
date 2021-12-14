package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 子系统名称
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_main_flag")
@ApiModel(value = "SysMainFlag对象", description = "子系统名称")
public class SysMainFlag extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("代码")
    private String code;

    @ApiModelProperty("系统名称")
    private String name;

    @ApiModelProperty("简称")
    private String shortName;

    @ApiModelProperty("英文名称")
    private String englishName;

    @ApiModelProperty("英文简称")
    private String englishShortName;

    @ApiModelProperty("图标logo")
    private String logo;

    @ApiModelProperty("背景图片")
    private String img;

    @ApiModelProperty("地址")
    private String url;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("排序")
    private Integer sort;

    /**		
	 * 代码		
     */
    public String getCode() {
        return code;
    }

    /**		
	 * 代码		
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**		
	 * 系统名称		
     */
    public String getName() {
        return name;
    }

    /**		
	 * 系统名称		
     */
    public void setName(String name) {
        this.name = name;
    }
    /**		
	 * 简称		
     */
    public String getShortName() {
        return shortName;
    }

    /**		
	 * 简称		
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    /**		
	 * 英文名称		
     */
    public String getEnglishName() {
        return englishName;
    }

    /**		
	 * 英文名称		
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
    /**		
	 * 英文简称		
     */
    public String getEnglishShortName() {
        return englishShortName;
    }

    /**		
	 * 英文简称		
     */
    public void setEnglishShortName(String englishShortName) {
        this.englishShortName = englishShortName;
    }
    /**		
	 * 图标logo		
     */
    public String getLogo() {
        return logo;
    }

    /**		
	 * 图标logo		
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }
    /**		
	 * 背景图片		
     */
    public String getImg() {
        return img;
    }

    /**		
	 * 背景图片		
     */
    public void setImg(String img) {
        this.img = img;
    }
    /**		
	 * 地址		
     */
    public String getUrl() {
        return url;
    }

    /**		
	 * 地址		
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**		
	 * 状态		
     */
    public Integer getStatus() {
        return status;
    }

    /**		
	 * 状态		
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**		
	 * 排序		
     */
    public Integer getSort() {
        return sort;
    }

    /**		
	 * 排序		
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SysMainFlag{" +
            "code=" + code +
            ", name=" + name +
            ", shortName=" + shortName +
            ", englishName=" + englishName +
            ", englishShortName=" + englishShortName +
            ", logo=" + logo +
            ", img=" + img +
            ", url=" + url +
            ", status=" + status +
            ", sort=" + sort +
        "}";
    }
}
