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
    private int xVel=3;
    private int xVelBala=5;
    private tronquito Tronquito; 
    /**
     * Act - do whatever the Finn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Finn()
    {
        Tronquito = new tronquito();
    }
    
    public void act() 
    {
        World mundo = getWorld();
        setImage(finnGif.getCurrentImage());
        
        setLocation( getX()+xVel , getWorld().getHeight() - ( getImage().getHeight()/2 )  ); 
        atacaFinn();
        quitaFinn();
    }
    
    /**
     * El actor Finn invoca  mediante una dance a un grupo de tronquitos para atacar al rey helado 
     */
    public void atacaFinn()
    {
        World mundo = getWorld();
        if ( this.getX() <= getWorld().getWidth()-100)   
        {   
            getWorld().addObject( Tronquito , this.getX()+xVelBala ,this.getY());   
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
