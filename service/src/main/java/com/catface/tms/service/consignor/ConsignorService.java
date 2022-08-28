package com.catface.tms.service.consignor;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.param.QueryConsignorParam;

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

  /**
   * 分页查询发货人
   *
   * @param param 发货人姓名,发货人电话,分页信息
   * @return 发货人列表
   */
  Page<Consignor> queryOnePage(QueryConsignorParam param);

  /**
   * 删除发货人
   *
   * @param consignorId 待删除的发货人ID
   * @param clientId    执行该操作的客户ID
   */
  void delete(Long consignorId, Long clientId);
}
