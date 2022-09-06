import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    
    public Lives(int hl)
    {
        if (hl==0)
        {
            setImage("heart1.gif");
        }else if (hl==1)
        {
            setImage("heart2.gif");
        }else if (hl==2)
        {
            setImage("heart3.gif");
        }
        else if (hl==3)
        {
            setImage("heart4.gif");
        }
        else if (hl==4)
        {
            setImage("heart5.gif");
        }
        else if (hl==5)
        {
            setImage("heart6.gif");
        }
        else if (hl==6)
        {
            setImage("heart7.gif");
            
        }
    }
    /**
     * Act - do whatever the healthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */ 
    public void act()
    {
        // Add your action code here.
       
    }
        
    
}
