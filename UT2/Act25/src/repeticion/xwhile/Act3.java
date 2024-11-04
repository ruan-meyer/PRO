package repeticion.xwhile;

public class Act3{
    public static void main(String[] args){
       int number = 47;
       while(number >= 5){
           if(primeNumber(number)){
               System.out.println(number);
           }
           number--;
       }
    }
    
    public static boolean primeNumber(int number){
        if(number == 1) {
            return false;
        } else if(number == 2){
            return true;
        } else {
            for(int i = 2; i < number; i++){
                if(number % i == 0f){
                    return false;
                }
            }
            return true;
        }
    }
}