import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goodEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goodEnd extends World
{

    /**
     * Constructor for objects of class goodEnd.
     * 
     */
    public goodEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 375, 1, true); 
        setPaintOrder(black.class, speech.class,gf.class, chad.class, floor.class, rose.class, bg.class);
        addObject(new black(), getWidth()/2, getHeight()/2);
        addObject(new chad(), 31, 319);
        addObject(new gf(), 880, 333);
        addObject(new floor(), 59, 394);
        addObject(new floor(), 177, 394);
        addObject(new floor(), 293, 394);
        addObject(new floor(), 405, 394);
        addObject(new floor(), 523, 394);
        addObject(new floor(), 584, 394);
        addObject(new floor(), 703, 394);
        addObject(new floor(), 809, 394);
        addObject(new floor(), 926, 394);
        addObject(new floor(), 946, 394);
    }
}
