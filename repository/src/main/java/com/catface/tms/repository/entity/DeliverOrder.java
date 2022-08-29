package com.catface.tms.repository.entity;

import java.math.BigDecimal;
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
 * 交货单
 * </p>
 *
 * @author catface
 * @since 2022-08-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DeliverOrder对象", description="交货单")
public class DeliverOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id，主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "所属客户ID")
    private Long clientId;

    @ApiModelProperty(value = "发货人ID")
    private Long consignorId;

    @ApiModelProperty(value = "发货人信息，json格式")
    private String consignor;

    @ApiModelProperty(value = "收货人ID")
    private Long consigneeId;

    @ApiModelProperty(value = "收货人信息，json格式")
    private String consignee;

    @ApiModelProperty(value = "接收货物的方式，现场收货，上门收货")
    private String acceptGoodsType;

    @ApiModelProperty(value = "送货方式，收货人自提，送货上门")
    private String deliverGoodsType;

    @ApiModelProperty(value = "是否需要代收货款")
    private String collectingOnDeliver;

    @ApiModelProperty(value = "代收货款金额")
    private BigDecimal collectingAmount;

    @ApiModelProperty(value = "运送状态")
    private String deliverStatus;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date updated;

    @ApiModelProperty(value = "备注")
    private String remark;


}
