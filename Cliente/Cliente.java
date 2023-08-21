package Cliente;

import java.rmi.Naming;
import java.util.Scanner;

import ServerCalculo.interfazServer;

public class Cliente {
    public static void main(String[] args) {
        try {
            interfazServer remoteService = (interfazServer) Naming.lookup("rmi://localhost/Calculo");
            Scanner cin = new Scanner(System.in);
            String message = cin.nextLine();

            while (!message.equalsIgnoreCase("salir")) {

                System.out.println("¿Es palindromo?: " + remoteService.esPalindromo(message));
                System.out.println("Palabra ordenada: " + remoteService.ordenarCaracteres(message));
                message = cin.nextLine();
            }

            cin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
