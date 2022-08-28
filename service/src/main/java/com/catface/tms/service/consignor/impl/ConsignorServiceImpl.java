package com.catface.tms.service.consignor.impl;

import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.service.ConsignorRpService;
import com.catface.tms.service.consignor.ConsignorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author catface
 * @since 2022/8/28
 */
@Slf4j
@Service
public class ConsignorServiceImpl implements ConsignorService {

  private final ConsignorRpService consignorRpService;

  public ConsignorServiceImpl(ConsignorRpService consignorRpService) {
    this.consignorRpService = consignorRpService;
  }

  /**
   * 保存发货人
   *
   * @param entity 待保存的发货人实体
   */
  @Override
  public void save(Consignor entity) {

    // 如果是更新,检查clientId是否一致,禁止修改其他客户的发货人
    if (entity.getId() != null) {
      Consignor entityExist = consignorRpService.getById(entity.getId());
      if (entityExist == null) {
        log.warn("待更新的发货人不存在,发货人ID:{}", entity.getId());
        return;
      }

      Assert.state(entityExist.getClientId().equals(entity.getClientId()),
          "禁止修改其他客户的发货人");
    }
    // 执行新增或者更新
    consignorRpService.saveOrUpdate(entity);
  }

}
