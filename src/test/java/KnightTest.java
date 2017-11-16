import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class KnightTest {
    private Character c1,c2;

    @Before
    public void setUp(){
        c1 = new Knight();
        c2 = new Hobbit();
    }
    @org.junit.Test
    public void kick() throws Exception {
        c1.kick(c2);
        assertFalse(c2.isAlive());
    }

}