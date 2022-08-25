package com.catface.tms.http.web.controller.vehicle.request;

import com.catface.common.model.PageRequest;
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
@ApiModel(description = "分页查询车辆请求")
public class GetVehicleRequest extends PageRequest {

  @ApiModelProperty(value = "上下文中的客户ID",required = true,example = "1234567890")
  @NotNull(message = "客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "上下文中的用户ID",required = true,example = "1234567890")
  @NotNull(message = "客户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "车牌号",example = "浙AF12345")
  private String plateNumber;

  @ApiModelProperty(value = "车辆类型",example = "[12121212]")
  private Set<Long> vehicleTypes;
}
