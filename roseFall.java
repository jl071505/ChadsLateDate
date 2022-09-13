import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roseFall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roseFall extends Actor
{
    private double speed;
    public roseFall()
    {
        speed=0.0;
        //setting variables
    }

    /**
     * Act - do whatever the Candy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gravity();
        fall();
    }  

    private void fall()
    {

        setLocation(getX(),getY()+(int)speed);

        if(getY()>390)
        {
            getWorld().removeObject(this);
        }
    }

    /**
     * Method gravity
     *accelerates the speed in which it falls to imitate gravity
     */
    private void gravity()
    {
        speed=speed+0.2;
    }
}
