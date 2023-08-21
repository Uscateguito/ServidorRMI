package ServerCalculo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionServer extends UnicastRemoteObject implements interfazServer{

    protected ImplementacionServer() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    public String saludo(String holis) throws RemoteException {


        return "Hola " + holis;
    }

    public static void main(String[] args) {

        try {
            interfazServer remoteService = new ImplementacionServer();
            Naming.rebind("Calculo", remoteService);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
