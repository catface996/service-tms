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
@ApiModel(description = "省份请求")
public class ProvinceRequest {

  @ApiModelProperty(value = "省份编码", required = true, example = "33")
  @NotBlank(message = "省份编码不能为空")
  private String provinceCode;

  @ApiModelProperty(value = "省份名称", required = true, example = "浙江省")
  @NotBlank(message = "省份名称不能为空")
  private String provinceName;

}
