import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description.
 * Esta clase su papel es de bala en conjunto con el objeto Finn 
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class tronquito extends Actor
{
    /**
     * Act - do whatever the tronquitos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation( getX() + Greenfoot.getRandomNumber(20) , getY() - Greenfoot.getRandomNumber(4) );
        quitaTronquitos();
        // Add your action code here.
    }
    
    /**
     * Quita el actor tronquitos cuando llega al final del mundo
     */
    public void quitaTronquitos()
    {
        World mundo=getWorld();
        if( this.getX() >= getWorld().getWidth()-10 ){
            getWorld().removeObject(this);
        }
        
    }
}
