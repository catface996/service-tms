package com.catface.tms.http.web.controller.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
@ApiModel(description = "城市请求")
public class CityRequest {

  @ApiModelProperty(value = "城市编码",required = true,example = "330100")
  @NotBlank(message = "城市编码不能为空")
  private String cityCode;

  @ApiModelProperty(value = "城市名称",required = true,example = "杭州市")
  @NotBlank(message = "城市名称不能为空")
  private String cityName;

}
