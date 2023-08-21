package Cliente;

import java.rmi.Naming;

import ServerCalculo.interfazServer;

public class Cliente {
     public static void main(String[] args) {
        try {
            interfazServer remoteService = (interfazServer) Naming.lookup("rmi://localhost/Calculo");
            String message = "Camilito";
            String transformedMessage = remoteService.saludo(message);
            System.out.println("Transformed message: " + transformedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
