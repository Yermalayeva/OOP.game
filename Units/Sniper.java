package Units;

public class Sniper extends Shoter {
    public Sniper(String name){
        super(name, 20, 0.6f, 2, 4, 5, 10, 0.5f);
    }
    @Override
    public String toString(){
        return "Снайпер";
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

