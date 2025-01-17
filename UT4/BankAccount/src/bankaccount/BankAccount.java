package bankaccount;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String holderName;
    private String holderDNI;
    private int pin;
   
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
        private void setBalance(double value){
            balance = balance + value;
        }

        public double getBalance(){
            return balance;
        }

        private void setHolderName(String value){
            holderName = value;
        }
        
        public String getHolderName(){
            return holderName;
        }
        
        private void setHolderDNI(String value){
            holderDNI = value;
        }
        
        public String getHolderDNI(){
            return holderDNI;
        }
        
        private void setPin(int value){
            pin = value;
        }
        
        private int getPin(){
            return pin;
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
    }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Methods">
        public boolean checkPin(int value){
            if(getPin() == value){
                return true;
            } 
            return false;
        }
        
        public void changePin(){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the new PIN: ");
            
        }
    //</editor-fold>
}
