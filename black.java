import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class black extends Actor
{
    //create variable for visability
    private int visable;
    public black()
    {
        //set variable value
        visable=255;
    }
    /**
     * Act - do whatever the Smoke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        fadeOut();
    }
    /**
     * Method fadeOut
     *fades out till it gets removed
     */
    private void fadeOut()
    {
        getImage().setTransparency(visable);
        visable=visable-5;
        if(visable<=0)
        {
            getWorld().removeObject(this);
        }
    }
}
