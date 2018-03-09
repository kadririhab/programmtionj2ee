package client;

import java.rmi.Naming;
import serveur.icompte;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		icompte obj;
		double message;
		try {
			obj=(icompte)Naming.lookup("rmi://localhost:1099/helloserveur");
			message=obj.debiter(2000);
			message=obj.crediter(1000);
			message=obj.liresolde(obj);
			System.out.println(message);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
