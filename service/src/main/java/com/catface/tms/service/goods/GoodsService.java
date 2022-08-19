package com.catface.tms.service.goods;

import com.catface.tms.service.goods.model.GoodsDetailModel;
import com.catface.tms.service.goods.param.SaveGoodsParam;

/**
 * @author by 大猫
 * @date 2022/4/15 3:14 PM catface996 出品
 */
public interface GoodsService {

    /**
     * 保存商品信息
     *
     * @param param 保存商品请求参数,包括商品名称,商品价格等
     * @return 商品详情
     */
    GoodsDetailModel saveGoods(SaveGoodsParam param);
}
