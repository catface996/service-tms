package com.catface.tms.http.web.controller.goods.vo;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/4/15 2:58 PM catface996 出品
 */
@Data
@ApiModel(description = "商品详情模型")
public class GoodsDetailVO {

    @ApiModelProperty(value = "商品持有人ID", required = true, example = "123456789098")
    private Long goodsOwnerId;

    @ApiModelProperty(value = "商品名称", required = true, example = "黑人珍珠亮白薄荷牙膏加装版")
    private String goodsName;

    @ApiModelProperty(value = "商品品牌", required = true, example = "黑人")
    private String goodsBrand;

    @ApiModelProperty(value = "商品价格", required = true, example = "25.66")
    private BigDecimal goodsPrice;
}
