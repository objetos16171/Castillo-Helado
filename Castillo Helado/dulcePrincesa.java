import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dulcePrincesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dulcePrincesa extends Actor
{
    private GifImage dulcePrincesaGif = new GifImage("dulcePrincesa.gif");
    /**
     * Act - do whatever the dulcePrincesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(dulcePrincesaGif.getCurrentImage());
        // Add your action code here.
    }    
}
