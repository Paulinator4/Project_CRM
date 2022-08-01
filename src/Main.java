Skip to content
        Search or jump to…
        Pull requests
        Issues
        Marketplace
        Explore

@Paulinator4 
Paulinator4
        /
        CRM_Project_2
        Public
        Code
        Issues
        Pull requests
        Actions
        Projects
        Wiki
        Security
        Insights
        Settings
        CRM_Project_2/src/Main.java /
@Paulinator4
Paulinator4 Initial commit
        Latest commit ddb354b 15 minutes ago
        History
        1 contributor
        32 lines (23 sloc)  728 Bytes

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> clients = new ArrayList<String>();

        System.out.println("1. Dodaj klienta");
        System.out.println("2. Wyświetl klientów");

        String scan = scanner.nextLine();


        switch (scan) {
            case "1":
                System.out.println("1");
                Client.addClient();
                break;
            case "2":
//                Client.displayClients();
                break;
            default:
                throw new IllegalArgumentException();
        }

    }

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