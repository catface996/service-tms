package com.catface.tms.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 车辆型号 Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2022-08-26
 */
public interface VehicleModelMapper extends BaseMapper<VehicleModel> {

  /**
   * 分页查询车辆型号
   *
   * @param param 车辆型号名称,分页信息
   * @return 车辆型号列表
   */
  List<VehicleModel> selectOnePage(@Param("param") QueryVehicleModelParam param);
}
