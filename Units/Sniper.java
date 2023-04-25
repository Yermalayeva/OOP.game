package Units;

import java.util.ArrayList;
public class Sniper extends Shooter {
    public Sniper(String name, ArrayList<Unit> team){
        super(name, 20, 0.6f, 4, 4, 5, 10, 0.5f, 5, team);
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

        //return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage + 
        //" расстояние: " + distance + " максимальное кол-во: " + maxCountBullet + " точность: " + accuracy;
        return super.getInfo();
    }
    
}

