package com.catface.tms.http.web.controller.consignor.convert;

import com.catface.tms.http.web.controller.consignor.request.SaveConsignorRequest;
import com.catface.tms.repository.entity.Consignor;
import java.util.Date;
import org.joda.time.DateTime;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author catface
 * @since 2022/8/28
 */
public class ConsignorWebConvert {

  private static final BeanCopier SAVE_REQUEST_2_ENTITY = BeanCopier.create(
      SaveConsignorRequest.class,
      Consignor.class, false);

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

}
