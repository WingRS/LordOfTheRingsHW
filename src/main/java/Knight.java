/**
 * Created by StasMaster on 05.11.17.
 */
public class Knight extends Character {

    private KickStrategy kickStrategy = new KnightsOath();

    public Knight() {
        super(2,21,2,12);
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this,c);
    }

}
