package com.interview;

import java.util.Iterator;

/**
 * 发送消息的控制器
 * @author liuzhijun
 *
 */
public class Controller {

	public void push(User user){
		
		Iterator<Message> iter = user.getMessages().iterator();
		while(iter.hasNext()){
			iter.next().send();
		}
	}

}
