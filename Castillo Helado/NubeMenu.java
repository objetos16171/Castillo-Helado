import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NubesMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NubeMenu extends Actor
{
    private int xDir=-3;
    /**
     * Act - do whatever the NubesMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World mundo = getWorld();
        setLocation( getX() + xDir , getY() );
        
        if( this.getX() <= 0){
            setLocation( getWorld().getWidth()-10 , getY() );
        }
    }    
}
