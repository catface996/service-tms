package com.catface.tms.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 运输工具
 * </p>
 *
 * @author catface
 * @since 2022-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Vehicle对象", description="运输工具")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "运输工具")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "所属客户ID")
    private Long clientId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车辆类型，例如：箱式火车")
    private String vehicleType;

    @ApiModelProperty(value = "车身颜色")
    private String color;

    @ApiModelProperty(value = "车辆图片，json数组")
    private String images;

    @ApiModelProperty(value = "载重，单位：吨")
    private Integer vehicleLoad;

    @ApiModelProperty(value = "车长")
    private Integer vehicleLength;

    @ApiModelProperty(value = "车高，单位：米")
    private Integer vehicleHeight;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "修改人")
    private Long modifier;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date updated;

    @ApiModelProperty(value = "备注")
    private String remark;


}
