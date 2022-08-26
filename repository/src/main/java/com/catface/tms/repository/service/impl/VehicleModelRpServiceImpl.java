package com.catface.tms.repository.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.mapper.VehicleModelMapper;
import com.catface.tms.repository.param.QueryVehicleModelParam;
import com.catface.tms.repository.service.VehicleModelRpService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆型号 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-08-26
 */
@Slf4j
@Service
public class VehicleModelRpServiceImpl extends
    ServiceImpl<VehicleModelMapper, VehicleModel> implements VehicleModelRpService {

  /**
   * 分页查询车辆型号
   *
   * @param param 型号名称,分页信息
   * @return 型号列表
   */
  @Override
  public Page<VehicleModel> queryOnePage(QueryVehicleModelParam param) {
    List<VehicleModel> list = baseMapper.selectOnePage(param);
    param.setRecords(list);
    return param;
  }
}
