package com.catface.tms.http.web.controller.consignor;

import com.catface.common.model.JsonResult;
import com.catface.common.model.PageVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.consignor.request.DeleteConsignorRequest;
import com.catface.tms.http.web.controller.consignor.request.SaveConsignorRequest;
import com.catface.tms.http.web.controller.consignor.response.ConsignorResponse;
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
@Api(tags = {SwaggerTagConst.CONSIGNOR})
@Slf4j
@RestController
public class ConsignorController {

  @ApiOperation(value = "保存发货人")
  @PostMapping(value = "/public/consignor/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveConsignorRequest request) {
    return JsonResult.success(true);
  }

  @ApiOperation(value = "分页查询发货人")
  @PostMapping(value = "/public/consignor/getOnePage")
  public JsonResult<PageVO<ConsignorResponse>> getOnePage(){
    return JsonResult.success();
  }

  @ApiOperation(value = "删除发货人")
  @PostMapping(value = "/public/consignor/delete")
  public JsonResult<Boolean> delete(@RequestBody@Valid DeleteConsignorRequest request){
    return JsonResult.success(true);
  }

}
