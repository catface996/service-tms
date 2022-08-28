package com.catface.tms.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.param.QueryConsignorParam;
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

}
