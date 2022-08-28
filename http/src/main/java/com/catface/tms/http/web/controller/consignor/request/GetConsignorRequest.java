package com.catface.tms.http.web.controller.consignor.request;

import com.catface.common.model.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
@ApiModel(description = "查询发货人请求")
public class GetConsignorRequest extends PageRequest {

  @ApiModelProperty(value = "会话中的客户ID",required = true,example = "1234567890")
  @NotNull(message = "会话中的客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "会话中的用户ID",required = true,example = "9876543210")
  @NotNull(message = "会话中的用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "发货人姓名",example = "佟掌柜")
  private String consignorName;

  @ApiModelProperty(value = "发货人电话",example = "17767675656")
  private String consignorMobile;
}
