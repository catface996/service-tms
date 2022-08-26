package com.catface.tms.service.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;

/**
 * @author catface
 * @since 2022/8/26
 */
public interface VehicleModelService {

  /**
   * 保存车辆型号
   *
   * @param entity 待保存的车辆型号
   */
  void save(VehicleModel entity);

  /**
   * 分页查询车辆型号
   *
   * @param param 型号名称,分页信息
   * @return 车辆型号列表
   */
  Page<VehicleModel> queryOnePage(QueryVehicleModelParam param);

  /**
   * 删除车辆型号
   *
   * @param vehicleModelId 车辆型号ID
   */
  void delete(Long vehicleModelId);

}
