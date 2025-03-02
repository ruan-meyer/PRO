package person;

public class FootballPlayer extends Person{
    private int number;
    private String demarcation;
    
    public FootballPlayer(String name, String surnames, int age, int id, int number, String demarcation){
        super(id, name, surnames, age);
        this.number = number;
        this.demarcation = demarcation;
    }
    
    public void playMatch(){
        
    }
    
    public void train(){
        
    }
}