import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class here
 * Este objeto aparece en el menú de inicio 
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class NubeMenu extends Actor
{
    private int xDir=-3;
    /**
     * Se borra el objeto al llega al inicio del mundo
     */
    public void act() 
    {
        World mundo = getWorld();
        setLocation( getX() + xDir , getY() );
        
        if( this.getX() <= 0){
            setLocation( getWorld().getWidth()-10 , getY() );
        }
    }    
}
