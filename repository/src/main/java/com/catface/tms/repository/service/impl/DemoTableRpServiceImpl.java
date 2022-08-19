package com.catface.tms.repository.service.impl;

import java.util.List;

import com.catface.tms.repository.entity.DemoTable;
import com.catface.tms.repository.mapper.DemoTableMapper;
import com.catface.tms.repository.service.DemoTableRpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-04-18
 */
@Slf4j
@Service
public class DemoTableRpServiceImpl extends ServiceImpl<DemoTableMapper, DemoTable> implements DemoTableRpService {

    /**
     * 根据姓名查询
     *
     * @param name 姓名
     * @return 姓名匹配的列表
     */
    @Override
    public List<DemoTable> queryByName(String name) {
        return baseMapper.selectByName(name);
    }
}
