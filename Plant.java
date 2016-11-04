/**
 * Created by Juril on 10/18/2016.
 */
public abstract class Plant extends Character {
    private int sunlightCost;

    public Plant(int hp, int attack, int sunlightCost){
        super(hp, attack);
        this.sunlightCost = getSunlightCost();
    }

    public int getSunlightCost(){
        return sunlightCost;
    }
}
