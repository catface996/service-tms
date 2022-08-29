package com.catface.tms.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 货运单货物明细
 * </p>
 *
 * @author catface
 * @since 2022-08-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DeliverGoodsDetail对象", description="货运单货物明细")
public class DeliverGoodsDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "货运单ID")
    private Integer deliverOrderId;

    @ApiModelProperty(value = "货品ID")
    private Long goodsId;

    @ApiModelProperty(value = "货物名称")
    private Long goodsName;

    @ApiModelProperty(value = "货物数量")
    private Integer goodsQty;

    @ApiModelProperty(value = "货物图片")
    private String goodsImages;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "修改人")
    private Long modifier;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date updated;


}
