import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marceline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marceline extends Actor
{
     
    private GifImage gifMarceline= new GifImage("Marce.gif");
    private int xPos=4;
    private int yPos=1;
    /**
     * Act - do whatever the Marceline wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
        setImage(gifMarceline.getCurrentImage());
        
        setLocation( getX() + xPos , getY() + yPos );
        World mundo=getWorld();
        if( this.getX() >= getWorld().getWidth() - 20 )
        {
            xPos = xPos * -1 ;
        }
        
        if( this.getX() <= 20 )
        {
            xPos = xPos * -1 ;
        }
        
        if( this.getY() <= 20 )
        {
            yPos=yPos*-1;
        }
        
        if( this.getY() >= getWorld().getHeight()-30 )
        {
            yPos=yPos*-1;
        }
        tocaCancion();
 
    }    
    
    /**
     * cancion de aparicion de marceline
     */
    public void tocaCancion()
    {
        World mundo=getWorld();
        
        
        if(this.getX() >= getWorld().getWidth() - 20)
        {
        Greenfoot.playSound("Soy tu Problema - Marceline plus.wav");
        }
        
    }
    
}
