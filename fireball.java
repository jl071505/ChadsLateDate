import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fireball extends Actor
{
    private GreenfootImage[] move;
    private int num;
    private int number;
    private int iter;
    public fireball()
    {
        num=0;
        number=0;
        iter=0;
        move=new GreenfootImage[5];
        
        
        for(int i=0; i<move.length;i++)
        {
            num++;
            move[i]=new GreenfootImage("fire"+num+".gif");
            
        }
    }
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-3);
        movement();
        animate();
        iter++;
    }
    /**
     * Method animate
     *loop through the pictures in the array to make the monster move
     */
    private void animate()
    {
        
        if(iter%5==0)
        {
            if( (number<move.length))
            {
                setImage(move[number]);
                number++;
            }else
            {
                number=0;
            }
        }
    }
    private void movement()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
