package Servidor_Operacion_3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazOp3 extends Remote {

    String ordenarPalabra(String mensaje) throws RemoteException;
}
