package Units;

import java.util.ArrayList;

public abstract class Unit implements GameInterface{
    protected String name;
    protected float maxHp, currentHp, luck;
    protected static float armor;
    protected int attack;
    public int speed;
    protected static ArrayList<Unit> team;
    
    Unit(String name, float hp, float luck, int speed, int damage, float armor){
        this.name = name;
        this.maxHp = hp;
        this.currentHp = maxHp;
        this.luck = luck;
        this.speed = speed;
        this.attack = attack;
        this.armor = armor;
        this.team = team;
    }
    
        void attack(){

    }
    void await(){

    }
    void defend(){

    }
    void die(){

    }
    public void getDmage(float damage){
        this.currentHp -= damage;
        if (this.currentHp > this.maxHp) {
            this.currentHp = this.maxHp;
        }
        if (this.currentHp < 0) {
            this.currentHp = 0;
        }
    }
    @Override
    public String getInfo(){
        return "[" + name + " " + toString() + "] hp:" + 
        currentHp + "/" + maxHp + " luck:" + luck 
        + " speed:" + speed + " attack:" + attack
        + " armor:" + armor;
    }
    @Override
    public void step(){
        System.out.println(getClass().getName());
    }
    
}
