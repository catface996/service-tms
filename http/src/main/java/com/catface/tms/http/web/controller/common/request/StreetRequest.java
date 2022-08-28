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
@ApiModel(description = "街道请求")
public class StreetRequest {

  @ApiModelProperty(value = "街道编码",required = true,example = "330105")
  @NotBlank(message = "街道编码不能为空")
  private String streetCode;

  @ApiModelProperty(value = "发货人所在街道名称")
  private String streetName;

}
