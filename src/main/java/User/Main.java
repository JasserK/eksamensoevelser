package User;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        User user = new User("John Smith");

        System.out.println("Full name: " + user.getFullName());
        System.out.println("Generated UserID: " + user.getUserID());

        if (user.validUserID()) {
            System.out.println("UserID is valid.");
        } else {
            System.out.println("UserID is not valid.");
        }
    }
}
