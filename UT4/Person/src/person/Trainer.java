package person;

public class Trainer extends Person{
    private String idFederation;
    
    public Trainer(String name, String surnames, int age, int id, String idFederation){
        super(id, name, surnames, age);
        this.idFederation = idFederation;
    }
    
    public void leadMatch(){
        
    }
    
    public void leadTrain(){
        
    }
}
