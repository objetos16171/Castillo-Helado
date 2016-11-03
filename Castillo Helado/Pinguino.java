import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinguino extends Actor
{
    
    GifImage gifImage = new GifImage("pinguinoMejorado2.gif");
    /**
     * Act - do whatever the Pinguino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        // Add your action code here.
    }    
}
