package com.catface.tms.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.param.QueryVehicleParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 运输工具 Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2022-08-25
 */
public interface VehicleMapper extends BaseMapper<Vehicle> {

  /**
   * 分页查询车辆信息
   *
   * @param param 客户ID,车牌号,车辆类型,分页信息
   * @return 车辆列表
   */
  List<Vehicle> selectOnePage(@Param("param") QueryVehicleParam param);
}
