package Units;

public class Crossbowman extends Shoter{
    public Crossbowman(String name){
        super(name, 20, 0.5f, 2, 2, 2, 50, 0.5f);
    }

    @Override
    public String toString(){
        
        return "Арбалетчик";
    }
    
}