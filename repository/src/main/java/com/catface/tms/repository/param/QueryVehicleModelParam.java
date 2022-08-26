package com.catface.tms.repository.param;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.VehicleModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author catface
 * @since 2022/8/26
 */
@Data
public class QueryVehicleModelParam extends Page<VehicleModel> {

  @ApiModelProperty(value = "型号名称")
  private String modelName;

}
