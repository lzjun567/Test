package com.interview;

import java.util.HashSet;

public class User {
	
	private String name;
	private HashSet<Message> messages = new HashSet<Message>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<Message> getMessages() {
		return messages;
	}
	
	/**
	 * �û�ע����Ϣ����
	 * @param message
	 */
	public void register(Message message){
		messages.add(message);
	}
}
