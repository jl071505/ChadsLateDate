import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class family here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class family extends Actor
{
    public family(String name)
    {
        if (name=="mom")
        {
            setImage("mom.png");
            
        }else if (name=="dad")
        {
            setImage("dad.png");
            
        }else if (name=="bBro")
        {
            setImage("bro.png");
            
        }else if (name=="yBro")
        {
            setImage("youngBro.png");
            
        }else if (name=="sis")
        {
            setImage("sis.png");
            
        }else if (name=="cousin")
        {
            setImage("cousin.png");
            
        }
        
    }
    /**
     * Act - do whatever the family wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
