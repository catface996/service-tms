package com.catface.tms.repository.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;

/**
 * <p>
 * 车辆型号 服务类
 * </p>
 *
 * @author catface
 * @since 2022-08-26
 */
public interface VehicleModelRpService extends IService<VehicleModel> {

  /**
   * 分页查询车辆型号
   *
   * @param param 型号名称,分页信息
   * @return 型号列表
   */
  Page<VehicleModel> queryOnePage(QueryVehicleModelParam param);
}
