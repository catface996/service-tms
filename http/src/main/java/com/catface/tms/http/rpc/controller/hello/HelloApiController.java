package com.catface.tms.http.rpc.controller.hello;

import javax.validation.Valid;

import com.catface.common.exception.CatfaceException;
import com.catface.common.model.JsonResult;
import com.catface.tms.api.hello.HelloApi;
import com.catface.tms.api.hello.request.SayHelloRequest;
import com.catface.tms.api.hello.vo.SayHelloVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Api(tags = {SwaggerTagConst.SAY_HELLO})
@RestController
public class HelloApiController implements HelloApi {

    @Value("${spring.profiles.active}")
    private String env;

    /**
     * 打招呼接口
     *
     * @param request 打招呼请求参数
     * @return 打招呼回应
     */
    @Override
    public JsonResult<SayHelloVO> sayHello(@RequestBody @Valid SayHelloRequest request) {
        return JsonResult.success(new SayHelloVO("大张伟"));
    }

    /**
     * 异常测试
     *
     * @param request 打招呼请求参数
     * @return 打招呼回应
     */
    @Override
    public JsonResult<String> exception(@RequestBody @Valid SayHelloRequest request) {
        throw new CatfaceException("ERROR_CODE", "ERROR_MESSAGE");
    }

}
