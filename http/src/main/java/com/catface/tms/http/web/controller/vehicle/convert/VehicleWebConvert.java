package com.catface.tms.http.web.controller.vehicle.convert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.PageVO;
import com.catface.tms.http.web.controller.common.response.ImageResponse;
import com.catface.tms.http.web.controller.vehicle.request.GetVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.request.SaveVehicleRequest;
import com.catface.tms.http.web.controller.vehicle.response.VehicleResponse;
import com.catface.tms.repository.entity.Vehicle;
import com.catface.tms.repository.param.QueryVehicleParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/25
 */
public class VehicleWebConvert {


  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveVehicleRequest.class, Vehicle.class, false);

  private static final BeanCopier ENTITY_2_RESPONSE = BeanCopier.create(Vehicle.class,
      VehicleResponse.class, false);

  public static Vehicle convert(SaveVehicleRequest request) {
    Vehicle entity = new Vehicle();
    SAVE_REQUEST_2_ENTITY.copy(request, entity, null);
    entity.setImages(JSON.toJSONString(request.getImageIds()));
    entity.setClientId(request.getCtxClientId());
    Date date = DateTime.now().toDate();
    if (entity.getId() == null) {
      entity.setCreated(date);
      entity.setCreator(request.getCtxUserId());
    }
    entity.setModifier(request.getCtxUserId());
    entity.setUpdated(date);
    return entity;
  }

  public static VehicleResponse convert(Vehicle entity) {
    VehicleResponse response = new VehicleResponse();
    ENTITY_2_RESPONSE.copy(entity, response, null);
    List<ImageResponse> imageResponses = JSONArray.parseArray(entity.getImages(),
        ImageResponse.class);
    response.setImages(imageResponses);
    return response;
  }

  public static List<VehicleResponse> convert(List<Vehicle> entities) {
    List<VehicleResponse> list = new ArrayList<>(entities.size());
    for (Vehicle entity : entities) {
      list.add(convert(entity));
    }
    return list;
  }

  public static PageVO<VehicleResponse> convert(Page<Vehicle> page) {
    PageVO<VehicleResponse> pageVO = new PageVO<>(page.getCurrent(), page.getSize(),
        page.getPages(), page.getTotal());
    List<VehicleResponse> responses = convert(page.getRecords());
    pageVO.setRecords(responses);
    return pageVO;
  }

  public static QueryVehicleParam convert(GetVehicleRequest request) {
    QueryVehicleParam param = new QueryVehicleParam();
    param.setVehicleTypes(request.getVehicleTypes());
    param.setPlateNumber(request.getPlateNumber());
    param.setClientId(request.getCtxClientId());
    param.setCurrent(request.getCurrent());
    param.setSize(request.getSize());
    return param;
  }


}
