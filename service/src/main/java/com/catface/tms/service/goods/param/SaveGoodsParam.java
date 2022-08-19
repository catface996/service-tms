package com.catface.tms.service.goods.param;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/4/15 3:15 PM catface996 出品
 */
@Data
public class SaveGoodsParam {

    /**
     * 商品持有人ID
     */
    private Long goodsOwnerId;

    /**
     * 商品名称
     */
    private String goodsName;

    @ApiModelProperty(value = "商品品牌", required = true, example = "黑人")
    private String goodsBrand;

    @ApiModelProperty(value = "商品价格", required = true, example = "25.66")
    private BigDecimal goodsPrice;

}
