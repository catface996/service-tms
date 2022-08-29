package com.catface.tms.repository.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 转派货运单
 * </p>
 *
 * @author catface
 * @since 2022-08-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DispatchOrder对象", description="转派货运单")
public class DispatchOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id，主键")
    private Long id;

    @ApiModelProperty(value = "货运单ID")
    private Long deliverOrderId;

    @ApiModelProperty(value = "客户ID")
    private Long clientId;

    @ApiModelProperty(value = "上一个客户ID，即转派货运单的上一个车主")
    private Long lastClientId;

    @ApiModelProperty(value = "运费金额")
    private BigDecimal freightChargeAmount;

    @ApiModelProperty(value = "运费付费方式")
    private String freightPayModel;

    @ApiModelProperty(value = "送货状态")
    private String deliverStatus;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "修噶人")
    private Long modifier;

    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date updated;

    @ApiModelProperty(value = "备注")
    private String remark;


}
