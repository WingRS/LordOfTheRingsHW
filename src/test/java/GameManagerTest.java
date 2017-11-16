import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class GameManagerTest {

    @Test
    public void fight() throws Exception {
        Character c1 = new Elf();
        Character c2 = new Hobbit();
        GameManager manager = new GameManager();
        manager.fight(c1,c2);
        assertTrue(c2.getHp() == 0);
    }

}