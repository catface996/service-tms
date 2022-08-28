package com.catface.tms.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.param.QueryConsigneeParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 收货人 Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
public interface ConsigneeMapper extends BaseMapper<Consignee> {

  /**
   * 分页查询收货人列表
   *
   * @param param 收货人姓名,收货人手机号,分页信息
   * @return 收货人列表
   */
  List<Consignee> selectOnePage(@Param("param") QueryConsigneeParam param);
}
