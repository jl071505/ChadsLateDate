import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roseArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roseArrow extends Actor
{
    private boolean removeMe;
    private int facing;
    private int rotate;
    //parameter indicates which direction the bullet should face
    public roseArrow()
    {
        //setting my variables values
        removeMe=false;
        facing=0;
        rotate=0;
        
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(5);
       rotation();
       checkEdge();
      
    
       removeIt();
       
    }  
  
    /**
     * Method checkEdge
     *if ball is at edge record
     *record that we need to remove it later
     */
    public void checkEdge()
    {
        if(isAtEdge())
        {
           removeMe=true;
        }
    
    }

    /**
     * Method rotation
     *gets the direction through animate() accesor so the bullets need to be rotated
     *so when they're shot, the line up with the direction Astro boy is
     *facing
     */
    public void rotation()
    {
        chad rot=(chad)getOneIntersectingObject(chad.class);
        if(rot != null)
        {
            
            rotate=rot.movement();
            setRotation(rotate);            
            
        }
    }
    /**
     * Method removeIt
     *if we record that we need to record the bullet
     *then remove bullet from world
     */
    public void removeIt()
    {
        if (removeMe)
        {
             getWorld().removeObject(this);
        }
    
    
    }  
}
