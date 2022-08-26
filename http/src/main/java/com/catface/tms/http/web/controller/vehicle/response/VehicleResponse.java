package com.catface.tms.http.web.controller.vehicle.response;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.catface.tms.http.web.controller.common.response.ImageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/25
 */
@Data
@ApiModel(description = "车辆模型")
public class VehicleResponse {

  @ApiModelProperty(value = "运输工具")
  private Long id;

  @ApiModelProperty(value = "所属客户ID")
  private Long clientId;

  @ApiModelProperty(value = "车牌号")
  private String plateNumber;

  @ApiModelProperty(value = "车辆类型，例如：箱式火车")
  private Long vehicleModel;

  @ApiModelProperty(value = "车身颜色")
  private String color;

  @ApiModelProperty(value = "车辆图片，json数组")
  private List<ImageResponse> images;

  @ApiModelProperty(value = "载重，单位：吨")
  private Integer vehicleLoad;

  @ApiModelProperty(value = "车长")
  private Integer vehicleLength;

  @ApiModelProperty(value = "车高，单位：米")
  private Integer vehicleHeight;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "修改时间")
  private Date updated;

  @ApiModelProperty(value = "备注")
  private String remark;

}
