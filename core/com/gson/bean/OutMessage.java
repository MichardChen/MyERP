/**
 * 微信公众平台开发模式(JAVA) SDK
 * (c) 2012-2013 ____′ liugf 风行工作室, MIT Licensed
 * http://www.jeasyuicn.com/wechat
 */
package com.gson.bean;

public class OutMessage {

	private String	ToUserName;
	private String	FromUserName;
	private Long	CreateTime;
	private int		FuncFlag	= 0;

	public String getToUserName() {
		return ToUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public int getFuncFlag() {
		return FuncFlag;
	}

	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
}