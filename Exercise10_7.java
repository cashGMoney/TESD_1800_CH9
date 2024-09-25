// Added Scanner
import java.util.Scanner;

public class Exercise10_7 {
  public static void main(String[] args) {

    // Allow Scanner input
    Scanner input = new Scanner(System.in);

    // Create ten accounts in an array with id 0, 1,..., 9, and initial balance $100.
    // Use constructor Account(int newId, double newBalance) to establish inital balances
    Account[] accounts = new Account[10];
    for (int i = 0; i < accounts.length; i++) {
      accounts[i] = new Account(i, 100);
    }
    
    // The system prompts the user to enter an id.
    while (true) {
      // We use -1 for the variable id because 0 is an actual account id value
      int id = -1;
      while (id < 0 || id > 9) {
        System.out.print("Enter an account ID (0 - 9): ");
        id = input.nextInt();

        // If the id is entered incorrectly, ask the user to enter a correct id.
        if (id < 0 || id > 9) {
          System.out.println("Incorrect id, Please enter a correct id.");
        }
      }

      // Once an id is accepted, the main menu is displayed.
      int selection = 0;
      while (selection != 4) {
        System.out.println("");
        System.out.println("Main menu:");
        System.out.println("1: Check balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
        System.out.print("Enter a choice: ");
        selection = input.nextInt();

        switch (selection) {
          // choice 1 for viewing the current balance (to 2 decimal places)
          case 1:
            System.out.printf("Balance: $%.2f%n", accounts[id].getBalance());
            break;

          // choice 2 for withdrawing money
          case 2:
            System.out.print("Enter an amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            accounts[id].withdraw(withdrawAmount);
            break;

          // choice 3 for depositing money
          case 3:
            System.out.print("Enter an amount to deposit: ");
            double depositAmount = input.nextDouble();
            accounts[id].deposit(depositAmount);
            break;

          // choice 4 for exiting the main menu
          case 4:
            System.out.println("Exiting to account selection");
            break;

          default:
            System.out.println("Incorrect account, Enter an account ID choice between 0 - 9: ");

          // Close the Scanner object
          // Not necessary because the program never ends but it removed my error message
          input.close();
        }
      }
    }
  }
}