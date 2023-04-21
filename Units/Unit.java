package Units;

public abstract class Unit implements GameInterface{
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
    
}
