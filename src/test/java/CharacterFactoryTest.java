import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class CharacterFactoryTest {
    private CharacterFactory factory;

    @Before
    public void setUp() {
        factory = new CharacterFactory();
    }

    @org.junit.Test
    public void createCharacter() throws Exception {
        Character c1 = factory.CreateCharacter();
        assertTrue(c1.isAlive());
    }

}