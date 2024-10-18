package repeticion.dowhile;

public class Act4{
    public static void main(String[] args){
        int number = 1;
        do{
            if(mutiple(number, 3)){
                System.out.println(number);
            }
            number++;
        } while(number <= 50);
    }
    
    public static boolean mutiple(int number, int divisor){
        if(number % divisor == 0){
            return true;
        } else {
            return false;
        }
    }
}