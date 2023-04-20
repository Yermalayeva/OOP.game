package Units;

public class Magican extends Unit{
    protected float mana;
    Magican(String name, float hp, float luck, int speed, int damage, float mana){
        super(name, hp, luck, speed, damage);
        this.mana = mana;
    }
    void Heal(){

    }
}
