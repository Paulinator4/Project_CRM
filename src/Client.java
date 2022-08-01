import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public abstract class Client {
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


    public static void addClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String inputName = scanner.nextLine();
//        System.out.println("podaj pesel");
//        String inputPesel = scanner.nextLine();
//        System.out.println("podaj telefon");
//        String inputPhone = scanner.nextLine();
//        System.out.println("podaj email");
//        String inputEmail = scanner.nextLine();
        List<String> clients = new ArrayList<>();
        clients.add(inputName);
        System.out.println("clients = " + clients);
        for (String client : clients) {
            System.out.println(client);
        }


    }
//    public static void displayClients(){
//        for (Client client : clients){
//            System.out.println("jsdfkjs");
//        }
//
//
//    }


}
Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms
        Privacy
        Security
        Status
        Docs
        Contact GitHub
        Pricing
        API
        Training
        Blog
        About
        You have no unread notifications