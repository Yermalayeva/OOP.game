package Units;

import java.util.ArrayList;

public class XBowMan extends Shooter{
    public XBowMan(String name, ArrayList<Unit> team){
        super(name, 20, 0.6f, 2, 4, 5, 10, 0.5f, 50, team);
    }
    @Override
    public String toString(){
        return "Стрелок";
    }
    @Override
    public void step() {
        
    }
    @Override
    public String getInfo() {
        //return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage + 
        //" расстояние: " + distance + " максимальное кол-во: " + maxCountBullet + " точность: " + accuracy;
        return super.getInfo();
    }
}
