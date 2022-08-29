package com.catface.tms.http.web.controller.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "运费请求")
public class FreightChargeRequest {

  @ApiModelProperty(value = "id，主键")
  private Long id;

  @ApiModelProperty(value = "车主ID")
  private Long vehicleOwner;

  @ApiModelProperty(value = "上一个客户ID，即转派货运单的上一个车主")
  private Long lastClientId;

  @ApiModelProperty(value = "运费金额")
  private BigDecimal freightChargeAmount;

  @ApiModelProperty(value = "运费付费方式")
  private String freightPayModel;

  @ApiModelProperty(value = "送货状态")
  private String deliverStatus;

  @ApiModelProperty(value = "创建人")
  private Long creator;

  @ApiModelProperty(value = "修噶人")
  private Long modifier;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "修改时间")
  private Date updated;

  @ApiModelProperty(value = "备注")
  private String remark;
}
