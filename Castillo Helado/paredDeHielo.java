import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se utiliza como finalidad estetica del proyecto
 * para acomodar los contadores o hacer una barra de puntuación
 * 
 * @author Soto Avila Carolina, Escobar Chavéz Jose Emmanuel 
 * @version 4 de noviembre del 2016
 */
public class paredDeHielo extends Actor
{
    /**
     * Act - do whatever the paredDeHielo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().setPaintOrder(Pinguino.class,Princesa.class,ReyHelado.class,Counter.class,paredDeHielo.class);
    }    
}
