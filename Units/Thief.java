package Units;

import java.util.ArrayList;

public class Thief extends Unit {
    //public Thief(String name, ArrayList<Unit> team){
        //super(name, 20, 0.8f, 3, 2, 10);
        //super(name, 20, 0.8f, 3, 2, 10, team);
    public Thief(String name, ArrayList<Unit> team, int x, int y) {
        super(name, 20, 0.8f, 3, 2, 10, team, x, y);
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
    public String getInfo() {
        //return name + " здоровье: " + hp + " удача: " + luck + " скорость: " + speed + " ущерб: " + damage;
        return super.getInfo();
    } 

}
