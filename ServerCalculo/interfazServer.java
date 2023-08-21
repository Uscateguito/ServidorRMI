package ServerCalculo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfazServer extends Remote {

    String esPalindromo(String mensaje) throws RemoteException;
    String ordenarCaracteres(String mensaje) throws RemoteException;
    
}
