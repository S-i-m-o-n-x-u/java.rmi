//	Example for PPT Page No.47

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public static void main(String[] agrs) {
		try {
			MyRemote service = new MyRemoteImpl();
//			Naming.bind("RemoteHello",service);
			Naming.rebind("RemoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public MyRemoteImpl() throws RemoteException {
	}

	public String sayHello() {
		return "Server says, 'Hey'";
	}
}