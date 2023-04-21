package Units;

public abstract class Shoter extends Unit{
    protected int distance, maxCountBullet,currentCountBullet;
    protected float accuracy;

    Shoter(String name,float hp, float luck, int speed, int damage, int distance, int maxCountBullet, float accuracy){
        super(name, hp, luck, speed, damage);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = maxCountBullet;
        this.accuracy = accuracy;

    }
    void shoot(){

    }
    
}
