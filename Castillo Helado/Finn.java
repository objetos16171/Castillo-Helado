import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Finn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finn extends Actor
{
    private GifImage finnGif = new GifImage ("finnNuevo.gif"); 
    /**
     * Act - do whatever the Finn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(finnGif.getCurrentImage());
        
        // Add your action code here.
    }    
}
