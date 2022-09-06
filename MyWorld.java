import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 375, 1, false);
        setPaintOrder(black.class, C.class,play.class, Lives.class, debris.class, explode.class, roseFall.class, roseArrow.class, fireball.class,monster.class,chad.class, floor.class, rose.class, bg.class);
         
        showText("CHAD'S LATE DATE", getWidth()/2,50);
        showText("Jingya L", 45,10);
        addObject(new play(), getWidth()/2, 300);
        addObject(new C(), 954, 320);
        addObject(new bg(), getWidth()/2, getHeight()/2);
        addObject(new bg(), getWidth()+getWidth()/2, getHeight()/2);
    }
}
