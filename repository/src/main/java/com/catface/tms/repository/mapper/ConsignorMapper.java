package com.catface.tms.repository.mapper;

import com.catface.tms.repository.entity.Consignor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catface.tms.repository.param.QueryConsignorParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 发货人 Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
public interface ConsignorMapper extends BaseMapper<Consignor> {


  /**
   * 分页查询发货人
   *
   * @param param 发货人姓名,发货人电话,分页信息
   * @return 发货人列表
   */
  List<Consignor> selectOnePage(@Param("param") QueryConsignorParam param);
}
