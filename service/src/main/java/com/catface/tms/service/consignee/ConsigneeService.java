package com.catface.tms.service.consignee;

import com.catface.tms.repository.entity.Consignee;

/**
 * @author catface
 * @since 2022/8/28
 */
public interface ConsigneeService {

  /**
   * 保存收货人
   * @param entity  到保存的收货人
   */
  void save(Consignee entity);
}
