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
@ApiModel(description = "县区请求")
public class DistrictRequest {

  @ApiModelProperty(value = "县区编码", required = true, example = "330105")
  @NotBlank(message = "县区编码不能为空")
  private String districtCode;

  @ApiModelProperty(value = "县区名称", required = true, example = "拱墅区")
  @NotBlank(message = "县区名称不能为空")
  private String districtName;

}
