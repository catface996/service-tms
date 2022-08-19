package com.catface.tms.repository.service;

import java.util.List;

import com.catface.tms.repository.entity.DemoTable;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author catface
 * @since 2022-04-18
 */
public interface DemoTableRpService extends IService<DemoTable> {

    /**
     * 根据姓名查询
     *
     * @param name 姓名
     * @return 姓名匹配的列表
     */
    List<DemoTable> queryByName(String name);
}
