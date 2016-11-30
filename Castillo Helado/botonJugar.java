import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botonJugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonJugar extends Actor
{
    private GreenfootSound musicaDeFondo = new GreenfootSound ("Everybody Wants To Rule The World Instrumental Version.mp3");
    private GifImage gifAyuda = new GifImage("jugarBoton.gif");

    
    /**
     * Act - do whatever the botonJugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(gifAyuda.getCurrentImage());
       
         if (Greenfoot.mouseClicked(this))
         {
             World menu = getWorld();
             ((Menu)menu).quitaMusica();
             Greenfoot.setWorld(new MyWorld());
             
             
            }
        // Add your action code here.
    }    
}
