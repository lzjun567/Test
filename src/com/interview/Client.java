package com.interview;

/**
 * 我们的用户的订单状态更新后，需要用 email，短信，ios/android push notification 等各种方式去通知他们。请用 flask 实现一个统一的信息推送平台，并且推送通知到用户注册的各个方式上：
1. 需要用到数据库的话， 可以随便选择
2. 用户可以注册不同的通知方式，测试里面只需要实现 email 的发送
3. 使用统一的接口推送通知，如果添加新发送方式，不需要改动太多 
4. 对于同一条信息， 不同推送方式会使用不同的消息模板。所以要需要消息模板的管理。需要发送的消息类型都应该提前创建好模板。

 * @author liuzhijun
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		User user = new User();
		user.setName("张三");
		
		String content = "恭喜你订单支付成功";
		Message emailMessage = new EmailMessage(content,"email_template.html");
		Message shortMessage = new ShortMessage(content, "sm_template.html");
		
		user.register(emailMessage);
		user.register(shortMessage);
		
		controller.push(user);
		
		
		
	}

}
