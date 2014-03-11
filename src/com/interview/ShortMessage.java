package com.interview;

/**
 * 短信发送
 * @author liuzhijun
 *
 */
public class ShortMessage extends Message{

	public ShortMessage(String content, String template) {
		super(content, template);
	}

	@Override
	public void send() {
		//模拟短信发送
		System.out.println("used template " + this.getTemplate()+ 
				" to sened  shrotmessage, the content is "+this.getContent());
		
	}


}
