// Needed import to collect a date
import java.time.LocalDate;

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
      setBalance(balance -= amount);
    }

    // A method named deposit() that deposits a specified amount to the account.
    public void deposit(double amount) {
      setBalance(balance += amount);
    }
}