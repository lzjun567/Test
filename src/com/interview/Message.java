package com.interview;

/**
 * 消息抽象类
 * @author liuzhijun
 *
 */
public abstract class Message {
	
	private String content;  //消息内容
	private String template; //模版路径
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTemplate() {
		
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	
	public Message(String content, String template) {
		this.content = content;
		this.template = template;
	}
	
	/**
	 * 具体的发送方式有子类实现
	 * @param user
	 */
	public abstract void send();

}
