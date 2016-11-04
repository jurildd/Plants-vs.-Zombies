/**
 * Created by Juril on 10/18/2016.
 */
public abstract class Character {
    private int hp;
    private int damage;

    public Character(){
    }

    public Character(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public void attack(Character defender){
        defender.takeDamage(damage);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public int getDamage(){
        return damage;
    }
}
