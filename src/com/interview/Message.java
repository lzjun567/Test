package com.interview;

/**
 * ��Ϣ������
 * @author liuzhijun
 *
 */
public abstract class Message {
	
	private String content;  //��Ϣ����
	private String template; //ģ��·��
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
	 * ����ķ��ͷ�ʽ������ʵ��
	 * @param user
	 */
	public abstract void send();

}
