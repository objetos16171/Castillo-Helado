import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase padre de todas las princesas
 * 
 * @author Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */ 
public abstract class Princesa extends Actor
{
    
    private int velocidad=5;
    /**
     * El objeto gira y desapacere a llegar al límite
     * el objeto desaparece.
     */
    public void act() 
    {
        World mundo = getWorld();
        setLocation(getX()+velocidad, getY());
        if(Greenfoot.getRandomNumber(10)<5)
        {
            turn(+1);
        }
        else
        {
            turn(-3);
        }
        
        if (getX()>= mundo.getWidth() - 10) 
        {
            mundo.removeObject(this);
        }
        
        // Add your action code here.
    }    
}
