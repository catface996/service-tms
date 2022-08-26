package com.catface.tms.http.web.controller.model.convert;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.PageVO;
import com.catface.tms.http.web.controller.model.request.GetVehicleModelRequest;
import com.catface.tms.http.web.controller.model.request.SaveVehicleModelRequest;
import com.catface.tms.http.web.controller.model.response.VehicleModelResponse;
import com.catface.tms.repository.entity.VehicleModel;
import com.catface.tms.repository.param.QueryVehicleModelParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/26
 */
public class VehicleModelWebConvert {

  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveVehicleModelRequest.class, VehicleModel.class, false);

  private static final BeanCopier ENTITY_2_RESPONSE = BeanCopier.create(VehicleModel.class,
      VehicleModelResponse.class, false);

  private static final BeanCopier GET_REQUEST_2_PARAM = BeanCopier.create(
      GetVehicleModelRequest.class, QueryVehicleModelParam.class, false);

  public static VehicleModel convert(SaveVehicleModelRequest request) {
    VehicleModel entity = new VehicleModel();
    SAVE_REQUEST_2_ENTITY.copy(request, entity, null);
    Date date = DateTime.now().toDate();
    if (entity.getId() == null) {
      entity.setCreated(date);
      entity.setCreator(request.getCtxUserId());
    }
    entity.setUpdated(date);
    entity.setModifier(request.getCtxUserId());
    return entity;
  }

  public static QueryVehicleModelParam convert(GetVehicleModelRequest request) {
    QueryVehicleModelParam param = new QueryVehicleModelParam();
    GET_REQUEST_2_PARAM.copy(request, param, null);
    param.setCurrent(request.getCurrent());
    param.setSize(request.getSize());
    return param;
  }

  public static VehicleModelResponse convert(VehicleModel entity) {
    VehicleModelResponse response = new VehicleModelResponse();
    ENTITY_2_RESPONSE.copy(entity, response, null);
    return response;
  }

  public static List<VehicleModelResponse> convert(List<VehicleModel> entities) {
    List<VehicleModelResponse> responses = new ArrayList<>();
    for (VehicleModel entity : entities) {
      responses.add(convert(entity));
    }
    return responses;
  }

  public static PageVO<VehicleModelResponse> convert(Page<VehicleModel> page) {
    PageVO<VehicleModelResponse> pageVO = new PageVO<>(page.getCurrent(), page.getSize(),
        page.getPages(), page.getTotal());
    List<VehicleModelResponse> responses = convert(page.getRecords());
    pageVO.setRecords(responses);
    return pageVO;
  }

}
