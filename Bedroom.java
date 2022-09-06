import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bedroom extends World
{
    private int time;
    private int iterT;
    /**
     * Constructor for objects of class Bedroom.
     * 
     */
    public Bedroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(black.class, chad.class, floor.class, rose.class, bg.class);
        addObject(new black(), getWidth()/2, getHeight()/2);
        time=10;
        addObject(new chad(1), 30, 346);
        //base
        addObject(new floor(), 59, 394);
        addObject(new floor(), 177, 394);
        addObject(new floor(), 293, 394);
        addObject(new floor(), 405, 394);
        addObject(new floor(), 523, 394);
        addObject(new floor(), 584, 394);
        //obstacles
        addObject(new floor(), 54, 207);
        addObject(new floor(), 129, 251);
        addObject(new floor(), 141, 344);
        addObject(new floor(), 233, 306);
        addObject(new floor(), 324, 265);
        addObject(new floor(), 329, 345);
        addObject(new floor(), 429, 215);
        addObject(new floor(), 541, 308);
        //add items
        addObject(new items("$"), 30, 50);
        addObject(new items("phone"), 442, 64);
        addObject(new items("shoe"), 548, 198);
        addObject(new items("pants"), 236, 180);
        addObject(new items("shirt"), 335, 304);
        addObject(new items("water"), 232, 346);
        
        
    }
    public void act()
    {
        showText("time left: "+time,540, 27);
        timer();
        iterT++;
    }
    public void timer()
    {
        if(iterT==60)
        {
            time--;
            iterT=0;
        }
        if (time==0 && iterT==10)
        {
            Greenfoot.setWorld(new badEnd());
        }
    }
}
