package bankaccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BankAccount[] accounts = new BankAccount[500];
        int numberAccounts = 0;
        
        while(true){
            int opt = 0;
            System.out.println("""
                               Welcome to Maze Bank 
                               What would you like to do? 
                               
                               1 - Create a new account 
                               2 - Log in into an existent account
                               3 - Exit """);
            System.out.print("Enter your option [1-3]: ");
            opt = sc.nextInt();
            
            switch(opt){
                case 1:
                   accounts[numberAccounts] = createAccount();
                case 2:
                    System.out.print("Enter your DNI: ");
                    String dni = sc.next();
                    // IMPLEMENT WARN ABOUT INEXISTENT ACCOUNT
                    for (int i = 0; i <= accounts.length; i++){
                        if(dni.equals(accounts[i].getHolderDNI())){
                            if(accounts[i].checkPin()){
                                accountMenu(accounts[i]);
                            } else {
                                System.out.print("Wrong PIN, press 1 to try again or 2 to exit");
                                int exit = sc.nextInt();
                                while(exit == 1){
                                    if(accounts[i].checkPin()){
                                        accountMenu(accounts[i]);
                                        break;
                                    }
                                    System.out.print("Wrong PIN, press 1 to try again or 2 to exit");
                                    exit = sc.nextInt();
                                }
                            }
                        }
                    }
                case 3:
            }
        }  
    }
    
    public static BankAccount createAccount(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating an account...");
        System.out.println(" ");
        BankAccount acc = new BankAccount();
        System.out.print("Press any key to move forward:");
        sc.next();
        Utils.clearScreen();
        
        return acc;
    }
    
    public static void accountMenu(BankAccount acc){
        Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        while(opt != 6){
            System.out.println("Hello, " + acc.getHolderName() + "!");
            System.out.println("""
                               Welcome to Maze Bank 
                               What would you like to do? 
                               
                               1 - See balance 
                               2 - Deposit 
                               3 - Withdraw 
                               4 - Change holders name 
                               5 - Change PIN 
                               6 - Exit""");
            
            System.out.print("Enter your option [1-6]: ");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    Utils.clearScreen();
                    System.out.print("Balance: " + acc.getBalance() + "\u20ac");
                    System.out.println();
                    break;
                case 2:
                    Utils.clearScreen();
                    acc.deposit();
                    break;
                case 3:
                    Utils.clearScreen();
                    acc.withdraw();
                    break;
                case 4:
                    Utils.clearScreen();
                    acc.changeHolderName();
                    break;
                case 5:
                    Utils.clearScreen();
                    acc.changePin();
                    break;
            }
            
            if(opt == 6){
                System.out.println();
                break;
            }
            System.out.print("Press any key to move forward: ");
            sc.next();
            Utils.clearScreen();
        }
        System.out.println("Thank you for using Maze Bank services!");
    }
}
