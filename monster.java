import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Actor
{
    private GreenfootImage[] move;
    private int num;
    private int number;
    private int iter;
    public int hit;
    private boolean oneHit;
    public int hh;
    private int test;
    public monster()
    {
        num=0;
        number=0;
        iter=0;
        hit=0;
        oneHit=false;
        move=new GreenfootImage[15];
        
        
        for(int i=0; i<move.length;i++)
        {
            num++;
            move[i]=new GreenfootImage("frame_"+num+"_delay-0.1s.gif");
            
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
        attacked();
        //getWorld().showText("hit test: "+(), 820, 30);
    }
    /**
     * Method animate
     *loop through the pictures in the array to make the monster move
     */
    private void animate()
    {
        
        if(iter%8==0)
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
    public void checkHit()
    {
        badEnd BE=(badEnd)getWorld();
        BE.hitMonster();
    }
  
    private void attacked()
    {       
        if (isTouching(roseArrow.class))
        {
            if(oneHit==false)
            {
                checkHit();
                removeTouching(roseArrow.class);
                oneHit=true;
                Greenfoot.playSound("Break.mp3");
            }else if(isTouching(roseArrow.class)==false)
            {
                oneHit=true;
            }
        }else
        {
            oneHit=false;
        }
        
    }
}

