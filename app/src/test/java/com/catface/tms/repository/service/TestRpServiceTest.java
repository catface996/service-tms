package com.catface.tms.repository.service;

import java.util.List;

import com.catface.tms.repository.entity.DemoTable;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author by catface
 * @date 2020/12/14
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRpServiceTest {

    @Autowired
    private DemoTableRpService demoTableRpService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void queryByUserName() {
        DemoTable demoTable = new DemoTable();
        demoTable.setAge(1);
        demoTable.setName("xx");
        demoTableRpService.save(demoTable);

        List<DemoTable> list = demoTableRpService.queryByName("xx");
        log.info("result:{}", list);
    }

    @Test
    public void testRedis() {
        stringRedisTemplate.opsForValue().set("xxxx", "oooo");
        String value = stringRedisTemplate.opsForValue().get("xxxx");
        log.info("value:{}", value);
    }
}