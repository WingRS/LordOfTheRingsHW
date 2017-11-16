import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by StasMaster on 30.10.17.
 */
public class King extends Character  {

    private KickStrategy kickStrategy = new KnightsOath();

    public King(){
       super(5,15,5,15);
    }

    @Override
    public void kick(Character c) {
        if(getHp() > 10) {
            kickStrategy = (c1,c2) -> c2.setHp(0);
        }
        kickStrategy.kick(this,c);
    }

}
