package com.catface.tms.repository.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author by catface
 * @since 2020/12/14
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRpServiceTest {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;
  
  @Test
  public void testRedis() {
    stringRedisTemplate.opsForValue().set("xxxx", "oooo");
    String value = stringRedisTemplate.opsForValue().get("xxxx");
    log.info("value:{}", value);
  }
}