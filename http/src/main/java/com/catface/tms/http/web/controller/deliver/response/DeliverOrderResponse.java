package com.catface.tms.http.web.controller.deliver.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.catface.tms.http.web.controller.consignee.response.ConsigneeResponse;
import com.catface.tms.http.web.controller.consignor.response.ConsignorResponse;
import com.catface.tms.repository.entity.Consignee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/29
 */
@Data
@ApiModel(description = "货运单模型")
public class DeliverOrderResponse {

  @ApiModelProperty(value = "id，主键")
  private Long id;

  @ApiModelProperty(value = "发货人信息，json格式")
  private ConsignorResponse consignor;

  @ApiModelProperty(value = "收货人信息，json格式")
  private ConsigneeResponse consignee;


  @ApiModelProperty(value = "接收货物的方式，现场收货，上门收货")
  private String acceptGoodsType;

  @ApiModelProperty(value = "送货方式，收货人自提，送货上门")
  private String deliverGoodsType;

  @ApiModelProperty(value = "是否需要代收货款")
  private String collectingOnDeliver;

  @ApiModelProperty(value = "代收货款金额")
  private BigDecimal collectingAmount;

  @ApiModelProperty(value = "运送状态")
  private String deliverStatus;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "修改时间")
  private Date updated;

  @ApiModelProperty(value = "备注")
  private String remark;

}
