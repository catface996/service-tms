package com.catface.tms.http.web.controller.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.IdRequest;
import com.catface.common.model.JsonResult;
import com.catface.common.model.PageVO;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.model.convert.VehicleModelWebConvert;
import com.catface.tms.http.web.controller.model.request.GetVehicleModelRequest;
import com.catface.tms.http.web.controller.model.request.SaveVehicleModelRequest;
import com.catface.tms.http.web.controller.model.response.VehicleModelResponse;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;
import com.catface.tms.service.model.VehicleModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @since 2022/8/26
 */
@Api(tags = {SwaggerTagConst.VEHICLE_MODEL})
@Slf4j
@RestController
public class VehicleModelController {

  private final VehicleModelService vehicleModelService;

  public VehicleModelController(VehicleModelService vehicleModelService) {
    this.vehicleModelService = vehicleModelService;
  }

  @ApiOperation(value = "保存车辆型号")
  @PostMapping(value = "/public/vehicleModel/save")
  public JsonResult<Boolean> save(@RequestBody @Valid SaveVehicleModelRequest request) {
    VehicleModel entity = VehicleModelWebConvert.convert(request);
    vehicleModelService.save(entity);
    return JsonResult.success(true);
  }

  @ApiOperation(value = "分页查询车辆型号")
  @PostMapping(value = "/public/vehicleModel/getOnePage")
  public JsonResult<PageVO<VehicleModelResponse>> getOnePage(@RequestBody @Valid
  GetVehicleModelRequest request) {
    QueryVehicleModelParam param = VehicleModelWebConvert.convert(request);
    Page<VehicleModel> page = vehicleModelService.queryOnePage(param);
    PageVO<VehicleModelResponse> pageVO = VehicleModelWebConvert.convert(page);
    return JsonResult.success(pageVO);
  }

  @ApiOperation(value = "分页查询车辆型号")
  @PostMapping(value = "/public/vehicleModel/delete")
  public JsonResult<Boolean> delete(@RequestBody @Valid IdRequest request) {
    return JsonResult.success(true);
  }


}
