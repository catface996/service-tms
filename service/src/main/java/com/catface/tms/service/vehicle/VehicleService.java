package com.catface.tms.service.vehicle;

import com.catface.tms.repository.entity.Vehicle;

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

}
