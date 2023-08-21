package Servidor_operacion_2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ServerCalculo.ImplementacionServer;
import ServerCalculo.interfazServer;

public class impleInterfazOp2 extends UnicastRemoteObject implements interfazOp2{

    protected impleInterfazOp2() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String saludo(String holis) throws RemoteException {
        // TODO Auto-generated method stub
        return "qué sucede mis brosss";
    }

    public static void main(String[] args) {

        try {
            interfazOp2 remoteService = new impleInterfazOp2();
            Naming.rebind("operacion1", remoteService);
            System.out.println("Server Op1 is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
