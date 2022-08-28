package com.catface.tms.http.web.controller.consignor.request;

import com.catface.tms.http.web.controller.common.request.CityRequest;
import com.catface.tms.http.web.controller.common.request.DistrictRequest;
import com.catface.tms.http.web.controller.common.request.ProvinceRequest;
import com.catface.tms.http.web.controller.common.request.StreetRequest;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/28
 */
@Data
public class SaveConsignorRequest {

  @ApiModelProperty(value = "会话中的客户ID", required = true, example = "1234567890")
  @NotNull(message = "会话中的客户ID不能为空")
  private Long ctxClientId;

  @ApiModelProperty(value = "会话中的用户ID", required = true, example = "9876543210")
  @NotNull(message = "会话中的用户ID不能为空")
  private Long ctxUserId;

  @ApiModelProperty(value = "id,主键")
  private Long id;

  @ApiModelProperty(value = "发货人姓名", required = true, example = "佟掌柜")
  @NotBlank(message = "发货人姓名不能为空")
  private String consignorName;

  @ApiModelProperty(value = "发货人手机号", required = true, example = "17767675656")
  @NotBlank(message = "发货人手机号不能为空")
  private String consignorMobile;

  @ApiModelProperty(value = "发货人所在省份", required = true)
  @NotNull(message = "发货人所在省份不能为空")
  @Valid
  private ProvinceRequest province;

  @ApiModelProperty(value = "发货人所在城市", required = true)
  @NotNull(message = "发货人所在城市不能为空")
  @Valid
  private CityRequest city;

  @ApiModelProperty(value = "发货人所在县区", required = true)
  @NotNull(message = "发货人所在县区不能为空")
  @Valid
  private DistrictRequest district;

  @ApiModelProperty(value = "发货人所在街道", required = true)
  @NotNull(message = "发货人所在街道不能为空")
  @Valid
  private StreetRequest street;

  @ApiModelProperty(value = "详细地址")
  private String detailedAddress;

  @ApiModelProperty(value = "备注")
  private String remark;

}
