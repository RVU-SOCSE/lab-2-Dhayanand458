import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        String validUser = "admin";
        String validPass = "1234";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== LOGIN TEST CASES =====");
        
        System.out.println("\n--- Automated Test Cases ---");
        checkLogin("admin", "1234", validUser, validPass);
        checkLogin("admin", "1111", validUser, validPass);
        checkLogin("user", "1234", validUser, validPass);
        checkLogin("ramya", "1234", validUser, validPass);
        checkLogin("admin", "", validUser, validPass);
        
        System.out.println("\n--- User Login Input ---");
        System.out.println("Valid Username: " + validUser);
        System.out.println("Valid Password: " + validPass);
        
        System.out.print("\nEnter Username: ");
        String userInput = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String passInput = scanner.nextLine();
        
        System.out.println("\n--- Login Verification ---");
        checkLogin(userInput, passInput, validUser, validPass);
        
        scanner.close();
    }
    
    static void checkLogin(String user, String pass, String validUser, String validPass) {
        if (user.equals(validUser) && pass.equals(validPass)) {
            System.out.println("✓ Login Successful");
        } else if (user.isEmpty() || pass.isEmpty()) {
            System.out.println("✗ Error: Empty field");
        } else {
            System.out.println("✗ Login Failed - Invalid credentials");
        }
    }
}
