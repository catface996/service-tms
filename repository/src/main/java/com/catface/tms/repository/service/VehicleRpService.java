package com.catface.tms.repository.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Vehicle;
import com.baomidou.mybatisplus.extension.service.IService;
import com.catface.tms.repository.param.QueryVehicleParam;

/**
 * <p>
 * 运输工具 服务类
 * </p>
 *
 * @author catface
 * @since 2022-08-25
 */
public interface VehicleRpService extends IService<Vehicle> {

  /**
   * 分页查询车辆列表
   * @param param 客户ID,车牌号,车辆类型,分页信息
   * @return 车辆列表
   */
  Page<Vehicle> queryOnePage(QueryVehicleParam param);
}
