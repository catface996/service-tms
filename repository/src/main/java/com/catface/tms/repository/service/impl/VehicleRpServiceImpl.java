package com.catface.tms.repository.service.impl;

import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.mapper.VehicleMapper;
import com.catface.tms.repository.service.VehicleRpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运输工具 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-08-25
 */
@Service
public class VehicleRpServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements VehicleRpService {

}
