package com.catface.tms.service.consignee;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.param.QueryConsigneeParam;

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

  /**
   * 分页查询收货人
   * @param param 收货人姓名,收货人手机号,分页信息
   * @return 收货人列表
   */
  Page<Consignee> queryOnePage(QueryConsigneeParam param);
}
