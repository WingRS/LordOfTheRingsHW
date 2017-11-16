import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by StasMaster on 16.11.17.
 */
public class KnightsOath implements  KickStrategy {
    public void kick(Character c1, Character c2) {
        c2.setHp(c2.getHp() - ThreadLocalRandom.current().nextInt(1, c1.getPower()+1));
    }
}
