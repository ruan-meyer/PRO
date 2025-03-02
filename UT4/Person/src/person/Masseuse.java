package person;

public class Masseuse extends Person {
    private String degree;
    private int yearsExperience;
    
    public Masseuse(String name, String surnames, int age, int id, String degree, int yearsExperience){
        super(id, name, surnames, age);
        this.degree = degree;
        this.yearsExperience = yearsExperience;
    }
    
    public void giveMassage(){
        
    }
}
