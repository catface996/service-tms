package com.catface.tms.http.web.controller.vehicle.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/25
 */
@Data
@ApiModel(description = "删除车辆的请求")
public class DeleteVehicleRequest {

  @ApiModelProperty(value = "会话中的客户ID", required = true, example = "1234567890")
  @NotNull(message = "客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "会话中的用户ID", required = true, example = "9876543210")
  @NotNull(message = "用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "待删除的车辆ID", required = true, example = "121212")
  @NotNull(message = "车辆ID不能为空")
  private Long vehicleId;

}
