package com.catface.tms.repository.mapper;

import java.util.List;

import com.catface.tms.repository.entity.DemoTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2022-04-18
 */
public interface DemoTableMapper extends BaseMapper<DemoTable> {

    /**
     * 根据姓名查询
     * @param name 姓名
     * @return 符合姓名的demo列表
     */
    List<DemoTable> selectByName(@Param("name") String name);
}
