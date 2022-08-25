package com.catface.tms.http.web.controller.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/25
 */
@Data
@ApiModel(description = "图片模型")
public class ImageResponse {

  @ApiModelProperty(value = "图片ID")
  private Long imageId;

  @ApiModelProperty(value = "图片路径")
  private String url;

}
