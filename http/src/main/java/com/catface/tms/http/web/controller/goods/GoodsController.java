package com.catface.tms.http.web.controller.goods;

import javax.validation.Valid;

import com.catface.common.model.JsonResult;
import com.catface.tms.http.config.swagger.SwaggerTagConst;
import com.catface.tms.http.web.controller.goods.convert.GoodsConvert;
import com.catface.tms.http.web.controller.goods.request.SaveGoodsRequest;
import com.catface.tms.http.web.controller.goods.vo.GoodsDetailVO;
import com.catface.tms.service.goods.GoodsService;
import com.catface.tms.service.goods.model.GoodsDetailModel;
import com.catface.tms.service.goods.param.SaveGoodsParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 大猫
 * @date 2022/4/15 2:48 PM catface996 出品
 */
@Api(tags = {SwaggerTagConst.GOODS_MANAGE})
@Slf4j
@RestController
public class GoodsController {

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {this.goodsService = goodsService;}

    @ApiOperation(value = "保存商品信息")
    @PostMapping(value = "/public/goods/save")
    public JsonResult<GoodsDetailVO> save(@Valid @RequestBody SaveGoodsRequest request) {
        // 请求参数装换
        SaveGoodsParam param = GoodsConvert.convert(request);
        // 执行业务逻辑
        GoodsDetailModel model = goodsService.saveGoods(param);
        // 处理结果转换
        GoodsDetailVO vo = GoodsConvert.convert(model);
        // 响应结果返回
        return JsonResult.success(vo);
    }

}
