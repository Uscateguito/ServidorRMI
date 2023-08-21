package Servidor_operacion_2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class impleInterfazOp2 extends UnicastRemoteObject implements interfazOp2{

    protected impleInterfazOp2() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String esPalindromo(String palabra) throws RemoteException {

        System.out.println("Palabra recibida: " + palabra);

        int posicionInicial = 0;
        int posicionFinal = palabra.length() - 1;

        while (posicionInicial <= posicionFinal) {
            if (palabra.charAt(posicionInicial) != palabra.charAt(posicionFinal)) {
                return "false";
            }
            posicionInicial++;
            posicionFinal--;
        }
        return "true";
    }

    public static void main(String[] args) {

        try {
            interfazOp2 remoteService = new impleInterfazOp2();
            Naming.rebind("operacion2", remoteService);
            System.out.println("Server Op 2 is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
