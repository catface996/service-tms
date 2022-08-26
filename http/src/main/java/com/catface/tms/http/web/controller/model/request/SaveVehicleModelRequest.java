package com.catface.tms.http.web.controller.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/26
 */
@Data
@ApiModel(description = "保存车辆型号请求")
public class SaveVehicleModelRequest {

  @ApiModelProperty(value = "会话中的用户ID")
  private Long ctxUserId;

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

  @ApiModelProperty(value = "备注")
  private String remark;

}
