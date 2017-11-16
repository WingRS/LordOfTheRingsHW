import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class HobbitTest {
    private Character c1,c2;

    @Before
    public void setUp() {
        c1 = new Hobbit();
        c2 = new Elf();
    }


    @Test
    public void kick() throws Exception {
        c1.kick(c2);
        assertFalse(c2.getHp() == 0);
    }

}