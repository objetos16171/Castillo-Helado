import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinguino extends Actor
{
    private int velocidadCaida =5;
    private GifImage gifPinguino = new GifImage("pinguinoMejorado2.gif");
    /**
     * Act - do whatever the Pinguino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifPinguino.getCurrentImage());
        this.setLocation(this.getX(), this.getY() + velocidadCaida);
        if (getY() >= this.getWorld().getHeight() - 10) {
            this.getWorld().removeObject(this);
        }
        
    }
    
    public void caida()
    {
        
    }
}
