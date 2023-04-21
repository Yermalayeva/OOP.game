package Units;

public class Thief extends Unit {
    public Thief(String name){
        super(name, 20, 0.8f, 3, 2);
    }

    @Override
    public String toString(){
        return "Разбойник";
    }

    void dodge(){

    }

    void steaith(){

    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage;
    } 

}
