package com.interview;

/**
 * ���ŷ���
 * @author liuzhijun
 *
 */
public class ShortMessage extends Message{

	public ShortMessage(String content, String template) {
		super(content, template);
	}

	@Override
	public void send() {
		//ģ����ŷ���
		System.out.println("used template " + this.getTemplate()+ 
				" to sened  shrotmessage, the content is "+this.getContent());
		
	}


}
