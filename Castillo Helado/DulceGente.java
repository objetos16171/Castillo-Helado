import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class  here.
 * Clase de la dulce gente es una clase enemigo 
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
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
