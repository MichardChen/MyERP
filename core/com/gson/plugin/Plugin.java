/**
 * 微信公众平台开发模式(JAVA) SDK
 * (c) 2012-2014 ____′ liugf 风行工作室, MIT Licensed
 * http://www.jeasyuicn.com/wechat
 */
package com.gson.plugin;

/**
 * 插件接口
 * @author liugf 风行工作室
 *
 */
public interface Plugin {
	public void run(Object... obj);

    public Boolean install();

    public Boolean uninstall();

    public Boolean upgrade();
}
