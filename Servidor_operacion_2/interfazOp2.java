package Servidor_operacion_2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfazOp2 extends Remote {

    String esPalindromo(String holis) throws RemoteException;
    
}
