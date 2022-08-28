package com.catface.tms.repository.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.param.QueryConsignorParam;
import java.util.List;

/**
 * <p>
 * 发货人 服务类
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
public interface ConsignorRpService extends IService<Consignor> {

  /**
   * 分页查询发货人
   *
   * @param param 发货人姓名,发货人电话,分页信息
   * @return 发货人列表
   */
  Page<Consignor> queryOnePage(QueryConsignorParam param);
}
