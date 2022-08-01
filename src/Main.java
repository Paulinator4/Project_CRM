import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Client> clients = new ArrayList<>();

        while (true) {

            System.out.println("1. Dodaj klienta");
            System.out.println("2. Wyświetl klientów");

            String scan = scanner.nextLine();


            switch (scan) {
                case "1":
                    System.out.println("1");
                    Client.addClient();
                    break;
                case "2":
                    Client.getClients();
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        }
    }
}