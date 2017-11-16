import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class KnightsOathTest {
    private Character c1,c2;
    private KnightsOath oath;

    @Before
    public void setUp() {
        c1 = new King();
        c2 = new Hobbit();
        oath = new KnightsOath();
    }

    @org.junit.Test
    public void kick() throws Exception {
        oath.kick(c1,c2);
        assertFalse(c2.isAlive());
    }

}