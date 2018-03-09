package serveur;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface icompte extends Remote  {
	
	 public void crediter(double s) throws RemoteException;
	 public double liresolde(double s) throws RemoteException;
	void debiter (double s) throws RemoteException;
	 }



