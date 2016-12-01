import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *imagen que aparece cuando el jugador pierde
 */
public class perdiste extends Actor
{
      private GifImage gifPerdiste = new GifImage("perdiste.gif");
    /**
     * Act - do whatever the perdiste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifPerdiste.getCurrentImage());
    } 
    
}
