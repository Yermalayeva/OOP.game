package Units;

public class Monk extends Magican{
    
    public Monk(String name){
        super(name, 20, 0.6f, 1, 2, 20);
    }
    @Override
    public String toString(){
        return "Монах";
    }
}
