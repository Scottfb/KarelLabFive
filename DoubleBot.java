


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers = 0;
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void doubleBeepers()
    {
        amountBeepers();
        replaceFirstPile();
        placeDoubleBeepers();
    }
    public void amountBeepers() {
        move();
        while (nextToABeeper()) {
            pickBeeper();
            beepers ++;
        }
    }
    public void replaceFirstPile() {
        for (int y = beepers; y > 0; y--) {
            putBeeper();
        }
    }
    public void placeDoubleBeepers() {
        move();
        for (int x = 2 * beepers; x > 0; x--) {
            putBeeper();
        }
        turnLeft();
        move();
    }
}
