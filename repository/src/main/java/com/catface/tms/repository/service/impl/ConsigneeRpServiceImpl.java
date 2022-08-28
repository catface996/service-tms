package com.catface.tms.repository.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.mapper.ConsigneeMapper;
import com.catface.tms.repository.param.QueryConsigneeParam;
import com.catface.tms.repository.service.ConsigneeRpService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收货人 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
@Slf4j
@Service
public class ConsigneeRpServiceImpl extends ServiceImpl<ConsigneeMapper, Consignee> implements
    ConsigneeRpService {

  /**
   * 分页查询收货人列表
   *
   * @param param 收货人姓名,收货人手机号,分页信息
   * @return 分页查询收货人
   */
  @Override
  public Page<Consignee> queryOnePage(QueryConsigneeParam param) {
    List<Consignee> list = baseMapper.selectOnePage(param);
    param.setRecords(list);
    return param;
  }
}
