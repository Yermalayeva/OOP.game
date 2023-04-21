package Units;

public class Crossbowman extends Shoter{
    public Crossbowman(String name){
        super(name, 20, 0.5f, 2, 2, 2, 50, 0.5f);
    }

    @Override
    public String toString(){
        return "Арбалетчик";
    }

    @Override
    public void step() {
        
    }

    @Override
    public String getInfo() {
        return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage + 
        " расстояние: " + distance + " максимальное кол-во: " + maxCountBullet + " точность: " + accuracy;
    }
    
}
