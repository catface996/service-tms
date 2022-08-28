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
 * 收货人
 * </p>
 *
 * @author catface
 * @since 2022-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Consignee对象", description="收货人")
public class Consignee implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id,主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "所属客户ID")
    private Long clientId;

    @ApiModelProperty(value = "收货人姓名")
    private String consigneeName;

    @ApiModelProperty(value = "收货人手机号")
    private String consigneeMobile;

    @ApiModelProperty(value = "收货人所在省份编码")
    private String provinceCode;

    @ApiModelProperty(value = "收货人所在省份名称")
    private String provinceName;

    @ApiModelProperty(value = "收货人所在城市编码")
    private String cityCode;

    @ApiModelProperty(value = "收货人所在城市名称")
    private String cityName;

    @ApiModelProperty(value = "收货人所在县区编码")
    private String districtCode;

    @ApiModelProperty(value = "收货人所在县区名称")
    private String districtName;

    @ApiModelProperty(value = "收货人所在街道编码")
    private String streetCode;

    @ApiModelProperty(value = "收货人所在街道名称")
    private String streetName;

    @ApiModelProperty(value = "详细地址")
    private String detailedAddress;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "修改人")
    private Long modifier;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "修改时间")
    private Date updated;

    @ApiModelProperty(value = "备注")
    private String remark;


}
