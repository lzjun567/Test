package com.interview;

/**
 * ���䷢��
 * @author liuzhijun
 *
 */
public class EmailMessage extends Message {
	public EmailMessage(String content, String template) {
		super(content, template);
	}
	@Override
	public void send(){
		//ģ���ʼ�����
		System.out.println("use template " + this.getTemplate()+
				"to sened  email, the cotnent is "+this.getContent());
		
	}

}
