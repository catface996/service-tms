package com.catface.tms.repository.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Vehicle;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/25
 */
@Data
public class QueryVehicleParam extends Page<Vehicle> {

  @ApiModelProperty(value = "客户ID")
  private Long clientId;

  @ApiModelProperty(value = "车牌号")
  private String plateNumber;

  @ApiModelProperty(value = "车辆类型")
  private Set<Long> vehicleTypes;


}
