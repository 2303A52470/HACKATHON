import java.util.Scanner;

public class InnovationPortal {
    private static boolean isAuthenticated = false;
    private static String userRole = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User Authentication
        authenticateUser(scanner);

        // Step 2: Data Collection
        if (isAuthenticated) {
            collectData(scanner);
            
            // Step 3: Data Processing & Storage
            processData();

            // Step 4: Data Analysis & Visualization
            analyzeData();

            // Step 5: Recognition & Feedback
            recognizeInnovation();

            // Step 6: Decision-Making & Reporting
            generateReports();
        }

        System.out.println("\nThank you for using the Innovation Excellence Portal!");
        scanner.close();
    }

    // Step 1: User Authentication
    private static void authenticateUser(Scanner scanner) {
        System.out.println("Welcome to the Innovation Excellence Indicators Portal.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Simulating authentication (In real applications, validate from DB)
        if (username.equals("admin") && password.equals("password123")) {
            isAuthenticated = true;
            userRole = "Administrator";
            System.out.println("Authentication Successful! Role: " + userRole);
        } else {
            System.out.println("Authentication Failed! Exiting system...");
        }
    }

    // Step 2: Data Collection
    private static void collectData(Scanner scanner) {
        System.out.println("\n[Data Collection] Enter the number of research projects completed:");
        int projects = scanner.nextInt();
        System.out.println("Enter the number of patents filed:");
        int patents = scanner.nextInt();
        System.out.println("Enter the number of awards won:");
        int awards = scanner.nextInt();

        System.out.println("\nData Collected Successfully!");
    }

    // Step 3: Data Processing & Storage (Simulation)
    private static void processData() {
        System.out.println("\n[Processing Data] Storing information securely in the database...");
        System.out.println("Data processing complete!");
    }

    // Step 4: Data Analysis & Visualization (Simulation)
    private static void analyzeData() {
        System.out.println("\n[Data Analysis] Generating reports and visual insights...");
        System.out.println("Trend Analysis: Increase in innovation contributions by 20% this year!");
    }

    // Step 5: Recognition & Feedback
    private static void recognizeInnovation() {
        System.out.println("\n[Recognition] Highlighting top innovators...");
        System.out.println("Awarding certificates to best-performing researchers and faculty.");
    }

    // Step 6: Decision-Making & Reporting
    private static void generateReports() {
        System.out.println("\n[Reporting] Generating strategic reports for management...");
        System.out.println("Report generated successfully! Ready for review.");
    }
}
