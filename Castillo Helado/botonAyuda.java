import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botonAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonAyuda extends Actor
{
    private GifImage gifAyuda = new GifImage("ayudaBoton.gif");
    /**
     * Act - do whatever the botonAyuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifAyuda.getCurrentImage());
         if (Greenfoot.mouseClicked(this))
         {
             World menu = getWorld();
             ((Menu)menu).quitaMusica();
             Greenfoot.setWorld(new Ayuda());
             
            }
      
        // Add your action code here.
    }    
}
