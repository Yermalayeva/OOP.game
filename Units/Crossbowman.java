package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{
    public Crossbowman(String name, ArrayList<Unit> team1){
        super(name, 20, 0.5f, 4, 2, 2, 50, 0.5f, 10, team);
    }

    @Override
    public String toString(){
        return "Арбалетчик";
    }

    

    @Override
    public String getInfo() {
        //return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage + 
        //" расстояние: " + distance + " максимальное кол-во: " + maxCountBullet + " точность: " + accuracy;
        return super.getInfo();
    } 
}
