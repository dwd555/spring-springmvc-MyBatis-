package com.dwd.utils;

public enum TokenState {
	/**
	 * ����
	 */
	EXPIRED("EXPIRED"),
	/**
	 * ��Ч(token���Ϸ�)
	 */
	INVALID("INVALID"),
	/**
	 * ��Ч��
	 */
	VALID("VALID");

	private String state;

	private TokenState(String state) {
		this.state = state;
	}

	/**
	 * ����״̬�ַ�����ȡtoken״̬ö�ٶ���
	 * 
	 * @param tokenState
	 * @return
	 */
	public static TokenState getTokenState(String tokenState) {
		TokenState[] states = TokenState.values();
		TokenState ts = null;
		for (TokenState state : states) {
			if (state.toString().equals(tokenState)) {
				ts = state;
				break;
			}
		}
		return ts;
	}

	public String toString() {
		return this.state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
