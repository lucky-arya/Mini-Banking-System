import java.util.*;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Succesfully.");
            System.out.println("New Balance is : " + balance);
        } else {
            System.out.println("Please Enter a Valid amount to Deposit.");
        }
    }

    public void Withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Invalid ! or Insufficeint Balance.");
        }
    }

    public void DisplayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }
}
class BankingSystem{
    private ArrayList<Account>  accounts=new ArrayList<>();
    private int nextAccountNumber=1001;

    public void createAccount(String Name,double intialAmount){
        Account account = new Account(nextAccountNumber++,Name,intialAmount);
        accounts.add(account);
        System.out.println("Welcome To ChorBank.");
        System.out.println("Account Created Successfully.");
        System.out.println("Your Account Number is : "+account.getAccountNumber());

    } 
    public Account FindAccouncts(int accountNumber){
        for(Account account:accounts){
            if(account.getAccountNumber()==accountNumber){
                return account;
            }
        }
        return null;
    }
    public void depositMoney(int accountNumber,double amount){
        Account account=FindAccouncts(accountNumber);
        if(account!=null){
            account.Deposit(amount);
        }else{
            System.out.println("Account Not Found.");
        }
    }
    public void withdraMoney(int accountNumber,double amount){
        Account account=FindAccouncts(accountNumber);
        if(account!=null){
            account.Withdraw(amount);
        }else{
            System.out.println("Account Not Found.");
        }
    }
    public void transferMoney(int fromAccount, int toAccount,double amount){
        Account sender=FindAccouncts(fromAccount);
        Account reciever=FindAccouncts(toAccount);
        if(sender != null && reciever !=null){
            if(sender.getBalance()>=amount){
                sender.Withdraw(amount);
                reciever.Deposit(amount);
                System.out.println("Amount Transfer Successful.");
            }else{
                System.out.println("Insufficient Funds in the Sender's Account.");
            }
        }else{
            System.out.println(" Opps! One of Both Account Is Not Found!");
        }

    }
    public void displayAccount(int accountNumber){
        Account account=FindAccouncts(accountNumber);
        if(account!=null){
            System.out.println("Accounts Details Are : ");
            account.DisplayAccountDetails();
        }else{
            System.out.println("Account Not Found.");
        }
    }
}
public class MiniBankingSystem {

    public static void main(String[] args) {
        BankingSystem bank=new BankingSystem();
        Scanner scn=new Scanner(System.in);

        while(true){
            System.out.println( "\n=== Mini Banking System ===\"");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice=scn.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Enter Account Holder's Name : ");
                    scn.nextLine();
                    String name=scn.nextLine();
                    System.out.println("Enter Initial Deposit Amount : ");
                    double initialDeposit=scn.nextDouble();
                    bank.createAccount(name, initialDeposit);
                    break;
                case 2:
                    System.out.println("Enter Account Number : ");
                    int accountNumber=scn.nextInt();
                    System.out.println("Enter the Deposit Amount : ");
                    double depositAmount=scn.nextDouble();
                    bank.depositMoney(accountNumber, depositAmount);
                    break;
                case 3: 
                    System.out.println("Enter Account Number : ");
                    accountNumber=scn.nextInt();
                    System.out.println("Enter the Withdrawal Amount : ");
                    double WithdrawAmount=scn.nextDouble();
                    bank.withdraMoney(accountNumber, WithdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter Sender's Account : ");
                    int fromAccount=scn.nextInt();
                    System.out.println("Enter Reciever's Account : ");
                    int toAccount=scn.nextInt();
                    System.out.println("Enter Amount to Tarnsfer : ");
                    int transferAmount=scn.nextInt();
                    bank.transferMoney(fromAccount, toAccount, transferAmount);
                    break;
                case 5:
                    System.out.println("Enter Account Number : ");
                    accountNumber=scn.nextInt();
                    bank.displayAccount(accountNumber);
                    break;
                case 6:
                    System.out.println("Thank you for using Our ChorBank Services. Goodbye!");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }
    }
}
