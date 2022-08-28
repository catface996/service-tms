package com.catface.tms.http.web.controller.consignee;

import com.catface.common.model.JsonResult;
import com.catface.common.model.PageVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.consignee.request.DeleteConsigneeRequest;
import com.catface.tms.http.web.controller.consignee.request.GetConsigneeRequest;
import com.catface.tms.http.web.controller.consignee.request.SaveConsigneeRequest;
import com.catface.tms.http.web.controller.consignee.response.ConsigneeResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/8/28
 */
@Api(tags = {SwaggerTagConst.CONSIGNEE})
@Slf4j
@RestController
public class ConsigneeController {

  @ApiOperation(value = "保存收货人")
  @PostMapping(value = "/public/consignee/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveConsigneeRequest request) {
    return JsonResult.success();
  }

  @ApiOperation(value = "分页查询收货人")
  @PostMapping(value = "/public/consignee/getOnePage")
  public JsonResult<PageVO<ConsigneeResponse>> getOnePage(
      @RequestBody @Valid GetConsigneeRequest request) {
    return JsonResult.success();
  }

  @ApiOperation(value = "删除收货人")
  @PostMapping(value = "/public/consignee/delete")
  public JsonResult<Boolean> delete(@RequestBody @Valid DeleteConsigneeRequest request) {
    return JsonResult.success(true);
  }

}
