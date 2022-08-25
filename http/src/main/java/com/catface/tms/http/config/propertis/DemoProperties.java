package com.catface.tms.http.config.propertis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author by 大猫
 * @since 2022/4/15 4:04 PM catface996 出品
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private Integer age;
}
