import java.util.List;

/**
 * Created by Juril on 10/18/2016.
 */
public class Cherrybomb extends Plant implements SplashAttacker {
    private int turnCount;

    public Cherrybomb(){
        super(10, 150, 150);
        turnCount = 2;
    }

    public void splashAttack(List<Zombie> defenders){
        if(turnCount == 0){
            for(Character chr : defenders){
                if(chr instanceof Zombie){
                    chr.takeDamage(150);
                }
            }
            takeDamage(150);
            turnCount = 2;
        }
        else{
            turnCount -= 1;
        }
    }
}
