package Units;

public class Spearman extends Unit {
    public Spearman(String name){
        super(name, 30, 0.6f, 2, 4);
    }
    @Override
    public String toString(){
        return "Копейщик";
    }
    @Override
    public void step() {
        
    }
    @Override
    public String getInfo() {
        return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage;
    }
    
}
