package serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class serveur {

	public serveur() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(1099);
			helloimp obj= new helloimp();
			Naming.rebind("rmi://localhost:1099/helloserveur", obj);
			System.out.println(obj.toString());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		

}
