package com.interview;

/**
 * 邮箱发送
 * @author liuzhijun
 *
 */
public class EmailMessage extends Message {
	public EmailMessage(String content, String template) {
		super(content, template);
	}
	@Override
	public void send(){
		//模拟邮件发送
		System.out.println("use template " + this.getTemplate()+
				"to sened  email, the cotnent is "+this.getContent());
		
	}

}
