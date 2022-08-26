package com.catface.tms.service.model.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;
import com.catface.tms.repository.service.VehicleModelRpService;
import com.catface.tms.service.model.VehicleModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2022/8/26
 */
@Slf4j
@Service
public class VehicleModelServiceImpl implements VehicleModelService {

  private final VehicleModelRpService vehicleModelRpService;

  public VehicleModelServiceImpl(VehicleModelRpService vehicleModelRpService) {
    this.vehicleModelRpService = vehicleModelRpService;
  }

  /**
   * 保存车辆型号
   *
   * @param entity 待保存的车辆型号
   */
  @Override
  public void save(VehicleModel entity) {
    vehicleModelRpService.saveOrUpdate(entity);
  }

  /**
   * 分页查询车辆型号
   *
   * @param param 型号名称,分页信息
   * @return 车辆型号列表
   */
  @Override
  public Page<VehicleModel> queryOnePage(QueryVehicleModelParam param) {
    return vehicleModelRpService.queryOnePage(param);
  }

  /**
   * 删除车辆型号
   *
   * @param vehicleModelId 车辆型号ID
   */
  @Override
  public void delete(Long vehicleModelId) {

  }
}
