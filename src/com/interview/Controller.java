package com.interview;

import java.util.Iterator;

/**
 * ������Ϣ�Ŀ�����
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
