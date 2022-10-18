import java.util.Scanner;

public class BankApplication{

    double accountBalance;
    int customerID;
    String customerName;
    int previousTransaction;


    public BankApplication(double balance,int ID,String name){
        accountBalance = balance;
        customerID = ID;
        customerName = name;

    }

    public void accountBalance(){
        System.out.println("Balance : " + accountBalance);
    }

    public void depositAmount(int amount){
        accountBalance = accountBalance + amount;
        previousTransaction = amount;
        System.out.println("Deposited : " + amount);

    }
    public void WithdrawAmount(int amount){
        accountBalance = accountBalance -amount;
        previousTransaction = -amount;
        System.out.println("withdrawn : " + amount);
    }

    public void previousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Previous Transaction ");
            System.out.println("Deposited : " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Previous Transaction ");
            System.out.println("Withdrawn : " + previousTransaction);
        }
        else{
            System.out.println("No Previous Transaction");
        }
    }

    public void menuMethod(){

        char option ;
        Scanner input = new Scanner(System.in);

        System.out.println("====================================================================");
        System.out.println("Welcome to Main Menu " + customerName);
        System.out.println();
        System.out.println("Customer ID " + customerID);
        System.out.println("====================================================================");
        System.out.println("A. Account Balance");
        System.out.println("B. Deposit Amount ");
        System.out.println("C. Withdraw Amount ");
        System.out.println("D. Previous Transaction ");
        System.out.println("E. Exit ");


        do{

            System.out.println("====================================================================");
            System.out.println("Enter an Option to proceed with transaction");
            System.out.println("====================================================================");
            option = input.next().charAt(0);
            System.out.println();

            switch (option){
                case 'A':
                    accountBalance();
                break;
                case 'B':
                    System.out.println("Please enter amount to be deposited");
                    int amount = input.nextInt();
                    depositAmount(amount);
                break;
                case 'C':
                    System.out.println("Please enter amount to be withdrawn");
                    int amount2 = input.nextInt();
                    WithdrawAmount(amount2);
                break;
                case 'D':
                    previousTransaction();
                break;
                case 'E':
                    System.out.println("====================================================================");
                break;
                default:
                    System.out.println("Invalid option, please enter a option to proceed");
                break;

            }


        }while (option != 'E');{
            System.out.println("Thank you for banking with us");
        }



    }


    public static void main(String[] args){

        BankApplication customer1 = new BankApplication(5000.23,1993809,"jaffar");
        customer1.menuMethod();


    }


}