package com.catface.tms.http.web.controller.consignor.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
@ApiModel(description = "删除发货人请求")
public class DeleteConsignorRequest {

  @ApiModelProperty(value = "会话中的客户ID", required = true, example = "1234567890")
  @NotNull(message = "客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "会话中的用户ID", required = true, example = "9876543210")
  @NotNull(message = "会话中的用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "待删除的发货人ID", required = true, example = "12121212")
  @NotNull(message = "待删除的发货人ID不能为空")
  private Long consignorId;
}
