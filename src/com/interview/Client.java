package com.interview;

/**
 * ���ǵ��û��Ķ���״̬���º���Ҫ�� email�����ţ�ios/android push notification �ȸ��ַ�ʽȥ֪ͨ���ǡ����� flask ʵ��һ��ͳһ����Ϣ����ƽ̨����������֪ͨ���û�ע��ĸ�����ʽ�ϣ�
1. ��Ҫ�õ����ݿ�Ļ��� �������ѡ��
2. �û�����ע�᲻ͬ��֪ͨ��ʽ����������ֻ��Ҫʵ�� email �ķ���
3. ʹ��ͳһ�Ľӿ�����֪ͨ���������·��ͷ�ʽ������Ҫ�Ķ�̫�� 
4. ����ͬһ����Ϣ�� ��ͬ���ͷ�ʽ��ʹ�ò�ͬ����Ϣģ�塣����Ҫ��Ҫ��Ϣģ��Ĺ�����Ҫ���͵���Ϣ���Ͷ�Ӧ����ǰ������ģ�塣

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
		user.setName("����");
		
		String content = "��ϲ�㶩��֧���ɹ�";
		Message emailMessage = new EmailMessage(content,"email_template.html");
		Message shortMessage = new ShortMessage(content, "sm_template.html");
		
		user.register(emailMessage);
		user.register(shortMessage);
		
		controller.push(user);
		
		
		
	}

}
