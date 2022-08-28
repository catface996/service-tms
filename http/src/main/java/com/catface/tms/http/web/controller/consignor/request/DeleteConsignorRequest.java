package com.catface.tms.http.web.controller.consignor.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
@ApiModel(description = "删除发货人请求")
public class DeleteConsignorRequest {

  private Long ctxClientId;

  private Long ctxUserId;

}
