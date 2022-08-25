package com.catface.tms.service.vehicle;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.param.QueryVehicleParam;

/**
 * @author catface
 * @since 2022/8/25
 */
public interface VehicleService {

  /**
   * 保存车辆
   *
   * @param entity 待保存的车辆
   */
  void save(Vehicle entity);

  /**
   * 分页查询车辆列表
   *
   * @param param 客户ID,车牌号,车辆类型,分页信息
   * @return 车辆列表
   */
  Page<Vehicle> queryOnePage(QueryVehicleParam param);

  /**
   * 删除车辆
   *
   * @param vehicleId 待删除车辆ID
   * @param clientId  执行删除的客户ID
   */
  void delete(Long vehicleId, Long clientId);

}
