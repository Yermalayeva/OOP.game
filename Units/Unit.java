package Units;

public class Unit {
    protected String name;
    protected float hp;
    protected float luck;
    protected int speed;
    protected int damage;
    
    Unit(String name, float hp, float luck, int speed, int damage){
        this.name = name;
        this.hp = hp;
        this.luck = luck;
        this.speed = speed;
        this.damage = damage;


    }
    void attack(){

    }
    void await(){

    }
    void defend(){

    }
    void walk(){

    }
    void dead(){

    }
    public char[] getInfo() {
        return null;
    }
    
}
