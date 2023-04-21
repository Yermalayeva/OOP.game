package Units;

public class Monk extends Magican{
    
    public Monk(String name){
        super(name, 20, 0.6f, 1, 2, 20);
        this.spiritualety = 200;
    }
    protected int spiritualety;

    public void heal(){
//духовность
    }

    public void resurrect(){
//воскрешение
    }
    @Override
    public String toString(){
        return "Монах";
    }
}
