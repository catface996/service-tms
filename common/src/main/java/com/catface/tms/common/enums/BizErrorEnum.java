package com.catface.tms.common.enums;

import com.catface.common.exception.BaseErrorEnum;

/**
 * @author by catface
 * @since 2020/12/17
 */
public enum BizErrorEnum implements BaseErrorEnum {

	/**
	 * 业务异常枚举值
	 */
	UN_READY_JOURNAL("非就绪状态的流水"),
	CONFIRMED_JOURNAL("流水已经处于确认状态"),
	CANCELED_JOURNAL("流水已经处于取消状态"),

	UN_SUPPORT_FREEZE_TYPE("不支持的冻结余额类型,目前仅支持提现冻结和投注冻结"),

	/**
	 * 派奖相关
	 */
	NOT_THE_SAME_BONUS_DISPATCH("非同一笔派奖流水"),

	/**
	 * 提现
	 */
	NOT_ENOUGH_BALANCE_FOR_WITHDRAW("可用余额中,可提现额度小于待提现金额"),

	;

	private final String message;

	BizErrorEnum(String message) {
		this.message = message;
	}

	@Override
	public String getCode() {
		return name();
	}

	@Override
	public String getMessage() {
		return message;
	}
}