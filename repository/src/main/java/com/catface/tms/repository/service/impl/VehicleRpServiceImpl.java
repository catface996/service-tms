package com.catface.tms.repository.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.mapper.VehicleMapper;
import com.catface.tms.repository.param.QueryVehicleParam;
import com.catface.tms.repository.service.VehicleRpService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运输工具 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-08-25
 */
@Slf4j
@Service
public class VehicleRpServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements
    VehicleRpService {

  /**
   * 分页查询车辆列表
   *
   * @param param 客户ID,车牌号,车辆类型,分页信息
   * @return 车辆列表
   */
  @Override
  public Page<Vehicle> queryOnePage(QueryVehicleParam param) {
    List<Vehicle> list = baseMapper.selectOnePage(param);
    param.setRecords(list);
    return param;
  }
}
