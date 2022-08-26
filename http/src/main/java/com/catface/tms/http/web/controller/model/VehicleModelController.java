package com.catface.tms.http.web.controller.model;

import com.catface.common.model.IdRequest;
import com.catface.common.model.JsonResult;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.model.request.GetVehicleModelRequest;
import com.catface.tms.http.web.controller.model.request.SaveVehicleModelRequest;
import com.catface.tms.http.web.controller.model.response.VehicleModelResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

/**
 * @author catface
 * @since 2022/8/26
 */
@Api(tags = {SwaggerTagConst.VEHICLE_MODEL})
@Slf4j
@RestController
public class VehicleModelController {

  @ApiOperation(value = "保存车辆型号")
  @PostMapping(value = "/public/vehicleModel/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveVehicleModelRequest request) {
    return JsonResult.success();
  }

  @ApiOperation(value = "分页查询车辆型号")
  @PostMapping(value = "/public/vehicleModel/getOnePage")
  public JsonResult<Page<VehicleModelResponse>> getOnePage(@RequestBody@Valid
      GetVehicleModelRequest request){
    return JsonResult.success();
  }

  @ApiOperation(value = "分页查询车辆型号")
  @PostMapping(value = "/public/vehicleModel/delete")
  public JsonResult<Boolean> delete(@RequestBody@Valid IdRequest request){
    return JsonResult.success(true);
  }


}
