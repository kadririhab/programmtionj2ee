package serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class helloimp extends UnicastRemoteObject implements hello {

	public helloimp()  throws RemoteException{
		super ();
		
	}
 public String Sayhello()throws RemoteException {
	 return "hello dsi";
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
