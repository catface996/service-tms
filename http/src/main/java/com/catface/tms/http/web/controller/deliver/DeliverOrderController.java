package com.catface.tms.http.web.controller.deliver;

import com.catface.common.model.JsonResult;
import com.catface.tms.http.web.controller.deliver.request.ReceiveGoodsRequest;
import com.catface.tms.http.web.controller.deliver.request.ReleaseGoodsRequest;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/8/29
 */
@Slf4j
@RestController
public class DeliverOrderController {

  @ApiOperation(value = "发货人填写发货单")
  @PostMapping(value = "/public/deliverOrder/release")
  public JsonResult<Boolean> release(@RequestBody @Valid ReleaseGoodsRequest request) {
    return JsonResult.success();
  }

  @ApiOperation(value = "承运人填写发货单")
  @PostMapping(value = "/public/deliverOrder/release")
  public JsonResult<Boolean> receive(@RequestBody @Valid ReceiveGoodsRequest request) {
    return JsonResult.success();
  }


}
