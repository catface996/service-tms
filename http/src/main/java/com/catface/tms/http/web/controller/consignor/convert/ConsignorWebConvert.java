package com.catface.tms.http.web.controller.consignor.convert;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.PageVO;
import com.catface.tms.http.web.controller.consignor.request.GetConsignorRequest;
import com.catface.tms.http.web.controller.consignor.request.SaveConsignorRequest;
import com.catface.tms.http.web.controller.consignor.response.ConsignorResponse;
import com.catface.tms.repository.entity.Consignor;
import com.catface.tms.repository.param.QueryConsignorParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/28
 */
public class ConsignorWebConvert {

  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveConsignorRequest.class, Consignor.class, false);

  private static final BeanCopier ENTITY_2_RESPONSE = BeanCopier.create(Consignor.class,
      ConsignorResponse.class, false);

  public static Consignor convert(SaveConsignorRequest request) {
    Consignor entity = new Consignor();
    SAVE_REQUEST_2_ENTITY.copy(request, entity, null);
    entity.setProvinceCode(request.getProvince().getProvinceCode());
    entity.setProvinceName(request.getProvince().getProvinceName());
    entity.setCityCode(request.getCity().getCityCode());
    entity.setCityName(request.getCity().getCityName());
    entity.setDistrictCode(request.getDistrict().getDistrictCode());
    entity.setDistrictName(request.getDistrict().getDistrictName());
    entity.setStreetCode(request.getStreet().getStreetCode());
    entity.setStreetName(request.getStreet().getStreetName());
    Date date = DateTime.now().toDate();
    if (entity.getId() == null) {
      entity.setCreator(request.getCtxUserId());
      entity.setCreated(date);
    }
    entity.setModifier(request.getCtxUserId());
    entity.setUpdated(date);

    entity.setClientId(request.getCtxClientId());
    return entity;
  }

  public static QueryConsignorParam convert(GetConsignorRequest request) {
    QueryConsignorParam param = new QueryConsignorParam();
    param.setConsignorMobile(request.getConsignorMobile());
    param.setConsignorName(request.getConsignorName());
    param.setCurrent(request.getCurrent());
    param.setSize(request.getSize());
    param.setClientId(request.getCtxClientId());
    return param;
  }

  public static ConsignorResponse convert(Consignor entity) {
    ConsignorResponse response = new ConsignorResponse();
    ENTITY_2_RESPONSE.copy(entity, response, null);
    return response;
  }

  public static List<ConsignorResponse> convert(List<Consignor> entities) {
    List<ConsignorResponse> responses = new ArrayList<>();
    for (Consignor entity : entities) {
      responses.add(convert(entity));
    }
    return responses;
  }

  public static PageVO<ConsignorResponse> convert(Page<Consignor> page) {
    PageVO<ConsignorResponse> pageVO = new PageVO<>(page.getCurrent(), page.getSize(),
        page.getPages(), page.getTotal());
    List<ConsignorResponse> list = convert(page.getRecords());
    pageVO.setRecords(list);
    return pageVO;
  }

}
