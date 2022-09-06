import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chad extends Actor
{
    private GreenfootImage[] right;
    private GreenfootImage[] left;
    private int cRight;
    private int cLeft;
    private int xSpeed;
    private int ySpeed;
    private int accel;
    private boolean wasSpaceDown;
    private int numR=0;
    private int numL=0;
    private int rotation;
    private int rose;
    private int items;
    private int delay;
    private int dDelay;
    private int gEnd;
    private boolean onGround;
    private String score;
    public chad(int num)
    {
        wasSpaceDown=false;
        gEnd=0;
        
        items=0;
        accel=1;
        xSpeed=4;
        ySpeed=0;
        cRight=0;
        cLeft=0;
        right=new GreenfootImage[8];
        left=new GreenfootImage[8];
        rotation=0;
        dDelay=0;
        delay=0;
        addFrames();
        
        if (num==1)
        {
            score="there are 6 items you must collect to help \n Chad get ready for his date!";
        }else if(num==2)
        {
            score="OH NO! Chad's girlfriend was so mad that \n Chad was late and turned into a monster! \n Collect roses and send them to her by pressong \n the space bar to cease her anger. But be careful! \n Because her fiery temper may just be the thing that kills you...";
        }else if(num==3)
        {
            score="Yes! Now Chad is all ready for his date :) help Chad find his girlfriend.";
        }
    }
    public chad()
    {
        wasSpaceDown=false;
        gEnd=0;
        rose=0;
        items=0;
        accel=1;
        xSpeed=4;
        ySpeed=0;
        cRight=0;
        cLeft=0;
        right=new GreenfootImage[8];
        left=new GreenfootImage[8];
        rotation=0;
        dDelay++;
        delay=0;
        gEnd++;
        addFrames();
    }
    /**
     * Act - do whatever the dude wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
        checkFall();
        getOnFloor();
        CRose();
        CItems();
        shoot();
        getWorld().showText(score, 300,60);
        badEnding();
        CFire();
        meetGF();
        die();
        dDelay++;
        
    }
   
    private void addFrames()
    {
        for(int i=0; i<right.length;i++)
        {
            cRight++;
            right[i]=new GreenfootImage("chadR"+cRight+".gif");
            
        }
        for(int i=0; i<left.length;i++)
        {
            cLeft++;
            left[i]=new GreenfootImage("chadL"+cLeft+".gif");
            
        }
    }
    private void badEnding()
    {
        if (this.items==6)
        {
            
            delay++;
            if(delay==20)
            {
                Greenfoot.setWorld(new goodEnd());
                delay=0;
            }
        
            
        }
    }
    /**
     * Method explode
     *adds the explosion to the world
     */
    private void explode()
    {
        getWorld().addObject(new explode(), getX(), getY());

    }

    /**
     * Method debrisExplode
     *adds the debris into the world from the explosion
     */
    private void debrisExplode()
    {
        for(int i=0;i<50;i++)
        {
            getWorld().addObject(new debris(), getX(), getY());
        }

    }

    private void CItems()
    {
        if(isTouching(items.class))
        {
            Greenfoot.playSound("collectItem.mp3");
            removeTouching(items.class);
            items++;

        }
    }
    public void checkRose()
    {
        badEnd BE=(badEnd)getWorld();
        BE.getRose();
    }
    public void checknRose()
    {
        badEnd BE=(badEnd)getWorld();
        BE.loseRose();
    }
    private void CRose()
    {
        if(isTouching(rose.class) || isTouching(roseFall.class))
        {
            Greenfoot.playSound("rose.mp3");
            removeTouching(rose.class);
            removeTouching(roseFall.class);
            checkRose();
            rose++;
        }
    }
    private void CFire()
    {
        if(isTouching(fireball.class))
        {
            removeTouching(fireball.class);
            explode();
            debrisExplode();
            checknRose();
            rose--;
            
            
            

        }
    }
    private void meetGF()
    {
        if(isTouching(gf.class))
        {
            Greenfoot.playSound("yay.mp3");
            Greenfoot.stop();
            getWorld().addObject(new speech(),825, 262);
            xSpeed=0;
            ySpeed=0;
            getWorld().showText("CHAD'S LATE DATE WILL BE OKAY!", 500,50);
            
            
            Greenfoot.playSound("Stage Win (Super Mario) - Sound Effect HD (128 kbps).mp3");
            Greenfoot.stop();
            
            

        }
    }
    public int movement()
    {
        if(Greenfoot.isKeyDown("Right"))
        {
            move(xSpeed);
            numR++;
            rotation=0;
            if( numR< right.length)
            {
                setImage(right[numR]);
            }else
            {
                numR=0;
            }
        }else if(Greenfoot.isKeyDown("Left"))
        {
            move(-xSpeed);
            numL++;
            rotation=180;
            if( numL< left.length)
            {
                setImage(left[numL]);
            }else
            {
                numL=0;
            }
        }else if(Greenfoot.isKeyDown("Up") && getOnFloor())
        {
            ySpeed=-10;
            setLocation(getX(), getY()+ySpeed);
            ySpeed=ySpeed+accel;

        }else
        {
            setLocation(getX(), getY()+ySpeed);
            ySpeed=ySpeed+accel;

        }
        return rotation ;
    }
    private void shoot()
    {
        //if space key is pressed and then we didn't press it on the last itteration
        //add a ball and record that space key was just pressed
        if((Greenfoot.isKeyDown("space")) && (wasSpaceDown) && rose>0)
        {
            rose--;
            checknRose();
            Greenfoot.playSound("Whoosh sound effect (128 kbps).mp3");
            getWorld().addObject(new roseArrow(),getX(),getY());
            wasSpaceDown=false;
        }else if(Greenfoot.isKeyDown("space")==false)
        {
            //record that is wasn't pressed
            wasSpaceDown=true;
        }

    }
    /**
     * Method getOnFloor
     *returns the height of the floor image
     *checks if there was an object under actor
     */
    private boolean getOnFloor()
    {
        Actor under=getOneObjectAtOffset(0, getImage().getHeight()/3, floor.class);
        return under != null;

    }
    /**
     * Method checkFall
     *checks if it's on the ground or not
     *
     */
    private void checkFall()
    {
        if (getOnFloor())
        {
            ySpeed=0;
        }else
        {
            movement();
        }
    }
    private void die()
    {
        if (getY()>=355)
        {
            setLocation(getX(),335);
            //Greenfoot.setWorld(new lose());
            //Greenfoot.playSound("game over - sound effect (128 kbps).mp3");
            //Greenfoot.playSound("Game Over sound effect (128 kbps).mp3");
            //Greenfoot.stop();
        }
    }
    } 



