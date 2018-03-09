package client;
import java.rmi.Naming;
import serveur.hello;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello obj;
		String message;
		try {
			obj=(hello)Naming.lookup("rmi://localhost:1099/helloserveur");
			message=obj.Sayhello();
			System.out.println(message);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
