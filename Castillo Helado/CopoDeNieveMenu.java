import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopoDeNieveMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopoDeNieveMenu extends Actor
{
    private int velCaida=2;
    /**
     * Act - do whatever the copoDeNieve wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(-2);
        setLocation( getX() , getY()+ velCaida );
        World mundo=getWorld();
        if(getY()>=getWorld().getHeight()-10){
            mundo.removeObject(this);
        }
        // Add your action code here.
    }    
}
