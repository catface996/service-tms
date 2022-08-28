package com.catface.tms.repository.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.mapper.ConsignorMapper;
import com.catface.tms.repository.param.QueryConsignorParam;
import com.catface.tms.repository.service.ConsignorRpService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发货人 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
@Slf4j
@Service
public class ConsignorRpServiceImpl extends ServiceImpl<ConsignorMapper, Consignor> implements
    ConsignorRpService {

  /**
   * 分页查询发货人
   *
   * @param param 发货人姓名,发货人电话,分页信息
   * @return 发货人列表
   */
  @Override
  public Page<Consignor> queryOnePage(QueryConsignorParam param) {
    List<Consignor> list = baseMapper.selectOnePage(param);
    param.setRecords(list);
    return param;
  }
}
