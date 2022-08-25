package com.catface.tms.api.hello;

import com.catface.tms.api.hello.request.SayHelloRequest;
import com.catface.common.model.JsonResult;
import com.catface.tms.api.hello.vo.SayHelloVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author by catface
 * @since 2020/12/15
 */
@Slf4j
@Component
public class HelloApiFallback implements FallbackFactory<HelloApi> {

  @Override
  public HelloApi create(Throwable throwable) {
    return new HelloApi() {

      @Override
      public JsonResult<SayHelloVO> sayHello(SayHelloRequest request) {
        log.error("rpcError,method:sayHello,request:{}", request, throwable);
        return JsonResult.rpcError("调用打招呼接口异常");
      }

      /**
       * 异常测试
       *
       * @param request 打招呼请求参数
       * @return 打招呼回应
       */
      @Override
      public JsonResult<String> exception(SayHelloRequest request) {
        log.error("rpcError,method:exception,request:{}", request, throwable);
        return JsonResult.rpcError("异常测试接口异常");
      }
    };
  }
}
