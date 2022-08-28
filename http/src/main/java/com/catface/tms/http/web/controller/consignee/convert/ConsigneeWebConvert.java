package com.catface.tms.http.web.controller.consignee.convert;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catface.common.model.PageVO;
import com.catface.tms.http.web.controller.consignee.request.GetConsigneeRequest;
import com.catface.tms.http.web.controller.consignee.request.SaveConsigneeRequest;
import com.catface.tms.http.web.controller.consignee.response.ConsigneeResponse;
import com.catface.tms.repository.entity.Consignee;
import com.catface.tms.repository.param.QueryConsigneeParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/28
 */
public class ConsigneeWebConvert {

  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveConsigneeRequest.class, Consignee.class, false);

  private static final BeanCopier ENTITY_2_RESPONSE = BeanCopier.create(Consignee.class,
      ConsigneeResponse.class, false);

  public static Consignee convert(SaveConsigneeRequest request) {
    Consignee entity = new Consignee();
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

  public static QueryConsigneeParam convert(GetConsigneeRequest request) {
    QueryConsigneeParam param = new QueryConsigneeParam();
    param.setClientId(request.getCtxClientId());
    param.setConsigneeMobile(request.getConsigneeMobile());
    param.setConsigneeName(request.getConsigneeName());
    param.setCurrent(request.getCurrent());
    param.setSize(request.getSize());
    return param;
  }

  public static ConsigneeResponse convert(Consignee entity) {
    ConsigneeResponse response = new ConsigneeResponse();
    ENTITY_2_RESPONSE.copy(entity, response, null);
    return response;
  }

  public static List<ConsigneeResponse> convert(List<Consignee> entities) {
    List<ConsigneeResponse> list = new ArrayList<>();
    for (Consignee entity : entities) {
      list.add(convert(entity));
    }
    return list;
  }

  public static PageVO<ConsigneeResponse> convert(Page<Consignee> page) {
    PageVO<ConsigneeResponse> pageVO = new PageVO<>(page.getCurrent(), page.getSize(),
        page.getPages(), page.getTotal());
    List<ConsigneeResponse> list = convert(page.getRecords());
    pageVO.setRecords(list);
    return pageVO;
  }

}
