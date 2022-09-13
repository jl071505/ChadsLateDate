import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bg extends Actor
{
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      // Add your action code here.
      move(-2);
      
     loopThrough();
    }    
    public void loopThrough()
    {
        if (getX()<=-(getWorld().getWidth()/2))
        {
            //getWorld().removeObject(this);
            setLocation(getWorld().getWidth()/2+getWorld().getWidth(), getWorld().getHeight()/2);
        }
    }
}
