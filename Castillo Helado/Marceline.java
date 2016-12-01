import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class  here.
 * Es el ayudante aparece da inmunidad de 30 segundos
 * al rey helado
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class Marceline extends Actor
{
     
    private GifImage gifMarceline= new GifImage("Marce.gif");
    private int xPos=1;
    private int yPos=1;
    /**
     * Establece el gif, y se cambia de dirección en las coordenadas x o y
     * cuando se llega al limite y al inicio del mundo.
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
     * Canción de aparicion de marceline 
     * cantara cuanto toque el rango establecido
     * de la anchura y altura del mundo 
     */
    public void tocaCancion()
    {
        World mundo=getWorld();
        
        if(this.getX() >= getWorld().getWidth() - 20)
        {
        Greenfoot.playSound("Marci.wav");
        }
        
        if(this.getY() >= getWorld().getHeight() - 20)
        {
        Greenfoot.playSound("Marci.wav");
        }
        
        }
    }
