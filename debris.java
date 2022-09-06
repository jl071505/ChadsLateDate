import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class debris extends Actor
{
    private int speed;
    public debris()
    {
        //set variables
        speed=Greenfoot.getRandomNumber(10)+15;

        //store the debris image in a variable
        GreenfootImage img=getImage();
        //set the debris img to random sizes
        int width=Greenfoot.getRandomNumber(19)+1;
        int height=Greenfoot.getRandomNumber(19)+1;
        //set the debris img to random sizes
        img.scale(width,height);

        setRotation(Greenfoot.getRandomNumber(360));

    }

    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
    }

    /**
     * Method movement
     *move the debris and if it is at the edge of the screen remove it
     */
    private void movement()
    {
        move(speed);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
