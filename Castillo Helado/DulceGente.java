import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DulceGente here.
 * 
 * @author Soto Avila Karolina, Escobar Chavez Jose Emmanuel Escobar Chavez 
 * @version 4 de Noviembre del 2016
 */
public abstract class DulceGente extends Actor
{
    private int velC=5;
    
    
    /**
     *act= contiene actos realizados por la dulce gente 
     */
    
    public void act() 
    {
        caida();
    }
    
   /**
    * metodo que hace caer a los enemigos
    */
    public void caida()
    {
        World mundo = getWorld();
        setLocation(getX(), getY()+velC);
        if (getY()>= mundo.getHeight() - 10) 
        {
            mundo.removeObject(this);
        }
    }
}
