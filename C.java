import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends Actor
{
    private GreenfootImage[] move;
    private int num;
    private int number;
    private int iter;
    public C()
    {
        num=0;
        number=0;
        iter=0;
        move=new GreenfootImage[8];
        
        
        for(int i=0; i<move.length;i++)
        {
            num++;
            move[i]=new GreenfootImage("chadR"+num+".gif");
            
        }
    }
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        animate();
        iter++;
    }
    /**
     * Method animate
     *loop through the pictures in the array to make the monster move
     */
    private void animate()
    {
        
        if(iter%4==0)
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

}
