package com.catface.tms.http.web.controller.deliver.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "发布货物信息请求")
public class ReleaseGoodsRequest {

  @ApiModelProperty(value = "会话中的客户ID", required = true, example = "1234567890")
  @NotNull(message = "会话中的客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "会话中的用户ID-货主", required = true, example = "9876543210")
  @NotNull(message = "会话中的用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "车主ID", example = "12121212")
  private Long vehicleOwnerId;

  @ApiModelProperty(value = "发货人ID", required = true, example = "232323")
  @NotNull(message = "发货人不能为空")
  private Long consignorId;

  @ApiModelProperty(value = "收货人ID", required = true, example = "454545")
  @NotNull(message = "收货人信息")
  private Long consigneeId;

  @ApiModelProperty(value = "货物列表", required = true)
  @NotEmpty(message = "货物列表不能为空")
  @Valid
  private List<GoodsDetailRequest> goods;


}
