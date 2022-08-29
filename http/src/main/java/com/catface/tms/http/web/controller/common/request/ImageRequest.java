package com.catface.tms.http.web.controller.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "图片请求")
public class ImageRequest {

  @ApiModelProperty(value = "图片ID", required = true, example = "121212")
  @NotNull(message = "图片ID不能为空")
  private Long imageId;

  @ApiModelProperty(value = "图片路径", required = true, example = "https://www.xxx.yyy/abc/def.jpg")
  @NotNull(message = "图片ID不能为空")
  private String imageUrl;

}
