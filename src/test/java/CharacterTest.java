import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by StasMaster on 16.11.17.
 */
public class CharacterTest {

    private Character c1;

    @Before
    public void  setUp() {
        c1 = new Hobbit();
    }

    @Test
    public void getPowerTest() throws Exception {
        assertTrue(c1.getPower() == 0);
    }

    @Test
    public void getHpTest() throws Exception {
        assertFalse(c1.getHp() == 3);
    }

    @Test
    public void setHpTest() throws Exception {
        c1.setHp(20);
        assertTrue(c1.getHp() == 20);
    }

    @Test
    public void setPowerTest() throws Exception {
        assertTrue(c1.setPower(20));
    }

    @Test
    public void isAliveTest() throws Exception {
        c1.setHp(0);
        assertFalse(c1.isAlive());
    }



}
