package com.catface.tms.http.web.controller.deliver.request;

import com.catface.tms.http.web.controller.common.request.ImageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "货物明细请求")
public class GoodsDetailRequest {

  @ApiModelProperty(value = "货物ID", required = true, example = "12123434")
  @NotNull(message = "货物ID不能为空")
  private Long goodsId;

  @ApiModelProperty(value = "数量", required = true, example = "2")
  @NotNull(message = "货物数量不能为空")
  private Integer quantity;

  @ApiModelProperty(value = "货物图片列表")
  private List<ImageRequest> images;


}
