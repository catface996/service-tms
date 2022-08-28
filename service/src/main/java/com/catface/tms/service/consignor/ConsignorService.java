package com.catface.tms.service.consignor;

import com.catface.tms.repository.entity.Consignor;

/**
 * @author catface
 * @since 2022/8/28
 */
public interface ConsignorService {

  /**
   * 保存发货人
   *
   * @param entity 待保存的发货人实体
   */
  void save(Consignor entity);
}
