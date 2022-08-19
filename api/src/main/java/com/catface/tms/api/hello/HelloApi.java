package com.catface.tms.api.hello;

import com.catface.tms.api.hello.request.SayHelloRequest;
import com.catface.common.model.JsonResult;
import com.catface.tms.api.hello.vo.SayHelloVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author by catface
 * @date 2020/12/15
 */

@FeignClient(name = "helloApi", url = "${rpc.tms.service}", fallbackFactory = HelloApiFallback.class)
public interface HelloApi {

    /**
     * 打招呼接口
     *
     * @param request 打招呼请求参数
     * @return 打招呼回应
     */
    @PostMapping(value = {"/private/hello/sayHello"})
    JsonResult<SayHelloVO> sayHello(SayHelloRequest request);

    /**
     * 异常测试
     *
     * @param request 打招呼请求参数
     * @return 打招呼回应
     */
    @PostMapping(value = "/private/hello/exception")
    JsonResult<String> exception(SayHelloRequest request);
}
