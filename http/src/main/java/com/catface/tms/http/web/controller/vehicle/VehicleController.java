package com.catface.tms.http.web.controller.vehicle;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.JsonResult;
import com.catface.common.model.PageVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.vehicle.convert.VehicleWebConvert;
import com.catface.tms.http.web.controller.vehicle.request.DeleteVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.request.GetVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.request.SaveVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.response.VehicleResponse;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.param.QueryVehicleParam;
import com.catface.tms.service.vehicle.VehicleService;
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

  private final VehicleService vehicleService;

  public VehicleController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @ApiOperation(value = "保存车辆信息")
  @PostMapping(value = "/public/vehicle/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveVehicleRequest request) {
    Vehicle entity = VehicleWebConvert.convert(request);
    vehicleService.save(entity);
    return JsonResult.success(true);
  }


  @ApiOperation(value = "分页查询车辆信息")
  @PostMapping(value = "/public/vehicle/getOnePage")
  public JsonResult<PageVO<VehicleResponse>> getOnePage(
      @RequestBody @Valid GetVehicleRequest request) {
    QueryVehicleParam param = VehicleWebConvert.convert(request);
    Page<Vehicle> page = vehicleService.queryOnePage(param);
    PageVO<VehicleResponse> pageVO = VehicleWebConvert.convert(page);
    return JsonResult.success(pageVO);
  }

  @ApiOperation(value = "删除车辆")
  @PostMapping(value = "/public/vehicle/delete")
  public JsonResult<Boolean> delete(@RequestBody @Valid DeleteVehicleRequest request) {
    vehicleService.delete(request.getVehicleId(), request.getCtxClientId());
    return JsonResult.success(true);
  }


}
