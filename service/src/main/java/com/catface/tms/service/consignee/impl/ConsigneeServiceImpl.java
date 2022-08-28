package com.catface.tms.service.consignee.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.param.QueryConsigneeParam;
import com.catface.tms.repository.service.ConsigneeRpService;
import com.catface.tms.service.consignee.ConsigneeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author catface
 * @since 2022/8/28
 */
@Slf4j
@Service
public class ConsigneeServiceImpl implements ConsigneeService {

  private final ConsigneeRpService consigneeRpService;

  public ConsigneeServiceImpl(ConsigneeRpService consigneeRpService) {
    this.consigneeRpService = consigneeRpService;
  }


  /**
   * 保存收货人
   *
   * @param entity 到保存的收货人
   */
  @Override
  public void save(Consignee entity) {
    // 如果是更新,检查待更新的收货人是否存在,存在则检查是否属于同一个客户
    if (entity.getId() != null) {
      Consignee entityExist = consigneeRpService.getById(entity.getId());
      if (entityExist == null) {
        log.warn("待更新的发货人不存在,发货人ID:{}", entity.getId());
        return;
      }
      Assert.state(entity.getClientId().equals(entityExist.getClientId()),
          "禁止修改其他客户的收货人");
    }

    // 执行新增或者更新操作
    consigneeRpService.saveOrUpdate(entity);
  }

  /**
   * 分页查询收货人
   *
   * @param param 收货人姓名,收货人手机号,分页信息
   * @return 收货人列表
   */
  @Override
  public Page<Consignee> queryOnePage(QueryConsigneeParam param) {
    return consigneeRpService.queryOnePage(param);
  }
}
