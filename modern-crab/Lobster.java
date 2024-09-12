// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * 
     */
    public Lobster()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(136) - 38);
        }
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        moveAndTurn();
    }

    /**
     * 
     */
    public void moveAround()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
            if (isAtEdge()) {
                turn(180);
            }
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("over.mp3");
        }
    }

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(-3);
        }
    }
}
