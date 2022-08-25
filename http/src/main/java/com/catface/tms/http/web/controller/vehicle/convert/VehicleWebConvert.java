package com.catface.tms.http.web.controller.vehicle.convert;

import com.alibaba.fastjson.JSON;
import com.catface.tms.http.web.controller.vehicle.request.SaveVehicleRequest;
import com.catface.tms.repository.entity.Vehicle;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/25
 */
public class VehicleWebConvert {


  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveVehicleRequest.class, Vehicle.class, false);

  public static Vehicle convert(SaveVehicleRequest request) {
    Vehicle entity = new Vehicle();
    SAVE_REQUEST_2_ENTITY.copy(request, entity, null);
    entity.setImages(JSON.toJSONString(request.getImageIds()));
    return entity;
  }

}
