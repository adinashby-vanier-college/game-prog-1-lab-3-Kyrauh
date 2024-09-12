// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 138, 201);
        Worm worm =  new  Worm();
        addObject(worm, 469, 100);
        Worm worm2 =  new  Worm();
        addObject(worm2, 238, 325);
        Worm worm3 =  new  Worm();
        addObject(worm3, 457, 473);
        Worm worm4 =  new  Worm();
        addObject(worm4, 70, 490);
        Worm worm5 =  new  Worm();
        addObject(worm5, 270, 54);
        Worm worm6 =  new  Worm();
        addObject(worm6, 405, 276);
        Worm worm7 =  new  Worm();
        addObject(worm7, 280, 198);
        Worm worm8 =  new  Worm();
        addObject(worm8, 264, 455);
        Worm worm9 =  new  Worm();
        addObject(worm9, 89, 89);
    }
}
