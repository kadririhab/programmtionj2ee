package serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
class compteimp extends UnicastRemoteObject implements icompte{
 private double s;
	public compteimp()  throws RemoteException{
		super ();
	public void debiter(double s)throws RemoteException{
	Scanner sc = new Scanner(System.in);
	 System.out.println("Veuillez saisir un entier :");
	 double nb = sc.nextInt();
	 s=s-nb;
	 System.out.println("Vous avez solde : " + s);
	}
	public void crediter (double s)throws RemoteException{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez saisir un entier :");
		 double nb = sc.nextInt();
		 s=s+nb;
		 System.out.println("Vous avez solde : " + s);
		 
		}
	public void liresolde (double s) throws RemoteException{
		 System.out.println("Vous avez solde : " + s);
	}
	}


	

}
