package com.catface.tms.repository.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.param.QueryConsigneeParam;

/**
 * <p>
 * 收货人 服务类
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
public interface ConsigneeRpService extends IService<Consignee> {

  /**
   * 分页查询收货人列表
   *
   * @param param 收货人姓名,收货人手机号,分页信息
   * @return 分页查询收货人
   */
  Page<Consignee> queryOnePage(QueryConsigneeParam param);
}
