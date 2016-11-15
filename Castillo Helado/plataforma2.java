import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma2 here.
 * 
 * @author Soto Avila Karolina, Escobar Chavez Jose Emmanuel Escobar Chavez 
 * @version 4 de Noviembre del 2016
 */
public class plataforma2 extends Actor
{
    private int velY=-5;
    /**
     * Act - do whatever the plataforma2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() , getY()+velY); 
        muevePlataforma();
    }    
    
    /**
     * Movera la plataforma a lo alto del mundo cuando 
     * sea mayor o menor segun en sus coordenadas cambiara mediande
     * una multiplicacion su misma de la variable velY
     */
    public void muevePlataforma(){
       World mundo = getWorld();
       if(getY()>=100)
       {
          velY = velY*-1;
       }
       
       if(getY()<=getWorld().getHeight()-100)
       {
          velY = velY*-1;
       }
    }
}