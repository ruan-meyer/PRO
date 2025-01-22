package bankaccount;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String holderName;
    private String holderDNI;
    private int pin;
   
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
        private void setBalance(double value){
            this.balance = this.balance + value;
        }

        public double getBalance(){
            return this.balance;
        }

        private void setHolderName(String value){
            this.holderName = value;
        }
        
        public String getHolderName(){
            return this.holderName;
        }
        
        private void setHolderDNI(String value){
            this.holderDNI = value;
        }
        
        public String getHolderDNI(){
            return this.holderDNI;
        }
        
        private void setPin(int value){
            this.pin = value;
        }
        
        private int getPin(){
            return this.pin;
        }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public BankAccount(){
        Scanner sc = new Scanner(System.in);
        
        //Set name
        System.out.print("Enter the holders name: ");
        setHolderName(sc.nextLine());
        System.out.println("");
        
        //Set and check DNI
        String DNI;
        System.out.print("Enter the holders DNI: ");
        DNI = sc.nextLine();
        System.out.println("");
        while(DNI.length() != 9){
            System.out.print("Invalid DNI, enter again: ");
            DNI = sc.nextLine();
            System.out.println("");
        }
        setHolderDNI(DNI);
        
        //Insert PIN
        System.out.print("Enter the PIN: ");
        setPin(sc.nextInt());
        System.out.println("");
        
        //Final message
        System.out.println("Account created successfully");
    }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Methods">
        public boolean checkPin(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the PIN: ");
            int value = sc.nextInt();
            
            if(getPin() == value){
                return true;
            }
            System.out.println("Invalid PIN");
            return false;
        }
        
        public void changePin(){
            if(!checkPin()){
                return;
            }
            
            Scanner sc = new Scanner(System.in);

            int[] newPin = new int[2];
            System.out.print("Enter the new PIN: ");
            newPin[0] = sc.nextInt();
            System.out.println("");

            System.out.print("Enter the new PIN again: ");
            newPin[1] = sc.nextInt();
            System.out.println("");

            while(newPin[0] != newPin[1]){
                System.out.println("The PINs doesn't match");
                System.out.print("Enter 1 to try again or 2 to exit:");
                int exit = sc.nextInt(); 
                if(exit == 2){
                    return;
                }
                System.out.print("Enter the new PIN: ");
                newPin[0] = sc.nextInt();
                System.out.println("");

                System.out.print("Enter the PIN again: ");
                newPin[1] = sc.nextInt();
                System.out.println("");
            }
            setPin(newPin[0]);
        }
        
        public void deposit(){
            if(!checkPin()){
                return;
            }
                        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount of money to deposit: ");
            double value = sc.nextDouble();
            
            if(value > 0){
                setBalance(getBalance() + value);
                System.out.println("Deposit completed successfully");
                return;
            }
            while(value <= 0){
                System.out.print("Invalid amount, enter the amount again or enter 0 to exit");
                value = sc.nextDouble();
                if(value == 0){
                    System.out.println();
                    return;
                }
                if(value > 0){
                    setBalance(getBalance() + value);
                    System.out.println("Deposit completed successfully");
                    return;
                }
            }
        }
        
        public void withdraw(){
            if(!checkPin()){
                return;
            }
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Balance: " + getBalance() + "€");
            System.out.print("Enter the amount of money to withdraw: ");
            double value = sc.nextDouble();
            
            if(value > 0 && value <= getBalance()){
                setBalance(getBalance() - value);
                System.out.println("Withdraw completed successfully");
                return;
            }
            while(value <= 0 || value >= getBalance()){
                System.out.println("\nBalance: " + getBalance() + "€");
                System.out.print("Invalid amount, enter the amount again or enter 0 to exit");
                if(value == 0){
                    System.out.println();
                    return;
                }
                if(value > 0 && value <= getBalance()){
                    setBalance(getBalance() + value);
                    System.out.println("Withdraw completed successfully");
                    return;
                }
            }
        }
        
        public void changeHolderName(){
            if(!checkPin()){
                return;
            }
                        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the new holders name: ");
            String newName = sc.nextLine();
            setHolderName(newName);
            System.out.println("Name changed successfully");
        }
    //</editor-fold>
}