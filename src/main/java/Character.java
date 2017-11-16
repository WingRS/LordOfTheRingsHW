import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by StasMaster on 30.10.17.
 */
public abstract class  Character {
    protected int power;
    protected int hp;

    public  Character() {

    }

    public Character(int minHp, int maxHp, int minPower, int maxPower){
        hp = randPoints(minHp,maxHp);
        power = randPoints(minPower,maxPower);
    }

    public int randPoints(int min, int max){
        return  ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public abstract void kick(Character c);
    public boolean isAlive() {
        return hp > 0;
    }


    public int getPower() {
        return power;
    }

    public boolean setPower(int power) {
        this.power = power;
        return true;
    }

    public int getHp() {
        return hp;
    }

    public boolean setHp(int hp) {
        this.hp = hp;
        return true;
    }

}
