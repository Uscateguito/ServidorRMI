package ServerCalculo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfazServer extends Remote {

    String saludo(String holis) throws RemoteException;
    
}
