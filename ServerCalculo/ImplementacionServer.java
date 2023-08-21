package ServerCalculo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Servidor_Operacion_3.InterfazOp3;
import Servidor_operacion_2.interfazOp2;

public class ImplementacionServer extends UnicastRemoteObject implements interfazServer {

    protected ImplementacionServer() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    public String esPalindromo(String mensaje) throws RemoteException {

        try {
            interfazOp2 remoteService1 = (interfazOp2) Naming.lookup("rmi://localhost/operacion2");
            return remoteService1.esPalindromo(mensaje);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String ordenarCaracteres(String mensaje) throws RemoteException {
        
        // Cambiar todo esto
        try {
            InterfazOp3 remoteService2 = (InterfazOp3) Naming.lookup("rmi://localhost/operacion3");
            return remoteService2.ordenarPalabra(mensaje);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;

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
