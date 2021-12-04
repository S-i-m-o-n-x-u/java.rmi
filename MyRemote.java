//	Example for PPT Page No.47

import java.rmi.*;

public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}