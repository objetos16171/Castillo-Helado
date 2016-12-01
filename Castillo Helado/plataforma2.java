import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase sirve para que el rey helado se pude apoyar 
 * 
 * @author Soto Avila Karolina, Escobar Chavez Jose Emmanuel Escobar Chavez 
 * @version 4 de Noviembre del 2016
 */
public class plataforma2 extends Actor
{
    private int velY=-5;
    /**
     * El metodo act movera de posicion en el eje de la Y de abajo hacia arriba
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