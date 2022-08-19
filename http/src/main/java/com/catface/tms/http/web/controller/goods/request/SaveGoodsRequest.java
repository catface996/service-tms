package com.catface.tms.http.web.controller.goods.request;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @date 2022/4/15 2:49 PM catface996 出品
 */
@Data
@ApiModel(description = "保存商品请求")
public class SaveGoodsRequest {

    @ApiModelProperty(value = "商品持有人ID", required = true, example = "123456789098")
    @NotNull(message = "商品持有人ID不能为空")
    private Long goodsOwnerId;

    @ApiModelProperty(value = "商品名称", required = true, example = "黑人珍珠亮白薄荷牙膏加装版")
    @Size(max = 32, min = 8, message = "商品名称需要8到32个字符")
    private String goodsName;

    @ApiModelProperty(value = "商品品牌", required = true, example = "黑人")
    @Size(max = 16, min = 2, message = "品牌名称需要2到16个字符")
    private String goodsBrand;

    @ApiModelProperty(value = "商品价格", required = true, example = "25.66")
    @DecimalMin(value = "0.00", message = "商品价格不能低于0元")
    private BigDecimal goodsPrice;
}
