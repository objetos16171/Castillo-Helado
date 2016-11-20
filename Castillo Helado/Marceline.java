import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marceline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marceline extends Actor
{
    
    private GifImage gifMarceline= new GifImage("marcelineCanta.gif");
    
    /**
     * Act - do whatever the Marceline wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifMarceline.getCurrentImage());
        // Add your action code here.
        
    }    
    
    
}
