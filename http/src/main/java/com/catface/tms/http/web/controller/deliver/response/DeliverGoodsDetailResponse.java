package com.catface.tms.http.web.controller.deliver.response;

import com.catface.tms.http.web.controller.common.response.ImageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "发货货物详情")
public class DeliverGoodsDetailResponse {

  @ApiModelProperty(value = "货物ID")
  private Long goodsId;

  @ApiModelProperty(value = "货物名称")
  private String goodsName;

  @ApiModelProperty(value = "货物图片列表")
  private List<ImageResponse> images;

  @ApiModelProperty(value = "货物数量")
  private Integer goodsQty;
}
