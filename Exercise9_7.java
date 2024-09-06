// Needed import to collect a date
import java.time.LocalDate;

public class Exercise9_2 {
  public static void main(String[] args) {

    // Create the Account object class.
    class Account {

      // A private int data field named id for the account (default 0).
      private int id = 0;

      // A private double data field named balance for the account (default 0).
      private double balance = 0;

      // A private double data field named annualInterestRate that stores the current interest rate (default 0). 
      // Assume all accounts have the same interest rate.
      private double annualInterestRate = 0;

      // A private Date data field named dateCreated that stores the date when the account was created.
      private LocalDate dateCreated = LocalDate.now();

      // A no-arg constructor that creates a default account.
      Account() {
      }

      // A constructor that creates an account with the specified id and initial balance.
      Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
      }

      // The accessor and mutator methods for id, balance, and annualInterestRate.
      public int getId() {
        return id;
      }
      public void setId(int newId) {
        id = newId;
      }

      public double getBalance() {
        return balance;
      }
      public void setBalance(double newBalance) {
        balance = newBalance;
      }

      public double getAnnualInterestRate() {
        return annualInterestRate;
      }
      public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
      }

      // The accessor method for dateCreated.
      public LocalDate getDateCreated() {
        return dateCreated;
      }

      // A method named getMonthlyInterestRate() that returns the monthly interest rate.
      // monthlyInterestRate is annualInterestRate / 12.
      // Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
      double getMonthlyInterestRate() {
        return (annualInterestRate/12)/100;
      }

      // A method named getMonthlyInterest() that returns the monthly interest.
      // Monthly interest is balance * monthlyInterestRate.
      double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
      }

      // A method named withdraw() that withdraws a specified amount from the account.
      public void withdraw(double amount) {
        setBalance(balance - amount);
      }

      // A method named deposit() that deposits a specified amount to the account.
      public void deposit(double amount) {
        setBalance(balance + amount);
      }
    }
    
    // Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, 
    Account account1112 = new Account(1112, 20000);

    // An annual interest rate of 4.5%. 
    account1112.setAnnualInterestRate(4.5);

    // Use the withdraw method to withdraw $2,500,
    account1112.withdraw(2500);

    // Use the deposit method to deposit $3,000,
    account1112.deposit(3000); 

    // Print the balance, the monthly interest, and the date when this account was created.
    // Formated balance and Monthly interest to represent currency with 2 decimal places
    System.out.printf("Balance: $%.2f%n", account1112.getBalance());
    System.out.printf("Monthly Interest: $%.2f%n", account1112.getMonthlyInterest());
    System.out.println("Date Created: " + account1112.getDateCreated());
  }
}