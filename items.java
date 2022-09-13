import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class items extends Actor
{
    public items(String name)
    {
        if (name=="$")
        {
            setImage("money.png");
            
        }else if (name=="phone")
        {
            setImage("phone.png");
            
        }else if (name=="shoe")
        {
            setImage("shoe.png");
            
        }else if (name=="pants")
        {
            setImage("pants.png");
            
        }else if (name=="shirt")
        {
            setImage("shirt.png");
            
        }else if (name=="water")
        {
            setImage("water.png");
            
        }
        
    }
    /**
     * Act - do whatever the items wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
