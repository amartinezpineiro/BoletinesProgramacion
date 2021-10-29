package Boletines.Boletin6.Boletin6_1;

public class Coche {
    //attributes
    private int speed;

    //constructors
    public Coche() {
        speed = 0;
    }

    //methods
    public int getSpeed() {
        return speed;
    }

    /**
     * Description of what the method does
     *
     * @param incriseSpeed indicates what speed is incrised
     */
    public void accelerate(int incriseSpeed) {
        speed += incriseSpeed;
    }

    /**
     * Description of what the method does
     *
     * @param reduceSpeed indicates what speed is reduced
     */
    public void brake(int reduceSpeed) {
        speed -= reduceSpeed;
    }
}
