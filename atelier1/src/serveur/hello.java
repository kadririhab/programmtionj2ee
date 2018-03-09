package serveur;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface hello extends Remote  {
	 public String Sayhello()throws RemoteException ;
}
