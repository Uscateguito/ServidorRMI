package Servidor_Operacion_3;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ImplemeInterfazOp3 extends UnicastRemoteObject implements InterfazOp3 {

    protected ImplemeInterfazOp3() throws RemoteException {
        super();
    }

    @Override
    public String ordenarPalabra(String mensaje) throws RemoteException {

        return ordenarPalabrasMenorAMayor(mensaje);
    }

    public static String ordenarPalabrasMenorAMayor(String palabra) {

        String solucion = "";

        // Convierto el string en un arreglo de caracteres dinámico

        List<Character> palabraenArray = new ArrayList<Character>();

        for (char c : palabra.toCharArray()) {
            palabraenArray.add(c);
        }

        palabraenArray.sort(null);

        for (char c : palabraenArray) {
            solucion += c;
        }

        System.out.println("Palabra ordenada: " + solucion);

        return solucion;
    }

    public static void main(String[] args) {
            
            try {
                InterfazOp3 remoteService = new ImplemeInterfazOp3();
                Naming.rebind("operacion3", remoteService);
                System.out.println("Server Op 3 is ready.");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
