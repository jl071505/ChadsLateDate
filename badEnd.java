import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class badEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class badEnd extends World
{
    private int iter;
    private int roses;
    private int iter1;
    private int raHits;
    private int loop;
    private int HE;
    /**
     * Constructor for objects of class badEnd.
     * 
     */
    public badEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 375, 1, false);
        roses=0;
        iter=0;
        iter1=0;
        HE=0;
        loop=0;
        setPaintOrder(black.class, Lives.class, debris.class, explode.class, roseFall.class, roseArrow.class, fireball.class,monster.class,chad.class, floor.class, rose.class, bg.class);
        
        addObject(new black(), getWidth()/2, getHeight()/2);
        
        addObject(new chad(2), 31, 339);
        addObject(new monster(), 899, 318);
        addObject(new bg(), getWidth()/2, getHeight()/2);
        addObject(new bg(), getWidth()+getWidth()/2, getHeight()/2);
       
        addObject(new floor(), 59, 385);
        addObject(new floor(), 177, 385);
        addObject(new floor(), 293, 385);
        addObject(new floor(), 405, 385);
        addObject(new floor(), 523, 385);
        addObject(new floor(), 584, 385);
        addObject(new floor(), 703, 385);
        addObject(new floor(), 809, 385);
        addObject(new floor(), 926, 385);
        
        addObject(new floor(), 192, 320);
        addObject(new floor(), 207, 225);
        addObject(new floor(), 299, 266);
        addObject(new floor(), 417, 266);
        addObject(new floor(), 311, 180);
        addObject(new floor(), 494, 220);
        addObject(new floor(), 590, 176);
        addObject(new floor(), 654, 258);
        addObject(new floor(), 556, 313);
        
        
        
        addObject(new rose(), 290, 343);
        addObject(new rose(), 333, 343);
        addObject(new rose(), 371, 343);
        addObject(new rose(), 414, 343);
        addObject(new rose(), 460, 343);
        addObject(new rose(), 669, 343);
        addObject(new rose(), 706, 343);
        addObject(new rose(), 743, 343);
        addObject(new rose(), 782, 343);
        addObject(new rose(), 536, 292);
        addObject(new rose(), 567, 292);
        addObject(new rose(), 193, 299);
        addObject(new rose(), 317, 99);
        addObject(new rose(), 598, 99);
        addObject(new rose(), 312, 245);
        
        
    }
    public void act()
    {
        addFire();
        fallRose();
        loseLives();
        iter=iter+1;
        iter1=iter1+1;
        loop=loop+1;
        happyEnd();
        showText("roses: "+roses, 670,30);
        
    }
    private void happyEnd()
    {
        if(HE==10)
        {
            Greenfoot.setWorld(new goodEnd());
        }
    }
    private void fallRose()
    {
        if(Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new roseFall(), Greenfoot.getRandomNumber(600), 0); 
        }
    }
    private void addFire()
    {
        if(Greenfoot.getRandomNumber(230)<1)
        {
            addObject(new fireball(), 899, 338);
            
        }
    }
    public void hitMonster()
    {
        raHits++;        
    }
    public void getRose()
    {
        roses++;
    }
    public void loseRose()
    {
        roses--;
    }
    private void loseLives()
    {
        if(raHits==0)
        {
            addObject(new Lives(0),920, 30);
        }else if(raHits==1)
        {
            addObject(new Lives(1),920, 30);
        }else if(raHits==2)
        {
            addObject(new Lives(2),920, 30);
        }else if(raHits==3)
        {
            addObject(new Lives(3),920, 30);
        }else if(raHits==4)
        {
            addObject(new Lives(4),920, 30);
        }else if(raHits==5)
        {
            addObject(new Lives(5),920, 30);
        }else if(raHits==6)
        {
            addObject(new Lives(6),920, 30);
            HE++;
            
        }
    }
}
