package com.catface.tms.common.enums;

import com.catface.common.enums.BaseEnum;

/**
 * @author catface
 * @since 2022/8/29
 */
public enum DeliverStatusEnum implements BaseEnum {

  /**
   * 运输状态
   */
  IN_TRANSIT("IN_TRANSIT", "运输中"),

  DISPATCHED("DISPATCHED", "已转运"),

  FOR_PICKUP("FOR_PICKUP", "待取货"),

  DELIVERED("DELIVERED", "已送达"),

  ;

  private final String code;

  private final String desc;

  DeliverStatusEnum(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  /**
   * 获取枚举值描述
   *
   * @return 枚举值描述
   */
  @Override
  public String getDesc() {
    return desc;
  }

  /**
   * 获取枚举值编码
   *
   * @return 枚举值编码
   */
  @Override
  public String getCode() {
    return code;
  }
}
