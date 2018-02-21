/**
 * 微信公众平台开发模式(JAVA) SDK
 * (c) 2012-2013 ____′ liugf 风行工作室, MIT Licensed
 * http://www.jeasyuicn.com/wechat
 */
package com.gson.bean;

import java.io.Serializable;

/**
 * 多图文消息
 * @author liugf 风行工作室
 *
 */
public class Articles implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String Title;
	private String Description;
	private String PicUrl;
	private String Url;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}
