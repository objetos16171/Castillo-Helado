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
    private int xvel=3;
    
    /**
     * Act - do whatever the Finn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World mundo = getWorld();
        setImage(finnGif.getCurrentImage());
        
        setLocation( getX()+xvel , getWorld().getHeight() - ( getImage().getHeight()/2 )  ); 
        
        atacaFinn();
        quitaFinn();
    }
    
    /**
     * El actor Finn invoca  mediante una dance a un grupo de tronquitos para atacar al rey helado 
     */
    public void atacaFinn()
    {
        World mundo = getWorld();
        if( ( ( this.getX() + xvel ) / 8 <= 12)   )
        {
            getWorld().addObject(new tronquitos(), this.getX() ,this.getY());
            
        }
    }
    /**
     * Quita a al actor cuando llega al borde del mundo 
     */
    public void quitaFinn()
    {
        World mundo=getWorld();
        if( this.getX() >= getWorld().getWidth()-10 ){
            getWorld().removeObject(this);
        }
    }
}
