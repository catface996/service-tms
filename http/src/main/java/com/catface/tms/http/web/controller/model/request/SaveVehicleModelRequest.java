package com.catface.tms.http.web.controller.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/26
 */
@Data
@ApiModel(description = "保存车辆型号请求")
public class SaveVehicleModelRequest {

  @ApiModelProperty(value = "会话中的用户ID", example = "9876543210")
  @NotNull(message = "用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "主键")
  private Long id;

  @ApiModelProperty(value = "型号名称", required = true, example = "2.5吨货车(厢式/板车)")
  @NotBlank(message = "型号名称不能为空")
  private String modelName;

  @ApiModelProperty(value = "车长，单位：厘米", example = "420")
  private Integer vehicleLength;

  @ApiModelProperty(value = "车宽,单位:厘米", example = "190")
  private Integer vehicleWidth;

  @ApiModelProperty(value = "车高,单位:厘米", example = "180")
  private Integer vehicleHeight;

  @ApiModelProperty(value = "备注")
  private String remark;

}
