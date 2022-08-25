package com.catface.tms.service.vehicle.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.param.QueryVehicleParam;
import com.catface.tms.repository.service.VehicleRpService;
import com.catface.tms.service.vehicle.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author catface
 * @since 2022/8/25
 */
@Slf4j
@Service
public class VehicleServiceImpl implements VehicleService {

  private final VehicleRpService vehicleRpService;

  public VehicleServiceImpl(VehicleRpService vehicleRpService) {
    this.vehicleRpService = vehicleRpService;
  }

  /**
   * 保存车辆
   *
   * @param entity 待保存的车辆
   */
  @Override
  public void save(Vehicle entity) {

    // 如果ID存在,则表示更新,检查被更新的车辆是否属于执行该操作的客户
    if (entity.getId() != null) {
      Vehicle entityOld = vehicleRpService.getById(entity.getId());
      if (entityOld == null) {
        log.warn("待更新的车辆不存在,车辆ID:{}", entity.getId());
        return;
      }
      Assert.state(entityOld.getClientId().equals(entity.getClientId()),
          "禁止修改其他客户的车辆信息");
    }

    // 执行新增或者更新操作
    vehicleRpService.saveOrUpdate(entity);

  }

  /**
   * 分页查询车辆列表
   *
   * @param param 客户ID,车牌号,车辆类型,分页信息
   * @return 车辆列表
   */
  @Override
  public Page<Vehicle> queryOnePage(QueryVehicleParam param) {
    return vehicleRpService.queryOnePage(param);
  }


}
