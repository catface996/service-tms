package com.catface.tms.service.goods.impl;

import com.catface.common.exception.CommonErrorEnum;
import com.catface.common.exception.CatfaceException;
import com.catface.tms.service.goods.GoodsService;
import com.catface.tms.service.goods.convert.GoodsConvert;
import com.catface.tms.service.goods.model.GoodsDetailModel;
import com.catface.tms.service.goods.param.SaveGoodsParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author by 大猫
 * @date 2022/4/15 3:19 PM catface996 出品
 */
@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    /**
     * 保存商品信息
     *
     * @param param 保存商品请求参数,包括商品名称,商品价格等
     * @return 商品详情
     */
    @Override
    public GoodsDetailModel saveGoods(SaveGoodsParam param) {

        // 这是干吗干吗
        doSomeThings(param.getGoodsName());

        // 又干啥干啥
        doSomeOtherThings(param);

        // 继续干啥干啥
        continueDoSomeThings();

        // 最后做啥做啥
        return GoodsConvert.convert(param);
    }

    /**
     * 做一些事情,这些事情的逻辑是
     * <p>
     * 1.xfadfasd
     * <p>
     * 2.sdfasdfas
     */
    private void doSomeThings(String goodsName) {
        log.info("做些事情,商品名称:{}", goodsName);
    }

    /**
     * 做一些其他的事情
     */
    private void doSomeOtherThings(SaveGoodsParam param) {
        log.warn("警告,加个设置过高,price:{}", param.getGoodsPrice());
    }

    /**
     * 继续去做一些事情
     */
    private void continueDoSomeThings() {
        log.error("这里仅仅模拟打印异常", new CatfaceException(CommonErrorEnum.PARAM_ERROR));
    }
}
