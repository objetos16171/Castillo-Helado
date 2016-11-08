import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Princesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Princesa extends Actor
{
    
    private int velocidad=5;
    private int vuelo=4;
    /**
     * Act - do whatever the Princesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        World mundo = getWorld();

        setLocation(getX()+velocidad, getY()+vuelo);
        if(Greenfoot.getRandomNumber(10)<5)
        {
            vuelo = vuelo * -1;
            
           
        }
        else
        {
            vuelo = vuelo * -1;
            turn(-2);
        }
        
        if (getX()>= mundo.getWidth() - 10) 
        {
            mundo.removeObject(this);
        }
        
        // Add your action code here.
    }    
}
