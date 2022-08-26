package com.catface.tms.http.web.controller.model.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/26
 */
@Data
@ApiModel(description = "车辆型号模型")
public class VehicleModelResponse {

  @ApiModelProperty(value = "主键")
  private Long id;

  @ApiModelProperty(value = "型号名称")
  private String modelName;

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
