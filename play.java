import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        click();
    }
    /**
     * Method click
     *if the user clicks this buttin, take them to the FirstWorld
     */
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new Bedroom());
            
        }
    }
}
