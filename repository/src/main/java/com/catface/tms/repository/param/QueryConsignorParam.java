package com.catface.tms.repository.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Consignor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
public class QueryConsignorParam extends Page<Consignor> {

  @ApiModelProperty(value = "客户ID")
  private Long clientId;

  @ApiModelProperty(value = "发货人姓名")
  private String consignorName;

  @ApiModelProperty(value = "发货人手机号")
  private String consignorMobile;
}
