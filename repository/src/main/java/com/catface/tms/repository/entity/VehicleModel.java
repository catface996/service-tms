package com.catface.tms.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 车辆型号
 * </p>
 *
 * @author catface
 * @since 2022-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "VehicleModel对象", description = "车辆型号")
public class VehicleModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.ASSIGN_ID)
  private Long id;

  @ApiModelProperty(value = "型号名称")
  private String modelName;

  @ApiModelProperty(value = "型号类别")
  private String modelType;

  @ApiModelProperty(value = "车长，单位：米")
  private Integer vehicleLength;

  @ApiModelProperty(value = "车宽")
  private Integer vehicleWidth;

  @ApiModelProperty(value = "车高")
  private Integer vehicleHeight;

  @ApiModelProperty(value = "创建人")
  private Long creator;

  @ApiModelProperty(value = "修改人")
  private Long modifier;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "更新时间")
  private Date updated;

  @ApiModelProperty(value = "备注")
  private String remark;


}
