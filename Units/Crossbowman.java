package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter{
    //public Crossbowman(String name, ArrayList<Unit> team1){
        //super(name, 20, 0.5f, 4, 2, 2, 50, 0.5f, 10, team);
    public Crossbowman(String name, ArrayList<Unit> team, int x, int y) {
        super(name, 20, 0.5f, 4, 2, 2, 50, 0.5f, 10, team, x, y);  
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


    @Override
    public void step(ArrayList<Unit> enemy) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }


    @Override
    public String introduce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'introduce'");
    } 
}
