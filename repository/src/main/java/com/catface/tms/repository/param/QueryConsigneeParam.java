package com.catface.tms.repository.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Consignee;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
public class QueryConsigneeParam extends Page<Consignee> {

  @ApiModelProperty(value = "客户ID")
  private Long clientId;

  @ApiModelProperty(value = "收货人姓名")
  private String consigneeName;

  @ApiModelProperty(value = "收货人手机号")
  private String consigneeMobile;
}
