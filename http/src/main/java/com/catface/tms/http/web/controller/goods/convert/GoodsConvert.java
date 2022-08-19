package com.catface.tms.http.web.controller.goods.convert;

import com.catface.tms.http.web.controller.goods.request.SaveGoodsRequest;
import com.catface.tms.http.web.controller.goods.vo.GoodsDetailVO;
import com.catface.tms.service.goods.model.GoodsDetailModel;
import com.catface.tms.service.goods.param.SaveGoodsParam;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @author by 大猫
 * @date 2022/4/15 3:13 PM catface996 出品
 */
public class GoodsConvert {

    private static final BeanCopier REQUEST_2_PARMA = BeanCopier.create(SaveGoodsRequest.class, SaveGoodsParam.class,
        false);

    private static final BeanCopier MODEL_2_VO = BeanCopier.create(GoodsDetailModel.class, GoodsDetailVO.class, false);

    public static SaveGoodsParam convert(SaveGoodsRequest request) {
        SaveGoodsParam param = new SaveGoodsParam();
        REQUEST_2_PARMA.copy(request, param, null);
        return param;
    }

    public static GoodsDetailVO convert(GoodsDetailModel model) {
        GoodsDetailVO vo = new GoodsDetailVO();
        MODEL_2_VO.copy(model, vo, null);
        return vo;
    }

    private GoodsConvert() {}
}
