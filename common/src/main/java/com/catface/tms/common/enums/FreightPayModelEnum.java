package com.catface.tms.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.catface.common.enums.BaseEnum;

/**
 * @author catface
 * @since 2022/8/29
 */
public enum FreightPayModelEnum implements BaseEnum {

  /**
   * 运费付款方式
   */
  FREIGHT_PREPAID("PP", "现付"),

  FREIGHT_COLLECT("CC", "到付"),

  FREIGHT_RETURN("RR", "回付"),

  ;

  @EnumValue
  private final String code;

  private final String desc;

  FreightPayModelEnum(String code, String desc) {
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
