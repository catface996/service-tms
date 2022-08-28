package com.catface.tms.service.consignee;

import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.service.ConsigneeRpService;
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
}
