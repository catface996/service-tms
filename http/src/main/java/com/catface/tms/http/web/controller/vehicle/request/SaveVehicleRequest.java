package com.catface.tms.http.web.controller.vehicle.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/25
 */
@Data
@ApiModel(description = "保存车辆请求")
public class SaveVehicleRequest {

  @ApiModelProperty(value = "会话中的用户ID", required = true, example = "1234567890")
  @NotNull(message = "用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "会话中的客户ID", required = true, example = "9876543210")
  @NotNull(message = "客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "运输工具")
  private Long id;

  @ApiModelProperty(value = "车牌号")
  private String plateNumber;

  @ApiModelProperty(value = "车辆类型，例如：箱式火车")
  private Long vehicleModel;

  @ApiModelProperty(value = "车身颜色")
  private String color;

  @ApiModelProperty(value = "车辆图片，json数组")
  private Set<Long> imageIds;

  @ApiModelProperty(value = "载重，单位：吨")
  private Integer vehicleLoad;

  @ApiModelProperty(value = "车长")
  private Integer vehicleLength;

  @ApiModelProperty(value = "车高，单位：米")
  private Integer vehicleHeight;

  @ApiModelProperty(value = "备注")
  private String remark;

}
