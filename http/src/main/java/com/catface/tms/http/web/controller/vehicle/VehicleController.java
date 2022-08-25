package com.catface.tms.http.web.controller.vehicle;

import com.catface.common.model.JsonResult;
import com.catface.common.model.PageVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.vehicle.request.DeleteVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.request.GetVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.request.SaveVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.response.VehicleResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/8/25
 */
@Api(tags = {SwaggerTagConst.VEHICLE})
@Slf4j
@RestController
public class VehicleController {

  @ApiOperation(value = "保存车辆信息")
  @PostMapping(value = "/public/vehicle/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveVehicleRequest request) {
    return JsonResult.success();
  }


  @ApiOperation(value = "分页查询车辆信息")
  @PostMapping(value = "/public/vehicle/getOnePage")
  public JsonResult<PageVO<VehicleResponse>> getOnePage(
      @RequestBody @Valid GetVehicleRequest request) {
    return JsonResult.success();
  }

  @ApiOperation(value = "删除车辆")
  @PostMapping(value = "/public/vehicle/delete")
  public JsonResult<Boolean> delete(@RequestBody @Valid DeleteVehicleRequest request) {
    return JsonResult.success();
  }

}
