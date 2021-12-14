package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.time.LocalTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 执行时间
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("support_nutri_order_times")
@ApiModel(value = "SupportNutriOrderTimes对象", description = "执行时间")
public class SupportNutriOrderTimes extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "not_id", type = IdType.AUTO)
    private Long notId;

    private Long noId;

    private LocalTime executeTime;

    /**		
	 * 		
     */
    public Long getNotId() {
        return notId;
    }

    /**		
	 * 		
     */
    public void setNotId(Long notId) {
        this.notId = notId;
    }
    /**		
	 * 		
     */
    public Long getNoId() {
        return noId;
    }

    /**		
	 * 		
     */
    public void setNoId(Long noId) {
        this.noId = noId;
    }
    /**		
	 * 		
     */
    public LocalTime getExecuteTime() {
        return executeTime;
    }

    /**		
	 * 		
     */
    public void setExecuteTime(LocalTime executeTime) {
        this.executeTime = executeTime;
    }

    @Override
    public String toString() {
        return "SupportNutriOrderTimes{" +
            "notId=" + notId +
            ", noId=" + noId +
            ", executeTime=" + executeTime +
        "}";
    }
}
