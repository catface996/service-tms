package com.catface.tms.http.web.controller.index;

import java.net.InetAddress;

import com.catface.common.model.JsonResult;
import com.catface.tms.http.config.propertis.DemoProperties;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by catface
 * @since 2020/12/15
 */
@Slf4j
@RefreshScope
@RestController
public class IndexController {

    @Value("${spring.profiles.active}")
    private String env;

    private final DemoProperties demoProperties;

    public IndexController(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @SneakyThrows
    @GetMapping(value = {"/"})
    public JsonResult<String> index() {
        String ip = InetAddress.getLocalHost().getHostAddress();
        String message = "Hello,这里是 tms example.IP:" + ip + ",env:" + env;
        log.info(message);
        return JsonResult.success(message);
    }



    @RequestMapping("/getNacosConfig")
    public Integer get() {
        return demoProperties.getAge();
    }

}
