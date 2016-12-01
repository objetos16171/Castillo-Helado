import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase se encarga unicamente para la presentación del proyecto.
 * 
 * @author Soto Avila Carolina, José Emmanuel Escobar Chavez 
 * @version 4 de noviembre del 2016
 */
public class MarcelineMenu extends Actor
{
    private GifImage gifMarcelineMenu = new GifImage("marcelineBajo.gif");
    private int direccion=3;

     /**
     * En el act unimente se establecio una imagen gif 
     * cambia de direccion cuand ves que llega al limite o al principio del mundo
     */
    public void act() 
    {
        setImage(gifMarcelineMenu.getCurrentImage());
        
        World mundo=getWorld();
        
        setLocation(getX()+direccion , getY() );
        
        if(getX()>=getWorld().getWidth()-50){
        direccion=direccion*-1;
        }
        
        if(getX()<=20){
        direccion=direccion*-1;
        }


        // Add your action code here.
    }    
}
