//	Example for PPT Page No.47

import java.rmi.*;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
			MyRemote service=(MyRemote)Naming.lookup("RemoteHello");
			String s=service.sayHello();
			System.out.println(s);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}