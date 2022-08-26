package com.catface.tms.http.web.controller.model.request;

import com.catface.common.model.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/26
 */
@Data
@ApiModel(description = "查询车辆型号请求")
public class GetVehicleModelRequest extends PageRequest {

  @ApiModelProperty(value = "型号名称",example = "箱式货车")
  private String modelName;

}
