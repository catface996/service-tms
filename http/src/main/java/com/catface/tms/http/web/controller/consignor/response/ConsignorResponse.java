package com.catface.tms.http.web.controller.consignor.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
@ApiModel(description = "发货人模型")
public class ConsignorResponse {

  @ApiModelProperty(value = "id,主键")
  private Long id;

  @ApiModelProperty(value = "所属客户ID")
  private Long clientId;

  @ApiModelProperty(value = "发货人姓名")
  private String consignorName;

  @ApiModelProperty(value = "发货人手机号")
  private String consignorMobile;

  @ApiModelProperty(value = "发货人所在省份编码")
  private String provinceCode;

  @ApiModelProperty(value = "发货人所在省份名称")
  private String provinceName;

  @ApiModelProperty(value = "发货人所在城市编码")
  private String cityCode;

  @ApiModelProperty(value = "发货人所在城市名称")
  private String cityName;

  @ApiModelProperty(value = "发货人所在县区编码")
  private String countyCode;

  @ApiModelProperty(value = "发货人所在县区名称")
  private String countyName;

  @ApiModelProperty(value = "发货人所在街道编码")
  private String streetCode;

  @ApiModelProperty(value = "发货人所在街道名称")
  private String streetName;

  @ApiModelProperty(value = "详细地址")
  private String detailedAddress;

  @ApiModelProperty(value = "创建人")
  private Long creator;

  @ApiModelProperty(value = "修改人")
  private Long modifier;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "修改时间")
  private Date updated;

  @ApiModelProperty(value = "备注")
  private String remark;

}
