import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase solo aparecerá en el menú principal del juego
 * 
 * @author Soto Avila Carolina, José Emmanuel Escobar Chavez
 * @version 4 de noviembre del 2016
 */
public class copoElegante extends Actor
{
    private int posX=0;
    /**
     * En este método solo se movera en pequeños intervalor 
     */
    public void act() 
    {
        if( this.getX()<= 300 ) {
            move(+2);
        }
        
        
        if( this.getX()>= 350 ) {
            move(-2);
        }
    }    
}
