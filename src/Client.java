import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    String name;
    String pesel;
    String phone;
    String email;

    Client(String name, String pesel, String phone, String email) {
        this.name = name;
        this.pesel = pesel;
        this.phone = phone;
        this.email = email;
    }

    private static List<Client> clients = new ArrayList<>();

    public static void addClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String inputName = scanner.nextLine();
        System.out.println("podaj pesel");
        String inputPesel = scanner.nextLine();
        System.out.println("podaj telefon");
        String inputPhone = scanner.nextLine();
        System.out.println("podaj email");
        String inputEmail = scanner.nextLine();
        Client inputClient = new Client(inputName, inputPesel, inputPhone, inputEmail);
        clients.add(inputClient);


    }

    public static void getClients() {


        for (int i = 0; clients.size() > i; i++) {

            System.out.println(clients.get(i).name);
            System.out.println(clients.get(i).pesel);
            System.out.println(clients.get(i).phone);
            System.out.println(clients.get(i).email);


        }

    }
}